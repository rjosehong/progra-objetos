import java.util.Scanner;
public class Controlador {
    Casillas ca = new Casillas();
    Tablero t = new Tablero();
    
    public void tableroJuego(){
        var cartas = ca.CartasCasillas();
        t.tableroMemoria(cartas);
        t.tableroMostrar();
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del jugador 1: ");
        String jugador1 = sc.nextLine();
        System.out.print("Ingrese el nombre del jugador 2: ");
        String jugador2 = sc.nextLine();

        int partidasGanadas1 = 0;
        int partidasGanadas2 = 0;

        boolean jugar = true;
        while(jugar){
            int punteo1 = 0;
            int punteo2 = 0;
            
            int jugador_actual = 1;

            while(!t.todoPareja()){
                System.out.print("Ingrese fila (0-3): ");
                int fila1 = sc.nextInt();
                System.out.print("Ingrese columna(0-3): ");
                int col1= sc.nextInt();
                t.voltearCarta(fila1, col1);
                t.tableroMostrar();
                System.out.print("Ingrese fila de su segunda carta(0-3): ");
                int fila2 = sc.nextInt();
                System.out.print("Ingrese columna de su segunda carta(0-3): ");
                int col2 = sc.nextInt();
                t.voltearCarta(fila2, col2);
                t.tableroMostrar();

                var carta1 = t.getCarta(fila1, col1);
                var carta2 = t.getCarta(fila2, col2);

                if(carta1.getSimbolo().equals(carta2.getSimbolo())){
                    System.out.println("Son parejas");
                    carta1.setIsMatched(true);
                    carta2.setIsMatched(true);
                    if(jugador_actual==1){
                        punteo1++;
                    }
                    else if (jugador_actual==2){
                        punteo2++;
                    }
                }
                else {
                    System.out.println("No son parejas");
                    carta1.setIsRevealed(false);
                    carta2.setIsRevealed(false);
                }
                jugador_actual = (jugador_actual == 1) ? 2 : 1;
            }
            System.out.print("Todas las cartas fueron emparejadas!");
            System.out.println(jugador1 + " tiene " + punteo1 + " puntos");
            System.out.println(jugador2 + " tiene " + punteo2 + " puntos");
            if (punteo1 > punteo2){
                System.out.println("Jugador " + jugador1 + " ha ganado!");
                partidasGanadas1++;
            }
            else if (punteo2 > punteo1){
                System.out.println("Jugador " + jugador2 + " ha ganado");
                partidasGanadas2++;
            }
            else {
                System.out.println("Empate xd");
            }
            System.out.print("Quiere jugar otra vez?(s/n)");
            String opcion = sc.nextLine();
            if (!opcion.equalsIgnoreCase("s")){
                jugar=false;
            }
        }
        if(partidasGanadas1 > partidasGanadas2){
            System.out.println(jugador1 + " ha ganado por mayor cantidad de partidas ganadas");
        }
        else if(partidasGanadas2 > partidasGanadas1){
            System.out.println(jugador2 + " ha ganado por mayor cantidad de partidas ganadas");
        }
        else {
            System.out.println("Hubo un empate");
        }
        sc.close();
    }
}
