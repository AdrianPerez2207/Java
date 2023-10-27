import java.util.Scanner;

public class EstructurasBasicasDeControl4 {

    public static void dividirImporte(int euros) {

        int billete200 = euros / 200;
        euros %= 200;
        int billete100 = euros / 100;
        euros %= 100;
        int billete50 = euros / 50;
        euros %= 50;
        int billete20 = euros / 20;
        euros %= 20 ;
        int billete10 = euros / 10;
        euros %= 10;

        System.out.println("Billetes de 200 Euros " + billete200);
        System.out.println("Billetes de 100 Euros " + billete100);
        System.out.println("Billetes de 50 Euros " + billete50);
        System.out.println("Billetes de 20 Euros " + billete20);
        System.out.println("Billetes de 10 Euros " + billete10);
        System.out.println("Sobran " + euros + " Euros");
    }
        public static void main(String[] args) {

        
            Scanner sc = new Scanner(System.in);

            System.out.println("Escriba el importe");
            int importe = sc.nextInt();
            dividirImporte(importe);

            sc.close();
    
        
    }
    
}
