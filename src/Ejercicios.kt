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

fun reto5() {
    val historial = arrayOf("a", "b", "c", "d")

    val invertido = Array(historial.size) { "" }

    for (i in historial.indices) {
        invertido[i] = historial[historial.size - 1 - i]
    }

    println(invertido.toList())
}

fun reto6() {
    val p1 = setOf("cine", "musica", "deporte")
    val p2 = setOf("musica", "arte")

    val comunes = p1.intersect(p2)
    val unicos = p1.subtract(p2)

    println(comunes)
    println(unicos)
}

fun reto7() {
    val inventario = mutableMapOf("pan" to 2, "leche" to 1)

    val producto = "pan"

    inventario[producto]?.let {
        if (it > 1) inventario[producto] = it - 1
        else inventario.remove(producto)
    }

    println(inventario)
}

