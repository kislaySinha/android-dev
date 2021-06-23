import java.time.temporal.TemporalAmount

fun main(){
    val account= Account(322)


//    account.insertDetails(2206,"kislay",200f)
    account.deposit(100f)
    account.withdraw(250f)
//    println(account.amount)
    account.printDetails()
}

//class User{
//    val name: String = ""
//    val mobile: Int=1
//    val email: String=""
//
//    fun checkEmail(): Boolean{
//        return email.isNotEmpty()
//    }
//}
class Account{
    var accNo:Int=1
    var name:String=""
    var amount:Float=0f
//    init {
//        this.accNo=accNo
//        this.name=name.replaceFirstChar { 'A' }
//        this.amount=amount+1000
//    }

    //secondary constructor
    constructor(accNo:Int){
        this.accNo=accNo
        name="as"
        amount=1213f
    }
    constructor(accNo: Int,name: String,amount:Float)
    fun deposit(money:Float){
        amount+=money
        println(amount)
    }
    fun withdraw(money: Float){
        if(money>amount){
            println("Not sufficient amount")
        }
        else{
            amount-=money
            println("ur amount" + amount)
        }
    }
//    fun insertDetails(ac:Int,nm:String,amnt:Float){
//        accNo=ac
//        name=nm
//        amount=amnt
//    }
    fun printDetails(){
        println("$accNo, $name, $amount")
    }

}