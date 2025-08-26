class Car(var brand : String = "", var year : Int = 0) {

    constructor(string: String) : this() {
        val car = string.split(' ')
        brand = car[0]
        year = car[1].toInt()
    }

    fun printDetails() {
        println("Brand: $brand, Year: $year")
    }
}