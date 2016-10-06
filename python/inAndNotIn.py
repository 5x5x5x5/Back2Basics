# inAndNotIn.py

'howdy' in ['hello', 'hi', 'howdy', 'heyas']
spam = ['hello', 'hi', 'howdy', 'heyas']
'howdy' not in spam
'cats' not in spam
'cat' in spam

myPets = ['Dazzler', 'Jack', 'The Colonel', 'Thoreau']
print('Enter a pet name:')
name = input()
if name not in myPets:
    print('I do not have a pet named ' + name)
else:
    print(name + ' is my pet.')
