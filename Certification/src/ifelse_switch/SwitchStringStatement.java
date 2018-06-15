package ifelse_switch;

public class SwitchStringStatement {
	
	public static void main (String [] args) {
		
		String color = "Blue";
		String shirt = "Shirt";
		
		//System.out.println("Hola");
		
		switch (color) {
		
		case "Yellow":
			
			shirt = shirt + "Yellow";
		
			break; 
			
	case "Blue":
			
			shirt = shirt + "Yellow";
		
			break; 
			
			default: shirt = shirt + "White";
			
			
			
		
		
		} 
		
		System.out.println("Shirt type: " + shirt);
		
	}

}
