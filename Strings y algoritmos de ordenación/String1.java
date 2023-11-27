import java.util.Scanner;
public class String1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadenaCaracteres;

        try {
            System.out.println("Ingresa una cadena de caracteres.");
            cadenaCaracteres = sc.nextLine();

            String cadenaAlReves = "";

            for (int i = cadenaCaracteres.length() - 1; i >= 0; i--){
                cadenaAlReves += cadenaCaracteres.charAt(i);
            }
            System.out.println("La cadena al revés con (String) sería: " + cadenaAlReves);


        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
    
}
