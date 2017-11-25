import Planet.*

enum class Planet(val orbitalPeriodInEarthYears: Double) {
    EARTH(1.0), MERCURY(0.2408467), VENUS(0.61519726), MARS(1.8808158),
    JUPITER(11.862615), SATURN(29.447498), URANUS(84.016846), NEPTUNE(164.79132)
}

const val EARTH_ORBITAL_PERIOD_IN_SECONDS = 31557600

class SpaceAge(ageInSeconds: Long) {

    private val ageInYears = ageInSeconds.toDouble() / EARTH_ORBITAL_PERIOD_IN_SECONDS
    private fun calculateAgeOn(planet: Planet) =
            Math.round(ageInYears * (1 / planet.orbitalPeriodInEarthYears) * 100.0) / 100.0

    fun onEarth(): Double = calculateAgeOn(EARTH)

    fun onMercury(): Double = calculateAgeOn(MERCURY)

    fun onVenus(): Double = calculateAgeOn(VENUS)

    fun onMars(): Double = calculateAgeOn(MARS)

    fun onJupiter(): Double = calculateAgeOn(JUPITER)

    fun onSaturn(): Double = calculateAgeOn(SATURN)

    fun onUranus(): Double = calculateAgeOn(URANUS)

    fun onNeptune(): Double = calculateAgeOn(NEPTUNE)

}