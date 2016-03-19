object Scala_WorkSheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  		val array = new Array[Int](10)    //> array  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
  		val array2 = Array("mo","muyan","moyang")
                                                  //> array2  : Array[String] = Array(mo, muyan, moyang)
			for(elem <- array2){
		  println(elem)                   //> mo
                                                  //| muyan
                                                  //| moyang
		  }
		  
		  import scala.collection.mutable.ArrayBuffer
		  val buffer = new ArrayBuffer[Int]()
                                                  //> buffer  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
			buffer+=1                 //> res0: Scala_WorkSheet.buffer.type = ArrayBuffer(1)
			buffer+=(34,423,543,5)    //> res1: Scala_WorkSheet.buffer.type = ArrayBuffer(1, 34, 423, 543, 5)
			buffer++=Array(283,4321,5)//> res2: Scala_WorkSheet.buffer.type = ArrayBuffer(1, 34, 423, 543, 5, 283, 432
                                                  //| 1, 5)
     	println(buffer.length)                    //> 8
     	
     	
     	 val map = Map("1" -> 100, "2" -> 200)    //> map  : scala.collection.immutable.Map[String,Int] = Map(1 -> 100, 2 -> 200)
                                                  //| 
    	val result = for((k,v) <- map) yield (k,v*2)
                                                  //> result  : scala.collection.immutable.Map[String,Int] = Map(1 -> 200, 2 -> 40
                                                  //| 0)
			val map1 = scala.collection.mutable.Map("xiedadiao" -> 100,"zhudadiao" -> 80)
                                                  //> map1  : scala.collection.mutable.Map[String,Int] = Map(zhudadiao -> 80, xied
                                                  //| adiao -> 100)
		val map2 = scala.collection.mutable.Map("xiedadiao" -> 100,"zhudadiao" -> 80,"hadoop" ->10000)
                                                  //> map2  : scala.collection.mutable.Map[String,Int] = Map(hadoop -> 10000, zhud
                                                  //| adiao -> 80, xiedadiao -> 100)
    val mapOfGetelse = map2.getOrElse("hadoop",0) //> mapOfGetelse  : Int = 10000
}