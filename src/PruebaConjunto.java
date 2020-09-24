import java.util.Arrays;
import java.util.Random;

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
		
		
	
	}

}
