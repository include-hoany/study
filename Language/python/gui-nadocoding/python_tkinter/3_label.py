from tkinter import *

root = Tk()
root.title("Nado Gui")
root.geometry("640x480")

label1 = Label(root, text="안녕하세요.")
label1.pack()

phtoto = PhotoImage(file="../python_GUI/img.png")
label2 = Label(root, image=phtoto)
label2.pack()

def change():
    label1.config(text="또만나요.")
    global photo2 
    photo2 = PhotoImage(file="../python_GUI/img2.png")
    label2.config(image=photo2)

btn = Button(root, text="클릭", command=change)
btn.pack()

root.mainloop()