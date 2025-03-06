package RETO;

import java.util.Random;
import java.util.Scanner;

public class Wordle2 {
	// SON LAS VARIABLES GOBALES QUE SE USARAN
	static String palabraSecreta;// ES LA PALABRA SECRETA DONDE SE GUARDARA LA PALABRA QUE QUEREMOS QUE ADIVINEN
	static int numIntentosConsumidos;// SON LOS NUMEROS DE INTENTOS QUE TIENE EL JUGADOR ANTES QUE ACABE EL JUEGO
	static int numLetrasAdivinadas;// GUARDA LAS LETRAS QUE SE HAN ADIVINADO EN EL PROCESO DEL JUEGO
	static Scanner in = new Scanner(System.in);// ES PARA ESCRIBIR POR EL TECLADO

	public static void main(String[] args) {
		// UN ESTRING DONDE SE ALMACENA LAS PALABRAS QUE SE UTILIZARAN DE MANERA
		// ALEATORIA
		String[] palabras = { "perro", "silla", "cielo", "fruta", "jugar", "amigo", "reloj", "libro", "playa", "nieve",
				"fuego", "dulce", "coche", "rueda", "calvo", "movil", "balon", "gafas", "mesas", "raton" };
		String[] palabrasIngles = { "house", "plant", "water", "music", "phone", "bread", "money", "table", "happy",
				"watch", "fruit", "green", "chair", "party", "light", "apple", "beach", "earth", "smile", "river" };
		// DECLARAMOS LAS VARIABLES QUE SE USARAN EN EL MAIN
		String palabraJugador = "";
		numIntentosConsumidos = 0;
		// CREAMOS UN MENU PARA PODER ENTRAR EN EL JUEGO
		int idioma;
		int opcion;
		System.out.println("Elige en que idioma quieres jugar: ");
		System.out.println("1. Ingles");
		System.out.println("2. Español");
		System.out.println("3. Salir");
		idioma = in.nextInt();
		do {

			if (idioma == 1) {
				System.out.println("Elige una opcion:");
				System.out.println("1. Generar palabra y averiguarla");
				System.out.println("2. Salir");
				// UN MENU PARA ELEGIR
				int partidasjugadas = 0;
				int victoriasjugador = 0;
				int victoriasmaquina = 0;
				do {
					opcion = in.nextInt();

					switch (opcion) {
					// LA OPCION 1 ES LA QUE INICIA EL JUEGO
					case 1:
						partidasjugadas++;

						numIntentosConsumidos = 0;
						generapalabra(palabrasIngles);// AQUI SE GENERA LA PALABRA ALEATORIA
						System.out.println(palabraSecreta);
						System.out.println("Palabra generada");
						palabraJugador = in.nextLine();
						// BUCLE QUE RECORRE LA PALABRA
						for (int i = 0; i <= palabraSecreta.length(); i++) {
							// HACEMOS UNA CONDICIÓN PARA SABER SI HA GANADO O NO EL JUGADOR
							if (haGanadoJugador(palabraJugador)) {
								victoriasjugador++;
								// SE MOSTRARA POR PANTALLA LA VICTORIA DEL JUGADOR
								System.out.println("Ha ganado el jugador");
								// ES UNA MANERA DE SALIR DEL BUCLE Y QUE NO SEA INFINITO
								i = palabraSecreta.length() + 1;
								/**
								 * LLAMAMOS EL METODO QUE SE ENCARGA DE COMPROBAR SI HA ACABADO EL JUEGO Y LO
								 * HACEMOS CON UNA CONDICIÓN SI SE CUMPLE EL JUEGO ACABA SINO PASAMOS A LO
								 * SIGUIENTE
								 */
								if (haTerminadoJuego(palabraJugador)) {
									System.out.println("Ha terminado la partida");// SI ES VERDAD MOSTRAMOS POR PANTALLA
									System.out.println("Partidas jugadas: " + partidasjugadas);
									System.out.println("Victorias Jugador: " + victoriasjugador);
									System.out.println("Victorias Maquina: " + victoriasmaquina);
								}
							}
							/**
							 * HACEMOS LA CONDICIENDO QUE MIENTRAS EL JUGADOR NO HAYA GANADO VEMOS DE SEGUIR
							 * JUGANDO Y EL CONTADOR DE INTENTOS DEBE DE IR SUMANDOSE
							 */
							if (!haGanadoJugador(palabraJugador)) {
								numIntentosConsumidos++;
								palabraJugador = in.nextLine().toLowerCase();
								while (!comprobacionLongitudPalabra(palabraJugador)
										|| !comprobacionLetraFinal(palabraJugador)
										|| !comprobacionNumerosEspaciosCarespeciales(palabraJugador)
										|| !comprobacionConsonantesSeguidas(palabraJugador)) {
									palabraJugador = in.nextLine();
								}
								System.out.println(compruebaLetrasAcertadas(palabraJugador));// SE MOSTARA LAS LETRAS
																								// ACERTADAS
							}
							/**
							 * UNA CONDICIÓN QUE DICE QUE SI EL NUMERO DE INTENTOS ES IGUAL A 6 Y EL JUGADOR
							 * AUN NO HA CONSEGUIDO GANAR LA PARTIDA DEBE DE ENTRAR Y MOSTRAR QUE GANO LA
							 * MAQUINA
							 */
							if (numIntentosConsumidos == 6 && !haGanadoJugador(palabraJugador)) {
								System.out.println("Ha ganado la maquina");
								victoriasmaquina++;
								// MOSTRANDO QUE GANO LA MAQUINA
								/**
								 * CONDICIÓN QUE SI EL JUEGO HA TERMINO DEBE MOSTRAR POR PANTALLA QUE HA
								 * TERMINADO LA PARTIDA
								 */
								if (haTerminadoJuego(palabraJugador)) {
									System.out.println("Ha terminado la partida");// MOSTRAMOS ACABO PANTALLA
									System.out.println("Partidas jugadas: " + partidasjugadas);
									System.out.println("Victorias Jugador: " + victoriasjugador);
									System.out.println("Victorias Maquina: " + victoriasmaquina);

								}
							}
						}
						break;
					/** LA SEGUNDA OPCIÓN ES PARA SALIR DEL JUEGO */
					case 2:
						System.out.println("Saliste");// MOSTRAMOS POR PANTALLA SALIDA
						break;
					default:
						System.out.println("Opcion invalida");
						break;
					}
					System.out.println();
					System.out.println("Elige una opcion:");
					System.out.println("1. Generar palabra y averiguarla");
					System.out.println("2. Salir");
					// SI LA OPCIÓN ES DISTINTO DE 2 SE SALE
				} while (opcion != 2);
			}
			if (idioma == 2) {
				System.out.println("Elige una opcion:");
				System.out.println("1. Generar palabra y averiguarla");
				System.out.println("2. Salir");
				// UN MENU PARA ELEGIR
				int partidasjugadas = 0;
				int victoriasjugador = 0;
				int victoriasmaquina = 0;
				do {
					opcion = in.nextInt();

					switch (opcion) {
					// LA OPCION 1 ES LA QUE INICIA EL JUEGO
					case 1:
						partidasjugadas++;

						numIntentosConsumidos = 0;
						generapalabra(palabras);// AQUI SE GENERA LA PALABRA ALEATORIA
						System.out.println("Palabra generada");
						palabraJugador = in.nextLine();
						// BUCLE QUE RECORRE LA PALABRA
						for (int i = 0; i <= palabraSecreta.length(); i++) {
							// HACEMOS UNA CONDICIÓN PARA SABER SI HA GANADO O NO EL JUGADOR
							if (haGanadoJugador(palabraJugador)) {
								victoriasjugador++;
								// SE MOSTRARA POR PANTALLA LA VICTORIA DEL JUGADOR
								System.out.println("Ha ganado el jugador");
								// ES UNA MANERA DE SALIR DEL BUCLE Y QUE NO SEA INFINITO
								i = palabraSecreta.length() + 1;
								/**
								 * LLAMAMOS EL METODO QUE SE ENCARGA DE COMPROBAR SI HA ACABADO EL JUEGO Y LO
								 * HACEMOS CON UNA CONDICIÓN SI SE CUMPLE EL JUEGO ACABA SINO PASAMOS A LO
								 * SIGUIENTE
								 */
								if (haTerminadoJuego(palabraJugador)) {
									System.out.println("Ha terminado la partida");// SI ES VERDAD MOSTRAMOS POR PANTALLA
									System.out.println("Partidas jugadas: " + partidasjugadas);
									System.out.println("Victorias Jugador: " + victoriasjugador);
									System.out.println("Victorias Maquina: " + victoriasmaquina);
								}
							}
							/**
							 * HACEMOS LA CONDICIENDO QUE MIENTRAS EL JUGADOR NO HAYA GANADO VEMOS DE SEGUIR
							 * JUGANDO Y EL CONTADOR DE INTENTOS DEBE DE IR SUMANDOSE
							 */
							if (!haGanadoJugador(palabraJugador)) {
								numIntentosConsumidos++;
								palabraJugador = in.nextLine().toLowerCase();
								while (!comprobacionLongitudPalabra(palabraJugador)
										|| !comprobacionLetraFinal(palabraJugador)
										|| !comprobacionNumerosEspaciosCarespeciales(palabraJugador)
										|| !comprobacionConsonantesSeguidas(palabraJugador)
										|| !comprobacionVocalesSeguidas(palabraJugador)
										|| !comprobacionVocales(palabraJugador)) {
									palabraJugador = in.nextLine();
								}
								System.out.println(compruebaLetrasAcertadas(palabraJugador));// SE MOSTARA LAS LETRAS
																								// ACERTADAS
							}
							/**
							 * UNA CONDICIÓN QUE DICE QUE SI EL NUMERO DE INTENTOS ES IGUAL A 6 Y EL JUGADOR
							 * AUN NO HA CONSEGUIDO GANAR LA PARTIDA DEBE DE ENTRAR Y MOSTRAR QUE GANO LA
							 * MAQUINA
							 */
							if (numIntentosConsumidos == 6 && !haGanadoJugador(palabraJugador)) {
								System.out.println("Ha ganado la maquina");
								victoriasmaquina++;
								// MOSTRANDO QUE GANO LA MAQUINA
								/**
								 * CONDICIÓN QUE SI EL JUEGO HA TERMINO DEBE MOSTRAR POR PANTALLA QUE HA
								 * TERMINADO LA PARTIDA
								 */
								if (haTerminadoJuego(palabraJugador)) {
									System.out.println("Ha terminado la partida");// MOSTRAMOS ACABO PANTALLA
									System.out.println("Partidas jugadas: " + partidasjugadas);
									System.out.println("Victorias Jugador: " + victoriasjugador);
									System.out.println("Victorias Maquina: " + victoriasmaquina);

								}
							}
						}
						break;
					/** LA SEGUNDA OPCIÓN ES PARA SALIR DEL JUEGO */
					case 2:
						System.out.println("Saliste");// MOSTRAMOS POR PANTALLA SALIDA
						break;
					default:
						System.out.println("Opcion invalida");
						break;
					}
					System.out.println("Elige una opcion:");
					System.out.println("1. Generar palabra y averiguarla");
					System.out.println("2. Salir");
					// SI LA OPCIÓN ES DISTINTO DE 2 SE SALE
				} while (opcion != 2);
			}
			if (idioma == 3) {
				System.out.println("Saliste");
			}
			System.out.println("Elige en que idioma quieres jugar: ");
			System.out.println("1. Ingles");
			System.out.println("2. Español");
			System.out.println("3. Salir");
			idioma = in.nextInt();
		} while (idioma != 3);
	}

	private static boolean comprobacionLongitudPalabra(String paljug) {
		paljug.toLowerCase();
		if (paljug.length() != 5) {
			System.out.println("La palabra tiene que tener 5 caracteres");
			return false;
		} else {
			return true;
		}
	}

	private static boolean comprobacionLetraFinal(String paljug) {
		paljug.toLowerCase();
		if (paljug.charAt(4) == 'w' || paljug.charAt(4) == 'q' || paljug.charAt(4) == 'x') {
			System.out.println("No puede acabar en 'w', 'q' o 'x'");
			return false;
		} else {
			return true;
		}
	}

	private static boolean comprobacionVocales(String paljug) {
		int contvocales = 0;
		paljug.toLowerCase();
		for (int i = 0; i < paljug.length(); i++) {
			if (paljug.charAt(i) == 'a' || paljug.charAt(i) == 'e' || paljug.charAt(i) == 'i' || paljug.charAt(i) == 'o'
					|| paljug.charAt(i) == 'u') {
				contvocales++;
			}
		}
		if (contvocales == 2 || contvocales == 3) {
			return true;
		} else {
			System.out.println("Tiene que tener 2 o 3 vocales");
			return false;
		}
	}

	private static boolean comprobacionVocalesSeguidas(String paljug) {
		paljug.toLowerCase();
		if (paljug.contains("aa") || paljug.contains("ee") || paljug.contains("ii") || paljug.contains("oo")
				|| paljug.contains("uu")) {
			System.out.println("No puede tener dos vocales seguidas");
			return false;
		} else {
			return true;
		}
	}

	private static boolean comprobacionConsonantesSeguidas(String paljug) {

		int contnvocales = 0;
		int contconsonantes = 0;
		for (int i = 0; i < paljug.length(); i++) {
			paljug.toLowerCase();
			char letra = paljug.charAt(i);
			if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u') {
				contconsonantes++;
			}
			if (paljug.charAt(i) == 'a' || paljug.charAt(i) == 'e' || paljug.charAt(i) == 'i' || paljug.charAt(i) == 'o'
					|| paljug.charAt(i) == 'u') {
				contconsonantes = 0;
				contnvocales++;
			}
		}
		if (contconsonantes < 4) {
			return true;
		} else {
			System.out.println("No puede contener 4 consonantes seguidas");
			return false;
		}
	}

	private static boolean comprobacionNumerosEspaciosCarespeciales(String paljug) {
		boolean palabra = true;
		for (int i = 0; i < paljug.length(); i++) {
			if (!Character.isLetter(paljug.charAt(i))) {
				palabra = false;
			}
		}
		if (palabra == true) {
			return true;
		} else {
			System.out.println("No se pueden poner ni espacios, ni numeros, ni caracteres especiales");
			return false;
		}
	}

	/**
	 * ESTE METODO ES PARA COMPROBAR SI LA PALABRA QUE EL JUGADOR HA INTRODUCIDO ES
	 * IGUAL A LA PALABRA SECRETA
	 */
	public static String compruebaLetrasAcertadas(String paljug) {
		numLetrasAdivinadas = 0;
		String palabraQueDevuelve = ""; // ES LA PLAABRA QUE SE DEVUELVE
		char caracterFallido = '*'; // SE GUARDA LAS LETRAS QUE NO SE ACIERTAN
		String caracterCorrecto = ""; // SE GUARDA LAS PALABRAS CORRECTA
		boolean caracterM = false; // UN BOOLEAN
		/** PASAMOS LAS PALABRAS EN MINUSCULAS PARA PODER IGULARLAS */
		paljug.toLowerCase();
		/**
		 * UN BUCLE QUE NOS RECORRE EL TAMAÑO DE LA PALABRA Y DONDE HAY UN ACONDICIÓN
		 * QUE COMPARAMOS EL PRIMER CARACTER CON EL SEGUNDO Y SI NO ES IGUAL SALTA A LA
		 * SEGUNDA CONDICIÓN
		 */
		for (int i = 0; i < palabraSecreta.length(); i++) {
			if (paljug.charAt(i) == palabraSecreta.charAt(i)) {// VER SI LAS LAS PRIMERAS LETRAS SON IGUALES
				caracterCorrecto += paljug.charAt(i);
				palabraQueDevuelve += caracterCorrecto.toUpperCase();
				caracterCorrecto = "";
				numLetrasAdivinadas++;
				/**
				 * SEGUNDA CONDICIÓN DONDE SE COMPARA ESE CARCTER DE LA PALABRA DEL JUGADOR CON
				 * TODAS LAS LAS LETRAS DE LA PALABRA SECRETA
				 */
			} else {
				for (int k = 0; k < palabraSecreta.length(); k++) {// SEGUNDO BUCLE QUE RECORRE TODA LA PALABRA SECRETA
					if (paljug.charAt(i) == palabraSecreta.charAt(k)) {// VER SI LA PRIMERA LETRA DE JUGADOR ES IGUAL A
																		// TODAS LAS DE LA PALABRA SECRETA
						caracterM = true;// DEVUELVE EL VERDADERO PARA QUE SIGA SALIENDO MAS ASTERISCO
						palabraQueDevuelve += paljug.charAt(i);// GUARDA LA PALABRA QUE CONICIDE
						k = palabraSecreta.length() + 1;// SALE DEL GRUPO
					}
				}
				// CONDICIÓN DONDE SE GUARDA EL * EN LA PALABRA QUE SE DEVUELVE
				if (caracterM != true) {

					palabraQueDevuelve += caracterFallido;
				}
				caracterM = false;
			}
		}
		System.out.println("Llevas: " + numIntentosConsumidos + " intentos");
		System.out.println("Llevas: " + numLetrasAdivinadas + " letras adivinadas");
		return palabraQueDevuelve;
	}

	// ESTE METODO ES PARA COMPROBAR SI EL JUGADOR HA ACERTADO LA PALABRA SECRETA
	public static boolean haGanadoJugador(String paljug) {
		/**
		 * HACEMOS UNA CONDICIÓN PARA VER SI LAS DOS PALABRAS SON IGUALES SI ES ASI
		 * DEVOLVEMOS UN VERDADERO Y LA PARTIDA ACABA SINO ES ASI, DEVUELVE UN FALSE Y
		 * LA PARTIDA CONTINUA HASTA QUE SE ACABE LOS TURNOS
		 */
		if (paljug.equals(palabraSecreta)) {
			return true;
		}
		return false;
	}

	/**
	 * EN ESTE METODO VEMOS SI HEMOS ACABADO LA PARTIDA Y SE HACE POR MEDIO DE UNA
	 * CONDICIÓN SI ES QUE LOS INTENTOS LLEGAN A 6 Y LA PALABRA DEL JUGADOR NO ES
	 * IGUALA A LA SECRETA SIGNIFICA QUE SE ACABO LA PARTIDA LA SEGUNDA CONDICIÓN ES
	 * LA DEL JUGADOR HA GANADO Y FINALIZA CUANDO LA PALABRA DEL JUGADOR COINCIDE
	 */
	public static boolean haTerminadoJuego(String paljug) {
		if (numIntentosConsumidos == 6 && !paljug.equals(palabraSecreta)) {
			return true;
		}
		if (paljug.equals(palabraSecreta)) {
			return true;
		}
		return false;
	}

	/**
	 * ESTE METOOD FUNCIONA PARA GENERAR UNA PALABRA DE MANERA ALEATORIA UTILIZANDO
	 * EL STRING QUE TENEMOS EN LA PARTE SUPERIOR
	 */
	public static String generapalabra(String[] pals) {
		Random random = new Random();
		int pospalabra;
		pospalabra = random.nextInt(20);
		palabraSecreta = pals[pospalabra];
		return palabraSecreta;
	}

	private static String generapalabraIngles(String[] pals) {
		Random random = new Random();
		int pospalabra;
		pospalabra = random.nextInt(20);
		palabraSecreta = pals[pospalabra];
		return palabraSecreta;
	}

}