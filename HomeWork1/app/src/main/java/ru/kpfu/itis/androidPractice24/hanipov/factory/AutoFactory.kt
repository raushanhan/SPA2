package ru.kpfu.itis.androidPractice24.hanipov.factory

import ru.kpfu.itis.androidPractice24.hanipov.automobiles.*
import kotlin.random.Random

class AutoFactory {

    fun createRandomAuto(number: Int): Automobile {

        val releaseYear = generateRandomReleaseYear()
        val weight = generateRandomWeight()
        val horsepower = generateRandomHorsepower()

        val type = listOf("Elektrobus", "Moskvic", "Automobile", "SportCar", "ToyTruck").random()

        return when (type) {
            "Elektrobus" -> Elektrobus(
                number = number,
                releaseYear = releaseYear,
                weight = weight,
                horsepower = horsepower,
                capacity = generateRandomCapacity()
            )

            "Moskvic" -> Moskvic(
                number = number,
                releaseYear = releaseYear,
                weight = weight,
                horsepower = horsepower,
                manufacturerCountry = generateRandomCountry()
            )

            "Automobile" -> Automobile(
                number = number,
                releaseYear = releaseYear,
                weight = weight,
                horsepower = horsepower
            )

            "SportCar" -> SportCar(
                number = number,
                releaseYear = releaseYear,
                weight = weight,
                horsepower = horsepower,
                colour = generateRandomColour()
            )

            "ToyTruck" -> ToyTruck(
                number = number,
                releaseYear = releaseYear,
                weight = weight,
                horsepower = horsepower,
                signalCatchDistance = generateRandomSignalDistance()
            )

            else -> throw RuntimeException()
        }
    }

    private fun generateRandomReleaseYear(): Int = Random.nextInt(from = 2000, until = 2024)

    private fun generateRandomHorsepower(): Int = Random.nextInt(from = 100, until = 500)

    private fun generateRandomWeight(): Int = Random.nextInt(from = 1500, until = 5000)

    private fun generateRandomColour(): String = listOf("Red", "Green", "Blue").random()

    private fun generateRandomCapacity(): Int = Random.nextInt(from = 50, until = 90)

    private fun generateRandomCountry(): String = listOf("China", "USSR").random()

    private fun generateRandomSignalDistance(): Int = Random.nextInt()
}