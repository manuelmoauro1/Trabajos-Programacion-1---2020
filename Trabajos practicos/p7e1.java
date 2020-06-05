/*
Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, invierta el orden del contenido (por ejemplo: el que está en 0 se intercambia con
el que está en 9, el que está en 1 con el que está en 8...). Este intercambio no se debe realizar
de manera explícita, hay que hacer un método que incluya una iteración de intercambio.
*/
public class p7e1 {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int aux;
        int ultimo = numbers.length - 1;

        for (int i = 0; i < numbers.length / 2; i++){
            aux = numbers[i];
            numbers[i] = numbers[ultimo];
            numbers[ultimo] = aux;
            ultimo--;
        }
        for (int i : numbers) {
            System.out.println(i);
        }
    }
    
}