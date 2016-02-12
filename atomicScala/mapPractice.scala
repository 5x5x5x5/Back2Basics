// mapPractice.scala

case class User(id:Int, firstname:String, lastname:String, active:Boolean)

def activeById(us:Seq[User]) = us.filter(_.active).sortBy(_.id).map(_.lastname)

val activeUsersById = activeById(Seq(
  User(76, "Danny", "Siegle", true),
  User(33, "Kevin", "Smith", false),
  User(23, "Jack", "Sparrow", true)
))