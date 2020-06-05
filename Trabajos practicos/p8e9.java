import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Hacer un programa que dado una matriz de enteros de tamaño 4*5 que
se encuentra precargada, solicite al usuario el ingreso de una fila y dos
números enteros (columnas de la matriz), y ordene de forma creciente la
matriz en la fila indicada entre las dos posiciones columnas ingresadas.
*/

public class p8e9 {
    public static void main(String[] args) {
        int[][] numbers = { { 1, 2, 3, 4, 5, }, { 1, 3, 2, 6, 5, }, { 1, 2, 3, 4, 5, }, { 1, 2, 3, 4, 5, }, };
        int enteroUser1, enteroUser2, filaUser;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese una fila: ");
            filaUser = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un numero entero: ");
            enteroUser1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un numero entero: ");
            enteroUser2 = Integer.valueOf(entrada.readLine());

            ordenarEntreDos(numbers, filaUser, enteroUser1, enteroUser2);
            
        }
        catch (Exception e) {
            System.out.println("Te pasaste de rango");
        }
    }
    public static void ordenarEntreDos (int [][] numbers, int filaUser, int enteroUser1, int enteroUser2) {
        int aux;
        for (int i = enteroUser1; i < enteroUser2; i++) {
            if (numbers[filaUser][i] > numbers[filaUser][i + 1]) {
                aux = numbers[filaUser][i];
                numbers[filaUser][i] = numbers[filaUser][i + 1];
                numbers[filaUser][i + 1] = aux;
            }

        }
        for (int fila = 0; fila < 4; fila++) {
            System.out.print("|");
            for (int columna = 0; columna < 5; columna++) {
                System.out.print(numbers[fila][columna] + "|");
            }
            System.out.println("");
        }
    }
}