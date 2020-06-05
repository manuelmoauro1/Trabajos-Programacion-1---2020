/*
Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, obtenga la cantidad de números pares que tiene y la imprima.
*/

public class p8e2 {
    public static void main(String[] args) {
        int [][] numbers = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},};

        try {
            cantidadPar(numbers);
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
    }
    public static void cantidadPar (int [][] numbers) {
        int cuenta = 0;
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                if (numbers[i][j] % 2 == 0) {
                    cuenta++;
                }
            }
        }
        System.out.println(cuenta);
    }
}