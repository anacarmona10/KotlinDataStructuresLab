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

fun reto8() {
    val notas = listOf(4.0 to 0.3, 3.5 to 0.3, 5.0 to 0.4)

    var final = 0.0

    for ((nota, peso) in notas) {
        final += nota * peso
    }

    println(final)
}

fun reto9() {
    fun traducir(codigo: String): String {
        return when (codigo) {
            "ISO" -> "Colombia"
            "USA" -> "Estados Unidos"
            else -> "Desconocido"
        }
    }
}

fun reto10() {
    val empleados = listOf("A", "B", "C", "D")

    val rotado = empleados.drop(1) + empleados.first()

    println(rotado)
}

fun reto11() {
    val objetos = listOf("camisa" to 1.0, "zapatos" to 2.0)

    val limite = 5.0
    var total = 0.0
    val seleccion = mutableListOf<String>()

    for ((obj, peso) in objetos) {
        if (total + peso <= limite) {
            seleccion.add(obj)
            total += peso
        }
    }

    println(seleccion)
}

fun reto12() {
    val ruta = listOf("A", "B", "C", "B", "A")

    val esSimetrica = ruta == ruta.reversed()

    println(esSimetrica)
}

fun reto13() {
    val paquetes = (1..50).toList()

    val grupos = paquetes.chunked(10)

    println(grupos)
}

fun reto14() {
    val ids = listOf(1,2,2,3,3,4,4)

    val unico = ids.groupBy { it }
        .filter { it.value.size == 1 }
        .keys

    println(unico)
}

fun reto15() {
    val precios = mapOf("arroz" to 1000, "leche" to 2000)

    val conIVA = precios.mapValues { it.value * 1.19 }

    println(conIVA)
}

fun reto16() {
    val sensores = mutableListOf(3,6,7,9,10)

    sensores.removeAll { it % 3 == 0 }

    println(sensores)
}

fun reto17() {
    val matriz = arrayOf(
        arrayOf(1,2,3,4),
        arrayOf(5,6,7,8),
        arrayOf(9,10,11,12),
        arrayOf(13,14,15,16)
    )

    var diag1 = 0
    var diag2 = 0

    for (i in matriz.indices) {
        diag1 += matriz[i][i]
        diag2 += matriz[i][matriz.size - 1 - i]
    }

    println(diag1)
    println(diag2)
}

fun reto18() {
    val r1 = mapOf("azucar" to 1.0, "harina" to 2.0)
    val r2 = mapOf("azucar" to 0.5, "leche" to 1.0)

    val fusion = mutableMapOf<String, Double>()

    for ((k,v) in r1) fusion[k] = v
    for ((k,v) in r2) fusion[k] = fusion.getOrDefault(k,0.0) + v

    println(fusion)
}

fun reto19() {
    val estudiantes = listOf("Ana" to 4.5, "Luis" to 3.8)

    val ranking = estudiantes.sortedByDescending { it.second }

    println(ranking)
}