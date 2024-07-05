package ru.kpfu.itis.androidPractice24.hanipov.automobiles

class Elektrobus(
    private val number: Int,
    private val releaseYear: Int,
    private val model: String = "Elektrobus",
    private val horsepower: Int,
    private val weight: Int,
    private val capacity: Int
) : Automobile(number, releaseYear, model, horsepower, weight) {
    fun getCapacity() = capacity

    override fun printInfo() {
        super.printInfo()
        println("It can accommodate up to $capacity passengers at once")
    }
}