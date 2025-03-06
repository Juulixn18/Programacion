package UD4FUNCIONES;

import java.util.Scanner;

public class EJ23HOHJA5 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] n1 = new int[5]; 
        int[] n2 = new int[5]; 
        int[] n3 = new int[5];
        int opcion;
        do {
            menu();
            opcion = in.nextInt();
            switch (opcion) {
                case 1: {
                    n1 = rellena(n1); 
                    break;
                }
                case 2: {
                    n2 = copia(n1); 
                    break;
                }
                case 3: {
                    mostrar(n1, n2, n3); 
                    break;
                }
                case 4: {
                    n3 = ordenado(n1); 
                    break;
                }
                case 5: {
                    System.out.println("Saliste");
                    break;
                }
                default:
                    System.out.println("Escoge una función de las mostradas");
            }
        } while (opcion != 5); 
    }
    public static int[] rellena(int[] numeros) {
        System.out.println("Introduce 5 números para rellenar el array:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = in.nextInt();
        }
        return numeros;
    }

    public static int[] copia(int[] numscopiados) {
        int[] numcopi = new int[numscopiados.length];
        for (int i = 0; i < numscopiados.length; i++) {
            numcopi[i] = numscopiados[i]; // Copio los valores de numscopiados a numcopi
        }
        System.out.println("Array copiado exitosamente.");
        return numcopi;
    }
    
    public static int[] ordenado(int[] numero) {
        int temp;       
        for (int i = 0; i < numero.length - 1; i++) {
            for (int j = 0; j < numero.length -1 -i; j++) { 
                if (numero[j] > numero[j + 1]) {
                    temp = numero[j];
                    numero[j] = numero[j + 1];
                    numero[j + 1] = temp;
                }
            }
        }
        return numero; // Devolvemos el array ya ordenado
    }

    // Muestro todos los array
    public static void mostrar(int[] numeros, int[] numeroscopiados, int[] numeroOrdenado) {
        System.out.println("Array original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); 

        System.out.println("Array copiado:");
        for (int i = 0; i < numeroscopiados.length; i++) {
            System.out.print(numeroscopiados[i] + " ");
        }
        System.out.println(); 

        System.out.println("Array ordenado (Burbuja):");
        for (int i = 0; i < numeroOrdenado.length; i++) {
            System.out.print(numeroOrdenado[i] + " "); 
        }
        System.out.println(); 
    }

    // Menú de opciones
    public static void menu() {
        System.out.println("Escoge una función:");
        System.out.println("1. Rellenar un array");
        System.out.println("2. Copiar un array a otro");
        System.out.println("3. Mostrar en pantalla todos los valores");
        System.out.println("4. Ordenar el array con burbuja");
        System.out.println("5. Salir");
    }
}
