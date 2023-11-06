public class EjerciciosDeRepaso12 {
    public static int generarTiradas() {
        int tiradas = (int) (Math.random() * 6) + 1;
        return tiradas;
    }


    public static void main(String[] args) {

        int tirada1 = 0;
        int tirada2 = 1;
        int tirada3 = 0;
        int contador = 0;

        while(tirada1 != tirada2 || tirada2 != tirada3){
            tirada1 = generarTiradas();
            tirada2 = generarTiradas();
            tirada3 = generarTiradas();
            contador++;          
        }
        System.out.println("Triradas: " + tirada1 + " , " + tirada2 + " , " + tirada3);
        System.out.println("Intentos: " + contador);

    
    }
    
}
