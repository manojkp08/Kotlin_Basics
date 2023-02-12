//class Car constructor(make: String, model:String){
//    val make = make
//    val model = model
//}
//We can also make class like this.
//
//class Car(val make: String, val model: String, val color: String){
//    fun accelerate(){
//        println("Vroomvroom")
//    }
//    fun details(){
//        println("This is a $color $make $model")
//    }
//}
//class Truck(val make: String, val model: String, val towingcapacity: Int){
//    fun tow(){
//        println("taking the heroes to the rodeo")
//    }
//    fun details(){
//        println("This $make $model has a towing capacity of $towingcapacity lbs")
//    }
//}


// This open class is an inheritable class
open class Vehicle(val make:String, val model: String){
    open fun accelerate(){
        println("vroom vroom")
    }
    fun park(){
        println("parking the vehicle")
    }
    fun brake(){
        println("STOP")
    }
}
// we have class Car which can inherit from Vehicle class.
// Note - If your child class don't have any methods or functions then you can get rid of the curly braces.
class Car(make: String, model: String, val color: String) : Vehicle(make, model){
    override fun accelerate() {
        println("We are going ludicrous mode!")
    }
}
class Truck(make: String, model: String, val towingcapacity: Int) : Vehicle(make, model){
    fun tow(){
        println("headed out to the mountains")
    }
}
fun main(args: Array<String>){

    val tesla = Car("Tesla", "Model S", "Red")
    tesla.accelerate()

    val truck = Truck("Ford", "F-150", 10000)
    tesla.accelerate()
//    val car = Car("Toyota", "Avalon", "Blue")
//    println(car.make)
//    println(car.model)
//    println(car.accelerate())
//    println(car.details())
//
//    val truck = Truck("Ford", "F-150", 10000)
//    truck.tow()
//    println(car.details())
}