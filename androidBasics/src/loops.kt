var x= hashMapOf(1 to "hello", "sfda" to "kislay", 3 to "sexy")

var y = mutableListOf<String>("kis","lay","sin","ha")

fun main(){
    x.forEach{
        println(it)
    }
    y.forEach {
        println(it)
    }
    for (name in y){
        print(name)
    }
    for(s in 0 until 10){
        println(s)
    }
    for(s in 0..10){
        println(s)
    }
    for(s in 0..3){
        println(y[s])
    }
    for(x in 0 until  10 step 2){
        println(x)
    }
    for(x in 10 downTo  0 step 2){
        println(x)
    }
}