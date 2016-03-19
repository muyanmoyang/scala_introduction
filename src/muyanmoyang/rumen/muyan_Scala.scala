package muyanmoyang.rumen

import scala.io.Source

/**
 * @author muyanmoyang
 * @ mail : 18290100360@163.com
 */
object HelloWorld {
  def main(args: Array[String]) {
//    var max = fun1(10,100)
//    println(max)
//    doWhile()
//    var result:Int = whileCirculation(99,34)
//    println("result:" + result)
    
//     var file = if(!args.isEmpty) args(0) else "muyanmoyang"
//     println(file)
     
//     fileOperation()
//     fileFilter()
//     testException()
//     forCirculation()
//    grep(".*hadoop-daemon.*")
//    arrayFun()
//    mapFun()
//    mutableMap()
    zipTest()
//    fileFun()
//    println("n!="+returnTest(10))
  }
  /**
   * compute the maxmum
   */
  def fun1(x:Int , y:Int):Int ={
    if(x>y)
      x
    else
      y
  }
  /**
   * test the do while circulation(ѭ��) 
   */
  def doWhile(){
    var line = ""
    do
    {
    	line = readLine()
    	println("Line:"+line)
    }while(line != " ")
  }
  /**
   * test the Circulation of "while" 
   */
  def whileCirculation(x:Int,y:Int):Int={
    var a = x
    var b = y
    while(a > b)
    {
      var temp = a 
      a = a % b
      b = temp
    }
    a
  }
  /**
   * test the file operate
   */
  def fileOperation(){
    
    var files = (new java.io.File("C:/Users/Administrator/Desktop")).listFiles()
    for(file <- files){
      if(file.getName().startsWith("e") || file.getName().contains("����")){ 
    	  println(file)  
      }
    }
      
  }
   /*
    * test the fuction of filter
    * ��for���ʽ��ʹ�ö��������
    */
  def fileFilter(){
    var files = (new java.io.File("C:/Users/Administrator/Desktop")).listFiles()
    //����ڷ������м��볬��һ����������if�Ӿ�����÷ֺŷָ���
    for(file <- files if file.isFile() ; if file.getName().endsWith(".caj")){
      if(file.getName().startsWith("e") || file.getName().contains("����")){ //ͨ�������Ӿ������й���
    	  println(file)  
      }
    } 
  }
  /*
    * ����Ƕ��ѭ���ķ�ʽ��ȡĳ��·����ĳ���ļ������������pattern�����ݣ�����ӡ
    * 
    */
  val filesHere = (new java.io.File("C:/Users/Administrator/Desktop")).listFiles  
  def fileLines(file: java.io.File) =  scala.io.Source.fromFile(file).getLines.toList 
  def grep(pattern : String)=
    for{file <- filesHere 
    	if file.getName().startsWith("Hadoop2 HA") 
    	line <- fileLines(file) 
    	if line.trim.matches(pattern)}
    	println(file + ": " + line.trim)  
  
  
  /**
   * test the Exception module
   */
  def testException(){
    var n = 101
    try{
    	if (n %2 == 0) println("n:"+n) else throw new RuntimeException("the number must be event")
    }catch{
      case e : Exception => println ("the exception is : " + e.getMessage()) 
    }
  }
  /**
   * test the function Circulation of "for" 
   */
  def forCirculation(){
    for(i <- 1 to 100){
      if(i %2 != 0){
        println("\n")
      }else{
    	print("number:" + i)
      }
    }
  }
  /**
   * test the array operation
   */
  def arrayFun(){
    val triple = (10000,"mo","muyanmoyang")
    println("triple:"+triple._1 )
    println("triple:"+triple._2 )
    println("triple:"+triple._3 )
    
    val array = Array(1,10,3,4,5)
    // the first way
    for(i <- 0 until array.length){
      println("array["+(i+1)+"]: "+array(i))
    }
    // the second way
    for(elem <- array){
      println("array: "+elem)
    }
  }
  /**
   *  test the map operation
   */
  def mapFun(){
    val map = Map("1" -> 100, "2" -> 200)
    val result = for((k,v) <- map) yield (k,v*2)
    for((k,v) <- result){
      println("key is:" +k + "  value is :" + v)
    }
  }
  /**
   * mutable map 
   */
  def mutableMap(){
    println("------------------Map---------------------")
    val map = scala.collection.mutable.Map("xiedadiao" -> 100,"zhudadiao" -> 80)
    val mapOfGetelse = map.getOrElse("hadoop",0)
    map +=("Spark" -> 1000)
    for((k,v) <- map){
      println("the key is :" +k + "    the value is :" +v)
    }
    println("------------------SortedMap---------------")
    val sortedMap = scala.collection.immutable.SortedMap("A" -> 100,"C" -> 90 ,"B" -> 80)
    for((k,v) <- sortedMap){
      println("the key is :" +k + "    the value is :" +v)
    }
  }
  /**
   * file operation
   */
  def fileFun(){
    val file = Source.fromFile("C:/Users/Administrator/Desktop/Hadoop2 HA Federation��������.txt")
    val url = Source.fromURL("http://spark.apache.org/")
    //��forѭ�������if��������
    for(line <- file.getLines if line.trim.matches(".*��֤.*")){
      print(line+"\n")
    }
    for(line <- url.getLines){
      print(line+"\n")
    }
  }
  /**
   * about the return of function && compute the n!
   */
  def returnTest(n:Int):Int = {
    if(n <= 0)
      1
    else
      n*returnTest(n-1)
  }
  /**
   * zip operation 
   */
  def zipTest(){
    val x = Array("[","-","]")
    val y = Array(2,7,2)
    val pairs = x.zip(y)
    for((x,y) <- pairs){
      print(x*y)
    }
  }
}
