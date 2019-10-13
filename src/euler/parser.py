from yaml import load, Loader

class argParser():
    def __init__(self, filename):
        self.filename = filename
        self.data = None

    def readArgs(self):
        with open(self.filename) as file:
            self.data = load(file, Loader=Loader)
        return self.data

