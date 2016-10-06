#spam = 0
#if spam < 5:
#    print('Hello, world.')
#    spam = spam + 1

## Alternatively with a while loop
#spam = 0
#while spam < 5:
#    print('Hello, world')
#    spam = spam + 1

### Here's an annoying while loop
name = ''
while True:
    print('Please type your name.')
    name = input()
    if name == 'your name':
        break
print('Thank you!')
