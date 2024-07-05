package ru.kpfu.itis.androidPractice24.hanipov.automobiles

open class Automobile(
    private val number: Int,
    private val releaseYear: Int,
    private val model: String = "Lada Kalina",
    private val horsepower: Int,
    private val weight: Int
) {
    open fun printInfo() {
        println("this is a $model of $releaseYear release year.\n" +
                "It's got $horsepower horsePower and weighs $weight kg.")
    }

    fun getNumber() = number
    fun getReleaseYear() = releaseYear
    fun getModel() = model
    fun getHorsePower() = horsepower
    fun getWeight() = weight
}