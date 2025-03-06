package RETOS;

import java.util.Scanner;

public class RETO1MOD1 {
	static Scanner in = new Scanner(System.in);
	static char[] tablero = new char[9];

	public static void main(String[] args) {
		int opcion = 0;
		
		
		//contadores para las victorias 
		int j1=0;
		int j2=0;
		int pos;
		int emp=0;

		do {
			System.out.println("1. Jugar una partida");
			System.out.println("2. Mostrar estadísticas");
			System.out.println("3. Salir");
			System.out.println("Seleccione una opción:");
			opcion = in.nextInt();
			//La opcion 1 inicia la partida 
			if (opcion == 1) {

				
				iniciar();
				//dentro hacemos el movimiento de cada jugador pero siempre comprobando si es valido y si ha ganado algun jugador o no
				//y comprobamos si se equivoca para que asigne la posicion correcta.
				do {
					System.out.println("Movimiento jugador 1");
					pos=in.nextInt();
					
					
					if (pos >= 1 && pos <= 9) {
						mueveJugador1(pos);
						if (ganaJugador1()==true) {
							//cuando gana el jugador 1 sumamos una victoria al contador
							System.out.println("Ha ganado jugador 1");
							j1++;
						}
					}else {
						System.out.println("Movimiento jugador 1");
						pos=in.nextInt();
					}

					
					if(quedanCasillas()==true && ganaJugador1()==false) {
						System.out.println("Movimiento jugador 2");
						pos = in.nextInt();
						if (pos >= 1 && pos <= 9) {
							mueveJugador2(pos);
							if (ganaJugador2()==true) {
								//cuando gana el jugador 2 sumamos una victoria al contador
								System.out.println("Ha ganado jugador 2");
									j2++;
							}
						}else {
							System.out.println("Movimiento jugador 2");
							pos=in.nextInt();
						}
						
					}
					if (quedanCasillas()==false) {
						System.out.println("Empate");
						System.out.println();
						if(esEmpate()==true) {
							emp++;
						}
					
					}
					

				}while (quedanCasillas() == true && ganaJugador1() == false && ganaJugador2() == false) ;
			}
			//una vez queramos mostrar las estadisticas mostraremos los contadores que ya se han acumulado anteriormente.
			if (opcion == 2) {		
				System.out.println("Jugador 1 ha ganado: " + j1+ " veces");
				System.out.println("Jugador 2 ha ganado: " + j2 + " veces");
				System.out.println("Jugador 1 y jugador 2 han empatado: " + emp + " veces");
			}
			
			if (opcion < 1 || opcion > 3) {
				System.out.println("Erroe seleccione una de las siguientes opciones:");
				
			}
		} while (opcion != 3);
		System.out.println("Has salido");
	}

	public static void mueveJugador1(int pos) {
		// :el jugador 1 pone una ficha en una posición válida (entre 0 y 8, además está
		// vacía), para comprobar si es valido llamamos a la funcion movimientovalido(pos) por parametro pasamos la posicion
		//si el booleano es valido ponemos la x
		//tambien llamamos la funcion de dibujatablero() para que lo dibuje con la ficha guardada.
		//y si el movimiento no es valido pedimos que lo elija de nuevo.
		boolean valido = movimientoValido(pos);
		if (valido == true) {
			tablero[pos - 1] = 'X';
			dibujaTablero();
		}
		if (valido == false) {
			System.out.println("Elige otra posicion");
			mueveJugador1(in.nextInt());
		}
	}

	public static void mueveJugador2(int pos) {
		// :el jugador 2 pone una ficha en una posición válida (entre 0 y 8, además está
		// vacía), para comprobar si es valido llamamos a la funcion movimientovalido(pos) por parametro pasamos la posicion
		//si el booleano es valido ponemos la O
		//tambien llamamos la funcion de dibujatablero() para que lo dibuje con la ficha guardada.
		//y si el movimiento no es valido pedimos que lo elija de nuevo.
		boolean valido = movimientoValido(pos);
		if (valido == true) {
			tablero[pos - 1] = 'O';
			dibujaTablero();
		}
		if (valido == false) {
			System.out.println("Elige otra posicion");
			mueveJugador2(in.nextInt());
		}
	}

	public static boolean movimientoValido(int pos) {
		// se comprueba que el moviento es válido antes de poner la ficha (entre 0 y 8,
		// además está vacía).
		if (tablero[pos-1]==' ') {
			return true;
		}
		return false;
	}

	public static void iniciar() {
		// pone el tablero vacío (0).
		 boceto();
		for (int i = 0; i < tablero.length; i++) {
			tablero[i] = ' ';
		}
	}

	public static boolean quedanCasillas() {
		// comprueba si ya están ocupadas todas las posiciones del tablero.
		for (int i = 0; i < tablero.length; i++) {
			if (tablero[i] == ' ') {
				return true;
			}
		}
		return false;
	}

	public static void dibujaTablero() {
		// dibuja el tablero tal y como aparece en el ejemplo de partida.
		System.out.println("-------------");
		System.out.println("| " + tablero[0] + " | " + tablero[1] + " | " + tablero[2] + " |");
		System.out.println("-------------");
		System.out.println("| " + tablero[3] + " | " + tablero[4] + " | " + tablero[5] + " |");
		System.out.println("-------------");
		System.out.println("| " + tablero[6] + " | " + tablero[7] + " | " + tablero[8] + " |");
		System.out.println("-------------");

	}
	
	public static boolean ganaJugador1() {
		// comprueba si el jugador 1 tiene tres fichas en raya, ganando la partida.
		for (int i = 0; i < 1; i++) {
			if ((tablero[0] == 'X' && tablero[1] == 'X' && tablero[2] == 'X')|| 
					(tablero[3] == 'X' && tablero[4] == 'X' && tablero[5] == 'X')||
					(tablero[6] == 'X' && tablero[7] == 'X' && tablero[8] == 'X')) {
				
					return true;
				}
				if ((tablero[0] == 'X' && tablero[3] == 'X' && tablero[6] == 'X') || 
					(tablero[1] == 'X' && tablero[4] == 'X' && tablero[7] == 'X') || 
					(tablero[2] == 'X' && tablero[5] == 'X' && tablero[8] == 'X')){
					return true;
				}
				if ((tablero[0] == 'X' && tablero[4] == 'X' && tablero[8] == 'X')
					||(tablero[2] == 'X' && tablero[4] == 'X' && tablero[6] == 'X')){
					return true;
				}
				
		}
		return false;
	}
	
	public static boolean ganaJugador2() {
		for (int i = 0; i < 1; i++) {
			if ((tablero[0] == 'O' && tablero[1] == 'O' && tablero[2] == 'O')|| 
				(tablero[3] == 'O' && tablero[4] == 'O' && tablero[5] == 'O')||
				(tablero[6] == 'O' && tablero[7] == 'O' && tablero[8] == 'O')) {
			
				return true;
			}
			if ((tablero[0] == 'O' && tablero[3] == 'O' && tablero[6] == 'O') || 
				(tablero[1] == 'O' && tablero[4] == 'O' && tablero[7] == 'O') || 
				(tablero[2] == 'O' && tablero[5] == 'O' && tablero[8] == 'O')){
				return true;
			}
			if ((tablero[0] == 'O' && tablero[4] == 'O' && tablero[8] == 'O')
				||(tablero[2] == 'O' && tablero[4] == 'O' && tablero[6] == 'O')){
				return true;
			}
			
			
			
		}
		return false;
	}
	
	public static boolean esEmpate() {
		if (ganaJugador1()==false && ganaJugador2()==false) {
			
			return true;
		}else {
			return false;
		}
		
	}
	public static void boceto() {
		System.out.println("-------------");
		System.out.println("| 1"  + " | 2" + " | 3" + " |");
		System.out.println("-------------");
		System.out.println("| 4" +  " | 5" + " | 6" + " |");
		System.out.println("-------------");
		System.out.println("| 7" + " | 8" +  " | 9" + " |");
		System.out.println("-------------");
	}

}