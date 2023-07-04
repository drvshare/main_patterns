package ru.drvshare.main_patterns.quadratic

import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class Test {
    @Test
    fun `there are no roots here`() {
        println(e)
        val res = solve(1.0, 0.0, 1.0)
        assertTrue { res.isEmpty() }
    }

    @Test
    fun `two roots of multiplicity 1`() {
        val res = solve(1.0, 0.0, -1.0)
        assertTrue {
            val r1 = 1.0
            val r2 = -1.0
            res[0] in (r1 - e)..(r1 + e) && res[1] in (r2 - e)..(r2 + e)
        }
    }

    @Test
    fun `one root of multiplicity 2`() {
        val res = solve(1.0, 2.0, 1.0)
        assertTrue {
            val r = -1.0
            res[0] == res[1] && res[1] in (r - e)..(r + e)
        }
    }

    @Test
    fun `a cannot be equal to 0`() {
        assertFailsWith<IllegalArgumentException>
        {
            solve(0.0 + Double.MIN_VALUE, 2.0, 1.0)
        }

    }

    @Test
    fun `overflow`() {
        assertFailsWith<IllegalArgumentException>("b = +/-Infinity")
        {
            solve(1.0, 1.0, 1.0)
        }
        assertFailsWith<IllegalArgumentException>("b = +/-Infinity")
        {
            solve(1.0, Double.MAX_VALUE, 1.0)
        }
        assertFailsWith<IllegalArgumentException>("a = +/-Infinity")
        {
            solve(Double.MAX_VALUE, 2.0, 1.0)
        }
    }

    @Test
    fun `big`() {
        assertFailsWith<IllegalArgumentException>
        {
            solve(Double.MAX_VALUE, 2.0, 1.0)
        }
    }
}
