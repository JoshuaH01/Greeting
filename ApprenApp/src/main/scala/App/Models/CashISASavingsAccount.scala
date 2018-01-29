package App.Models

final class CashISASavingsAccount
(accountNumber: String, balance: Double, private val depositThreshhold : Double = 200.00)
  extends BankAccount(accountNumber, balance) {
  override def deposit(amount: Double): BankAccount = new SavingsAccount(accountNumber, balance + amount) {


      if (amount > depositThreshold) {
      val difference = amount - depositThreshold
      println(s"You cant put more than £$depositThreshold, Excess: $difference")
      new CashISASavingsAccount(accountNumber, balance + depositThreshold)
    } else {
      new CashISASavingsAccount(accountNumber, balance + amount)
    }
  }
  override def withdraw(amount: Double): BankAccount = {
    println(s"You can't withdraw yet, your money is locked in for 3 years!")
    this
  }
}
