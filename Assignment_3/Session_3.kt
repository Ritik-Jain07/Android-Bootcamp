//WAP to create singleton class.

object PersonDetails{
    fun print() {
        println("Ritik")
    }
}

//WAP to create sealed Base class and 3 subclasses of Base class, write a function which will have base class object as an argument and it will return name of the subclass based argument type.

sealed class Car{
    class Mercedes: Car()
    class Honda: Car()
    class Tata:Car()
}

fun sample(c:Car){
    when(c){
        is Car.Mercedes -> println("Mercedes Class called")
        is Car.Honda -> println("Honda Class called")
        is Car.Tata -> println("Tata Class called")
        else -> println("Invalid Call")

    }
}

//WAP to create extension function.

fun MutableList<Int>.swap(index1:Int,index2:Int):MutableList<Int> {
    val tmp=this[index1]
    this[index1]=this[index2]
    this[index2]=tmp
    return this
}


fun main(args: Array<String>) {
    println("-----------------------")
    println("Question 2")
    println(PersonDetails.print())
    println("-----------------------")
    println("Question 3")
    val obj1=Car.Mercedes()
    val obj2=Car.Mercedes()
    val obj3=Car.Mercedes()
    println(sample(obj1))
    println(sample(obj2))
    println(sample(obj3))
    println("-----------------------")
    println("Question 4")
    val list= mutableListOf<Int>(5,10,15)
    println("List before swapping $list")
    println("list after swapping ${list.swap(1,2)}")

}