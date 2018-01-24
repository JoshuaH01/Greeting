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

class Person(name:String, age:Int) {

  def speak() : String = {
    if(name =="Joshua") {
      "You don't get a hello!!!"
    } else {
      "hello " + name + ",you are " + age + " years old"
    }
  }
  private val years	: String = if (age == 1) "years" else "year"
 }

object Prompt {

  def ask(message: String) : String = StdIn.readLine(message)

}

object Greetings extends App {




//    val n : String = Prompt.ask("What is your name? ")
//  val a = Prompt.ask("How old are you?")
//
//    val p = new Person(n,a.toInt)
//  println(p.speak())

  val accountNumber = "12345"
  val account = new CashISASavingsAccount(accountNumber, 100.00)
  val afterWithdraw = account.withdraw(100.00)

  }

