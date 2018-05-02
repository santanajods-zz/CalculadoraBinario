package flutuante;

public class Soma {
	public char[] somar(char[] bin1,char[] bin2) {
		char sinal1 = bin1[0];
		char sinal2 = bin2[0];
		
		char[] expoente1 = getExpoente(bin1);
		char[] expoente2 = getExpoente(bin2);
		
		char[] mantissa1 = getMantissa(bin1);
		char[] mantissa2 = getMantissa(bin2);
		
		System.out.println(sinal1);
		System.out.println(new String(expoente1));
		System.out.println(new String(mantissa1));
		
		
		
		return bin1;
		
	}
	private char[] getExpoente(char[] bin){
		char[] aux = new char[8];
		for(int i=0; i<8; i++) {
			aux[i] = bin[i+1];
		}
		return aux;
	}
	
	private char[] getMantissa(char[] bin) {
		char[] aux = new char[23];
		for(int i=0; i<23; i++) {
			aux[i] = bin[i+8];
		}
		return aux;
	}
	
	
	
	private char[] igualarExpoente(char[] mantissa1, char[] expoente1, char[] mantissa2, char[] expoente2) {
		
	}
}
