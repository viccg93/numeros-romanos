package org.udemy.tdd.numerosromanos.app.converters;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConvertidorNumerosTest extends TestCase {

    IConvertidorNumeros converter;

    public void setUp() throws Exception {
        super.setUp();
        converter = new ConvertidorNumeros();
    }

    @Test
    public void testConvertirANumeroRomano() {
        assertEquals("validacion de numero 1",
                "I",
                converter.convertirANumeroRomano(1));

        assertEquals("validacion de numero 2",
                "II",
                converter.convertirANumeroRomano(2));

        assertEquals("validacion de numero 3",
                "III",
                converter.convertirANumeroRomano(3));

        assertEquals("validacion de numero 4",
                "IV",
                converter.convertirANumeroRomano(4));

        assertEquals("validacion de numero 5",
                "V",
                converter.convertirANumeroRomano(5));

        assertEquals("validacion de numero 6",
                "VI",
                converter.convertirANumeroRomano(6));
        assertEquals("validacion de numero 7",
                "VII",
                converter.convertirANumeroRomano(7));
        assertEquals("validacion de numero 8",
                "VIII",
                converter.convertirANumeroRomano(8));
        assertEquals("validacion de numero 9",
                "IX",
                converter.convertirANumeroRomano(9));
        assertEquals("validacion de numero 10",
                "X",
                converter.convertirANumeroRomano(10));
        assertEquals("validacion de numero 11",
                "XI",
                converter.convertirANumeroRomano(11));
        assertEquals("validacion de numero 19",
                "XIX",
                converter.convertirANumeroRomano(19));
        assertEquals("validacion de numero 19",
                "XX",
                converter.convertirANumeroRomano(20));
        assertEquals("validacion de numero 30",
                "XXX",
                converter.convertirANumeroRomano(30));
        assertEquals("validacion de numero 35",
                "XXXV",
                converter.convertirANumeroRomano(35));
        assertEquals("validacion de numero 50",
                "L",
                converter.convertirANumeroRomano(50));
        assertEquals("validacion de numero 90",
                "XC",
                converter.convertirANumeroRomano(90));
        assertEquals("validacion de numero 95",
                "XCV",
                converter.convertirANumeroRomano(95));
        assertEquals("validacion de numero 99",
                "XCIX",
                converter.convertirANumeroRomano(99));
        assertEquals("validacion de numero 100",
                "C",
                converter.convertirANumeroRomano(100));
        assertEquals("validacion de numero 3200",
                "MMMCC",
                converter.convertirANumeroRomano(3200));
        assertEquals("validacion de numero 3999",
                "MMMCMXCIX",
                converter.convertirANumeroRomano(3999));
    }

}