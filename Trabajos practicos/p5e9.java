import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Escribir un programa que mientras el usuario ingrese un caracter letra
minúscula, se quede con la menor y la mayor letra ingresada. Finalmente
muestre por pantalla dichas letras. */

public class p5e9 {
    public static void main(String[] args) {
        char letra;
        char letraNueva;
        char letraMenor;
        char letraMayor;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un caracter: ");
            letra = entrada.readLine().charAt(0);
            letraMenor = letra;
            letraMayor = letra;
            letraNueva = letra;

            while (Character.isLetter(letra) && Character.isLowerCase(letra) && Character.isLowerCase(letraNueva) && Character.isLetter(letraNueva)) {
                System.out.println("Ingrese un caracter: ");
                letraNueva = entrada.readLine().charAt(0); 
                if (Character.isLowerCase(letraNueva) && Character.isLetter(letraNueva)) {
                    if (letraNueva < letraMenor) {
                        letraMenor = letraNueva;
                    }
                    if (letraNueva > letraMayor) {
                        letraMayor = letraNueva;
                    }                   
                }
            }
            System.out.println("La letra menor fue: " + letraMenor + " y la letra mayor fue: " + letraMayor);
        }
        catch(Exception exc) {
            System.out.println(exc);
        }
    }
    
}