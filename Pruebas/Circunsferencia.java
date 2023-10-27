class Circunsferencia {
    public static void main(String[]args){
        //Enumeramos las variables
        double radio, superficie, longitud;

        //Damos valores
        radio = 7;

        //Calculamos la superficie
        superficie = 3.1415 * radio * radio;

        //Calculamos la longitud
        longitud = 2 * 3.1415 * radio;

        //Imprimimos los resultados
        System.out.println("La superficie es" + superficie);
        System.out.println("La longitud es" + longitud);


    }
}