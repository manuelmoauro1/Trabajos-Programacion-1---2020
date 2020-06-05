import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p1e4 {
    /* Escribir un programa que solicite los siguientes datos de una persona (nombre,
apellido, edad, altura, ocupación, dirección) y los imprima por pantalla.*/
    public static void main(final String[] args) {
        String nombre, apellido, ocupacion, direccion;
        int edad;
        float altura;
        try {
            BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese su nombre: ");
            nombre = entrada.readLine();
            System.out.println("Ingrese su apellido: ");
            apellido = entrada.readLine();
            System.out.println("Ingrese su ocupacion: ");
            ocupacion = entrada.readLine();
            System.out.println("Ingrese su direccion: ");
            direccion = entrada.readLine();
            System.out.println("Ingrese su edad: ");
            edad = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese su altura: ");
            altura = Float.valueOf(entrada.readLine());
            System.out.println("Nombre completo: " + nombre + " " + apellido + "\n" + "Su ocupacion es: " + ocupacion + "\n" + "Su domicilio es: " + direccion + "\n" + "Su edad es: " + edad + "\n" + "Su altura es: " + altura);
            


        }
            catch(Exception exc){
                System.out.println(exc);
        }
    }
}
