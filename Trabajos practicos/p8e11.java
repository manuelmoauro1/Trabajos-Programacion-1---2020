/*
Hacer un programa que dada la matriz de secuencias de enteros definida y
precargada permita encontrar por cada fila la posición de inicio y fin de la
secuencia cuya suma de valores sea mayor.
*/
public class p8e11 {
    public static void main(String[] args) {
        int [][] numbers = {{0, 1, 0, 4, 0, 0, 2, 8, 9, 3, 0, 4, 6, 4, 2, 1, 0, 0, 9, 0},
        {0, 1, 2, 0, 0, 0, 2, 8, 9, 3, 0, 4, 6, 4, 2, 1, 0, 0, 9, 0},
        {0, 1, 2, 4, 0, 0, 2, 8, 9, 3, 0, 4, 6, 4, 2, 1, 0, 0, 9, 0},
        {0, 1, 0, 4, 0, 0, 2, 8, 9, 3, 0, 4, 6, 4, 2, 1, 0, 0, 199, 0},};

        try {
            for (int i = 0; i < 4; i++) {
                obtenerSecuencias(numbers, i);
            }

            
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static int obtenerInicioSecuencia (int [][] numbers, int fila, int desde) {
        while (numbers[fila][desde] == 0) {
            desde++;

        }
        return desde;
    }
    public static int obtenerFinalSecuencia (int [][] numbers, int fila, int inicio) {
        while (numbers[fila][inicio] != 0) {
            inicio++;
        }
        return inicio -1;
    }
    public static int obtenerSumas (int [][] numbers, int desde, int hasta, int fila) {
        int cuenta = 0;
        while (desde <= hasta) {
            cuenta += numbers[fila][desde];
            desde++;
        }
        return cuenta;
    }
    public static void obtenerSecuencias (int [][] numbers, int fila) {
        int inicio, fin;
        inicio = 0;
        fin = -1;
        int cuenta;
        int mayorSuma = 0;
        int inicioMayor = 0, finMayor = 0;
        while (inicio < 18) {
            inicio = obtenerInicioSecuencia(numbers, fila, fin + 1);
            fin = obtenerFinalSecuencia(numbers, fila, inicio);
            cuenta = obtenerSumas(numbers, inicio, fin, fila);
            if (cuenta > mayorSuma) {
                mayorSuma = cuenta;
                inicioMayor = inicio;
                finMayor = fin;
            }
        }
        System.out.print(inicioMayor + "-");
        System.out.println(finMayor);      
    }
}
        
