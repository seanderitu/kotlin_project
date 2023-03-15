fun main(args: Array<String>) {
    print("Welcome to our home page")
    var option:Int= readLine()!!. toInt()
    if (option==1){
        print("Data Deals")
    }
    else if (option==2){
        print("Daily Bundles")

    }
    else if (option==3){
        print("Weekly Bundles")
    }
    else if (option==4){
        print("Tunukiwa deals")

    }
     else if(option==5){
         print("Monthly Bundles")
     }

    else{
        print("Invalid input")
    }


}
