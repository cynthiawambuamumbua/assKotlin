import jdk.jfr.DataAmount

fun main(){
    println(randomString("cynthia"))
    var number=24
    println(number)
    var x=CurrentAccount(123456778,"CynthiaWa",3490)
    x.details(23456789,9000)
    var s=CurrentAccount(2345678,"mumbua",700)


}


//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun randomString(str1:String) {
    if (str1 <= Int.toString()) {
        var firstCharacter = str1.first()
        var lastCharacter = str1.last()
        var str1 = str1.length
        return
    }
}
    //Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false
//    fun numbers(password: String): Boolean {
//        if (numbers() <= String) {
//            for (password in 8..16) {
//                return true
//            }
//            return false
//        }
//    }

//    Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//    multiples of both 6 and 8 it should print out “Bingo!”
fun numbers(nums:Int) {
    if (nums in 1..100) {
        if (nums % 6 === 0 && nums % 8 === 0) {
            println("Bingo")
        }
    }
}
//    Create a class CurrentAccount with the following attributes: account number,
//    account name, balance. It has the following functions:
//    a. deposit(amount: Double) - Increments the balance by the amount
//            deposited
//    b. withdraw(amount: Double) - Decrements the balance by the amount
//      withdrawn
//    c. details() - Prints out the account number and balance and name in
//            this format: “Account number x with balance y is operated by z”
class CurrentAccount(AccountNumber:Int,accountName:String,balance:Int) {
    fun deposit(amount: Double): Double {
        var balance = +amount
//        val amount = balance
//        balance += amount
        return balance
    }
    fun withdraw(amount: Double):Double{
        var balance=-amount
        return balance

    }
    fun details(AccountNumber:Int,balance: Int): Int {
        var x=AccountNumber
        var y=balance
        var z=x+y
        return  z
    }
}
//Create another class SavingsAccount. It has the same functions and
///attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
///from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
class SavingsAccount(AccountNumber: Int,accountName: String,withdrawals:Int) {
    fun withdrawals() {
//        var withdrawals = withdrawals
        var nowithdrawals = if (withdrawals() <= 4) {

        } else {
            withdrawals()
        }
    }
}

private operator fun Unit.compareTo(i: Int): Int {
    TODO("Not yet implemented")
}
















