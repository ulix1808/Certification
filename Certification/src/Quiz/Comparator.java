package Quiz;

public class Comparator {
	
	public static void main(String [] args){
	String s1 = new String("Test");
	String s2 = new String("Test");
	// el operador "==" compara la referencia en memoria, no el contenido del objeto
	if (s1==s2)
	System.out.println("Same");
	if (s1.equals(s2))
		//El metodo equals compara el contenido del objeto y puede sobreescribirse para comparar un objeto acorde a la necesidad del programador
	System.out.println("Equals");
	}
	
}
