/*
Se tiene una matriz de caracteres de tamanio 420 de secuencias de caracteres entre 'a' y 'z' (por cada fila), separadas por espacios ' '.
La matriz esta precargada, y ademas cada fila empieza y termina con uno o mas separadores espacios. Se pide realizar un programa que:
_por cada secuencia, agregue en un arreglo de enteros de tamanio 420 inicializado con ceros la cantidad de vocales que tiene cada secuencia.
Cada agregado en el arreglo se debe realizar de forma consecutiva de izquierda a derecha y sin separadores.
*/
public class vocales {
    public static final int nFilas = 4;
    public static final int nColumnas = 20;
    public static final int nElementos = nFilas * nColumnas;

    public static void main(String[] args) {

        char[][] caracteres = {
            { ' ', 'a', 'b', 'e', 'd', 'z', ' ', 'w', 'r', 'v', 'c', ' ', 'k', 'u', 'y', 'e', 's', 's', 'd', ' ' },
            { ' ', 'a', 'b', 'c', 'd', 'z', ' ', 's', 'r', 'i', 'j', ' ', 'j', 's', 'y', 'y', 't', 's', 'd', ' ' },
            { ' ', 'a', 'b', 'c', 'd', 'z', ' ', 'a', 'r', 'f', 'n', ' ', 'f', 'a', 'y', 'e', 's', 's', 'd', ' ' },
            { ' ', 'a', 'b', 'c', 'd', 'z', ' ', 'r', 'u', 'm', 'g', ' ', 'z', 'x', 'y', 'e', 's', 'v', 'd', ' ' } 
        };
        int [] arrInt = new int [nElementos];
        cargarArreglo(arrInt);
        for (int i = 0; i < nFilas; i++) {
            recorrerSecuencias(caracteres, arrInt, i);
        }
        for (int i : arrInt) {
            System.out.println(i);
        }

    }
    public static int obtenerPosicionArreglo (int [] arrInt) {
        int iterador = 0;
        while (arrInt[iterador] != -1) {
            iterador++;
        }
        return iterador;
    }
    public static void cargarArreglo(int [] arrInt) {
        for(int i = 0; i < nElementos; i++) {
            arrInt[i] = -1;
        }
    }
    public static int obtenerInicioSecuencia (char [][] caracteres, int fila, int desde) {
        while (desde < nColumnas && caracteres[fila][desde] == ' ') {
            desde++;
        }
        return desde;
    }
    public static int obtenerFinSecuencia (char [][] caracteres, int fila, int desde) {
        while (desde < nColumnas && caracteres[fila][desde] != ' ') {
            desde++;
        }
        return desde -1;
    }
    public static void recorrerSecuencias (char [][] caracteres, int [] arrInt, int fila) {
        int inicio = 0;
        int fin = -1;
        while (inicio < nColumnas) {
            inicio = obtenerInicioSecuencia(caracteres, fila, fin + 1);
            if(inicio < nColumnas) {
                fin = obtenerFinSecuencia(caracteres, fila, inicio);
                int numeroVocales = obtenerNumeroVocales(caracteres, fila, inicio, fin);
                int posArreglo = obtenerPosicionArreglo(arrInt);
                remplazarArreglo(arrInt, numeroVocales, posArreglo);
            }
        }
    }
    public static int obtenerNumeroVocales (char [][] caracteres, int fila, int inicio, int fin) {
        int iterador = 0;
        while (inicio <= fin) {
            if(caracteres[fila][inicio] == 'a' || caracteres[fila][inicio] == 'e' || caracteres[fila][inicio] == 'i' || caracteres[fila][inicio] == 'o' || caracteres[fila][inicio] == 'u') {
                iterador++;
            }
            inicio++;
        }
        return iterador;

    }
    public static void remplazarArreglo (int [] arrInt, int numeroVocales, int posArreglo) {
        arrInt[posArreglo] = numeroVocales;
    }
}
