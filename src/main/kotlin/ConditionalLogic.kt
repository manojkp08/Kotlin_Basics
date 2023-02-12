fun main(args: Array<String>){
    val p = 2
    val q = 2
    if (p == q){
        println("A does in fact equal B")
    }else{
        println("A does not equal B")
    }

    val accountBalance = 1000
    val price = 30
    if (accountBalance >= price){
        println("You can purchase this item")
    }else{
        println("You cannot purchase this item")
    }

    //val degrees = 70
    val degrees = 20
    //Here the temperature is in degree fahrenheit.
    if(degrees >= 70){
        println("This is some nice weather")
    }else if (degrees < 70 && degrees >= 50){
        println("Grab a sweater")
    }else{
        println("Holy crap its cold!")
    }

    val isHungry = false
    val isBored = true

    if (isHungry == true || isBored == true){
        println("Lets get a pizza")
    }

    val x = 1
    when(x){
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("x does not equal to 1 or 2")

    }

    fun vaderIsFeeling(mood: String = "angry"){
        if (mood == "angry"){
            println("run for the hills, Vader is $mood")
        }else{
            println("whatever you do, don't make him angry")
        }
    }
    vaderIsFeeling("happy")

    //now we are making a calculator using Kotlin
    val opr:String = "*"
    val a:Float = 63F
    val b:Float = 7F
    when (opr){
        "+" -> println(a+b)
        "-" -> println(a-b)
        "*" -> println(a*b)
        "/" -> println(a/b)
    }
}