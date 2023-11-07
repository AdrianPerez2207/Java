import java.util.Scanner;

public class PracicaArray1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] primero = new String[5];
        String[] segundo = new String[5];
        int contador = 4;


        try {
            for (int i = 0; i < primero.length; i++){
                System.out.println("Escribe una palabra");
                primero[i] = sc.nextLine();
            }
            for (int i = 0; i < primero.length; i++){
                segundo[i] = primero[contador];
                contador--;
                System.out.println(segundo[i]);
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
    
}
