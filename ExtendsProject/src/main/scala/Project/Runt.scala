package Project

object Runt extends App {

  val wolf: Animal = new Wolf("Wolf")
  val borderTerrier: BorderTerrier = new BorderTerrier("","Hunts rabbits")
  val persionCat: PersionCat = new PersionCat("","Meow")
  val meowth: Meowth = new Meowth("",10)

  println("wolf: "+wolf.Speak)
  println("Border Terrier: " +borderTerrier.Speak)
  println("Border Terrier " +borderTerrier.Hunt)
  println("Persion Cat " +persionCat.Speak)
  println(meowth.Greet)
}

  class Animal(name:String, whatISpeak:String = "Hello") {
    def Speak(): String = whatISpeak
  }

  class Dog (name:String, whatISpeak:String = "Wuff") extends Animal(name, whatISpeak)


  class Wolf(name:String) extends Dog(name, "Howls")


  class BorderTerrier(name:String,hunt:String) extends Dog(name){
    def Hunt():String = hunt
  }

  class Cat(name:String, whatISpeak:String) extends Animal (name, whatISpeak = "Hello")

  class PersionCat(name:String, whatISpeak:String) extends Cat(name,"Meow")

  class Meowth(name:String, coin:Int) extends Cat(name,"Thats right!") {
    def Greet : String = {
      if (coin >= 10) {
        "Team Rocket that's right"
      }
        else {""
      }
    }

  }

