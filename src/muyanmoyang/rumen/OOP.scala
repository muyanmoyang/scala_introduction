
package muyanmoyang.rumen

object OOP {
	class Student{
	  var age = 0
	  private[this] var privateAge = 0 
	  val name = "Hadoop"
	  def ageAdd(age:Int):Int = {
	    val returnAge = age + 1
	    returnAge
	  }
//	  def isYounger(other:Student)=privateAge < other.privateAge 
	  
	}
	def main(args: Array[String]) {
//		val stu = new Student()
//		println("age:"+stu.ageAdd(stu.age))
//		stu.age = 100
//		println("age:"+stu.age)
//		println("name:"+stu.name)
	  
//	  val tea = new Teacher()
//	  tea.name = "ƒΩ—“"
//	  tea.printInfo()
	  
//	  val muyan = new Muyan("ƒΩ—“",24,"ƒ–")
//	  println("name: "+ muyan.name +"   age:" + muyan.age +"  gender:" + muyan.gender)
//	  val muyan1 = new Muyan("ƒ™—Ù",25)
//	  muyan1.gender = "ƒ–"
//	  println("name: "+ muyan1.name +"   age:" + muyan1.age +"  gender:" + muyan1.gender)
	  
//	  val outer1 = new Outer("Hadoop")
//	  val outer2 = new Outer("Spark")
//	  val inner1 = new outer1.Inner("JAVA") 
//	  val inner2 = new outer1.Inner("Scala")
//	  inner1.foo(inner1)
//	  inner2.foo(inner2)
	  
//	  for(i <- 1 to 100){
//		  println("University-StudentNo:"+University.newStudentNo)
//	  }
//	  val university = new University()
//	  val num = university.fun()
//	  println(num)
	  
	  val a = applyTest()
	  a.apply
	  a.haveTry
	  
	}
	
	class Teacher{
	  var name : String = _
	  var age = 24
	  private[this] var gender:String = "ƒ–"
	  
	  def this(gender:String){
	    this()
	    this.gender = gender  
	  }
	  def printInfo(){
	    Console.print("name:" + this.name +"   age:"+this.age +"    gender:"+this.gender)
	  }
	}
	
	class Muyan(val name:String,val age:Int){
	  println(" ------------------------this is the main construtor------------------")
	  var gender : String = _ 
	  def this(name:String,age:Int,gender : String){
	    this(name,age)
	    this.gender = gender
	  }
	} 
	class Outer(val name:String){
	    outer => 
	      class Inner(val name :String){
	        def foo(b:Inner){
	          println("Outer name:" + outer.name + "        Inner name:" + b.name )
	        }
	      }
	}
	/**
	 * object ∂‘œÛ
	 */
	object University{
	  private var studentNo = 0
	  def newStudentNo = {
	    studentNo += 1
	    studentNo
	  }
	}
	class University{
	  var id = University.newStudentNo
	  def fun()= {
	    id += 1
	    id
	  }
	}
	
	object applyTest{
		def apply()={
		  println("----------------")
		  new ApplyTest
		}
	}
	class ApplyTest{
		def apply()={
		  println("****************")
		}
		def haveTry{
		  print("^^^^^^^^^^^^^^^^")
		}
	}
}