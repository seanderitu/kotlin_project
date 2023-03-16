fun main(args: Array<String>) {
    print("Enter your marks")
    var marks:Int= readLine()!!. toInt()

     if(marks>=80){
        print("A Excellent")
    }
    else if(marks>=70){
        print("A- Excellent")
    }
    else if(marks>=60){
        print("B+ Good")

    }
    else if(marks>=50){
        print("B Good trial")
    }

    else if (marks>=0){
        print("Failed! Do better next time")

    }


    else{
        print("Invalid Input")

    }


    }




