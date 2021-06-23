//hashmap is mutable, map is not mutable
var listofNames = listOf<String>("Hello", "ehr", "efne")
var mutlistofNames = mutableListOf<String>("sjf", "wjdw", "wfj")
var mutArrayList= arrayListOf<String>("asd","add","adad")
var mapOfNames = mapOf("rofl" to "kislay", 2 to "komal" )
var ham = hashMapOf<Any,Any>(2 to "kislay", 3 to "ksf" )

fun main(){
    mutlistofNames.add("kislay")
    println(mapOfNames["rofl"])
    println(mapOfNames[2])
    mutArrayList.add("kom")
//    hashmapOfNames.set("kis" to "lay")
    println(ham[2])
    ham.set( 2 , "hdaa")
    println(ham[2])
    ham.put("adj","rfe")
    println(ham["adj"])
}