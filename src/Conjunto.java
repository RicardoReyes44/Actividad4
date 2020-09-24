import java.util.Arrays;

public class Conjunto {
	
	int[] cp;
	int[] cd;
	
	public Conjunto(int[] cp, int[] cd){
		this.cp = cp;
		this.cd = cd;
	}
	
	public String union() {
		
		String cadena = "";
		
		System.out.print("Union: ");
		
		for(int i=0; i<this.cd.length; i++) {
			for(int j=0; j<this.cd.length; j++) {
			    if(cd[i]==cp[j]) {
			    	cadena+=cp[j] + " ";
			    }
			}
		}
		
		return cadena;
	}
	
    public void interseccion() {
		
	}

    public void diferencia() {
	
    }
    
    public String toString() {
    	return Arrays.toString(cp) + "\n" + Arrays.toString(cd);
    }
}
