package id.daftech.testapps

import androidx.annotation.DisplayContext
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.jupiter.api.DisplayName


class CalculatorTest {

    val calculator = Calculator()

    @Test

    fun testAdd() {
        val result = calculator.add(10, 10)
        assertEquals(20, result)
    }

}