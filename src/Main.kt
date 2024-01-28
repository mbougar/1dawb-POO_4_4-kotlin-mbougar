


fun main() {
    println("\nInstancia varios \n")
    val coche1 = Coche("Volkswagen", "Polo", 100, 4, "1234BHJ", "Negro")
    val coche2 = Coche("Ford", "Focus", 85, 4, "3229LMK", "Azul")

    println(coche1)
    println(coche2)

    coche1.color = "Verde"
    coche1.numCaballos = 200
    coche1.numPuertas = 5
    coche1.matricula = "1234QQQ"

    coche2.color = "Blanco"
    coche2.numCaballos = 500
    coche2.numPuertas = 3
    coche2.matricula = "1234XYZ"

    println("Coche 1: $coche1")
    println("Coche 2: $coche2")

    println("\nIntenta instanciar y modificar con la marca y modelo con valores nulos o blancos y comprueba que no es posible.\n")

    try {
        coche1.marca = ""
    } catch (e: IllegalArgumentException) {
        println("Error $e")
    }

    try {
        coche1.modelo = null
    } catch (e: IllegalArgumentException) {
        println("Error $e")
    }

    println("\nIntenta instanciar y modificar con el número de caballos con un valor inferior a 70 o superior a 700 y comprueba que no es posible.\n")

    try {
        coche1.numCaballos = 50
    } catch (e: IllegalArgumentException) {
        println("Error $e")
    }

    try {
        coche2.numCaballos = 800
    } catch (e: IllegalArgumentException) {
        println("Error $e")
    }

    println("\nIntenta instanciar y modificar con el número de puertas con un valor inferior a 3 o superior a 5 y comprueba que no es posible.\n")

    try {
        coche1.numPuertas = 2
    } catch (e: IllegalArgumentException) {
        println("Error $e")
    }

    try {
        coche2.numPuertas = 8
    } catch (e: IllegalArgumentException) {
        println("Error $e")
    }

    println("\nIntenta instanciar y modificar con la matrícula con un valor que no tenga 7 caracteres y comprueba que no es posible.\n")

    try {
        coche1.matricula = "A12"
    } catch (e: IllegalArgumentException) {
        println("Error $e")
    }

    try {
        coche2.matricula = "12345XYZ"
    } catch (e: IllegalArgumentException) {
        println("Error $e")
    }

    println("\nIntenta instanciar y modificar con el color, el número de caballos, el número de puertas y la matrícula con valores nulos/blancos y comprueba que no es posible.\n")

    try {
        coche1.color = null
    } catch (e: IllegalArgumentException) {
        println("Error $e")
    }

    try {
        coche2.color = ""
    } catch (e: IllegalArgumentException) {
        println("Error $e")
    }

    try {
        coche1.numCaballos = null
    } catch (e: IllegalArgumentException) {
        println("Error $e")
    }

    try {
        coche2.numPuertas = null
    } catch (e: IllegalArgumentException) {
        println("Error $e")
    }

    try {
        coche1.matricula = null
    } catch (e: IllegalArgumentException) {
        println("Error $e")
    }

    try {
        coche2.matricula = ""
    } catch (e: IllegalArgumentException) {
        println("Error $e")
    }
}