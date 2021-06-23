/* types of args
1.positional args
2.default args
3.named args
 */
fun main(){
    showMe("kislay", isActive = true, age = 18)
    cntAndPrintArgs(1,2,3,4,5,6,7,8,9)
}
fun showMe(name:String, age:Int=22, isActive:Boolean=false){
    println("name: $name, age: $age, isActive: $isActive")
}
fun cntAndPrintArgs(vararg number:Int){
    println(number.size)
    for (x in number)
        println(x)
}