
import java.util.*
import kotlin.collections.HashMap as HashMap
fun main(args: Array<String>) {
    println("Question 1")
    subString()
    println("---------------")
    println("Question 2")
    duplicate()
    println("---------------")
    println("Question 3")
    frequency()
    println("---------------")
    println("Question 4")
    calculate()
    println("---------------")
    println("Question 5")
    commonElements()
    println("---------------")
    println("Question 6")
    pair()
}
//Write a program to replace a substring inside a string with another string.
fun subString(){
    val string: String  = "Welcome to Java"
    val result = string.replace("Java","Kotlin")
    println("Old String $string")
    println("New String $result")
}
//Write a program to find the number of occurrences of the duplicate words in a string and print them.

fun duplicate(){

    val string= ("Welcome to Kotlin Programming Language !!! Kotlin".split(' '))
    val hashmap= HashMap<String,Int>()
    for (i in string) {
        if (hashmap.keys.contains(i)) {
            hashmap[i] = 1+ hashmap[i]!!
        } else {
            hashmap[i] = 1
        }
    }
    for (c in hashmap.keys) {
        if(hashmap[c]!!>1){
        println("Frequency of word $c is ${hashmap[c]}")
    }}

}

//Write a program to find the number of occurrences of a character in a string without using loop.
fun frequency(){
    val string ="ritik"
    println(string.groupingBy { it }.eachCount())
}

//Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String.
fun calculate(){
    val string= "Ritik Jain 07-10-1999"
    var lower_case=0
    var upper_case=0
    var digit=0
    var special_char=0
    val length= string.length
    for (i in string.toCharArray()) {
        if (i.isLowerCase()) {
            lower_case += 1
        } else if (i.isUpperCase()) {
            upper_case += 1
        } else if (i.isDigit()) {
            digit += 1
        } else {
            special_char += 1
        }
    }
    println("No. of uppercase characters $upper_case")
    println("Percentage of uppercase characters ${(upper_case*100/length)}%")
    println("No. of lowercase characters $lower_case")
    println("Percentage of lowercase characters ${(lower_case*100)/length}%")
    println("No. of digits $digit")
    println("Percentage of Digits ${(digit*100)/length}%")
    println("No. of special characters $special_char")
    println("Percentage of special characters ${(special_char*100)/length}%")
}

//Find common elements between two arrays.
fun commonElements(){
    val array1= intArrayOf(1,3,2,4,6,3)
    val array2= intArrayOf(1,24,5,3,6,21)
    val set= mutableSetOf<Int>()
    for (i in array1.indices){
        for (j in array2.indices){
            if(array1[i]==array2[j]){
                set.add(array1[i])
            }
        }
    }
    println("Common elements between two arrays $set")
}

//Check letter in string which do not have pair.
fun pair(){

    val string= "ritik"
    val hashmap= HashMap<Char,Int>()
    for (i in string.toCharArray()) {
        if (hashmap.keys.contains(i)) {
            hashmap[i] = 1+ hashmap[i]!!
        } else {
            hashmap[i] = 1
        }
    }
    for (c in hashmap.keys) {
        if(hashmap[c]!! == 1){
            print(c)
        }}

}
