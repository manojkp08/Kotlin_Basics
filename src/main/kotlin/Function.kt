fun main(args: Array<String>){
    fun forceChoke(){
        println("You have a nice looking car.")
    }
    forceChoke()

    fun makeAnEntrance(line: String){
        println(line)
    }
    makeAnEntrance("I find your lack of faith disturbing.")

    fun calculateNumberGoodGuys(rebels: Int, ewoks: Int): Int {
        val goodGuys = rebels + ewoks
        return goodGuys
    }
    val rebels = calculateNumberGoodGuys(5,7)
    // val rebels = 12
    println("Darth Vader faced off against $rebels rebel scum.")
    println("Darth Vader faced off against ${calculateNumberGoodGuys(5,7)} rebel scum.")

    fun vaderIsFeeling(mood:String = "angry"){
        println(mood)
    }
    vaderIsFeeling("happy")

    fun calc_div(num1: Int, num2: Int):Int {
        val division = num1 / num2
        return division
    }
    val divresult = calc_div(54,2)
    println(divresult)
}