import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Escribir un programa que mientras el usuario ingrese un caracter letra
minúscula, acumule la cantidad de vocales que ingreso. Finalmente
muestre por pantalla dicha cantidad. */

public class p5e8 {
    public static void main(String[] args) {
        char caracter;
        int sumaDeCaracteres = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un caracter: ");
            caracter = entrada.readLine().charAt(0);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                sumaDeCaracteres ++;
            }
            while (caracter >= 'a' && caracter <= 'z') {
                System.out.println("Ingrese un caracter: ");
                caracter = entrada.readLine().charAt(0);
                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    sumaDeCaracteres ++;
                }
                


            }
            System.out.println("Usted ha ingreado " + sumaDeCaracteres + " vocales.");
        }
        catch(Exception exc) {
            System.out.println(exc);
        }        
    }
    
}