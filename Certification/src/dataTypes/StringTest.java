package dataTypes;

public class StringTest {
	
	
	public static void main (String [] args) {
		
		
		String no_builder = new String();
		
		no_builder.length();
		
		String dontDoThis = new String ("Bad Practice");
		
		no_builder = no_builder + dontDoThis ;  // String Concatenate
		
		

		
		// StringBuilder contiene metodos para construir un objeto String adicionales a la clase String
		StringBuilder sb = new StringBuilder("hello");
		System.out.println("string sb: " + sb);
		sb.append(" world");
		System.out.println("string sb: " + sb);
		sb.append("!").append(" are").append(" you?");
		System.out.println("string sb: " + sb);
		sb.insert(12, " How");
		System.out.println("string sb: " + sb);
		// Get length
		System.out.println("Length: " + sb.length());
		// Get SubString
		System.out.println("Sub: " + sb.substring(0, 5));
		
		
		
	}

}
