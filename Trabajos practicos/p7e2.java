
 /*
Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, obtenga la cantidad de números pares que tiene y la imprima.
 */
public class p7e2 {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int cantidad = 0;
        try {
            for(int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    cantidad++;               
                    System.out.println(numbers[i]);                   
                }
            }
            System.out.println("La cantidad de numeros par en la lista es: " + cantidad);
        }
        catch(Exception exc) {
            System.out.println(exc);
        }
    }
    
}