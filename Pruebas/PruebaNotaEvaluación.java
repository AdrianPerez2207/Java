import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class PruebaNotaEvaluación {

    public static void main(String[] args) {
        
        double calif1EV, calif2EV, calif3EV, califExamenFinal, califTrabajoFinal;
        double NotaFinal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la nota de la 1º Evaluación");
        calif1EV = sc.nextDouble();
        System.out.println("Dime la nota de la 2º Evaluación");
        calif2EV = sc.nextDouble();
        System.out.println("Dime la nota de la 3º Evaluación");
        calif3EV = sc.nextDouble();

        System.out.println("Dime la nota del exámen final");
        califExamenFinal = sc.nextDouble();

        System.out.println("Dime la nota del trabajo final");
        califTrabajoFinal = sc.nextDouble();

        NotaFinal = (((calif1EV + calif2EV + calif3EV)/3) * 0.55) +
                    (califExamenFinal * 0.3) + (califTrabajoFinal * 0.15);

        System.out.println("Tu nota es " + NotaFinal);

        sc.close();

    }
    
}
