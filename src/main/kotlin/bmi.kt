fun main(args: Array<String>) {
     print("Enter Weight")
     var weight :Int= readLine()!!. toInt()

     print("Enter Height")
     var height :Double= readLine()!!.toDouble()

     var heightsquared =height*height

     var bmi= weight/heightsquared

      if(bmi<=18){
          println("Underweight")

     }
     else  if (bmi<=29){
          println("Normal Weight")
     }
     else if (bmi<=34){
          println("Overweight")
     }
     else{
          println("Obese")
     }











}