
PER_FEET_IN_METERS = 0.09290304

def get_unit():
    while True:
        print("\t***Choose in which unit do you want to calculate area***")
        print("1.Meter")
        print("2.Feet")
        answer = input("Enter unit (1/m/meter or 2/f/feet): ").strip().lower()

        match answer:
            case "1" | "m" | "meter":
                return "meter"
            case "2" | "f" | "feet":
                return "feet"
            case _:
                print("Invalid input.Please enter (1/m/meter or 2/f/feet)")
                continue

# Function get float input from user
def get_float_input(prompt):
    while True:
        try:
            return float(input(prompt))
        except ValueError:
            print("Please provide a valid input")

# Function calculate area, meter is unit is meters or feet otherwise
def calculate_area(length, width, unit):
    area_feet = length * width
    return area_feet * PER_FEET_IN_METERS if unit == "meter" else area_feet

def main():
    unit = get_unit()
    length = get_float_input("Enter length: ")
    width = get_float_input("Enter width: ")

    area = calculate_area(length, width, unit)
    print(f"Area in {unit}: {area}")


if __name__ == '__main__':
    main()