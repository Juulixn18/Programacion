package RETO;

import java.util.Random;
import java.util.Scanner;

public class UsoTresEnRaya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int partidasJugadas = 0, victoriasJugador1 = 0, victoriasJugador2 = 0, empates = 0;
        int victoriasMaquina1 = 0, victoriasMaquina2 = 0;
        
        while (true) {
            System.out.println("¿Quieres jugar o salir? (1: Jugar, 2: Salir)");
            int opcion = scanner.nextInt();
            if (opcion == 2) {
                System.out.println("Saliendo del juego...");
                System.out.println("Estadísticas: Partidas jugadas: " + partidasJugadas +
                                   ", Victorias Jugador 1: " + victoriasJugador1 +
                                   ", Victorias Jugador 2: " + victoriasJugador2 +
                                   ", Victorias Máquina 1: " + victoriasMaquina1 +
                                   ", Victorias Máquina 2: " + victoriasMaquina2 +
                                   ", Empates: " + empates);
            }
            
            System.out.println("Selecciona el modo de juego:");
            System.out.println("1. Jugador vs Jugador");
            System.out.println("2. Jugador vs Máquina");
            System.out.println("3. Máquina vs Máquina");
            int modo = scanner.nextInt();
            
            TresEnRaya juego = new TresEnRaya();
            boolean turnoJugador1 = (random.nextInt(2) == 0);
            boolean juegoTerminado = false;
            partidasJugadas++;
            
            if (modo == 2) {
                System.out.println(turnoJugador1 ? "Empieza el Jugador" : "Empieza la Máquina");
            }
            
            juego.DibujaTablero();
            
            while (!juegoTerminado) {
                if (modo == 1 || (modo == 2 && turnoJugador1)) {
                    int pos;
                    boolean moveOk = false;
                    do {
                        System.out.println("Jugador " + (turnoJugador1 ? "1 (X)" : "2 (O)") + ", introduce tu movimiento (1-9):");
                        pos = scanner.nextInt();
                        if (juego.movimientoValido(pos)) {
                            if (turnoJugador1) {
                                juego.mueveJugador1(pos);
                            } else {
                                juego.mueveJugador2(pos);
                            }
                            moveOk = true;
                        } else {
                            System.out.println("Movimiento incorrecto. Inténtalo de nuevo.");
                        }
                    } while (!moveOk);
                } else {
                    System.out.println("Turno de la máquina...");
                    if (turnoJugador1) {
                        juego.mueveMaquina1();
                    } else {
                        juego.mueveMaquina2();
                    }
                }
                
                juego.DibujaTablero();
                
                if (juego.ganaJugador1()) {
                    System.out.println("¡Jugador 1 (X) ha ganado!");
                    victoriasJugador1++;
                    juegoTerminado = true;
                } else if (juego.ganaJugador2()) {
                    System.out.println("¡Jugador 2 (O) ha ganado!");
                    victoriasJugador2++;
                    juegoTerminado = true;
                } else if (!juego.quedanCasillas()) {
                    System.out.println("¡Empate! No quedan más movimientos.");
                    empates++;
                    juegoTerminado = true;
                }
                else if (juego.ganaMaquina1()) {
                    System.out.println("¡Jugador 2 (O) ha ganado!");
                    victoriasMaquina1++;
                    juegoTerminado = true;
                }else if (juego.ganaMaquina2()) {
                    System.out.println("¡Jugador 2 (O) ha ganado!");
                    victoriasMaquina2++;
                    juegoTerminado = true;
                }
                else {
                    turnoJugador1 = !turnoJugador1;
                }
            }
        }

    }
}