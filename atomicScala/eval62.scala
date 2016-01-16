// eval62.scala

val sunny = true
val temp = 99

val groovin:Boolean = (sunny && temp > 80)
println(groovin)

/* Output
true
*/

val partlycloudy = false

val smoothchillin = 
  (sunny || partlycloudy) && temp > 80
println(smoothchillin)

/* Output
true
true
*/

val confused = 
  (sunny || partlycloudy) && (temp > 80 || temp < 20)
println(confused)

/* Output
true
true
true
*/

// Convert farenheit to celsius

val F:Double = 75

val C = {
	val mid = F - 32
	mid * 5 / 9
}

val calcF = {
	val mid = C * 9 / 5
	mid + 32
}
println(C)
println(F)