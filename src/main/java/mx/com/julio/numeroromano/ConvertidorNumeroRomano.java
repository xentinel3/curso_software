package mx.com.julio.numeroromano;

public class ConvertidorNumeroRomano {

    public String decimalToRomano(int numero) {

        var centenas = numero / 100;
        var decenas = (numero % 100) / 10;
        var unidades = numero %  10;

        return generaCentena(centenas) + generaDecena(decenas) + generaUnidad(unidades);
    }


    private String generaCentena(int centena){
        if (centena >= 1 && centena <= 3){
            return generaLetra(centena, 'C');
        } else if (centena == 4) {
            return "CD";
        } else if (centena >= 5 && centena <= 8) {
            return "D" + generaLetra(centena - 5, 'C');
        } else if (centena == 9){
            return "CM";
        }
        return "";
    }

    private String generaDecena(int decenas){

        if (decenas >= 1 && decenas <= 3){
            return generaLetra(decenas, 'X');
        } else if (decenas == 4) {
            return "XL";
        } else if (decenas >= 5 && decenas <= 8) {
            return "L" + generaLetra(decenas - 5, 'X');
        } else if (decenas == 9){
            return "XC";
        }
        return "";
    }
    private String generaUnidad(int unidad) {

        if (unidad >= 1 && unidad <= 3) {
            return generaLetra(unidad, 'I');
        } else if (unidad == 4) {
            return "IV";
        } else if (unidad >= 5 && unidad <= 8) {
            return "V" + generaLetra(unidad - 5, 'I');
        } else if (unidad == 9){
            return "IX";
        }
        return "";
    }

    private String generaLetra(int cantidad, char letra) {
        var letras = new StringBuilder();

        for (int indice = 0; indice < cantidad; indice++) {
            letras.append(letra);
        }
        return letras.toString();
    }

}
