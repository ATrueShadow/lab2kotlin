import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Tag
import kotlin.math.PI

class MainKtTest {
    val EPS = 0.000001

    @Test
    @Tag("demo")
    fun testF() {
        assertEquals(-1.0, f(PI), EPS)
        assertEquals(1.0, f(PI/2), EPS)
        assertEquals(1.0, f(0.0), EPS)
    }

    //@Disabled
    @Test
    @Tag("var4")
    fun testVar4calcS() {
        assertEquals(1.397903, var4calcS(0.335), EPS)
    }

    //@Disabled
    @Test
    @Tag("var4")
    fun testVar4calcF() {
        assertEquals(0.347382, var4calcF(0.335, 0.025), EPS)
    }

    @Test
    @Tag("var4")
    fun testVar4calcScustom() {
        assertEquals(2.458695, var4calcS(0.902), EPS)
    }

    @Test
    @Tag("var4")
    fun testVar4calcFcustom() {
        assertEquals(0.808286, var4calcF(1.5, 0.5), EPS)
    }
}