import java.util.Scanner;

//Marcos y Julius son dos legionarios aficionados a los dados. Hoy han pensado un juego. Primero deciden el número de turnos a jugar.
//Nosotros lo pediremos por teclado.

//En cada turno cada jugador lanza un dado de 10 caras.

//Si un jugador saca un valor mayor que el otro, se suman los puntos de los dos dados al jugador.

//Si los dos sacan el mismo valor, la suma de los dos se acumula en para la próxima tirada. Si es la útima tirada, esos putnos se pierden.

//Debeis mostrar la partida de los jugadores, detallando las puntuaciones de cada uno y quién gana cada turno.

//Podéis hacer funciones para hacer la tirada de dados, para calcular el ganador.

public class DadosClase {

    public static int generarTiradas(){

        int tiradas = (int) (Math.random() * 10) + 1;
        return tiradas;
    }

    public static void calcularGanador(int puntuaciónMarcos, int puntuaciónJulius){

        if (puntuaciónMarcos > puntuaciónJulius){
            System.out.println("El ganador es Marcos");
        } else if (puntuaciónJulius > puntuaciónMarcos){
            System.out.println("El ganador es Julius");
        } else { 
            System.out.println("Empate");}

    
        }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el número de turnos.");
        int numeroturnos = sc.nextInt();

        int puntuaciónJulius = 0;
        int puntuaciónMarcos = 0;
        int acumulador = 0;

        for (int turno = 1; turno <= numeroturnos; turno ++){
            System.out.println("Turno " + turno + ":");

            //Simulamos las tiradas
            int dadoJulius = generarTiradas();
            int dadoMarcus = generarTiradas();

            System.out.println("Julius sacó: " + dadoJulius);
            System.out.println("Marcos sacó: " + dadoMarcus);

            if (dadoJulius > dadoMarcus){
                puntuaciónJulius += dadoJulius + dadoMarcus + acumulador;
                acumulador = 0;
                System.out.println("Julius ha ganado el turno.");
            } else if (dadoMarcus > dadoJulius){
                puntuaciónMarcos += dadoMarcus + dadoJulius + acumulador;
                acumulador = 0;
            System.out.println("Marcos ha ganado el turno.");
            } else if (dadoJulius == dadoMarcus){
                acumulador += dadoJulius + dadoMarcus;
                System.out.println("Empate.");
            }


        }
        
        //Calculamos al ganador
        calcularGanador(puntuaciónMarcos, puntuaciónJulius);

        System.out.println("Puntuación final Marcos: " + puntuaciónMarcos );
        System.out.println("Puntuación final Julius: " + puntuaciónJulius);


    }

}

