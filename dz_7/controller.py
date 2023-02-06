from model import get_x, get_y, summ, sub, mult, div
from view import get_choice


def start():
    x = get_x()
    y = get_y()
    op = get_choice()
    if op == 1:
        print(summ(x, y))
    elif op == 2:
        print(sub(x, y))
    elif op == 3:
        print(mult(x, y))
    elif op == 4:
        print(div(x, y))
    else:
        raise ValueError('Wrong value!')
