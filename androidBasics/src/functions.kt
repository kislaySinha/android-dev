fun main(){
    getName()
    println(square(5))
    println(sqr1(2))
    println(sqr2(3))
}
fun getName(){
    println("hey")
}
fun square(number:Int):Int{
    return number*number
}
fun sqr1(number:Int):Int = if (number>3) number*number else -1
fun sqr2(number:Int)=number*number