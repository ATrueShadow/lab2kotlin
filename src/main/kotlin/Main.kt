import kotlin.math.*

/* Пример "главной функции программы
 * Сейчас она печатает сообщение Hello, World!
 */
fun main() {
    print("Enter x, y: ")
    val (x, y) = readln().split(", ").map { it.toDouble() }

    println("S = ${var4calcS(x)}; F = ${var4calcF(x, y)}")
}

/* Пример написания функции, состоящей из одного выражения
 * В этом случае, указывать тип функции необязательно, Kotlin сам "выведет" его
 */
fun f(x:Double) = sin(x) + cos(x)

fun var4calcS(x: Double) : Double {
    return 1 + x + (x.pow(2) / 2) + (x.pow(3) / 6) + (x.pow(4) / 24)
}

fun var4calcF(x: Double, y: Double) : Double {
    return x * (sin(x.pow(3)) + cos(y).pow(2))
}