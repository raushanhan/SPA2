package ru.kpfu.itis.androidPractice24.hanipov.race

import ru.kpfu.itis.androidPractice24.hanipov.automobiles.Automobile
import ru.kpfu.itis.androidPractice24.hanipov.factory.AutoFactory

class Race {

    fun run(contestantsCount: Int) {

        val contestants = createCars(contestantsCount)

        while (contestants.size > 1) {

            contestants.shuffle()

            val currentWinners = ArrayList<Automobile>()

            for (i in 0 until contestants.size step 2) {
                if (i + 1 < contestants.size) {
                    val winner = findTheWinner(contestants[i], contestants[i + 1])
                    println("winner is ${winner.getNumber()}")

                    currentWinners.add(winner)
                } else {
                    println("contestant ${contestants[i].getNumber()} has no pair. " +
                            "They get to the next round")
                    currentWinners.add(contestants[i])
                }
            }
            contestants.clear()
            contestants.addAll(currentWinners)
        }
        println("The finish winner is the car number ${contestants.first().getNumber()}!")

    }

    private fun createCars(contestantsCount: Int): ArrayList<Automobile> {
        val cars = ArrayList<Automobile>()

        val factory = AutoFactory()

        for (i in 0 until contestantsCount) {
            cars.add(factory.createRandomAuto(i + 1))
        }

        return cars
    }

    private fun findTheWinner(auto1: Automobile, auto2: Automobile): Automobile {

        println("race between ${auto1.getNumber()} and ${auto2.getNumber()}")
        return if (auto1.getHorsePower() / auto1.getWeight()
            > auto2.getHorsePower() / auto2.getWeight()) auto1 else auto2

    }
}