package ejercicios

fun reto1() {
    val gastos = arrayOf(20.0, 15.5, 30.0, 10.0, 25.0)

    var total = 0.0
    var max = gastos[0]
    var min = gastos[0]

    for (g in gastos) {
        total += g
        if (g > max) max = g
        if (g < min) min = g
    }

    val promedio = total / gastos.size

    println("Total: $total")
    println("Promedio: $promedio")
    println("Mayor: $max")
    println("Menor: $min")
}

fun reto2() {
    val empleados = listOf("Ana" to 25, "Luis" to 35, "Carlos" to 40)

    val resultado = empleados
        .filter { it.second > 30 }
        .map { it.first.uppercase() }

    println(resultado)
}

fun reto3() {
    val telefonos = listOf(123, 456, 123, 789, 456)

    val unicos = telefonos.toSet().sorted()

    println(unicos)
}

fun reto4() {
    val productos = listOf("pan", "leche", "pan", "huevos")

    val conteo = mutableMapOf<String, Int>()

    for (p in productos) {
        conteo[p] = conteo.getOrDefault(p, 0) + 1
    }

    println(conteo)
}