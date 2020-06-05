import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, solicite al usuario un numero entero y una posición fila, columna. Con estos
datos tendrá que realizar un corrimiento a derecha (se pierde el último valor en dicha fila)
y colocar el numero en la matriz en la posición fila, columna indicada.

*/

public class p8e4 {
    public static void main(String[] args) {
        int [][] numbers = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},};
        int enteroUser, filaUser, columnaUser;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un entero a colocar en la matriz");
            enteroUser = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese una fila");
            filaUser = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese una columna");
            columnaUser = Integer.valueOf(entrada.readLine());

            corrimientoDer(numbers, enteroUser, filaUser, columnaUser);

            
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void corrimientoDer (int [][] numbers, int enteroUser, int filaUser, int columnaUser) {
        int indice = 9;
        while (indice > columnaUser) {
            numbers[filaUser][indice] = numbers[filaUser][indice - 1];
            indice--;
        }
        numbers[filaUser][columnaUser] = enteroUser;
        for (int fila = 0; fila < 5; fila++){
			System.out.print("|");
			for (int columna = 0; columna < 10; columna++){
				System.out.print(numbers[fila][columna]+"|");
			}
			System.out.println("");
		}



    }
    
}