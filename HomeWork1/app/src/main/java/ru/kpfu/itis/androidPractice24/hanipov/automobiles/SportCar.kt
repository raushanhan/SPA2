package ru.kpfu.itis.androidPractice24.hanipov.automobiles

class SportCar(
    private val number: Int,
    private val releaseYear: Int,
    private val model: String = "Porsche 911",
    private val horsepower: Int,
    private val weight: Int,
    private val colour: String
) : Automobile(number, releaseYear, model, horsepower, weight) {
    fun getColour() = colour

    override fun printInfo() {
        super.printInfo()
        println("It is $colour")
    }
}