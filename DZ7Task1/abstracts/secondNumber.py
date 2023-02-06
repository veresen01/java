from abstracts.inputClass import inputClass


class secondNumber(inputClass):
    """класс определения второго числа"""

    def __init__(self, y):
        inputClass.__init__(self, int(y))