def add(a, b):
   print(f"Sum: {a + b}")

def difference(a, b):
     print(f"Difference: {a - b}")

def product(a, b):
     print(f"Product: {a * b}")

def divide(a, b):
     print(f"Division: {a / b}")

while True:
    firstNum = int(input("Enter a first number: "))
    if firstNum > 0:
        break

while True:
    secondNum = int(input("Enter a second number: "))
    if secondNum > 0:
        break

add(firstNum, secondNum)
difference(firstNum, secondNum)
product(firstNum, secondNum)
divide(firstNum, secondNum)

