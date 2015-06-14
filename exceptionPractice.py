"""
# This is how you get an error
def flan(divideBy):
    return 42 / divideBy

print(flan(2))
print(flan(12))
print(flan(0))
print(flan(1))
"""

"""
def flab(divideBy):
    try:
        return 42 / divideBy
    except ZeroDivisionError:
        print('Error: That\'s the argument of a flapper')

print(flab(2))
print(flab(12))
print(flab(0))
print(flab(1))
"""

def slab(divideBy):
    return 42 / divideBy

try:
    print(slab(2))
    print(slab(12))
    print(slab(0))
    print(spam(1))
except:
    print('Error: Arguments schmarguments.')
