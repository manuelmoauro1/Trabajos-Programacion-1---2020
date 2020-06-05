import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Hacer un programa que dado una matriz ordenada creciente por filas de
enteros de tamaño 4*5 que se encuentra precargada, solicite al usuario un
numero entero y una fila, y luego inserte el numero en la matriz en la fila
indicada manteniendo su orden.
*/

public class p8e7 {
    public static void main(String[] args) {
        int[][] numbers = { { 1, 2, 3, 4, 5, }, { 1, 2, 3, 4, 5, }, { 1, 2, 3, 4, 5, }, { 1, 2, 3, 4, 5, }, };
        int enteroUser, filaUser;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un numero entero: ");
            enteroUser = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese una fila: ");
            filaUser = Integer.valueOf(entrada.readLine());

            agregarEnteroUser(numbers, enteroUser, filaUser);

            
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
    public static void agregarEnteroUser (int [][] numbers, int enteroUser, int filaUser) {
        int aux;
        numbers[filaUser][4] = enteroUser;
        for (int j = 4; j > 0; j--) {
            if (numbers[filaUser][j] < numbers[filaUser][j-1]) {
                aux = numbers[filaUser][j];
                numbers[filaUser][j] = numbers[filaUser][j-1];
                numbers[filaUser][j-1] = aux;
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