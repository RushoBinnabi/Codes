num1 = 14605000
num2 = 14605000 

num1 = float(input("Enter the 1st Number: "))
operation = input("Enter The Operation to be performed: ")
num2 = float(input("Enter the 2nd Number: "))


if operation == "+":
    print(num1 + num2)

elif operation == "-":
    print(num1 - num2)

elif operation == "*":
    print(num1 * num2)

elif operation == "/":
    print(num1 / num2)


else:
    print("Please check your numbers or operation.")


while num1 + num2 < 14605000:
    
    num1 = float(input("Enter the 1st Number: "))
    operation = input("Enter The Operation to be performed: ")
    num2 = float(input("Enter the 2nd Number: "))
    
    
    if operation == "+": print(num1 + num2)
    
    
    elif operation == "-": print(num1 - num2)
    
    
    elif operation == "*": print(num1 * num2)
    
    
    elif operation == "/": print(num1 / num2)
    
    
    else: print("Please check your numbers or operation.")