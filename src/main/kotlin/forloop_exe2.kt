fun main(args: Array<String>) {
    for (x in 1..100)

        if (x % 3==0){
            println("$x FizzBuzz")
        }
    else if (x % 5==0){
        println("$x Buzz")
    }

    else if (x % 15==0){
        println("$x Fizz")
    }

}