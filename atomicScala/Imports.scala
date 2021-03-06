// ImportClass.scala
import util.Random

val r = new Random
println(r.nextInt(10))
println(r.nextInt(10))
println(r.nextInt(10))

// ImportMultiple.scala
import util.Random
import util.Properties

val r = new Random
val p = Properties

// ImportSameLine.scala
import util.Random, util.Properties

val r = new Random
val p = Properties

// ImportCombined.scala
import util.{Random, Properties}

val r = new Random
val p = Properties

// ImportNameChange.scala
import util.{ Random => Bob,
  Properties => Jill }

val r = new Bob
val p = Jill

// ImportEverything.scala
import util._

val r = new Random
val p = Properties

// FullyQualify.scala

val r = new util.Random
val p = util.Properties
