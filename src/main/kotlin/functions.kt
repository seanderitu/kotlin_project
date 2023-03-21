fun main(args: Array<String>) {


    multiply()
    add()
}

fun multiply(){
    println("Enter Number")
    var num1: Int= readLine()!!. toInt()
    var num2: Int= readLine()!!. toInt()
    var result=num1*num2
    println(result)

}

fun add(){
    println("Enter Number")
    var num11: Int= readLine()!!. toInt()
    var num22: Int= readLine()!!. toInt()
    var resultt=num11+num22
    println(resultt)

}