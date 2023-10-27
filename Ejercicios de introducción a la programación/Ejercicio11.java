public class Ejercicio11 {

    public static void main(String[]args){
        //Enumeramos las variables
        double radio, area, perimetro;

        //Damos valores
        radio = 3.6;

        //Calculamos la superficie
        area = Math.PI * Math.pow(radio, 2);

        //Calculamos la longitud
        perimetro = 2 * Math.PI * radio;

        //Imprimimos los resultados
        System.out.println("El area es " + area);
        System.out.println("El perimetro es " + perimetro);


    }
    
}
