import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Hacer un programa que dado el arreglo definido y precargado, y un número
entero ingresado por el usuario, copie de forma continua las secuencias de
tamaño igual al número ingresado en otro arreglo de iguales características e
inicializado con 0. La copia en este último arreglo deben comenzar desde el
principio del mismo.
*/
public class p7e14 {
    public static void main(String[] args) {
        int[] numbers = { 0, 1, 2, 0, 3, 5, 7, 4, 0, 0, 1, 9, 7, 4, 6, 0, 1, 8, 0, 0 };
        int enteroUser;
        BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese un numero entero: ");
            enteroUser = Integer.valueOf(entrada.readLine());
            copiarSecuencias(numbers, enteroUser);
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static int obtenerInicioSecuencia (int [] numbers, int desde) {
        while (desde < numbers.length && numbers[desde] == 0) {
            desde++;
        }
        return desde;
    }
    public static int obtenerFinSecuencia (int [] numbers, int inicio) {
        while (numbers[inicio] != 0) {
            inicio++;
        }
        return inicio - 1;
    }
    public static int elementosSecuencia (int [] numbers, int inicio, int fin) {
        int elementos = 0;
        for (int i = inicio; i <= fin; i++) {
            elementos++;
        }
        return elementos;
    }
    public static void copiarSecuencias (int [] numbers, int enteroUser) {
        int inicio, fin;
        inicio = 0;
        fin = -1;
        int elementosSec;
        int [] elementos = new int [20];
        while (inicio < numbers.length) {
            inicio = obtenerInicioSecuencia(numbers, fin + 1);
            if (inicio < numbers.length) {
                fin = obtenerFinSecuencia(numbers, inicio);
                elementosSec = elementosSecuencia(numbers, inicio, fin);
                if (elementosSec == enteroUser) {
                    for (int i = inicio; i <= fin; i++) {
                        elementos[i] = numbers[i];
                    }
                    
                }
            } 
        }
        for (int i : elementos) {
            System.out.println(i);
        }
    }
    
}