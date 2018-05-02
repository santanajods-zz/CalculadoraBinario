package inteiro;

public class Tratamento {
	public char[] tratar(String binario1, String binario2) {
		Preenchimento pr = new Preenchimento();
		
		//Aqui as strings  são transformadas em arrays de char, para facilitar a manipulação
		char[] bin1 = binario1.toCharArray();
		char[] bin2 = binario2.toCharArray();
		//Aqui será definido o tamanho do laço de  acordo com o tamanho do maior binário recebido
		int tamanhoMaior = bin2.length;
		//Definindo o tamanho do array resultado baseado no tamanho do maior binario
		char[] aux = new char[tamanhoMaior];

		char bitSinal1 = bin1[0];
		
		//System.out.println(new String(aux));

		aux = pr.preencher(bin1, tamanhoMaior);
		
		//System.out.println(new String(aux));
		
		//bin1 = addZero(bin1);
		bin1 = aux;
		
		bin1[0] = bitSinal1;	
		
		return bin1;
		
	}
	
	private char[] addZero(char[] bin) {
		char[] binAux = new char[bin.length];
		  
		for(int i = binAux.length -1; i>=0; i--) {
			binAux[i] = '0';
		}
		
		for(int i = binAux.length -1; i>0; i--) {
			binAux[i] = bin[i];
		}
		
		return binAux;
	}
	
	
}
