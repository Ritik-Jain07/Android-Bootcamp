fun simpleInterest(){
    val interest={amount:Int,rate:Double,time:Int -> (amount*rate*time)/100 }
    println("Calculated Simple Interest ${interest(10000,5.5,2)}")
}

data class Employee(val name:String,val age:Int)

fun listEmployees(){
    val empList: List<Employee> = listOf(
        Employee("Ritik", 21),
        Employee("Adarsh", 22),
        Employee("Ajay", 45),
        Employee("Vijay", 31)
    )

    val filterEmp= empList.filter {employee-> employee.age>30 }

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