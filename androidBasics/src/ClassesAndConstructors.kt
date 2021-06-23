 class Vehicle(var wheels: Int){
//     var wheels =  wheels

     fun getAxle(): Int{
         return wheels / 2
     }
 }

 fun main(args: Array<String>) {
     val v = Vehicle(wheels = 6)
     println(v.wheels)
     println(v.getAxle())
     println(v.wheels)
 }