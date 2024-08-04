package mx.com.julio.numeroromano;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertidorNumeroRomanoTest {

    @Test
    void test1(){
        var convertidor = new ConvertidorNumeroRomano();
        var numeroUno = 1;
        assertEquals("I", convertidor.decimalToRomano(numeroUno));
    }

    @Test
    void testOneToTen(){
        var convertidor = new ConvertidorNumeroRomano();
        var number = 1;
        assertEquals("I", convertidor.decimalToRomano(number));
        number = 2;
        assertEquals("II", convertidor.decimalToRomano(number));
        number = 3;
        assertEquals("III", convertidor.decimalToRomano(number));
        number = 4;
        assertEquals("IV", convertidor.decimalToRomano(number));
        number = 5;
        assertEquals("V", convertidor.decimalToRomano(number));
        number = 6;
        assertEquals("VI", convertidor.decimalToRomano(number));
        number = 7;
        assertEquals("VII", convertidor.decimalToRomano(number));
        number = 8;
        assertEquals("VIII", convertidor.decimalToRomano(number));
        number = 9;
        assertEquals("IX", convertidor.decimalToRomano(number));
        number = 10;
        assertEquals("X", convertidor.decimalToRomano(number));

    }
    @Test
    void given954ThenCMLIV(){
        var convertidor = new ConvertidorNumeroRomano();
        var numero = 954;

        assertEquals("CMLIV", convertidor.decimalToRomano(numero));
    }

    @Test
    void givenRareCombinationsThenWeCanHaveTheirRomanianRepresentation(){
        var convertidor = new ConvertidorNumeroRomano();

        var numero = 999;
        assertEquals("CMXCIX", convertidor.decimalToRomano(numero));
        numero = 444;
        assertEquals("CDXLIV", convertidor.decimalToRomano(numero));
        numero = 555;
        assertEquals("DLV", convertidor.decimalToRomano(numero));
        numero = 333;
        assertEquals("CCCXXXIII", convertidor.decimalToRomano(numero));

    }
}