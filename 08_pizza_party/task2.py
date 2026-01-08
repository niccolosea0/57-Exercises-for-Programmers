"""
        Create a variant of the program that prompts for the
        number of people and the number of pieces each person
        wants, and calculate how many full pizzas you need to
        purchase.
"""

import math


while True:
    try:
        people = int(input("How many people? "))
    except ValueError:
        print("ValueError: Error: Please enter a number!")
    else:
        break


# Calculate how many slices each person wants
total_slices = 0
for i in range(people):
    while True:
        try:
            slices = int(input(f"How many slices does person {i + 1} wants? "))
        except ValueError:
            print("ValueError: Please enter a number!")
        else:
            break
    total_slices += slices

if total_slices > 8:
    full_pizza_num = math.floor(total_slices / 8)
    additional_pizza = total_slices % 8
else:
    # It means total_slices is not greater that slices that one pizza have
   full_pizza_num = 1
   additional_pizza = 0

# Calculate how many pizza's in general is necessary
pizza_num = full_pizza_num + additional_pizza
if pizza_num > 1:
   print(f"There will be {pizza_num} pizzas necessary")
else:
    print(f"There will be {pizza_num} pizza necessary")