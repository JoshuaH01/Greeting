package App.Models



trait Pet {
    val name: String

    def speak(): String = "Woof!"

  }
trait Walking {
  def walk: String
}

trait DogWalking extends Walking{
  override def walk = "trot"

}

trait CatWalking extends Walking{
  override def walk = "swag"

}

  class Dog(override val name:String) extends Pet{


  }

 class Cat(override val name:String) extends Pet{

    override def speak(): String = "Meow"
  }

object Pets extends App {

 val pets: List[Pet with Walking] =List(

  new Dog("Rufis") with DogWalking,

  new Cat("Narla") with CatWalking

  )
pets.foreach(p => println(p.walk))
}

