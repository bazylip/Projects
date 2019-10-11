import re
from functools import reduce

cardNumber = int(input("Enter your card credit number: "))
cardIssuer = input("Enter issuer name: ")

def getIssuerStatus(cardIssuer, cardNumber):
    switchCorrect = {
        "visa": re.compile("^4[0-9]{15}$"),
        "mastercard": re.compile("^(?:2[2-7][0-9]{14}|5[1-5][0-9]{14})$")
    }

    return switchCorrect.get(cardIssuer).match(str(cardNumber))

def luhnAlgorithmStatus(cardNumber):
    checkSum = reduce((lambda x1, x2: x1 + int(x2)*2 if int(x2)*2 < 10 else x1 + int(x2)*2 - 9), str(cardNumber)[::2], 0)
    checkSum += reduce((lambda x1, x2: x1 + int(x2)), str(cardNumber)[1::2], 0)
    return checkSum % 10 == 0

print ("Card issuer status: ", "OK" if getIssuerStatus(cardIssuer.lower(), cardNumber) else "NOT OK")
print ("Checksum status: ", "OK" if luhnAlgorithmStatus(cardNumber) else "NOT OK")


