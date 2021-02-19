// Q1. Write a program to print your Firstname,LastName & age using init block,companion object.
class name(){

        companion object{
            const val fname = "Ritik"
            const val lname = "Jain"
            const val age = 21
        }

}
class details(){
    init{
        println(name.fname)
        println(name.lname)
        println(name.age)
    }
}

// Q2. Write a single program for following operation using overloading
//  A) Adding 2 integer number
//  B) Adding 2 double
//  D) multiplying 2 int
//  E) concate 2 string
//  F) Concate 3 String

class operation(){

    fun add(a: Int,b: Int){
        println("Integer data type add function called")
        println("Sum of 2 integer no. ${a} and ${b} = "+(a+b))
    }
    fun add(a:Double,b:Double){
        println("Double data type add function called")
        println("Sum of 2 Double no. ${a} and ${b} =  "+(a+b))
    }
    fun add(a:Int,b:Double){
        println("Integer and Double data type function called")
        println("Multiplication of 2 int no. ${a} and ${b} =  "+(a+b))
    }
    fun add(a:String,b:String){
        println("String data type add function called")
        println("Concatenation of 2 Strings ${a} and ${b} =  "+(a+" "+b))
    }
    fun add(a:String,b:String,c:String){
        println("String data type add function called")
        println("Concatenation of 3 strings ${a},${b} and ${c}  = "+(a+" "+b+" "+c))
    }
}

// Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every bank.

open class bank(){
    open fun getdetails(){
        println("Bank Details are as follows:")
    }

}

class SBI:bank(){
    val ir = 5
    val branch_code = "SBIN0004441"
    val name = "SBI"
    override fun getdetails() {
        println("Bank Details are as follows:")
        println("Bank Name "+name)
        println("IFSC Code "+branch_code)
        println("Rate of Interest "+ir)
    }
}

class ICICI:bank(){
         val ir = 8
         val branch_code = "ICICI0007874"
         val name = "ICICI"
    override fun getdetails() {
        println("Bank Details are as follows:")
        println("Bank Name "+name)
        println("IFSC Code "+branch_code)
        println("Rate of Interest "+ir)
    }

}

class BOI:bank(){

        val ir = 6
        val branch_code = "BOI0000385"
        val name = "BOI"
    override fun getdetails() {
        println("Bank Details are as follows:")
        println("Bank Name "+name)
        println("IFSC Code "+branch_code)
        println("Rate of Interest "+ir)
    }

}

// Create Kotlin classes having suitable attributes for Library management system.Use OOPs concepts in your design.Also try to use interfaces and abstract classes.
var id=1
open class library(){
    companion object {
        var regstu: HashMap<Int,String> =HashMap<Int,String>()
        var bookava= mutableMapOf<String,Int>(Pair("Maths",5),Pair("English",5),Pair("Science",3))
    }}

interface A {

    fun issuebook(subject: String){

    }
    fun returnbook(subject: String){

    }
}
class student(name:String):A,library(){
        init{
            library.regstu[id]=name
            id+=1
            println(regstu)
        }

        override fun issuebook(subject:String){
            if(bookava[subject]!! <0){
                println("Book Not available")
            }
            else{
                bookava[subject]= bookava[subject]!!-1
                println("${subject} book issued successfully")
            }
        }
        override fun returnbook(subject: String) {
            bookava[subject] = bookava[subject]!! + 1
            println("${subject} book returned successfully")
        }
    }


//5. Write a function which take marks as an argument and return the the grade as follows:
//marks between 50 to 60 , return “Good”
//marks between 60 to 70, return “Very Good”
//marks between 70 to  80, return “Excellent”
//marks between  80 to 100, return “Rockstar”

fun grade(marks: Int): String {
    return when (marks){
        in 50..60 -> "Good"
        in 61..70 -> "Very Good"
        in 71..80 -> "Excellent"
        else -> "Rockstar"
    }

}

// Write a program to create mutable list of Integer. replace the second item in the list with new value. Print the list value.
fun list(){
    var l= mutableListOf(1,2,4,63,53,87)
    println("Original List "+l)
    l[1]=20
    println("New List"+l)
}

//  Write a program to create mutable map. print all the value and key of map.

fun map(){
    var m= mutableMapOf(Pair(1,"Ritik"), Pair(2,"Jain"),Pair(3,"Android"))
    println("Keys and values of a map "+m)
}

// Write a program to create HasSet. print all the value.
fun set(){
    var s= mutableSetOf(1,2,4,5,"Ritik")
    println("Values of a Set"+s)
}