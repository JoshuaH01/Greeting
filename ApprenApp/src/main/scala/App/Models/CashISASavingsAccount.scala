package App.Models

final class CashISASavingsAccount
(accountNumber: String, balance: Double, private val depositThreshhold : Double = 200.00)
  extends BankAccount(accountNumber, balance) {
  override def deposit(amount: Double): BankAccount = new SavingsAccount(accountNumber, balance + amount) {


      if (amount > depositThreshhold) {
      val difference = amount - depositThreshhold
      println(s"You cant put more than £$depositThreshhold, Excess: $difference")
      new CashISASavingsAccount(accountNumber, balance + depositThreshhold)
    } else {
      new CashISASavingsAccount(accountNumber, balance + amount)
    }
  }
  override def withdraw(amount: Double): BankAccount = {
    println(s"You can't withdraw yet, your money is locked in for 3 years!")
    this
  }
}
