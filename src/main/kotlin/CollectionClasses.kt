fun main(args: Array<String>) {
    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")
    println(imperials)
    //sorting in this list on the basis of first alphabet
    println(imperials.sorted())
    //accessing from index
    println(imperials[2])
    //accessing last element of the list
    println(imperials.last())
    //checking if the list contains the passed string or not
    println(imperials.contains("Luke"))

    val rebels = arrayListOf("Leiah","Luke","Han Solo","Mon Mothma")
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0,"Lando")
    println(rebels)
    println(rebels.indexOf("Luke"))

    rebels.remove("Han Solo")
    println(rebels)

    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon","Luke" to "Landspeeder")
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leiah", "This ship doesn't exist"))
    println(rebelVehiclesMap.values)

    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Rocket pack")
    rebelVehicles["Luke"] = "XWing"
    rebelVehicles.put("Leiah", "Tantive IV")
    println(rebelVehicles)
    rebelVehicles.remove("Boba Fett")
    println(rebelVehicles)
    rebelVehicles.isEmpty()

}