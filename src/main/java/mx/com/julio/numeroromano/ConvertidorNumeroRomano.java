package mx.com.julio.numeroromano;

public class ConvertidorNumeroRomano {

    public String convertir(int numero){

        var romano ="";

        if (numero >= 20 && numero <= 23) {
            return "XX" + generaIes(numero - 20);
        }
        if (numero == 19) {
            return "XIX";
        }
        if (numero >= 15 && numero <= 18){
            romano = "XV";

            return romano + generaIes(numero - 15);
        }
        if (numero == 14){
            return "XIV";
        }
        if (numero >= 10 && numero <= 13){
            romano = "X";

            var numeroDeIes = numero - 10;
            return romano + generaIes(numeroDeIes);
        }
        if (numero == 9){
            return "IX";
        }
        if (numero >= 5 && numero <= 8){
            romano = "V";
            var numeroDeIes = numero - 5;

            return romano + generaIes(numeroDeIes);
        }
        if (numero == 4){
            return "IV";
        }

        return romano +  generaIes(numero);
    }

    private String generaIes(int cantidad){
        var cadenaIes = "";
        for (int indice = 0; indice < cantidad; indice++){
            cadenaIes += "I";
        }
        return cadenaIes;
    }
}
