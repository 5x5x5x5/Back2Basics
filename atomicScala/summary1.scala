// Summary1.scala

// name:type = initialization

// val name = initialization

val daysInFebruary = 28
val daysInMarch = 31

// var = name = initialization
// var name:type = initialization

var hoursSpent = 20
hoursSpent = 25

hoursSpent = 30.5 // causes error. Can't change type.

// A statement changes state
// An expression expresses

val hours = 10
val minutesPerHour = 60
val minutes = hours * minutesPerHour

// some expression (like println()) don't seem to produce a result. 
// Scala has a special Unit type for these

val result = println("???")
// ???
// result: Unit = ()

// Conditional expressions
if (99 < 100) { 4 } else { 42 }
// res0: Int = 4

val result2 = if (99 < 100) { "Bob" } else { "Meemee" }
// result2: Int = Bob

// Exercises
// 1.
val broccoli:Int = 6

// 2.
broccoli = 7
//console:8: error: reassignment to val
// because values are immutable

// 3.
var cauliflower:int = 7637
cauliflower = 56.94
//<console>:8: error: type mismatch;
// because you can change variables but not their type

// 4. 
val candy:Double = 56.76
println(candy)
// 56.76
// I don't get it. Was this a trick question. I just did what it was supposed to with no surprises.

// 5. 
var tryme:Double = 15
// tryme: Double = 15.0
// It gives you just what you want.

// 6. Store a multiline string.
var goose:String = """I don't say quack
and my eggs are bigger.
If it's sauce for me,
then so too for the gander
"""

// 7. store the string maybe as a Boolean, like a crazy person.
val nope:Boolean = "maybe"
// Of course that didn't work
//<console>:7: error: type mismatch;

// 8. store 15.4 as an Int
var masochist:Int = 15.4
/*<console>:7: error: type mismatch;
 found	 : Double(15.4)
 required: Int
*/

// 9. Modify weightStatus in CompoundBMI.scala to produce Unit instead of String
// CompoundBMI.scala
val lbs =  150.0
val height = 68.0
val weightStatus = {
	val bmi = lbs/(height * height) * 703.07
	if(bmi < 18.5) println("Underweight")
	else if(bmi < 25) println("Normal weight")
	else println("Overweight")
}

weightStatus
/* so I get a warning that a pure expression does nothing in statement position;
you may be omitting necessary paraenthesis.
This to me is an indication that a Unit type was returned.
*/

