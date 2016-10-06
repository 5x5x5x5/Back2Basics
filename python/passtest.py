print('Hello and by the way, what\'s your name?')
yourName = input()
print('So you say...what would be your password, if you are in fact the person who belongs here?')
password = input()

if yourName == 'Mary':
    print('Hello Mary')
else:
    print('Getouttahere')
if password == 'swordfish':
    print('Access granted.')
else:
    print('Wrong password.')
