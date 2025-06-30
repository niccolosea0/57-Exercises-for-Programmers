def main():
    # Ask users to input valid bill amount
    while True:
        dollars = dollars_to_float(input("Enter bill amount: "))
        if dollars is None:
            print("Please enter a valid positive number.")
        else:
            break

    # Ask users to input valid tip rate
    while True:
        percent = percent_to_float(input("Enter tip rate: "))
        if percent is None:
            print("Please enter a valid positive percentage.")
        else:
            break

    # Calculate tip and total values
    tip = dollars * percent
    total = dollars + tip

    print(f"\nBill: ${dollars:.2f}")
    print(f"Tip: ${tip:.2f}")
    print(f"Total: ${total:.2f}")


def dollars_to_float(d):
    # Remove $ sign from input
    value = d.replace("$", "")

    # Check that value is digit
    if value.isdigit():
        return float(value) # Convert value to float and return it

    return None

def percent_to_float(p):
    # Remove % sign from input
    value = p.replace("%", "")

    # Check that value is digit and greater or equal to 1
    if value.isdigit() and float(value) >= 1:
        return float(value) / 100 # Convert value to float, divide it to 100 and return it (e.x 15% = 0.15)

    return None







main()