package ru.kpfu.itis.androidPractice24.hanipov.automobiles

class ToyTruck(
    private val number: Int,
    private val releaseYear: Int,
    private val model: String = "Hasbro Lada Kalina",
    private val horsepower: Int,
    private val weight: Int,
    private val signalCatchDistance: Int
) : Automobile(number, releaseYear, model, horsepower, weight) {
    fun getSignalCatchDistance() = signalCatchDistance

    override fun printInfo() {
        super.printInfo()
        println("It is available on distance up to $signalCatchDistance m")
    }
}