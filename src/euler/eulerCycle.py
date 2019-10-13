from __future__ import print_function
from euler.parser import argParser

class Graph():

    def __init__(self, data, directed):
        self.data = data
        self.directed = directed
        self.cycle = []

    def findCycle(self, u):
        if not self.directed:
            for edgeToV in self.data[u]:
                self.data[u].remove(edgeToV)
                self.data[edgeToV].remove(u)
                self.findCycle(edgeToV)
            self.cycle.insert(0, u)
            return self.cycle
        else:
            return False



parser = argParser('conf.yaml')
data = parser.readArgs()

graph = Graph(data.get('graph'), data.get('directed'))

print("Euler cycle is: ")
list(map(lambda x: print(x, "-> ", end=""), graph.findCycle(0)))
