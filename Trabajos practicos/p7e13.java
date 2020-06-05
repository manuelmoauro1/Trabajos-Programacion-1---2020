import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Hacer un programa que dado el arreglo definido y precargado, y un número
entero ingresado por el usuario, elimine las secuencias de tamaño igual al
número ingresado.
*/

public class p7e13 {
    public static void main(String[] args) {
        int[] numbers = { 0, 1, 2, 0, 3, 5, 7, 4, 0, 0, 1, 9, 7, 4, 6, 0, 1, 8, 0, 0 };
        int enteroUser;
        BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un entero: ");
            enteroUser = Integer.valueOf(entrada.readLine());
            eliminar(numbers, enteroUser);

            
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
    public static int obtenerFinalSecuencia (int [] numbers, int inicio) {
        while (numbers[inicio] != 0) {
            inicio++;
        }
        return inicio - 1;
    }
    public static int obtenerElementosSecuencia (int [] numbers, int posInic, int posFin) {
        int suma = 0;
        for (int i = posInic; i <= posFin; i++) {
            suma++;
        }
        return suma;
    }

    public static void eliminar (int [] numbers, int enteroUser) {
        int inicio, fin;
        inicio = 0;
        fin = -1;
        int suma = 0;
        while (inicio < numbers.length) {
            inicio = obtenerInicioSecuencia(numbers, fin + 1);
            if (inicio < numbers.length) {
                fin = obtenerFinalSecuencia(numbers, inicio);
                suma = obtenerElementosSecuencia(numbers, inicio, fin);
                if (suma == enteroUser) {
                    for (int i = inicio; i <= fin; i++) {
                        numbers[i] = 199;
                    }
                }                
            } 
        }
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}