package IWVG.SwC.JoelLiriano.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        this.fraction = new Fraction(4,3);
    }

    @Test
    void testDecimal() {
        assertEquals(1.3333333333333333, this.fraction.decimal(), 10e-5);
    }

    @Test
    void testGetNumerator() {
        assertEquals(4,this.fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        assertEquals(3,this.fraction.getDenominator());
    }
    @Test
    void testMultiply() {
        Fraction multiplied = fraction.multiply(new Fraction(1,2));
        Fraction expected = new Fraction(4,6);
        assertTrue(multiplied.isEquivalent(expected));
    }

    @Test
    void testinvert() {
        fraction.invert();
        assertEquals(3,this.fraction.getNumerator());
        assertEquals(4,this.fraction.getDenominator());
    }

    @Test
    void testIsPropia(){
        assertEquals(false,this.fraction.isPropia());
    }

}

