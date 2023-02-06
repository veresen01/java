from abstracts.inputClass import inputClass


class firstNumber(inputClass):
    """класс определения первого числа"""

    def __init__(self, x):
        inputClass.__init__(self, int(x))