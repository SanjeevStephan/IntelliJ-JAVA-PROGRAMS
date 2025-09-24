import os

def clear_terminal():
    # For windows
    print("HEllo from inside the python script : clear.py")
    if os.name == 'nt':
        os.system('cls')
    else:
        os.system('clear')

clear_terminal()