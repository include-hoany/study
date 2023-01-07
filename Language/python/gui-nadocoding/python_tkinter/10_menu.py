from tkinter import *

root = Tk()
root.title("Nado Gui")
root.geometry("640x480")

menu = Menu(root)

def create_new_file():
    print("새 파일을 만듭니다.")

#file 메뉴
menu_file = Menu(menu, tearoff=0)
menu_file.add_command(label="file", command=create_new_file)
menu_file.add_command(label="New Window")
menu_file.add_separator()
menu_file.add_command(label="Open File...")
menu_file.add_separator()
menu_file.add_command(label="Save All", state="disable")
menu_file.add_separator()
menu_file.add_command(label="Exit", command=root.quit)

#Edit 메뉴
menu_edit = Menu(menu, tearoff=0)

# Language 메뉴 추가 (radio 버튼으로 추가)
menu_lang = Menu(menu, tearoff=0)
menu_lang.add_radiobutton(label="Python")
menu_lang.add_radiobutton(label="Java")
menu_lang.add_radiobutton(label="Swift")

# view 메뉴 추가 checkbox 메뉴 추가
menu_view = Menu(menu, tearoff=0)
menu_view.add_checkbutton(label="Show Minimap")

#menu 바에 또다른 메뉴 추가  cascade 연속적
menu.add_cascade(label="File", menu=menu_file)
menu.add_cascade(label="Edit", menu=menu_edit)
menu.add_cascade(label="Language", menu=menu_lang)
menu.add_cascade(label="View", menu=menu_view)

root.config(menu=menu)
root.mainloop()