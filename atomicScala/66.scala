// More compound expression practice

val a = 7
val b = 5
val c = 7

val check = (a >= b) && (b >= c)

println(check)

// part the second

val doubleCheck = {
	if(a >= c && b >= c) {
		println("Both are!")
	} else {
		println("one is and one isn't!")
	}
}