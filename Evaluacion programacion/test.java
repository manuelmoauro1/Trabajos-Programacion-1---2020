/*
    Se tiene una matriz de caracteres de tamanio 4*20 de secuencias de caracteres entre 'a' y 'z' (por cada fila), separadas por espacios ' '.
    La matriz esta precargada, y ademas cada fila empieza y termina con uno o mas separadores espacios. Se pide realizar un programa que:
    _por cada fila, copie la tercer secuencia (si tiene) en un arreglo de caracteres de tamanio 4*20 inicializado con espacios.
    Cada agregado en el arreglo se debe realizar de forma consecutiva de izquierda a derecha y sin separadores.
    - Busco inicio y fin [listo]
    - Por cada fila copio tercer secuencia en el arreglo 
*/

public class test {
    public static final int nFilas = 4;
    public static final int nColumnas = 20;
    public static final int nElementos = nFilas * nColumnas;
    public static void main(String[] args) {
        char [][] caracteres = {{ ' ', 'a', 'b', 'e', 'd', 'z', ' ', 'w', 'r', 'v', 'c', ' ', 'k', 'u', 'y', 'e', 's', 's', 'd', ' ' },
        { ' ', 'a', 'b', 'c', 'd', 'z', ' ', 's', 'r', 'i', 'j', ' ', 'j', 's', 'y', 'y', 't', 's', 'd', ' ' },
        { ' ', 'a', 'b', 'c', 'd', 'z', ' ', 'a', 'r', 'f', 'n', ' ', 'f', 'a', 'y', 'e', 's', 's', 'd', ' ' },
        { ' ', 'a', 'b', 'c', 'd', 'z', ' ', 'r', 'u', 'm', 'g', ' ', 'z', 'x', 'y', 'e', 's', 'v', 'd', ' ' } 
        };
        char [] arrChar = new char [nElementos];
        cargarArreglo(arrChar);
        for (int i = 0; i < nFilas; i++) {
            recorrerSecuencias(caracteres, arrChar, i);
        }
        imprimirArreglo(arrChar);
    }
    public static void imprimirArreglo (char [] arrChar) {
        for (char c : arrChar) {
            System.out.print(c+"|");
        }
    }
    public static void cargarArreglo (char [] arrChar) {
        for (int i = 0; i < nElementos; i++) {
            arrChar[i] = ' ';
        }
    }
    public static int encontrarInicioTercerSecuencia (char [][] caracteres, int fila, int desde) {
        int secuencia = 0;
        while (secuencia < 2 && desde < nColumnas) {
            while(caracteres[fila][desde] == ' ') {
                desde++;
            }
            while (caracteres[fila][desde] != ' ') {
                desde++;
            }
            while (caracteres[fila][desde] == ' ') {
                desde++;
            }
            secuencia++;
        }
        if (desde == nColumnas) {
            return -1;
        }
        return desde;
    }
    public static int encontrarFinTercerSecuencia (char [][] caracteres, int fila, int desde) {
        while(caracteres[fila][desde] != ' ') {
            desde++;
        }
        return desde -1;
    }
    public static void recorrerSecuencias (char [][] caracteres, char [] arrChar, int fila) {
        int inicio = encontrarInicioTercerSecuencia(caracteres, fila, 0);
        if (inicio != -1) {
            int fin = encontrarFinTercerSecuencia(caracteres, fila, inicio);
            int posArreglo = obtenerPosicionArreglo(arrChar);
            copiarSecuenciaEnArreglo(caracteres, arrChar, fila, inicio, fin, posArreglo);

        }
    }
    public static void copiarSecuenciaEnArreglo (char [][] caracteres, char [] arrChar, int fila, int inicio, int fin, int posArreglo) {
        int i = 0;
        while (inicio <= fin) {
            arrChar[posArreglo + i] = caracteres[fila][inicio];
            inicio++;
            i++;
        }
    }
    public static int obtenerPosicionArreglo(char [] arrChar) {
        int i = 0;
        while(arrChar[i] != ' ') {
            i++;
        }
        return i;
    }
}