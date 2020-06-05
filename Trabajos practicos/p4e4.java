import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p4e4 {
	public static void main(String[] args) {
		int anio;
		int mes;
		int dia;
		int aureo;
		int epacta;
		int edadLunar;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un anio: ");
			anio = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese un mes: ");
			mes = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese un dia: ");
			dia = Integer.valueOf(entrada.readLine());
			aureo = (anio + 1) % 19;
			epacta = ((aureo - 1) * 11) % 30;
			if (mes == 1 && dia == 1) {
				System.out.println("La edad lunar es: " + epacta);
			}
			else if (mes == 2){
				edadLunar = epacta + 12 + dia;
				if (edadLunar > 28) {
					edadLunar = edadLunar % 30;
				}
				System.out.println("La edad lunar es: " + edadLunar);

			}
			
			else if (mes == 3){
				edadLunar = epacta + 0 + dia;
				if (edadLunar > 28) {
					edadLunar = edadLunar % 30;
				}
				System.out.println("La edad lunar es: " + edadLunar);



			}
			else if (mes == 4){
				edadLunar = epacta + 2 + dia;
				if (edadLunar > 28) {
					edadLunar = edadLunar % 30;
				}
				System.out.println("La edad lunar es: " + edadLunar);

			}
			
			else if (mes == 5){
				edadLunar = epacta + 3 + dia;
				if (edadLunar > 28) {
					edadLunar = edadLunar % 30;
				}
				System.out.println("La edad lunar es: " + edadLunar);

			}
			else if (mes == 6){
				edadLunar = epacta + 4 + dia;
				if (edadLunar > 28) {
					edadLunar = edadLunar % 30;
				}
				System.out.println("La edad lunar es: " + edadLunar);

			}
			else if (mes == 7){
				edadLunar = epacta + 5 + dia;
				if (edadLunar > 28) {
					edadLunar = edadLunar % 30;
				}
				System.out.println("La edad lunar es: " + edadLunar);

			}
			else if (mes == 8){
				edadLunar = epacta + 6 + dia;
				if (edadLunar > 28) {
					edadLunar = edadLunar % 30;
				}
				System.out.println("La edad lunar es: " + edadLunar);

			}
			else if (mes == 9){
				edadLunar = epacta + 7 + dia;
				if (edadLunar > 28) {
					edadLunar = edadLunar % 30;
				}
				System.out.println("La edad lunar es: " + edadLunar);

			}
			else if (mes == 10){
				edadLunar = epacta + 8 + dia;
				if (edadLunar > 28) {
					edadLunar = edadLunar % 30;
				}
				System.out.println("La edad lunar es: " + edadLunar);

			}
			else if (mes == 11){
				edadLunar = epacta + 9 + dia;
				if (edadLunar > 28) {
					edadLunar = edadLunar % 30;
				}
				System.out.println("La edad lunar es: " + edadLunar);

			}
			else if (mes == 12){
				edadLunar = epacta + 10 + dia;
				if (edadLunar > 28) {
					edadLunar = edadLunar % 30;
				}
				System.out.println("La edad lunar es: " + edadLunar);

			}

			
			



			

		}
		catch(Exception exc){
			System.out.println(exc);
		}


	}
}