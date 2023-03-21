fun main(args: Array<String>) {

    var ussd:Int= readLine()!!.toInt()
    if(ussd  == 544){
        print("Products and Services")
        5
    }
    when(ussd){
        0-> println("Data Deals")
        1-> println("Daily Bundles")
        2-> println("Weekly Bundles")
        3-> println("Monthly Bundles")
        4-> println("Minutes")
        5-> println("Bonga Pints")
        6-> println("Tunukiwa")

        else-> println("Invalid input")

    }
}