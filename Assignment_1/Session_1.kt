
import java.util.*
import kotlin.collections.HashMap as HashMap

//Write a program to replace a substring inside a string with another string.
fun sub(){
    var s: String  = "Welcome to Java"
    var res = s.replace("Java","Kotlin")
    println("Old String "+ s)
    println("New Stirng "+ res)
}
//Write a program to find the number of occurrences of the duplicate words in a string and print them.

fun duplicate(){

    var s= listOf("Welcome to Kotlin Programming Language !!! Kotlin".split(' '))[0]
    val a:HashMap<String,Int> = HashMap<String,Int>()
    for (i in s) {
        if (a.keys.contains(i)) {
            a[i] = 1+ a[i]!!
        } else {
            a[i] = 1
        }
    }
    for (c in a.keys) {
        if(a[c]!!>1){
        println(c + "  " + a[c])
    }}

}

//Write a program to find the number of occurrences of a character in a string without using loop.
fun freq(){
    val i ="ritik"
    println(i.groupingBy { it }.eachCount().filter { it.value > 1 })
}

//Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String.
fun calculate(){
    var s= "Ritik Jain 07-10-1999"
    var l_c=0
    var u_c=0
    var d=0
    var s_c=0
    var s1=0
    var l= s.length
    for (i in s.toCharArray()) {
        if (i.isLowerCase()) {
            l_c += 1
        } else if (i.isUpperCase()) {
            u_c += 1
        } else if (i.isDigit()) {
            d += 1
        } else if (i == ' ') {
            s1 += 1
        } else {
            s_c += 1
        }
    }
    println("No. of uppercase characters "+u_c)
    println("No. of lowercase characters "+l_c)
    println("No. of digits "+d)
    println("No. of special characters "+s_c)
}

//Find common elements between two arrays.
fun common(){
    val a= arrayOf(1,3,2,4,6,3)
    val b= arrayOf(1,24,5,3,6,21)
    val res = a.intersect(b.toList()).toIntArray()
    println(Arrays.toString(res))
}

//Check letter in string which do not have pair.
fun pair(){

    var s= "ritik"
    val a:HashMap<Char,Int> = HashMap<Char,Int>()
    for (i in s.toCharArray()) {
        if (a.keys.contains(i)) {
            a[i] = 1+ a[i]!!
        } else {
            a[i] = 1
        }
    }
    for (c in a.keys) {
        if(a[c]!! == 1){
            print(c)
        }}

}
