// PythagoreanTheorem.scala
package com.atomicscala.pythagorean

class RightTriangle {
  def hypotenuse(a:Double, b:Double):Double={
    Math.sqrt(a*a + b*b)
  }
  def area(a:Double, b:Double):Double = {
    a*b/2
  }
}

class EquilateralTriangle {
  def area(side:Double):Double = {
    (side * side) * (math.sqrt(3)) / 4
  }
}