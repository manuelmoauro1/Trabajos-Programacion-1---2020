/*
Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, invierta el orden del contenido por fila. Este intercambio no se debe realizar
de manera explícita, hay que hacer un método que incluya una iteración de intercambio.
*/

public class p8e1 {
    public static void main(String[] args) {
        int [][] numbers = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},};

        try {
            invertir(numbers);
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
    }
    public static void invertir (int [][] numbers) {
        int indiceA, indiceB, n;
        n = 9;
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (n >= 0) {
                indiceA = numbers[i][j];
                indiceB = numbers[i][n];
                numbers[i][j] = indiceB;
                numbers[i][n] = indiceA;
                n--;
                }
            }
            n = 9;
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