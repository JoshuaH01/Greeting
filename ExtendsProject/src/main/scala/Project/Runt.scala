package Project

object Runt extends App {

  val Wolf: Animal = new Wolf("Wolf")
  val borderTerrier: BorderTerrier = new BorderTerrier("","Hunts rabbits")
  val persianCat: PersianCat = new PersianCat("","Meow")
  val meowth: Meowth = new Meowth("",10)

  println("wolf: "+Wolf.Speak)
  println("Border Terrier: " +borderTerrier.Speak)
  println("Border Terrier: " +borderTerrier.Hunt)
  println("Persian Cat " +persianCat.Speak)
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

  class PersianCat(name:String, whatISpeak:String) extends Cat(name,"Meow")

  class Meowth(name:String, coin:Int) extends Cat(name,"Thats right!") {
    def Greet : String = {
      if (coin >= 10) {
        "Team Rocket that's right"
      }
        else {""
      }
    }

  }

