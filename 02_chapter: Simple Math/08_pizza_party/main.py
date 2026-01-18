import math

while True:
    try:
        people = int(input("How many people? "))
        pizza_num = int(input("How many pizzas do you have? "))
    except ValueError:
        print("Error: Please enter a number!")
    else:
        break

if pizza_num > 1:
    print(f"\nOkay, {people} people with {pizza_num} pizzas!")
else:
    print(f"\nOkay, {people} people with {pizza_num} pizza!")

leftovers = (pizza_num * 8) % people
slices_per_persons = math.floor((pizza_num * 8) / people)

if slices_per_persons > 1:
    print(f"Each Person will get {slices_per_persons} slices of pizza")
else:
    print(f"Each Person will get {slices_per_persons} slices of pizza")

print(f"There are {leftovers} leftovers")