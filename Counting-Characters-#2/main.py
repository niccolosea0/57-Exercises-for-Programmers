name = input("Enter your input string? ")
if len(name) == 0:
    print("You must enter something.")
    exit(1)

if name.isalpha():
    print(f"{name} has {len(name)} characters.")

else:
    print("Input must contain only characters.")