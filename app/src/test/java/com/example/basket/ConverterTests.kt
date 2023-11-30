package com.example.basket

import com.example.basket.data.database.converters.Converters
import io.mockk.every
import io.mockk.mockk
import io.mockk.spyk
import io.mockk.verify
import org.junit.Assert
import org.junit.Test
import java.math.BigDecimal

class ConverterTests {

    @Test
    fun `test fromDouble`() {
        val converters = spyk(Converters())

        // Test with a non-null Double
        val result1 = converters.fromDouble(10.5)
        Assert.assertEquals(BigDecimal("10.5"), result1)

        // Test with a null Double
        val result2 = converters.fromDouble(null)
        Assert.assertEquals(BigDecimal.ZERO, result2)
    }

    @Test
    fun `test bigDecimalToDouble`() {
        val converters = spyk(Converters())

        // Test with a non-null BigDecimal
        val result1 = converters.bigDecimalToDouble(BigDecimal("15.75"))
        Assert.assertEquals(15.75, result1)

        // Test with a null BigDecimal
        val result2 = converters.bigDecimalToDouble(null)
        Assert.assertEquals(null, result2)
    }

    @Test
    fun `example test with MockK`() {
        val converters = spyk(Converters())

        // Mock the behavior of the fromDouble method
        every { converters.fromDouble(10.0) } returns BigDecimal("10.0")

        // Test the class that depends on the Converters class
        // ...

        // Verify that the fromDouble method was called with the expected argument
        println("Actual invocation: ${converters.fromDouble(10.0)}")
        verify { converters.fromDouble(eq(10.0)) }
    }
}