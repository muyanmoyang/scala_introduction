package muyanmoyang.rumen


class Animal(val name:String,var age:Int){
	println("This is the super class constructor")
	val school = "GUET"
	def score = "275"
	override def toString = "I am an animal--" + school + ":" + score  
}

class Dog(name:String,age:Int,val height:Int)extends Animal(name,age){
	println("this is the class extends Animal")
	override val school = "UESTC"
	override def toString = "I am a dog --" + school + ":" + super.score
}
/*
 * abstract class
 */
abstract class Person(val name : String){
  var id:Int 
  var age:Int
  var salary:Int
  def teach
  def getSalary
}
class Teacher(name : String)extends Person(name){
  override var id = name.hashCode()
  override var age = 28
  override var salary = 1000
  override def teach(){
    println("name:"+name+"    id:"+id+"    age:"+age)
  }
  override def getSalary(){
    salary+=100
    println("salary:" + salary)
  }
}

/*
 * trait
 */
trait Logger{
  def log(msg:String)
}

class ConcreteLogger()extends Logger with Cloneable{
  override def log(msg:String){
    println("Log:" + msg)
  }
  def concreteLog(){
    println("it is me!")
  }
} 

//¶àÖØ¼Ì³Ð
class Human(){
   println("I am human")
}
trait Teacher2 extends Human{
   println("I am teacher.......")
   def teach
}
trait pianoPlayer extends Human{
   println("I am piano player......")
   def playPiano() = {println("playing piano ......")}
}
trait musicPlayer extends Human{
   println("I am music player......")
   def playMusic() = {println("playing music......")}
}
class PianoTeacher extends Human with Teacher2 with pianoPlayer with musicPlayer{
	override def teach = {
	println("teaching ......")
	}
}
object OverridDemo {
	def main(args: Array[String]) {
//		val dog = new Dog("Ä½ÑÒ",24,174)
//		println("name:" + dog.name + "   age:"+dog.age +"    height:" + dog.height )
//		println("----------------------------------------------")
//		println(dog.toString)
	  
//		val teacher = new Teacher("Ä½ÑÒ")
//		teacher.teach
//		teacher.getSalary
		
//		val concrete = new ConcreteLogger
//		concrete.log("É¶ÍæÒâ¶ù")
//		concrete.concreteLog
	  
	  // ¶àÖØ¼Ì³Ð
		val teacher = new PianoTeacher
		teacher.teach
		teacher.playMusic
		teacher.playPiano
	}
}
