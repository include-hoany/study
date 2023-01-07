from tkinter import *

root = Tk()
root.title("Nado Gui")
root.geometry("640x480")

chkval = IntVar() # chkvar 에 int 형으로 값을 저장한다
chkbox = Checkbutton(root, text="오늘하루 보지않기.", variable=chkval)
# chkbox.select() #자동 선택처리
# chkbox.deselect() #자동 해제 처리
chkbox.pack()

chkval2 = IntVar()
chkbox2  = Checkbutton(root, text="일주일동안 보지 않기", variable=chkval2)
chkbox2.pack()

def btncmd():
    print(chkval.get())
    print(chkval2.get())

btn = Button(root, text="클릭", command=btncmd)
btn.pack()

root.mainloop()