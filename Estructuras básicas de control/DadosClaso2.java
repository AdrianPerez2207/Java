import java.util.Scanner;

//Marcos y Julius son dos legionarios aficionados a los dados. Hoy han pensado un juego. Primero deciden el número de turnos a jugar.
//Nosotros lo pediremos por teclado.

//En cada turno cada jugador lanza un dado de 10 caras.

//Si un jugador saca un valor mayor que el otro, se suman los puntos de los dos dados al jugador.

//Si los dos sacan el mismo valor, la suma de los dos se acumula para la próxima tirada. Si es la útima tirada, esos putnos se pierden.

//Debeis mostrar la partida de los jugadores, detallando las puntuaciones de cada uno y quién gana cada turno.

//Podéis hacer funciones para hacer la tirada de dados, para calcular el ganador.

public class DadosClaso2 {

    public static int generarTiradas() {
        int tiradas = (int) (Math.random() * 10) + 1;
        return tiradas;
    }
    public static void calcularGanador(int puntuaciónMarcos, int puntuaciónJulius){
        if (puntuaciónMarcos > puntuaciónJulius){
            System.out.println("Marcos gana la partida.");
        } else if (puntuaciónMarcos < puntuaciónJulius){
            System.out.println("Julius gana la partida.");
        } else {
            System.out.println("Han empatado.");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Pedimos por teclado el número de turnos a jugar.
        System.out.println("Ingresa el número de turnos");
        int numTurnos = sc.nextInt();

        //Variables
        int puntuaciónMarcos= 0;
        int puntuaciónJulius = 0;
        int acumulador =  0;

        //Calculamos ganador de turnos
        for (int turno = 1; turno <= numTurnos; turno++){
            //Simulamos la tirada de los dados e imprimimos el resultado.
            int dadoMarcos = generarTiradas();
            int dadoJulius = generarTiradas();

            System.out.println("Marcos sacó: " + dadoMarcos);
            System.out.println("Julius sacó: " + dadoJulius);

            if (dadoMarcos > dadoJulius){
                puntuaciónMarcos += dadoMarcos + dadoJulius + acumulador;
                acumulador = 0;
                System.out.println("Marcos gana el turno.");
            } else if (dadoJulius > dadoMarcos){
                puntuaciónJulius += dadoMarcos + dadoJulius + acumulador;
                acumulador = 0;
                System.out.println("Julius gana el turno.");
            } else if (dadoJulius == dadoMarcos){
                acumulador += dadoJulius + dadoMarcos;
                System.out.println("Empate.");
            }
        }
        calcularGanador(puntuaciónMarcos, puntuaciónJulius);

    }
    
}
