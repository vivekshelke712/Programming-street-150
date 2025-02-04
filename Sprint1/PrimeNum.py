
num = int(input("Enter a number: "))


if num <= 1: 
    print("Number is not prime")
else:
    for i in range(2, num):  
        if num % i == 0:
            print("Number is not prime")
            break
    else:  
        print("Prime")
