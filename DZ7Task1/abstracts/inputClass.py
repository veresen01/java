class inputClass:
    """родительский класс"""

    def __init__(self, a):
        self.a = a

    def setX(self, x):
        self.a = x

    def getX(self):
        return self.a