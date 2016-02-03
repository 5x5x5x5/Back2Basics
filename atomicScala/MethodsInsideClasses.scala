// Dog.scala
class Dog {
  def bark():String = { "yip!" }
}


// Cat.scala
class Cat {
  def meow():String = { "mew!"}
}

val kitty = new Cat
val m1 = kitty.meow()
assert("mew!" == m1, "Expected mew!, but instead got " + m1)

// Hamster.scala
class Hamster {
  def speak():String = { "squeak!" }
  def exercise():String = { speak() + " Running on a wheel" }
}

val buster = new Hamster
val e1 = buster.exercise()
assert(
  "squeak! Running on a wheel" == e1,
  "Don't you know what you're doing?!?!?!?"
  )