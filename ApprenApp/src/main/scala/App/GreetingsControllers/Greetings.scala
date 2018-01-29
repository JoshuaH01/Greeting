package App.GreetingsControllers

object Greetings extends App {

    import App.Models.{BankAccount, CashISASavingsAccount, Person}


    val accountNumber = "12345"
    val account = new CashISASavingsAccount(accountNumber, 100.00)

    val cashISA = new CashISASavingsAccount("45678", 0.0)
    val iSADeposit: BankAccount = cashISA.deposit(200.00)
    val withdrawFromISA: BankAccount = cashISA.withdraw(100.00)

    val personWithCashISA = new Person("Loyal customer", 56, withdrawFromISA)
    val personWithCashISA2 = new CashISASavingsAccount("12345678", 0.00, depositThreshhold = 1000.00).deposit(1000.00).withdraw(300.00)

    /* val whatisname : String = prompt.ask("What is your name? ")
    val whatisage : String = promt.ask("How old are you? ")*/

    val afterWithdraw: BankAccount = account.withdraw(100.00)

    val p: Person = new Person("", 0)
    val child = new Person("Jade")

    println(personWithCashISA.speak())


}