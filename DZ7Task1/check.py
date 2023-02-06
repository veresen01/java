from view import view
from operations.dif import dif
from operations.div import div
from operations.sum import summ
from operations.mult import mult
from abstracts.firstNumber import firstNumber
from abstracts.secondNumber import secondNumber
from abstracts.operation import operation


class checkOperation:
    '''класс получения чисел и обращения к определенным операциям'''
    @staticmethod
    def checkOp():
        view.setX()
        a = firstNumber(int(input()))
        view.setY()
        b = secondNumber(int(input()))
        view.setOp()
        oper = operation(input())

        if oper.getX() == "+":
            view.result()
            print(summ.summ(a.getX(), b.getX()))
        elif oper.getX() == "-":
            view.result()
            print(dif.dif(a.getX(), b.getX()))
        elif oper.getX() == "*":
            view.result()
            print(mult.mult(a.getX(), b.getX()))
        elif oper.getX() == "/":
            view.result()
            print(div.div(a.getX(), b.getX()))
        else:
            print("Не верно введена операция")