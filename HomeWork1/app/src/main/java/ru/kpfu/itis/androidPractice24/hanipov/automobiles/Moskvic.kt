package ru.kpfu.itis.androidPractice24.hanipov.automobiles

class Moskvic(
    private val number: Int,
    private val releaseYear: Int,
    private val model: String = "Moskvic",
    private val horsepower: Int,
    private val weight: Int,
    private val manufacturerCountry: String
) : Automobile(number, releaseYear, model, horsepower, weight) {
    fun getManufacturerCountry() = manufacturerCountry

    override fun printInfo() {
        super.printInfo()
        println("It is made in $manufacturerCountry")
    }
}