#def spam():
#    eggs = 31337
#spam()
#print(eggs)

"""
def spam():
    eggs = 98
    bacon()
    print(eggs)

def bacon():
    ham = 101
    eggs = 0

spam()
"""

"""
# Global variables can be read from local scope.
def spam():
    print(eggs)
eggs = 42
spam()
print(eggs)
"""

"""
# Local and global variables with the same name.

def spam():
    eggs = 'spam local'
    print(eggs)    # prints 'spam local'
def bacon():
    eggs = 'bacon local'
    print(eggs)    # prints 'bacon local'
    spam()
    print(eggs)    # prints 'bacon local'

eggs = 'global'
bacon()
print(eggs)        # prints 'global'
"""

"""
# the global statement

def spam():
    global eggs
    eggs = 'spam'

eggs = 'it don\'t matter'
spam()
print(eggs)
"""

"""
def spam():
    global eggs
    eggs = 'spam' # this is the global

def bacon():
    eggs = 'bacon' # this is a local

def ham():
    print(eggs) # this is the global

eggs = 42 # this is global
spam()
print(eggs)
"""

# Python will not fall back to using the global eggs variable
def spam():
    eggs = 'wha??'
    print(eggs) # ERROR!
    eggs = 'spam local'

eggs = 'global'
spam()

# This error happens because Python sees that there is an assignment statement for eggs in the spam() function and therefore considers eggs to be local. Because print(eggs) is executed before eggs is assigned anything, the local variable eggs doesn't exist.
