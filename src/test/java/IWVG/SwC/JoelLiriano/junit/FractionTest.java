package IWVG.SwC.JoelLiriano.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        this.fraction = new Fraction();
    }

    @Test
    void testDecimal() {
        this.fraction = new Fraction(2,3);
        assertEquals(0.6666666666666667, this.fraction.decimal(), 10e-5);
    }

    @Test
    void testGetNumerator() {
        this.fraction = new Fraction(4,3);
        assertEquals(4,this.fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        this.fraction = new Fraction(4,3);
        assertEquals(3,this.fraction.getDenominator());
    }
}

