package RETO;

import java.util.Random;

public class TresEnRaya {
    private int[][] tablero = new int[3][3];
    private int[] posiciones = { 00, 01, 02, 10, 11, 12, 20, 21, 22 };

    public TresEnRaya() {
        // Inicializa el tablero a 0
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 0;
            }
        }
    }

    public void mueveJugador1(int pos) {
        if (!movimientoValido(pos)) {
            System.out.println("Movimiento incorrecto");
            return;
        }
        tablero[posiciones[pos - 1] / 10][posiciones[pos - 1] % 10] = 1;
    }

    public void mueveJugador2(int pos) {
        if (!movimientoValido(pos)) {
            System.out.println("Movimiento incorrecto");
            return;
        }
        tablero[posiciones[pos - 1] / 10][posiciones[pos - 1] % 10] = 2;
    }
    
    public void mueveMaquina1() {
        Random random = new Random();
        int pos;
        do {
            pos = random.nextInt(9) + 1;
        } while (!movimientoValido(pos));
        tablero[posiciones[pos - 1] / 10][posiciones[pos - 1] % 10] = 1;
    }
    
    public void mueveMaquina2() {
        Random random = new Random();
        int pos;
        do {
            pos = random.nextInt(9) + 1;
        } while (!movimientoValido(pos));
        tablero[posiciones[pos - 1] / 10][posiciones[pos - 1] % 10] = 2;
    }
    
    public boolean movimientoValido(int pos) {
        if (pos <= 0 || pos > 9) {
            return false;
        }
        int fila = posiciones[pos - 1] / 10;
        int col = posiciones[pos - 1] % 10;
        if (tablero[fila][col] == 1 || tablero[fila][col] == 2) {
            return false;
        }
        return true;
    }
    
    public void DibujaTablero() {
        System.out.println("-------------");
        for (int i = 0; i < tablero.length; i++) {
            for (int x = 0; x < tablero[i].length; x++) {
                char simbolo = tablero[i][x] == 1 ? 'X' : tablero[i][x] == 2 ? 'O' : ' ';
                System.out.print("| " + simbolo + " ");
            }
            System.out.println("|");
            System.out.println("-------------");
        }
    }
    
    public void inciar() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 0;
            }
        }
    }

    // Métodos para comprobar si hay ganador
    public boolean ganaJugador1() {
        if ((tablero[0][0] == 1 && tablero[0][1] == 1 && tablero[0][2] == 1)
                || (tablero[1][0] == 1 && tablero[1][1] == 1 && tablero[1][2] == 1)
                || (tablero[2][0] == 1 && tablero[2][1] == 1 && tablero[2][2] == 1)
                || (tablero[0][0] == 1 && tablero[1][0] == 1 && tablero[2][0] == 1)
                || (tablero[0][1] == 1 && tablero[1][1] == 1 && tablero[2][1] == 1)
                || (tablero[0][2] == 1 && tablero[1][2] == 1 && tablero[2][2] == 1)
                || (tablero[0][0] == 1 && tablero[1][1] == 1 && tablero[2][2] == 1)
                || (tablero[0][2] == 1 && tablero[1][1] == 1 && tablero[2][0] == 1)) {
            return true;
        }
        return false;
    }
    
    public boolean ganaJugador2() {
        if ((tablero[0][0] == 2 && tablero[0][1] == 2 && tablero[0][2] == 2)
                || (tablero[1][0] == 2 && tablero[1][1] == 2 && tablero[1][2] == 2)
                || (tablero[2][0] == 2 && tablero[2][1] == 2 && tablero[2][2] == 2)
                || (tablero[0][0] == 2 && tablero[1][0] == 2 && tablero[2][0] == 2)
                || (tablero[0][1] == 2 && tablero[1][1] == 2 && tablero[2][1] == 2)
                || (tablero[0][2] == 2 && tablero[1][2] == 2 && tablero[2][2] == 2)
                || (tablero[0][0] == 2 && tablero[1][1] == 2 && tablero[2][2] == 2)
                || (tablero[0][2] == 2 && tablero[1][1] == 2 && tablero[2][0] == 2)) {
            return true;
        }
        return false;
    }
    
    public boolean ganaMaquina1() {
        return ganaJugador1();
    }
    
    public boolean ganaMaquina2() {
        return ganaJugador2();
    }
    
    public boolean quedanCasillas() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}

/*package RETO;

import java.util.Random;
import java.util.Scanner;

public class TresEnRaya {
	Scanner entrada = new Scanner(System.in);
    private int[][] tablero = new int[3][3];
    private int[] posiciones = { 00, 01, 02, 10, 11, 12, 20, 21, 22 };
    private char fichaJ1 , fichaJ2;

    public TresEnRaya() {
        // Inicializa el tablero a 0
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 0;
            }
        }
    }
    
    public void seleccionaFicha(char ficha) {
    	fichaJ1 = entrada.nextLine().charAt(0);
    	if (fichaJ1=='X') {
			fichaJ2='O';
		}
    	if (fichaJ1 == 'o'){
			fichaJ2='x';
		}
	
    	while (ficha!='X'&& ficha!='O') {
    		System.out.println("Error introduzca 'X' o 'O'");
    		fichaJ1 = entrada.nextLine().charAt(0);
    		
    	}
    }
    public void mueveJugador1(int pos) {
        if (!movimientoValido(pos)) {
            System.out.println("Movimiento incorrecto");
            return;
        }
        tablero[posiciones[pos - 1] / 10][posiciones[pos - 1] % 10] = 1;
    }

    public void mueveJugador2(int pos) {
        if (!movimientoValido(pos)) {
            System.out.println("Movimiento incorrecto");
            return;
        }
        tablero[posiciones[pos - 1] / 10][posiciones[pos - 1] % 10] = 2;
    }
    
    public void mueveMaquina1() {
        Random random = new Random();
        int pos;
        do {
            pos = random.nextInt(9) + 1;
        } while (!movimientoValido(pos));
        tablero[posiciones[pos - 1] / 10][posiciones[pos - 1] % 10] = 1;
    }
    
    public void mueveMaquina2() {
        Random random = new Random();
        int pos;
        do {
            pos = random.nextInt(9) + 1;
        } while (!movimientoValido(pos));
        tablero[posiciones[pos - 1] / 10][posiciones[pos - 1] % 10] = 2;
    }
    
    public boolean movimientoValido(int pos) {
        if (pos <= 0 || pos > 9) {
            return false;
        }
        int fila = posiciones[pos - 1] / 10;
        int col = posiciones[pos - 1] % 10;
        if (tablero[fila][col] == 1 || tablero[fila][col] == 2) {
            return false;
        }
        return true;
    }
    
    public void DibujaTablero() {
        System.out.println("-------------");
        for (int i = 0; i < tablero.length; i++) {
            for (int x = 0; x < tablero[i].length; x++) {
                char simbolo = tablero[i][x] == 1 ? fichaJ1 : tablero[i][x] == 2 ? fichaJ2 : ' ';
                System.out.print("| " + simbolo + " ");
            }
            System.out.println("|");
            System.out.println("-------------");
        }
    }
    
    public void inciar() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 0;
            }
        }
    }

    // Métodos para comprobar si hay ganador
    public boolean ganaJugador1() {
        if ((tablero[0][0] == 1 && tablero[0][1] == 1 && tablero[0][2] == 1)
                || (tablero[1][0] == 1 && tablero[1][1] == 1 && tablero[1][2] == 1)
                || (tablero[2][0] == 1 && tablero[2][1] == 1 && tablero[2][2] == 1)
                || (tablero[0][0] == 1 && tablero[1][0] == 1 && tablero[2][0] == 1)
                || (tablero[0][1] == 1 && tablero[1][1] == 1 && tablero[2][1] == 1)
                || (tablero[0][2] == 1 && tablero[1][2] == 1 && tablero[2][2] == 1)
                || (tablero[0][0] == 1 && tablero[1][1] == 1 && tablero[2][2] == 1)
                || (tablero[0][2] == 1 && tablero[1][1] == 1 && tablero[2][0] == 1)) {
            return true;
        }
        return false;
    }
    
    public boolean ganaJugador2() {
        if ((tablero[0][0] == 2 && tablero[0][1] == 2 && tablero[0][2] == 2)
                || (tablero[1][0] == 2 && tablero[1][1] == 2 && tablero[1][2] == 2)
                || (tablero[2][0] == 2 && tablero[2][1] == 2 && tablero[2][2] == 2)
                || (tablero[0][0] == 2 && tablero[1][0] == 2 && tablero[2][0] == 2)
                || (tablero[0][1] == 2 && tablero[1][1] == 2 && tablero[2][1] == 2)
                || (tablero[0][2] == 2 && tablero[1][2] == 2 && tablero[2][2] == 2)
                || (tablero[0][0] == 2 && tablero[1][1] == 2 && tablero[2][2] == 2)
                || (tablero[0][2] == 2 && tablero[1][1] == 2 && tablero[2][0] == 2)) {
            return true;
        }
        return false;
    }
    
    public boolean ganaMaquina1() {
        return ganaJugador1();
    }
    
    public boolean ganaMaquina2() {
        return ganaJugador2();
    }
    
    public boolean quedanCasillas() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}*/