package App.Models

class Person(name:String, age:Int, private val accounts: Seq[BankAccount]){

  private val excludedNames: List[String] = List("Joshua", "Jade", "Gavin", "Gemma")

  def this(name: String, age: Int) = this(name, age, accounts = List(new SavingsAccount("123", 0.00)))

  def this(name: String) = this(name, 0, accounts = List(new SavingsAccount("123", 0.00)))


  private val years: String =
  if (age == 1) "Year" else "Years"

  def speak(): String = {
    if (excludedNames.contains(name.toLowerCase)) {
      "You don't get a hello!!!"
    } else {
      s"Hello $name, you are $age $years old. \n You have accounts:$accounts"
    }

  }
}




