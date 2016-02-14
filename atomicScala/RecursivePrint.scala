// RecursivePrint.scala
def rPrint(s:Seq[Char]):Unit = {
	print(s.head)
	if(s.tail.nonEmpty) rPrint(s.tail) // Recursive call
}

rPrint("Recursion")

//totally cheesin it from O'Hara with my phone 
