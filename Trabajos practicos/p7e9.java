import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Hacer un programa que dado un arreglo de enteros de tamaño 10 que se
encuentra precargado, solicite al usuario el ingreso de dos números
enteros (posiciones del arreglo) y ordene de forma creciente el arreglo
entre dos posiciones correspondientes a los números ingresados.
*/


public class p7e9 {
    public static void main(String[] args) {
        int [] numbers = {1, 52, 3, 4, 2, 37, 7, 8, 9, 10};
        int primerPos, segundaPos;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            
            System.out.println("Ingrese una posicion del arreglo: ");
            primerPos = Integer.valueOf(entrada.readLine());
            System.out.print("Ingrese otra posicion del entero: ");
            segundaPos = Integer.valueOf(entrada.readLine());
            
            ordenar(numbers, primerPos, segundaPos);

        }
        catch (Exception exc) {
            System.out.println(exc);
        }
        
    }

    public static void ordenar(int [] numbers, int pos1, int pos2) {
        int aux;
        for (int j = pos1; j < pos2; j++) {
            for (int i = pos1; i < pos2; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    aux = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = aux;
                }
            }

            }
        for (int x : numbers) {
            System.out.println(x);
        }
    }
    
}