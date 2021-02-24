fun simpleInterest(){
    val interest={amount:Int,rate:Double,time:Int -> (amount*rate*time)/100 }
    println("Calculated Simple Interest ${interest(10000,5.5,2)}")
}

fun listEmployees(){
    val empList= mutableListOf<Pair<String,Int>>();
    empList.add(0, Pair("Ritik",21))
    empList.add(1,Pair("Adarsh",22))
    empList.add(2,Pair("Ajay",45))
    empList.add(3,Pair("Vijay",31))

    val filterEmp= empList.filter { it.second>30 }

    for (i in filterEmp){
        println("Employees name and age greater than 30 are $i")
    }
}

fun main(){
    println("Question 1.")
    simpleInterest()
    println("---------------------")
    println("Question 2")
    listEmployees()
}