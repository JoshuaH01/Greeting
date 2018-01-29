package App.Models

abstract class BankAccount(accountNumber : String,balance: Double) {
  def withdraw(amount: Double) : BankAccount
  def deposit(amount: Double) : BankAccount

  override  def toString: String = s"Account number: $accountNumber balance: $balance"
}
