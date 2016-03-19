object Scala_WorkSheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 
  println("Welcome to the Scala worksheet");$skip(35); 
  		val array = new Array[Int](10);System.out.println("""array  : Array[Int] = """ + $show(array ));$skip(46); 
  		val array2 = Array("mo","muyan","moyang");System.out.println("""array2  : Array[String] = """ + $show(array2 ));$skip(42); 
			for(elem <- array2){
		  println(elem)
		  }
		  
		  import scala.collection.mutable.ArrayBuffer;$skip(99); 
		  val buffer = new ArrayBuffer[Int]();System.out.println("""buffer  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(buffer ));$skip(13); val res$0 = 
			buffer+=1;System.out.println("""res0: Scala_WorkSheet.buffer.type = """ + $show(res$0));$skip(26); val res$1 = 
			buffer+=(34,423,543,5);System.out.println("""res1: Scala_WorkSheet.buffer.type = """ + $show(res$1));$skip(30); val res$2 = 
			buffer++=Array(283,4321,5);System.out.println("""res2: Scala_WorkSheet.buffer.type = """ + $show(res$2));$skip(29); 
     	println(buffer.length);$skip(59); 
     	
     	
     	 val map = Map("1" -> 100, "2" -> 200);System.out.println("""map  : scala.collection.immutable.Map[String,Int] = """ + $show(map ));$skip(50); 
    	val result = for((k,v) <- map) yield (k,v*2);System.out.println("""result  : scala.collection.immutable.Map[String,Int] = """ + $show(result ));$skip(81); 
			val map1 = scala.collection.mutable.Map("xiedadiao" -> 100,"zhudadiao" -> 80);System.out.println("""map1  : scala.collection.mutable.Map[String,Int] = """ + $show(map1 ));$skip(97); 
		val map2 = scala.collection.mutable.Map("xiedadiao" -> 100,"zhudadiao" -> 80,"hadoop" ->10000);System.out.println("""map2  : scala.collection.mutable.Map[String,Int] = """ + $show(map2 ));$skip(50); 
    val mapOfGetelse = map2.getOrElse("hadoop",0);System.out.println("""mapOfGetelse  : Int = """ + $show(mapOfGetelse ))}
}
