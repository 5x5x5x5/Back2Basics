// recursion.scala

package recursion

import scala.annotation.tailrec

/*
 * Different ways to calculate the sum of a list using
 * recursive Scala methods
 */

object Sum extends App {

  val list = List.range(1, 100)
  println(sum(list))
  println(sum2(list))
  println(sum3(list))
  println(sumWithReduce(list))

  // (1) yields a "java.lang.StackOverflowError" with large lists
  def sum(ints:List[Int]):Int = ints match {
    case Nil => 0
    case x :: tail => x + sum(tail)
  }

  // (2) tail-recursive solution
  def sum2(ints:List[Int]):Int = {
    @tailrec
    def sumAccumulator(ints:List[Int], accum:Int): Int = {
      ints match {
        case Nil => accum
	case x :: tail => sumAccumulator(tail, accum + x)
      }
    }
    summAccumulator(ints, 0)
  }

  // (3) good example of recursion here:
  // stackoverflow.com/questions/12496959/summing-values-in-a-list
  // this example is from that page:
  def sum3(xs:List[Int]):Int = {
    if (xs.isEmpty) 0
    else xs.head + sum3(xs.tail)
  }

}

def sumWithReduce(ints:List[Int]) = {
  ints.reduceLeft(_+ _)
}

// Calculating the "product" of a List[Int] recursively

/*
 * Different ways to calculate the product of a List[Int] recursion.
 */

object Product extends App {

  val list =List(1, 2, 3, 4)
  println(product(List(1, 2, 3, 4)))
  println(product2(List(1, 2, 3, 4)))

  // (1) basic recursion; yields a "java.lang.StackOverflowError" with large Lists
  def product(ints:List[Int]):Int = ints match{
    case Nil => 1
    case x :: tail => x * product(tail)
  }

// (2) tail-recursive solution
  def product2(ints:List[Int]): Int = {
    @tailrec
    def productAccumulator(ints:List[Int], accum:Int):Int ={
      ints match {
        case Nil => accum
	case x :: tail => productAccumulator(tail, accum * x)
      }
    }
    productAccumulator(ints, 1)
  }
}


/*
 * Calculating the "max" of a List[Int] recursion.
 */

object Max extends App {

  val blist = List.range(1, 10000)
  println(max(blist))
  println(max2(blist))

  // (1) using 'match'
  def max(ints:List[Int]):Int = {
    @tailrec
    def maxAccum(ints:List[Int], theMax:Int):Int ={
      ints match {
        case Nil => theMax
	case x ::tail =>
	  val newMax = if (x > theMax) x else theMax
	  maxAccum(tail, newMax)
	}
      }
      maxAccum(ints, 0)
    }

  // (2) using if/else
  def max2(inst:List[Int]):Int = {
    @tailrec
    def maxAccum2(ints:List[Int], theMax:Int):Int = {
      if (ints.isEmpty) {
        return theMax
      } else {
        val newMax = if (ints.head > theMax) ints.head else theMax
	maxAccum2(ints.tail, newMax)
      }
    }
    maxAccum2(ints, 0)
  }
}