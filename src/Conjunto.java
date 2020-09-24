import java.util.Arrays;

public class Conjunto {
	
	int[] cp;
	int[] cd;
	
	public Conjunto(int[] cp, int[] cd){
		this.cp = cp;
		this.cd = cd;
	}


	public int[] union() {
		
		int array[];
		int array2[];
		int total = 0;
		int cont = 0;
		
		System.out.print("Union: ");
		
		for(int i=0; i<this.cd.length; i++) {
			for(int j=0; j<this.cp.length; j++) {
			    if(cd[i]==cp[j]) {
			    	cont++;
			    }
			}
			
			if(cont==0) {
				total++;
			}
			cont = 0;
		}
		
		array2 = new int[total];
		array = new int[this.cp.length+total];
		int pos = 0;

		for(int i=0; i<this.cd.length; i++) {
			for(int j=0; j<this.cp.length; j++) {
			    if(cd[i]==cp[j]) {
			    	cont++;
			    }
			}
			
			if(cont==0) {
				array2[pos] = cd[i];
				pos++;
			}
			cont = 0;
		}
		
		for(int i=0; i<this.cp.length; i++) {
			array[i] = this.cp[i];
		}
		
		for(int i=0; i<array2.length; i++) {
			array[this.cp.length+i] = array2[i];
		}
		
		return ordenar(array);
	}

	
	public int[] ordenar(int[] array){
		
		int min = 0;
		int aux = 0;
		int pos = 0;
		for(int i=0; i<array.length; i++) {
			min = i;
			for(int j=i+1; j<array.length; j++) {
				if(array[j]<array[min]) {
					min = j;
				}
			}
			
			aux = array[i];
			array[i] = array[min];
			array[min] = aux;
		}
		
		return array;
	}

	

    public String interseccion() {
    	
    	String cadena = "";
    	
    	System.out.print("Interseccion: ");

    	for(int i=0; i<this.cd.length; i++) {
			for(int j=0; j<this.cp.length; j++) {
			    if(cd[i]==cp[j]) {
			    	cadena+=cp[j] + " ";
			    }
			}
		}
		
		return cadena;
	}


    public String diferencia() {
    	
    	int cont = 0;
    	String cadena = "ConjuntoDivisor-ConjuntoPrimo: ";
    	
    	System.out.print("Diferencia:\n");
    	
    	for(int i=0; i<this.cd.length; i++) {
			for(int j=0; j<this.cp.length; j++) {
			    if(cd[i]==cp[j]) {
			    	cont++;
			    }
			}
			
			if(cont==0) {
				cadena+=cd[i] + " ";
	    	}
			cont = 0;
		}
    	
    	cadena+="\nConjuntoPrimo-ConjuntoDivisor: ";
    	
    	for(int i=0; i<this.cp.length; i++) {
			for(int j=0; j<this.cd.length; j++) {
			    if(cp[i]==cd[j]) {
			    	cont++;
			    }
			}
			
			if(cont==0) {
				cadena+=cp[i] + " ";
	    	}
			cont = 0;
		}

    	
    	return cadena;
    }


	@Override
    public String toString() {
    	return "ConjuntoPrimo: " + Arrays.toString(cp) + "\nConjuntoDivisor: " + Arrays.toString(cd);
    }
}
