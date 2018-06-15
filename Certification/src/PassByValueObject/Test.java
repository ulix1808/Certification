package PassByValueObject;

public class Test {

	
	public static void main (String [] args) {
		
		Object1 b1 = new Object1();
		Object1 b2 = b1;
		
		b1.imprimirValores();
		b2.imprimirValores();
		
		b1.setValor1(5);
		
		b2.imprimirValores();
		
		
		
		
		
	}
}
