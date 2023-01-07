from tkinter import *

root = Tk()
root.title("Nado Gui")
root.geometry("640x480")

listbox = Listbox(root, selectmode="extended", height=0)
listbox.insert(0, "사과")
listbox.insert(1, "딸기")
listbox.insert(2, "바나나")
listbox.insert(END, "수박")
listbox.insert(END, "포도")
listbox.pack()

def btncmd():
   # 삭제
   # 맨앞에 listbox.delete(0)
   # 맨마지막 listbox.delete(END)

   #갯수 확인
   #print("리스트에는 {0}개가 있어요.".format(listbox.size()))

    #항목 확인
    # print("1번째 부터 3번째까지의 항목 : ", listbox.get(0, 2))

    #선택된 항목 확인 위치 값으로 확인
    print("선택된 항복은 : ", listbox.curselection())

btn = Button(root, text="클릭", command=btncmd)
btn.pack()

root.mainloop()