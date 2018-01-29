package App

import scala.io.StdIn

abstract class BankAccount(accountNumber : String,balance: Double) {
  def withdraw(amount: Double) : BankAccount
  def deposit(amount: Double) : BankAccount
}

class SavingsAccount(accountNumber: String, balance: Double) extends  BankAccount(accountNumber, balance){

  override def deposit(amount: Double): BankAccount = new SavingsAccount(accountNumber, balance + amount)
  override def withdraw(amount: Double): BankAccount = new SavingsAccount(accountNumber, balance - amount)

}

final class CashISASavingsAccount (accountNumber: String, balance: Double) extends BankAccount(accountNumber, balance) {
  override def deposit(amount: Double): BankAccount = new SavingsAccount(accountNumber, balance + amount)
  override def withdraw(amount: Double): BankAccount = {
    println(s"You can't withdraw yet, your money is locked in for 3 years!")
    this
  }
}

class Person(name:String, age:Int, private val bankAccount: BankAccount) {

  def this(name: String, age: Int) = this(name, age, new SavingsAccount("123", 0.00))
  def this(name:String) = this(name, 0, new SavingsAccount("123", 0.00))


  private val years: String = if (age == 1) "Year" else "Years"

  def speak(): String = {
    if (name == "Joshua") {
      "You don't get a hello!!!"
    } else {
      s"Hello $name, you are $age $years old. \n You have ${bankAccount.balance} in your account."
    }
  }

  object Prompt {

    def ask(message: String): String = StdIn.readLine(message)

  }

  object Greetings extends App {


    val accountNumber = "12345"
    val account = new CashISASavingsAccount(accountNumber, 100.00)

    val name : String = prompt.ask("What is your name? ")
    val gae : String = promt.ask("How old are you? ")

    val afterWithdraw = account.withdraw(100.00)

    val p = Person = new Person(name, age.toint)
    val child = new Person("Jade")

    println(p.speak())
  }
}

