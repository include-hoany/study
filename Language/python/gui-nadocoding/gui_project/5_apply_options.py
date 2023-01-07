from tkinter import *
import tkinter.ttk as ttk
from tkinter import filedialog
import tkinter.messagebox as msgbox
from PIL import Image
import os

root = Tk()
root.title("Nado GUI Coding")
root.resizable(False, False)
def merge_image():

    # print("가로넓이 옵션", cmb_width.get())
    # print("간격 옵션", cmb_space.get())
    # print("포맷 옵션", cmb_format.get())

    try:
        # 가로 넓이
        img_width = cmb_width.get()
        if img_width == "원본유지":
            img_width = -1
        else:
            img_width = int(img_width)

        # 간격
        img_space = cmb_space.get()
        if img_space == "좁게":
            img_space = 30
        elif img_space == "보통":
            img_space = 60
        elif img_space == "넓게":
            img_space = 90
        else: # 없음
            img_space = 0

        # 포맷
        img_format = cmb_format.get().lower()

        ######################################

        # 이미지 사이즈 리스트에넣어서 하나씩 처리
        image_sizes = [] #(wifth1, height) (width2, height2) ...

        images = [Image.open(x) for x in file_list.get(0, END)]

        if img_width > -1: 
            # width 값 변경
            image_sizes = [(int(img_width), int(img_width * x.size[1] / x.size[0])) for x in images]
        else: # 원본 사이즈 사용
            image_sizes = [(x.size[0], x.size[1]) for x in images]

        # 사진 비율 계산
        # 100 * 60 이미자가 있음. -> width 를 80으로 줄이면  height  는?
        # (원본 width) : (원본 : height) = (변경 : width) : (변경 : height)
        # 100 : 60 = 80 : ?
        # x  : y  =  x'  :  y'
        # xy' = x'y
        # y' = x'y / x -> 이 식을 적용
        # 100:60=80:

        #우리 코드에 대입
        # x = width = size[0]
        # y = height = size[1]
        # x' = img_width 이 값으로변경
        # y' = x'y / x    

        # width, height = zip(*(x.size for x in images))
        width, height = zip(*(image_sizes))

        max_width, total_height = max(width), sum(height)

        #스케치북 준비
        if img_space > 0: # 이미지 간격 옵션
            total_height += (img_space * (len(images) - 1))

        result_img = Image.new("RGB", (max_width, total_height), (255,255,255))
        y_offset = 0 # y 위치정보

        for idx, img in enumerate(images):
            # width 가 원본유지가 아닐때에는 이미지 크기 조정
            if img_width > -1:
                img = img.resize(image_sizes[idx])

            result_img.paste(img, (0, y_offset))
            y_offset += (img.size[1] + img_space) #사용자가 조정한 간격 더하기

            progress = (idx + 1) / len(images) * 100 # 실제 퍼센트
            p_var.set(progress)
            progress_bar.update()
    except Exception as err:
        msgbox.showwarning("에러", "에러발생 : {}".format(err))


        #포맷 옵션 추가
        dest_path = os.path.join(txt_path_entry.get(), "nado_photo.{}".format(img_format))
        result_img.save(dest_path)
        msgbox.showinfo("완료", "사진저장이 완료되었습니다.")


#파일 추가
def add_file():
    files = filedialog.askopenfilenames(title="이미지 파일을 선택하세요 ", \
        filetypes=(("PNG 파일", "*.png"), ("모든파일", "*.*")), \
        initialdir=r"\Users\include-hoany\Desktop") # 최초 경로 보여줌

    for file in files:
        file_list.insert(END, file)

#선택 삭제
def del_file():
    #리버스를 하는 이유는 앞에서부터 삭제를 하면 인덱스 번호가 꼬이기 때문
    for index in reversed(file_list.curselection()):
        file_list.delete(index)

# 저장 경로 폴더 정의
def browse_dest_path():
    folder_selected = filedialog.askdirectory(initialdir="/Users/include-hoany")

    if folder_selected == "":
        return

    txt_path_entry.insert(0, folder_selected)



def start():
    # print("가로넓이 옵션", cmb_width.get())
    # print("간격 옵션", cmb_space.get())
    # print("포맷 옵션", cmb_format.get())

    #파일 목록 확인
    if file_list.size() == 0:
        msgbox.showwarning("경고", "이미지 파일을 추가하세요.")
        return

    
    #저장 경로 확인
    if len(txt_path_entry.get()) == 0:
        msgbox.showwarning("경고", "저장경로를 설정해 주세요.")
        return

    #이미지 통합작업
    merge_image()


# 파일 프레임 (파일 추가, 선택 삭제)

file_frame = Frame(root)
file_frame.pack(fill="x", padx=5, pady=5)

btn_add_file = Button(file_frame, padx=5, pady=5, width=12, text="파일 추가", command=add_file)
btn_add_file.pack(side="left")

btn_del_file = Button(file_frame, padx=5, pady=5, width=12, text="파일 삭제", command=del_file)
btn_del_file.pack(side="right")

#리스트 프레임
list_frame = Frame(root)
list_frame.pack(fill="both", padx=5, pady=5)

scrollbar = Scrollbar(list_frame)
scrollbar.pack(side="right", fill="y")

file_list = Listbox(list_frame, selectmode="extended", height=15, yscrollcommand=scrollbar.set)
file_list.pack(fill="both", expand=True, side="left")
scrollbar.config(command=file_list.yview)

#저장경로 프레임
path_frame = LabelFrame(root, text="저장경로")
path_frame.pack(fill="x", padx=5, pady=5, ipady=5)

txt_path_entry = Entry(path_frame)
txt_path_entry.pack(side="left", fill="x", expand=True, padx=5, pady=5, ipady=4)

btn_dest_path = Button(path_frame, text="경로지정", width=10, command=browse_dest_path)
btn_dest_path.pack(side="right", padx=5, pady=5)

#옵션 프레임
frame_option = LabelFrame(root, text="옵션")
frame_option.pack(padx=5, pady=5, ipady=5)

# 1. 가로 넓이 옵션
#가로넓이 레이블
lbl_width = Label(frame_option, text="가로넓이", width=8)
lbl_width.pack(side="left", padx=5, pady=5)

#가로넓이 콤보
opt_width = ["원본유지", "1024", "800", "640"]
cmb_width = ttk.Combobox(frame_option, state="readonly", values=opt_width, width=10)
cmb_width.current(0)
cmb_width.pack(side="left", padx=5, pady=5)

# 2. 간격 옵션
#간격옵션 레이블
lbl_space = Label(frame_option, text="간격", width=8)
lbl_space.pack(side="left", padx=5, pady=5)

#간격옵션 콤보
opt_space = ["없음", "좁게", "보통", "넓게"]
cmb_space = ttk.Combobox(frame_option, state="readonly", values=opt_space, width=10)
cmb_space.current(0)
cmb_space.pack(side="left", padx=5, pady=5)

# 3. 파일 포맷 옵션
#포맷옵션 레이블
lbl_format = Label(frame_option, text="포맷", width=8)
lbl_format.pack(side="left", padx=5, pady=5)

#포맷옵션 콤보
opt_format = ["PNG", "JPG", "BMP"]
cmb_format = ttk.Combobox(frame_option, state="readonly", values=opt_format, width=10)
cmb_format.current(0)
cmb_format.pack(side="left", padx=5, pady=5)

#진행 상황 Progress bar 프레임
progress_frame = LabelFrame(root, text="진행상황")
progress_frame.pack(fill="x", padx=5, pady=5, ipady=5)

p_var = DoubleVar()
progress_bar = ttk.Progressbar(progress_frame, maximum=100, variable=p_var)
progress_bar.pack(fill="x", padx=5, pady=5)

#실행 프레임
run_frame = Frame(root)
run_frame.pack(fill="x")

btn_close = Button(run_frame, padx=5, pady=5, text="닫기", width=12, command=root.quit)
btn_close.pack(side="right", padx=5, pady=5)

btn_start = Button(run_frame, padx=5, pady=5, text="시작", width=12, command=start)
btn_start.pack(side="right", padx=5, pady=5)

root.mainloop()