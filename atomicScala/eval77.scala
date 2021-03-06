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

// 4.

def getMe(s:String) = {
	s.toLowerCase
}

val g1 = getMe("abraCaDabra")
assert("abracadabra" == g1, "My message to the world")
val g2 = getMe("zyxwVUT")
assert("zyxwvut" == g2, "If you're reading this, say Oops")

// 5.

def addStrings(s:String, p:String) = {
	s + p
}

val s1 = addStrings("abc", "def")
assert(s1 == "abcdef", "I really wish you weren't reading this")
val s2 = addStrings("zyx", "abc")
assert("zyxabc" == s2, "Again with the errors and the printing...")

// 6.

def manyTimesString(s:String, i:Int):String = {
	s * i
}

val m1 = manyTimesString("abc", 3)
assert("abcabcabc" == m1, "You did it wrong")
val m2 = manyTimesString("123", 2)
assert("123123" == m2, "Wrong again, honey!")

// 7.

def bmiStatus(a:Double, b:Double) = {
	val bmi = a / (b * b) * 703.07
	if(bmi < 18.5) "Underweight"
	else if(bmi < 25) "Normal weight"
	else "Overweight"
}

val normal = bmiStatus(160, 68)
assert("Normal weight" == normal, "Expected Normal weight, Got " + normal)

val overweight = bmiStatus(180, 60)
assert("Overweight" == overweight, "You got some 'splainin to do")

val underweight = bmiStatus(100, 68)
assert("Underweight" == underweight, "Expected Underweight, Got " + underweight)
