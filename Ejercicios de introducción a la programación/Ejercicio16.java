public class Ejercicio16 {

    public static void main(String[] args) {

        //Variables
        double diametro, altura, area, volumen;
        altura = 42.4;
        diametro = 15.5;

        // Calculamos el radio
        double radio = diametro / 2;

        // Calculamos el área de la superficie
        area = 2 * Math.PI * Math.pow(radio, 2) + 2 * Math.PI * radio * altura;

        // Calculamos el volumen
        volumen = Math.PI * Math.pow(radio, 2) * altura;

        // Imprimir resultados
        System.out.println("Área de la superficie del cilindro: " + area + " cm²");
        System.out.println("Volumen del cilindro: " + volumen + " cm³");
    }
}
