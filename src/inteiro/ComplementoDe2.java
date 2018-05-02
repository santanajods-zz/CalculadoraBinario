package inteiro;

public class ComplementoDe2 {
	public char[] complementar(char[] binNegativo) {
		
		char[] binInvertido = new char[binNegativo.length];
		
		for(int i = 0; i < binInvertido.length; i++) {
			binInvertido[i] = '0';
		}
		
		for(int i = binInvertido.length-1; i>=0; i--) {
			if(binNegativo[i] == '0') binInvertido[i] = '1';
			if(binNegativo[i] == '1') binInvertido[i] = '0';
		}
		
		char[] um = new char[binInvertido.length];
		
		for(int i = 0; i < um.length-1; i++) {
			um[i] = '0';
		}
		
		um[um.length -1] = '1';
		//System.out.println(new String(binNegativo));
		//System.out.println(new String(binInvertido));
		//System.out.println(new String(um));
		
		Soma s = new Soma();
		char[] binComplementado =  s.somar(binInvertido, um);
		
		//System.out.println(new String(binComplementado));
		
		char[] aux = new char[binNegativo.length];
		
		
		
		for(int i = binInvertido.length-1; i > 0; i--) {
			aux[i-1] = binComplementado[i];
		}
		
		return binComplementado;
		
	}
}
