import java.util.Scanner;

public class Arrays4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numPersonas = 0;

        try {
            //Pedimos el número de alturas por teclado
            System.out.println("Escribe el número de personas para calcular su altura.");
            numPersonas = Integer.parseInt(sc.nextLine());

            //Verificamos que es un entero positivo
            if (numPersonas <= 0){
                System.out.println("Error, ingresa un número entero positivo.");
            }
            //Declaramos variables y array y pedimos ingresar la altura de cada persona, calculamos la suma de las alturas.
            double alturas[] = new double[numPersonas];
            double sumaAlturas = 0;
            for (int i = 0; i < numPersonas; i++){
                System.out.println("Escribe la altura de la persona " + (i + 1));
                alturas[i] = sc.nextDouble();
                sumaAlturas = sumaAlturas + alturas[i];
            }
            //Con la suma de las alturas sacamos la media
            double media = sumaAlturas / numPersonas;
            //Declaramos 2 variables para sacar alturas superiores e inferiores a la media y las calculamos con un bucle.
            int alturaSuperior = 0;
            int alturaInferior = 0;
            for (int i = 0; i < numPersonas; i++){
                if (alturas[i] > media) {
                    alturaSuperior++;
                }else if (alturas[i] < media) {
                    alturaInferior++;
                }
            }
            System.out.println("La media es: " + media);
            System.out.println("Alturas superiores a la media :" + alturaSuperior);
            System.out.println("Alturas inferiores a la media: " + alturaInferior);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        sc.close();
    }
    
}
