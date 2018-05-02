package flutuante;

public class Main {
	public static void main(String[] args) {
		String bin1 = "00000001000000000000000000000010";
		String bin2 = "00000100000000000000000000000011";
		
		char[] binTratado1 = bin1.toCharArray();
		char[] binTratado2 = bin2.toCharArray();
		
		Soma s = new Soma();
		
		s.somar(binTratado1, binTratado2);
		
		
	}
}
