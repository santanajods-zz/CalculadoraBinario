package inteiro;

public class Preenchimento {
	public char[] preencher(char[] binMenor, int tamLaco) {
		char[] aux = new char[tamLaco];

		for(int i=0; i<aux.length; i++) {
			aux[i] = '0';
		}

		for(int i=binMenor.length-1; i>0; i--) {
			aux[i + (aux.length - binMenor.length)] = binMenor[i];
		}
	
		return aux;	
	}

}
