public class Ejercicio1 {

    public static void main(String[] args) {
        
        //Variables
        int A, B, C;
        int a, b, c, d, e;
        A = 6;
        B = 2;
        C = 3;

        //Expresiones aritméticas
        a = (A * B) % C;
        b = A * B / C;
        c = C % B + C * B;
        d = A % ( A * B * C / (B + C) );
        e = B * B + C - B * (A % B );

        //Imprimimos resultado
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("e: " + e);

        //a = 0
        //b = 4
        //c = 7
        //d = 6
        //e = 7

    }
    
}


