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

fun reto2() {}