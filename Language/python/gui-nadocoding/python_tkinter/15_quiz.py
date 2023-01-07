from tkinter import *
import os

root = Tk()
root.title("제목 없음 - Windows 메모장")
root.geometry("680x480")
filename = "mynote.txt"

menu = Menu(root)

def file_open():
    if os.path.isfile(filename):
        with open("../python_GUI/mynote.txt", "r") as f:
            print("파일열기")
            text.delete("1.0", END)
            text.insert(END, f.read())
            f.close

    else:
        print("파일 안열었다")

def file_save():
    with open("../python_GUI/mynote.txt", "w") as f:
        f.write(text.get("1.0", END))
        f.close

menu_none = Menu(menu, tearoff=0)
menu_file = Menu(menu, tearoff=0)

menu_file.add_command(label="열기", command=file_open)
menu_file.add_command(label="저장", command=file_save)
menu_file.add_separator()
menu_file.add_command(label="끝내기", command=root.quit)

menu.add_cascade(label="파일", menu=menu_file)
menu.add_cascade(label="편집", menu=menu_none)
menu.add_cascade(label="서식", menu=menu_none)
menu.add_cascade(label="보기", menu=menu_none)
menu.add_cascade(label="도움말", menu=menu_none)


text = Text(root)
scrollbar = Scrollbar(root)
text.config(yscrollcommand=scrollbar.set)

text.pack(fill="both", expand=True, side="left")
scrollbar.pack(side="right", fill="y")

scrollbar.config(command=text.yview)
root.config(menu=menu)
root.mainloop()