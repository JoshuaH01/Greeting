package Animals

object MyAnimals extends App {
  val jess: Animal = new Cat()
  val lassie: Animal = new Dog()

  println(jess.speak())
  println(lassie.speak())
}

abstract class Animal{
  def speak() : String
}


class Cat() extends Animal {
  override def speak() = "Meow"
}

class Dog() extends Animal {
  override def speak() = "Wuff"
}
