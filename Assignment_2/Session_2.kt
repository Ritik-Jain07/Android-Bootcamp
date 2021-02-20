fun main(args: Array<String>) {
    println("Question 1")
    Name()
    println("------------------")
    println("Question 2")
    Operation().add(20,20)
    Operation().add(25.0,12.0)
    Operation().multiply(12,78)
    Operation().add("Ritik","Jain")
    Operation().add("Ritik","Jain","Android")
    println("------------------")
    println("Question 3")
    Sbi()
    Icici()
    Boi()
    println("------------------")
    println("Question 4")
    val object1 = Student("Ritik")
    val object2 = Student("Adarsh")
    object1.issueBook("English")
    object2.submitBook("Maths")
    println("------------------")
    println("Question 5")
    println(grade(98))
    println("------------------")
    println("Question 6")
    list(2,44)
    println("------------------")
    println("Question 7")
    map()
    println("------------------")
    println("Question 8")
    set()
}
// Q1. Write a program to print your Firstname,LastName & age using init block,companion object.
class Name(){

     val firstname = "Ritik"
     val lastname = "Jain"
     val age = 21
    init{
        println(firstname)
        println(lastname)
        println(age)
    }
}


// Q2. Write a single program for following operation using overloading
//  A) Adding 2 integer number
//  B) Adding 2 double
//  D) multiplying 2 int
//  E) concate 2 string
//  F) Concate 3 String

class Operation(){

    fun add(a: Int,b: Int){
        println("Integer data type add function called")
        println("Sum of 2 integer no. $a and $b = ${(a+b)}")
    }
    fun add(a:Double,b:Double){
        println("Double data type add function called")
        println("Sum of 2 Double no. $a and $b = ${(a+b)}")
    }
    fun multiply(a:Int,b:Int){
        println("Integer and Double data type function called")
        println("Multiplication of 2 int no. $a and $b = ${(a*b)}")
    }
    fun add(a:String,b:String){
        println("String data type add function called")
        println("Concatenation of 2 Strings $a and $b = ${(a+" "+b)}")
    }
    fun add(a:String,b:String,c:String){
        println("String data type add function called")
        println("Concatenation of 3 strings $a,$b and $c = ${(a+" "+b+" "+c)}")
    }
}

// Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every bank.

open class Bank(){
    fun getDetails(bank_name:String,ifsc_code: String,rate_of_interest:Double){
    println("Bank Details are as follows:")
    println("Bank Name $bank_name")
    println("IFSC Code $ifsc_code")
    println("Rate of Interest $rate_of_interest %")
    }
}

class Sbi():Bank(){
    var object1=Bank().getDetails("SBI","SBIN0004441",8.5)
}

class Icici:Bank(){
    var object2=Bank().getDetails("ICICI","ICICI008953",5.5)
    }


class Boi:Bank(){
    var object3=Bank().getDetails("BOI","BOI00012687",3.5)
}

// Create Kotlin classes having suitable attributes for Library management system.Use OOPs concepts in your design.Also try to use interfaces and abstract classes.

var id=1
abstract class Library(){
    var record =HashMap<Int,String>()
    val availablebooks= mutableMapOf<String,Int>(Pair("Maths",5),Pair("English",5),Pair("Science",3))
}
interface FunctionsDelegate {

    fun issueBook(subject: String){}
    fun submitBook(subject: String){}

}
class Student(name:String):FunctionsDelegate,Library(){

    init{
        record[id]=name
        id+=1
        println(record)
        }
    override fun issueBook(subject:String){
        if(availablebooks[subject]!! <= 0){
            println("Book Not available")
        }
        else{
            availablebooks[subject]= availablebooks[subject]!!-1
            println("${subject} book issued successfully")
        }
        }
    override fun submitBook(subject: String) {
        availablebooks[subject] = availablebooks[subject]!! + 1
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
        in 81..100 -> "Rockstar"
        else -> "Invalid Marks"
    }

}

// Write a program to create mutable list of Integer. replace the second item in the list with new value. Print the list value.
fun list(indices:Int,value:Int){
    val list= mutableListOf(1,2,4,63,53,87)
    println("Original List $list")
    if(indices<list.size) {
        list[1] = value
    }
    else{
        println("Index value is greater than size of list")
    }
    println("New List $list")
}

//  Write a program to create mutable map. print all the value and key of map.

fun map(){
    val map= mutableMapOf(Pair(1,"Ritik"), Pair(2,"Jain"),Pair(3,"Android"))
    println("Keys of a map are ${map.keys}")
    println("Values of a map are ${map.values}")
}

// Write a program to create HasSet. print all the value.
fun set(){
    val set1= mutableSetOf(1,2,4,5,"Ritik")
    println("Values of a Set are $set1")
}