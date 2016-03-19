package muyanmoyang.rumen

import scala.collection.mutable.ArrayBuffer

object Scala_Array {
	def main(args: Array[String]) {
		val array = new Array[Int](10) 
		val array2 = Array("mo","muyan","moyang")
//		for(elem <- array2){
//		  println(elem)
//		}
		
		val buffer = new ArrayBuffer[Int]()
		buffer+=1
		buffer+=(34,423,543,5)
		buffer++=Array(283,4321,5)
//		println(buffer)
		buffer.remove(2,3)
		
		for(elem <- buffer){
//		  print(elem+"¡¢")
		}
		//Function
		val res = testYield()
//		println()
		for(elem <- res){
//		  print(elem+"¡¢")
		}
		
		val array3 = Array(4324,4326,6,48,67)
		val arrayFilter = array3.filter(_% 2 == 0).map(2 * _)
		for(elem <- arrayFilter) print(elem+"¡¢")
		
		testSort()
		
	}
	/**
	 * the operation of "yield"
	 */
	def testYield()={
	  val array = Array(4,14,325,46,21)
	  val res = for(elem <- array) yield 2*elem
	  res
	}
	/**
	 * the sort of array
	 */
	def testSort()={
	   val array = Array(4,14,325,46,21)
	   array.sorted
	   array
	}
}
