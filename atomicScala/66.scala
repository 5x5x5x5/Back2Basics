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

// third question

val activity = "swimming"
val hour = 10

val isOpen = {
	if(activity == "swimming" ||
		activity == "ice skating") {
		val opens = 9
		val closes = 20
		println("Operating hours: " + opens + " - " + closes)
		if(hour >= opens && hour <= closes) {
			true
		} else {
			false
		}
	} else {
		false
	}
}
 println(isOpen)
 /* Output:
 Operating hours: 9 - 20
 true
 */

 val doActivity = isOpen && goodTemperature
 println(activity + ": " + isOpen + " && " + goodTemperature + " = " + doActivity)
 /* Output
 (run 4 times, once for each activity):
 swimming: false && false = false
 walking: true && true = true
 biking: true && false = false
 couch: true && true = true
 */

 // Question 4

 val distance = 9
 val activity = "running"
 val willDo = //fill this in

 /* Output
 (run 3 times, once for each activity):
 running : true
 walking: false
 biking: true
 */