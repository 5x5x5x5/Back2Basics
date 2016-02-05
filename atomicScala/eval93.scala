// Exercises for Mathods inside classes atom

// 1.
class Sailboat {
  def raise():String = { "Sails raised" }
  def lower():String = { "Sails lowered" }
}

class Motorboat {
  def on():String = { "Motor on" }
  def off():String ={ "Motor off" }
}

val sailboat = new Sailboat
val r1 = sailboat.raise()
assert(r1 == "Sails raised", "Uh-oh, better go back to sailing school!" + r1)
val r2 = sailboat.lower()
assert(r2 == "Sails lowered", "It didn't work. You are eaten by a grue" + r2)

val motorboat = new Motorboat
val s1 = motorboat.on()
assert(s1 == "Motor on", "Why did you say " + s1)
val s2 = motorboat.off()
assert(s2 == "Motor off", "Expected Motor off, but we got " + s2)