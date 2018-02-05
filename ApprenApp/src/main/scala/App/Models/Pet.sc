trait Pet {
 val name: String

  def speak(): String = "Woof!"

}

class Dog extends Pet{

  new val Dog = "Rufis"
  Dog.speak
}

class Cat extends Pet{

  new val Cat = "Narla"
  override def speak(): String = "Meow"
  Cat.speak
}