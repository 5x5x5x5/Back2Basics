def collatz(number):
    if number % 2 == 0:
        number = number // 2
        print(number)
        return number
    elif number == 1:
        return number
    else:
        number = number * 3 + 1
        print(number)
        return number

print('Come on gimme a number!! Hurry! The milliseconds are burning!')
number = int(input())

# collatz(collatz(collatz(collatz(collatz(collatz(number))))))

print(number)
while number != 1:
    number = collatz(number)

"""
if starter == 1:
    print(str(starter) + ' is where we always end up')
elif starter % 2 == 0:
    evenNumber = starter // 2
    print(str(evenNumber))
    if evenNumber == 1:
        print(str(evenNumber) + ' is where we always end up')
    elif evenNumber % 2 == 0:
        evenNumber2 = evenNumber // 2
        print(str(evenNumber2))
    else:
        oddNumber2 = evenNumber * 3 + 1
        print(str(oddNumber2))
else:
    oddNumber = starter * 3 + 1
    print(str(oddNumber))
    if oddNumber == 1:
        print(str(oddNumber) + ' is where we always end up')
    elif oddNumber % 2 == 0:
        evenNumber2 = oddNumber // 2
        print(str(evenNumber2))
    else:
        oddNumber2 = oddNumber * 3 + 1
        print(str(oddNumber2))
"""




"""
def collatz(number):
    if number == 1:
        print(str(number) + ' is where we always end up')
        return
    elif number % 2 == 0:
        collatz(number // 2)
    else:
        collatz(number * 3 + 1)
"""

"""
while number != 1:
        if number % 2 == 0:
            number = number // 2
            print(str(number))
            return finalNum
        if number % 2 == 1:
            number = (number *3) + 1
            print(str(number))
            return finalNum

    if number % 2 == 0:
        number = number // 2
        print(str(number))
        return finalNum
    else:
        number = (number * 3) + 1
        print(str(number))
        return finalNum
"""

"""
print('Go ahead and type a number already. You won\'t believe what happens next')
number = int(input())

collatz(number)
"""


"""
while True:
    collatz(finalNum)
    finalNum = collatz(finalNum)
    if finalNum == 1:
        
        break
         
"""
