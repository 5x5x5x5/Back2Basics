"""
When this program starts, Python first imports the random muodule.
The the getAnswer() function is defined.
Because this function is being defined (and not called), the execution skips over the code in it.
Next, the random.randint() function is called with two arguments, 1 and 9.
It evaluates to a random integer between 1 and 9 (including 1 and 9 themselves), and this value is stored in the variable named r.

The getAnswer() function is called with r as the argument.
The program execution moves to the top of the getAnswer() function, and the value r is stored in a parameter named answerNumber.
Then, depending on this value in answerNumber, the function returns one of many possible string values.
The program execution returns to the line at the bottom of the program that originally called getAnswer().
The returned string is assigned to a variable named fortune, which then gets passed to a print() call and is printed to the screen.
"""


import random

def getAnswer(answerNumber):
    if answerNumber == 1:
        return 'It is certain'
    elif answerNumber == 2:
        return 'It is decidedly so'
    elif answerNumber == 3:
        return 'Yes'
    elif answerNumber == 4:
        return 'Reply hazy try later'
    elif answerNumber == 5:
        return 'Ask again later'
    elif answerNumber == 6:
        return 'Concentrate and ask again'
    elif answerNumber == 7:
        return 'My reply is no'
    elif answerNumber == 8:
        return 'Outlook not so good'
    elif answerNumber == 9:
        return 'Very doubtful'

r = random.randint(1,9)
fortune = getAnswer(r)
print(fortune)


'''
Since we can pass return values as arguments to another function call, the last line can be written

print(getAnswer(random.randint(1,9)))
'''
