/*
Se tiene una matriz de caracteres de tamanio 4*20 de secuencias de caracteres entre 'a' y 'z' (por cada fila), separadas por espacios ' '.
La matriz esta precargada, y ademas cada fila empieza y termina con uno o mas separadores espacios. Se pide realizar un programa que:
_por cada fila, copie la tercer secuencia (si tiene) en un arreglo de caracteres de tamanio 4*20 inicializado con espacios.
Cada agregado en el arreglo se debe realizar de forma consecutiva de izquierda a derecha y sin separadores.
*/

/*
pos_arreglo_final = 0

para cada fila    
    inicio = inicio_secuencia(fila)
    fin = fin_secuencia(fila)
    
    copiar_secuencia(mat, arreglo_final, inicio, fin, pos_arreglo_final)

    pos_arreglo_final = pos_arreglo_final + (fin - inicio)

*/
public class Segundo_ejercicio {
    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 20;
    public static final int MAX = MAXFILA * MAXCOLUMNA;

    public static void main(String[] args) {
        char[][] matchar = {
                { ' ', 'a', 'b', 'c', 'd', 'z', ' ', 'w', 'r', 'v', 'c', ' ', 'k', 'u', 'y', 'e', 's', 's', 'd', ' ' },
                { ' ', 'a', 'b', 'c', 'd', 'z', ' ', 's', 'r', 'i', 'j', ' ', 'j', 's', 'y', 'y', 't', 's', 'd', ' ' },
                { ' ', 'a', 'b', 'c', 'd', 'z', ' ', 'a', 'r', 'f', 'n', ' ', 'f', 'a', 'y', 'e', 's', 's', 'd', ' ' },
                { ' ', 'a', 'b', 'c', 'd', 'z', ' ', 'r', 'u', 'm', 'g', ' ', 'z', 'x', 'y', 'e', 's', 'v', 'd',' ' }};

        char[] arrchar = new char[MAX];
        try {
            cargar_arreglo_char(arrchar);
            realizar_segundo_ejercicio(matchar, arrchar);
            imprimirArreglo(arrchar);
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void cargar_arreglo_char(char[] arrchar) {
        for (int i = 0; i < MAX; i++) {
            arrchar[i] = ' ';
        }
    }
    public static void imprimirArreglo (char [] arrchar) {
        for (char c : arrchar) {
            System.out.print(c);
        }
    }
    public static void realizar_segundo_ejercicio(char[][] matchar, char[] arrchar) {
        int pos_arreglo = 0;
        for (int i = 0; i < MAXFILA; i++) {
            int inicio = encontrarTercerSecuencia(matchar, i);
            if (inicio != -1) { 
              int fin = encontrarFinTercerSecuencia(matchar, i, inicio);
              copiarTercerSecuencia(matchar, arrchar, i, inicio, fin, pos_arreglo);
              pos_arreglo += (fin - inicio);
            }
        }
    }
    public static int encontrarTercerSecuencia(char[][] matchar, int fila) {
        int i = 0;
        int secuencia = 0;
        while (i < MAXCOLUMNA && secuencia < 2) {
          while(i < MAXCOLUMNA && matchar[fila][i] == ' ') {
            i++;
          }
          while(i < MAXCOLUMNA && matchar[fila][i] != ' ') {
            i++;
          }
          secuencia++;
        }

        while(i < MAXCOLUMNA && matchar[fila][i] == ' ') {
            i++;
        }

        if (i == MAXCOLUMNA) {
          return -1;
        } else {
          return i;
        }
        
    }
    public static int encontrarFinTercerSecuencia(char[][] matchar, int fila, int desde) {
        while (desde < MAXCOLUMNA && matchar[fila][desde] != ' ') {
            desde++;
        }
        return desde - 1;
    }
    public static void copiarTercerSecuencia(char[][] matchar, char[] arrchar, int fila, int inicio, int fin, int pos_arreglo) {
        for (int i=0; i < (fin - inicio); i++) {
          arrchar[pos_arreglo + i] = matchar[fila][inicio + i];
        }
    }
}