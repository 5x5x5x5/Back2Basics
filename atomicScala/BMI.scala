// BMI.scala

val kg = 72.57 // 160lbs
val heightM = 1.727 // 68 inches

val bmi = kg/(heightM * heightM)
if (bmi < 18.5) println("Underweight")
else if (bmi < 25) println("Normal weight")
else println("Overweight")

/* Output:
Normal weight
*/

// integer maths lesson

val lbs:Double = 160
val height = 68

val bmi2 = lbs / (height * height) * 703.07

if (bmi2 < 18.5) println("Underweight")
else if (bmi2 < 25) println("Normal weight")
else println("Over")

