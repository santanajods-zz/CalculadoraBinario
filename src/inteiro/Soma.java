package inteiro;

public class Soma {
	public char[] somar(char[] bin1, char[] bin2) {
		
		int tamLaco = bin1.length;
		
		char bitSinal1 = bin1[0];
		char bitSinal2 = bin2[0];
		
		char[] binRes = new char[tamLaco];
		boolean vaiUm = false; //Essa variável vai controlar se tem algum um para ser somado aos próximos valores
		//Percorrendo cada posição do array, da direita para a esquerda e comparando os valores, e de acordo com eles, "0" ou "1"
		//será colocado no array de resultado
		//Está sendo considerado em cada uma das condicionais inseridas neste laço for o valor da variável vaiUm, que interfere
		//no valor que o array de resultado irá receber
		for(int i=tamLaco-1; i>=0; i--) {
			if(bin1[i] == '1' && bin2[i] == '0' && vaiUm == false) binRes[i] = '1';
			else if(bin1[i] == '1' && bin2[i] == '0' && vaiUm == true)binRes[i] = '0';
			else if(bin1[i] == '0' && bin2[i] == '1' && vaiUm == false) binRes[i] = '1';
			else if(bin1[i] == '0' && bin2[i] == '1' && vaiUm == true)binRes[i] = '0';
			else if(bin1[i] == '1' && bin2[i] == '1' && vaiUm == true)binRes[i] = '1';
			else if(bin1[i] == '1' && bin2[i] == '1' && vaiUm == false) {
				binRes[i] = '0';
				vaiUm = true;
			}
			else if(bin1[i] == '0' && bin2[i] == '0' && vaiUm == false) binRes[i] = '0';
			else if(bin1[i] == '0' && bin2[i] == '0' && vaiUm == true) {
				binRes[i] = '1';
				if(i==0) break;
				vaiUm = false;
			}
			
		}
		//Convertendo o array de resultado para string e retornando-o
		
		if(vaiUm == true) {
			if(bitSinal2 == '1') {
				return binRes;
			}
			else {
				char[] aux= new char[binRes.length+1];
				
				for(int i = aux.length-1; i > 0; i--) {
					aux[i] = binRes[i-1];
				}
				aux[0] = bitSinal2;
				binRes = aux;
			}
			
		}
		
		return binRes;
	}
}
