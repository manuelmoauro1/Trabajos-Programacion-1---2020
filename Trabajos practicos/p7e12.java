/*
Hacer un programa que dado el arreglo definido y precargado permita
encontrar la posición de inicio y fin de la anteúltima secuencia (considerar
comenzar a buscarla a partir de la ultima posición del arreglo).
*/
public class p7e12 {
    public static void main(String[] args) {
        int[] numbers = { 0, 1, 2, 0, 3, 5, 7, 4, 0, 0, 1, 9, 7, 4, 6, 0, 1, 8, 0, 0 };

        try {
            int posFinal = posFin(numbers);
            System.out.println(posInicio(numbers, posFinal));
            System.out.println(posFinal);            
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static int posFin(int [] numbers) {
        int posFin = numbers.length - 1;
        while (numbers[posFin] == 0) {
            posFin--;
        }
        while (numbers[posFin] != 0) {
            posFin--;
        }
        while (numbers[posFin] == 0) {
            posFin--;
        }
        return posFin;
    }
    public static int posInicio(int [] numbers, int posFinal) {
        int posInicio = posFinal;
        while (numbers[posInicio] != 0) {
            posInicio--;
        }
        return posInicio + 1;
    } 
}