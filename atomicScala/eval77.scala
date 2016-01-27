// methods evaluation

def getSquare(x:Int):Int = {
	x * x
}

val a = getSquare(3)
assert(a == 9)
val b = getSquare(6)
assert(b == 36)
val c = getSquare(5)
assert(c == 25)