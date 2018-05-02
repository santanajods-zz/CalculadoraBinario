package inteiro;

public class Multiplicacao {
	public char[] multiplicar(char[] bin1, char[] bin2) {
		char[] a = new char[bin1.length+bin2.length+1];
		char[] s = new char[bin1.length+bin2.length+1];
		char[] p = new char[bin1.length+bin2.length+1];
		
		a = preencherA(a, bin1);
		s = preencherS(s, bin1);
		p = preencherP(p, bin2);
		
		Soma sum = new Soma();
		
		/*System.out.println(new String(a));
		System.out.println(new String(s));
		System.out.println(new String(p));*/
		
		
		
		for(int i=0; i<bin2.length; i++) {
			
			if(p[p.length-1] == p[p.length-2]) {
				char[] aux = new char[p.length];
				aux = zeraAuxiliar(aux);
								
				for(int j = p.length-1; j>0; j--) {
					aux[j] = p[j-1];
				}
				aux[0] = p[0];
				p=aux;
			}
			
			else if(p[p.length-1] != p[p.length-2]) {
				
				if(p[p.length-2] == '0' && p[p.length-1] == '1') {
					char[] aux = new char[p.length];
					aux = zeraAuxiliar(aux);
					aux = sum.somar(p, a);
										
					if(aux.length != p.length) {
						
						char[] aux2 = new char[p.length];
						zeraAuxiliar(aux2);
						
						for(int j=0; j < aux2.length; j++) {
							aux2[j] = aux[j+1];
						}
						
						aux = aux2;
					}
					
					for(int j = aux.length-1; j>0; j--) {
						p[j] = aux[j-1];
					}
					p[0] = aux[0];
				}
				
				else if(p[p.length-2] == '1' && p[p.length-1] == '0') {
					char[] aux = new char[p.length];
					aux = zeraAuxiliar(aux);
					aux = sum.somar(p, s);
					
					if(aux.length != p.length) {
						
						char[] aux2 = new char[p.length];
						zeraAuxiliar(aux2);
						
						for(int j=0; j < aux2.length; j++) {
							aux2[j] = aux[j+1];
						}
						
						aux = aux2;
					}
					
					for(int j = aux.length-1; j>0; j--) {
						p[j] =aux[j-1];
					}
					p[0] = aux[0];
				}
				
			}
		}		
		
		System.out.println(new String(p));
		return p;
		
	}
	
	private char[] preencherA(char[] a, char[] bin1) {
		for(int i=0; i<a.length; i++){
			a[i] = '0';
		}
		for(int i=0; i<bin1.length; i++) {
			a[i] = bin1[i];
		}
		
		return a;
	}
	
	private char[] preencherS(char[] s, char[] bin1) {
		for(int i=0; i<s.length; i++){
			s[i] = '0';
		}
		
		ComplementoDe2 comp2 = new ComplementoDe2();
		bin1 = comp2.complementar(bin1);
		
		for(int i=0; i<bin1.length; i++) {
			s[i] = bin1[i];
		}
		
		return s;
	}
	
	private char[] preencherP(char[] p, char[] bin2) {
		for(int i=0; i<p.length; i++){
			p[i] = '0';
		}
		
		for(int i=bin2.length-1; i>=0; i--) {
			p[i + (p.length - bin2.length-1)] = bin2[i];
		}
		
		return p;
	}
	
	private char[] zeraAuxiliar(char[] aux) {
		for(int i=0; i < aux.length; i++) {
			aux[i] = '0';
		}
		return aux;
	}
	
}


