import keyboard
from PIL import ImageGrab
import time

def screenshot():
    curr_time = time.strftime("_%Y%m%d_%H%M%S")
    img = ImageGrab.grab()
    img.save("imge{}.png".format(curr_time))

#복합키
#keyboard.add_hotkey("ctrl + shift + s", screenshot)


keyboard.add_hotkey("F9", screenshot)
keyboard.wait("esc") # 키보드 누를때끼지 프로그램 실행