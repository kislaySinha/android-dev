fun main(){
    val any: Any= "nam"
    val bAny: String = any as String
    if(bAny is String){
        println(bAny)
    }
    when(any){
        "kislay"->{
            println("Name1")
        }
        "sinha"->{
            println("Name2")
        }
        "hello"->{
            println("hName3")
        }
        "world"->{
            println("Name4")
        }
        else->{
            println("not")
        }
    }
    val x= when(any){
        "kis"-> "kislay $any"
        "name"->"ass $any"
        else->"not valid"
    }
    println(x)
}