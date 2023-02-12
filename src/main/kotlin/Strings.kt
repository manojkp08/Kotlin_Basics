fun main(args: Array<String>){
    //val str = "Weather is \\ pleasant today"
    //val str = "Weather is \r rpleasant today"
    //val str = "Weather is \$ pleasant today"
    //val str = "Weather is \' pleasant today"
    //val str = "Weather is \n pleasant today"
    val str = "Weather is pleasant today."
    println(str)

    val rawCrawl = """ >A long time ago,
        >in a galaxy
        >far, far, away...
        >BUMM BUMM BUMMM """.trimMargin(">")
    println(rawCrawl)

//    for (char in str){
//        println(char)
//    }

    val checkcontent: Boolean = str.contentEquals("Weather is pleasant today.")
    println(checkcontent)

    val contains = str.contains("Weather", false)
    println(contains)

    val upper = str.toUpperCase()
    val lower = str.toLowerCase()
    println(upper)
    println(lower)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subsequence = str.subSequence(4,13)
    println(subsequence)

    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    val age = 27

    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle")
    println("Luke's full name $luke has ${luke.length} characters")
}