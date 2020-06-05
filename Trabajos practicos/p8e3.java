import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, solicite al usuario una posición fila, columna y realice un corrimiento a
izquierda.
*/

public class p8e3 {
    public static void main(String[] args) {
        int [][] numbers = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},};
        int filaUser, columnaUser;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese una fila");
            filaUser = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese una columna");
            columnaUser = Integer.valueOf(entrada.readLine());

            corrimiento(numbers, filaUser, columnaUser);
        
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void corrimiento (int[][] numbers, int filaUser, int columnaUser) {
        int indice = columnaUser;
        while(indice > 0) {
            numbers[filaUser][indice] = numbers[filaUser][indice - 1];
            indice--;
        }
        for (int fila = 0; fila < 5; fila++){
			System.out.print("|");
			for (int columna = 0; columna < 10; columna++){
				System.out.print(numbers[fila][columna]+"|");
			}
			System.out.println("");
		}

    }
    
}