import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class PruebaConjunto {

	public static int[] crearConjuntoPrimo() {

		int[] array = new int[25];
		int pos = 0;
		
		for(int i=0; i<=100; i++) {
			int cont = 0;

			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					cont++;
				}
			}

			if(cont==2) {
				array[pos] = i;
				pos++;
			}
		}
		return array;	
	}


	public static int[] crearConjuntoDivisor() {

		int[] array = new int[12];
		int pos = 0;
		
		for(int i=1; i<=350; i++) {
			if(350%i==0) {
				array[pos] = i;
				pos++;
			}
		}

		return array;
	}


    public static void main(String[] args) {
		
    	Scanner entrada = new Scanner(System.in);
    	Conjunto c = new Conjunto(crearConjuntoPrimo(), crearConjuntoDivisor());
		int opcion;
		boolean candado = true;
		
		do {
			
			System.out.println("1.-Union");
			System.out.println("2.-Interseccion");
			System.out.println("3.-Diferencia");
			System.out.print("Ingresa opcion: ");
			
			try {
				opcion = entrada.nextInt();
				
				switch(opcion) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				default:
					System.out.println("No existe esa opcion, por favor prueba de nuevo");
					break;
				}
			}catch(InputMismatchException error) {
				System.out.println("Entrada invalida< " + error + ">, por favor vuelve a intentarlo");
				entrada.nextLine();
			}
			System.out.println();
		}while(candado);
	
	}

}
