package inteiro;

public class Subtracao {
	public char[] subtrair(char[] bin1, char[] bin2) {
		
		boolean achouUm = false;
		
		for(int i=0; i<bin2.length; i++) {
			if(bin2[i] == '1') achouUm = true ;
		}
		
		if(achouUm == true) {
			ComplementoDe2 comp = new ComplementoDe2();
			bin2 = comp.complementar(bin2);
			
			//System.out.println(new String(bin2));
			
			Soma s = new Soma();
			return s.somar(bin1, bin2);
			
			//System.out.println(new String(somado));

			/*char[] aux = new char[somado.length-1];
			
			aux[0] = somado[0];
			
			for(int i=1; i<aux.length; i++) {
				aux[i] = somado[i+1];
			}
			
			return aux;*/
		}
		else {
			return bin1;
		}
		
	}
}
