public class Ejercicio15 {

    public static void main(String[] args) {
        //Principal
        double DineroInicial = 2000;
        double TasaDeInteres = 0;
        double Hacienda = 0;

        // Calcular Interés
        TasaDeInteres = DineroInicial * 2.75 / 100;
        System.out.println(TasaDeInteres);

        //Sacamos el dinero de Hacienda
        Hacienda = TasaDeInteres * 18 / 100;
        System.out.println(TasaDeInteres - Hacienda);

}
}
