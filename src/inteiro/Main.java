package inteiro;

public class Main {
	public static void main(String[] args) {
		Soma op = new Soma();
		Tratamento trat = new Tratamento();	
		
		String bin1 = "0101";
		String bin2 = "0010";
		
		char[] binTratado1;
		char[] binTratado2;
		
		if(bin1.length() < bin2.length()) {
			binTratado1 = trat.tratar(bin1, bin2);
			binTratado2 = bin2.toCharArray();
		}
		
		else if (bin2.length() < bin1.length()) {
			binTratado2 = trat.tratar(bin2, bin1);
			binTratado1 = bin1.toCharArray();
		}
		else {
			binTratado2 = bin2.toCharArray();
			binTratado1 = bin1.toCharArray();
		}
		
		
		//ComplementoDe2 comp = new ComplementoDe2();
		//char[] res = (comp.complementar(binTratado2));
		
		//System.out.println(op.somar(binTratado1, binTratado2));
		
		Subtracao sub = new Subtracao();
		Multiplicacao mult =  new Multiplicacao();
		mult.multiplicar(binTratado1, binTratado2);
		
		//System.out.println(new String(binTratado1));
		//System.out.println(new String(binTratado2));
		//System.out.println(new String(comp.complementar(binTratado2)));
		
		//System.out.println(new String(sub.subtrair(binTratado1, binTratado2)));
	}
}
