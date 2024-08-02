package mx.com.julio.numeroromano;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertidorNumeroRomanoTest {

    @Test
    void test1(){
        var convertidor = new ConvertidorNumeroRomano();
        var numeroUno = 1;
        assertEquals("I", convertidor.convertir(numeroUno));
    }

    @Test
    void test2(){
        var convertidor = new ConvertidorNumeroRomano();
        var numeroDos = 2;
        assertEquals("II", convertidor.convertir(numeroDos));

        var tres = 3;
        assertEquals("III", convertidor.convertir(tres));

        var cuatro = 4;
        assertEquals("IV", convertidor.convertir(cuatro));

        var cinco = 5;
        assertEquals("V", convertidor.convertir(cinco));

        var numero = 6;
        assertEquals("VI", convertidor.convertir(numero));

        numero = 7;
        assertEquals("VII", convertidor.convertir(numero));

        numero = 8;
        assertEquals("VIII", convertidor.convertir(numero));

        numero = 9;
        assertEquals("IX", convertidor.convertir(numero));
        numero = 10;
        assertEquals("X", convertidor.convertir(numero));
        numero = 11;
        assertEquals("XI", convertidor.convertir(numero));
        numero = 12;
        assertEquals("XII", convertidor.convertir(numero));
        numero = 13;
        assertEquals("XIII", convertidor.convertir(numero));
        numero = 14;
        assertEquals("XIV", convertidor.convertir(numero));
        numero = 15;
        assertEquals("XV", convertidor.convertir(numero));
        numero = 16;
        assertEquals("XVI", convertidor.convertir(numero));
        numero = 17;
        assertEquals("XVII", convertidor.convertir(numero));
        numero = 18;
        assertEquals("XVIII", convertidor.convertir(numero));
        numero = 19;
        assertEquals("XIX", convertidor.convertir(numero));
        numero = 20;
        assertEquals("XX", convertidor.convertir(numero));
        numero = 21;
        assertEquals("XXI", convertidor.convertir(numero));


    }
}