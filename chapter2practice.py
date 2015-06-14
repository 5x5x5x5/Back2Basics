"""
print('Type some number. Go ahead. Do it!')
spam = input()

spam = int(spam)

if spam == 1:
    print('Hello')
elif spam == 2:
    print('Howdy')
else:
    print('Greetings!')
"""


"""
for i in range(10):
    print(i+1)
"""

m = True
i = 0
while m == True:
    i = i + 1
    print(i)
    m = (i < 10)
