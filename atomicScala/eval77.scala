// methods evaluation

// 1.

def getSquare(x:Int):Int = {
	x * x
}

val a = getSquare(3)
assert(a == 9)
val b = getSquare(6)
assert(b == 36)
val c = getSquare(5)
assert(c == 25)

// 2.

def getSquareDouble(x:Double) = {
	x * x
}
	
val sd1 = getSquareDouble(1.2)
assert(1.44 == sd1, "What's this supposed to be")
val sd2 = getSquareDouble(5.7)
assert(32.49 == sd2, "Should I be reading this?")

// 3.

def isArg1GreaterThanArg2(x:Double, y:Double) = {
	if(x > y) {true}
	else {false}
}

val t1 = isArg1GreaterThanArg2(4.1, 4.12)
assert( t1 == false)
val t2 = isArg1GreaterThanArg2(2.1, 1.2)
assert( t2 == true)