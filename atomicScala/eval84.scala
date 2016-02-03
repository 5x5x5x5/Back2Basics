val r1 = Range(0, 10)

// eval84.scala

val r = Range(0, 20)
val r2 = Range(0, 20, 2) // creates range with step size 2
r.step
r2.step

// 2.
var s = "This is an experiment"
s.split(" ")

// 3. 

var s1:String = "Sally"
var s2:String = "Sally"

if(s1.equals(s2)) println("s1 and s2 are equal")
else println("s1 and s2 don't seem to match up")

// 4. 

var s3:String = "Sam"
if(s1.equals(s3)) println("s1 and s3 are equal")
else println("Not gonna happen")

// 5.

var s4 = s1.toUpperCase
if(s1.contentEquals(s4)) println("They are equal")
else println("What in blue blazes is going on here?")
