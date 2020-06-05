import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p4e3 {
	public static void main(String[] args) {
		int numeroMes;
		int anio;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero de mes.");
			numeroMes = Integer.valueOf(entrada.readLine());
			if (numeroMes == 1 || numeroMes == 3 || numeroMes == 5 ||  numeroMes == 7 || numeroMes == 8 ||  numeroMes == 10 || numeroMes == 12 ) {
				System.out.println("El mes que ingresaste tiene 31 dias.");
			}
			else if (numeroMes == 2) {
				System.out.println("Ingrese un anio: ");
				anio = Integer.valueOf(entrada.readLine());
				if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
					System.out.println("El mes que inresaste tiene 29 dias.");
				}
				else {
					System.out.println("El mes que ingresastetiene 28 dias.");
				}
			}
			else if (numeroMes > 12){
				System.out.println("Ingrese un mes valido.");

			}
			else {
				System.out.println("El mes que ingresaste tiene 30 dias.");
			}


		}
		catch(Exception exc){
			System.out.println(exc);
		}
		
	}

}