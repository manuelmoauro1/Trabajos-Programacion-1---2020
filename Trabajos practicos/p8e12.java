/*
Hacer un programa que dada la matriz de secuencias de caracteres definida y
precargada, permita encontrar por cada fila la posición de inicio y fin de la
anteúltima secuencia (considerar comenzar a buscarla a partir de la ultima
posición de la fila).
*/
public class p8e12 {
    public static void main(String[] args) {
        int [][] numbers = {{0, 1, 0, 4, 0, 0, 2, 8, 9, 3, 0, 4, 6, 4, 2, 1, 0, 0, 0, 0},
        {0, 1, 2, 0, 0, 0, 2, 8, 9, 3, 0, 4, 6, 4, 2, 1, 0, 0, 9, 0},
        {0, 1, 2, 4, 0, 0, 2, 8, 9, 3, 0, 4, 6, 4, 2, 1, 0, 0, 9, 0},
        {0, 1, 0, 4, 0, 0, 2, 8, 9, 3, 0, 4, 6, 4, 2, 1, 0, 0, 199, 0},};

        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("La anteultima secuencia comienza en: " + encontrarInicioSecuencia(numbers, i) + " y finaliza en la posicion: " + encontrarFinalSecuencia(numbers, i));

            }
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
    }
    public static int encontrarFinalSecuencia (int [][] numbers, int fila) {
        int desde = 19;
        while (numbers[fila][desde] == 0) {
            desde--;
        }
        while (numbers[fila][desde] != 0) {
            desde--;
        }
        while (numbers[fila][desde] == 0) {
            desde--;
        }
        return desde;
    }
    public static int encontrarInicioSecuencia (int [][] numbers, int fila) {
        int desde = encontrarFinalSecuencia(numbers, fila);
        while (numbers[fila][desde] != 0) {
            desde--;

        }
        return desde + 1;
    }
    
}