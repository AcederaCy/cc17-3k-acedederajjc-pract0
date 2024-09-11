fun main() {
    val pounds = 280
    val kilograms = pounds * 0.45359237
    println("Weight in Pounds (lbs): $pounds")
    println("Weight converted to kilograms (kg): $kilograms")
    println("====================================")


    val miles = 75
    val kilometers = miles * 1.609344
    println("Length in Miles (mi): $miles")
    println("Length in Kilometers (km): $kilometers")
    println("====================================")


    val fahrenheit = 8700.0
    val celsius = (fahrenheit - 32) * 5.0 / 9.0
    println("Temperature in Fahrenheit (°F): $fahrenheit")
    println("Temperature in Celsius (°C): $celsius")
    println("====================================")


    val studentAges = listOf(16, 18, 23, 19, 20, 22, 21, 24, 17, 25)
    val averageAge = studentAges.sum() / studentAges.size.toDouble()
    for (i in studentAges.indices) {
        println("Age of Student ${i + 1}: ${studentAges[i]}")
    }
    println("The average age of the students: $averageAge")
    println("====================================")

    val character1 = "Zeroth"
    val character2 = "Eldor"
    val swordName = "Blade of Shadows"
    val shieldName = "Guardian's Shield"
    val abilityName = "Thunderclap Fury"

    val story = """
        The dark sorcerer $character1 has invaded the realm of $character2 with his malevolent powers. 
        The valiant knights of Eldor have risen to defend their land but face a formidable foe. 
        $character1 wields the cursed $swordName, striking fear into the hearts of the knights. 
        As the battle ensues, the knights attempt to breach his defenses, only to be thwarted by the mystical $shieldName. 
        With a thunderous roar, the sorcerer unleashes his ultimate ability, $abilityName, to crush the defenders.
    """.trimIndent()
    println(story)
}