
fun main (args:Array<String>){

//    Any ,Unit,Nothing

//    Any:every type in Kotlin exept null
    val anyNumber : Any = 42
    val anyString :Any = "String"

//    Unit:Unit object : void in java
    add()
    doNothing()


}

///    Nothing : fun returns nothing

fun doNothing() : Nothing {
    while (true){

    }

}


fun add():Unit{
    val addNumber = 2+4

    println("The number is devisible by three")
}
