object ProblemOne {
	def filterMultiples(num:Int):Boolean = {
		num % 3 == 0 || num % 5 == 0
	}
	def sumRange(listOfNumbers:IndexedSeq[Int]):Int = {
		listOfNumbers.foldLeft(0){(x:Int,y:Int)=>x+y}
	}
	def main(args:Array[String]):Unit ={
		val upperLimit:Int = 1000
		val listOfNumbers = 1 to upperLimit-1
		val multiples = listOfNumbers.filter(filterMultiples _)
		println(sumRange(multiples))
	}
}
