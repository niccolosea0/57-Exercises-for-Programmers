from datetime import datetime

age = int(input("What is your current age? "))
retireAge = int(input("At what age would you like to retire? "))

yearsLeft = retireAge - age
if yearsLeft <= 0:
    print("You can already retire. Seems your worked too much.")
    exit(0)

print(f"You have {yearsLeft} years left until you can retire.")

currentYear = datetime.now().year
retirmentYear = currentYear + yearsLeft # Year when user will retire

print(f"It's {currentYear}, so you can retire in {retirmentYear}.")



