// evaluation for conditional expressions p.58

val a = 1; val b = 5

if(a < b) {
	println("a is less than b")
}
else {
	println("a is not les than b")
}

/* Output
a is less than b
*/


if(a < 2){
	println("a is less than 2")
} else {
}

val c = 5

if(a < c) {
	if (b < c){
		println("You might have the biggest number of them all")	
	} else {
		println("Nice try, but b be bigger")
	}
} else {
	println("Come back when you get yourself a bigger number. Sheesh")
}