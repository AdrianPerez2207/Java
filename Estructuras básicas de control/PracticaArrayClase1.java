import java.util.Scanner;

public class PracticaArrayClase1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] salarios = new int[10];
        int media = 0;
        int suma = 0;

        try {
            System.out.println("Escribe el salario de los 10 trabajadores");
            for(int i = 0; i < salarios.length; i++){
                salarios[i] = Integer.parseInt(sc.nextLine());
                suma += salarios[i];
            }
            media = suma / salarios.length;
            System.out.println("La media es: " + media);
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
    
}
