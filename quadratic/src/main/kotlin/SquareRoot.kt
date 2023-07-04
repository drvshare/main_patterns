package ru.drvshare.main_patterns.quadratic

import kotlin.math.abs
import kotlin.math.sqrt

const val e: Double = 1e-14

fun solve(a: Double, b: Double, c: Double): Array<Double> {
    require(abs(a) > e) { "a == 0" }
    @Suppress("LocalVariableName")
    val D: Double = b * b - 4 * a * c

    require(abs(D) != Double.POSITIVE_INFINITY) { "+/-Infinity" }

    /** Корней нет (возвращается пустой массив) */
    if (D < -e) {
        return emptyArray<Double>()
    }


    /** Есть два корня кратности 1 */
    if (D > e) {
        val r1 = (-b + sqrt(D)) / (2 * a)
        val r2 = (-b - sqrt(D)) / (2 * a)
        return arrayOf(r1, r2)
    }

    /** Есть один корень кратности 2 */
    if (abs(D) <= e) {
        val r = -b / (2 * a)
        return arrayOf(r, r)
    }
    return emptyArray<Double>()
}
