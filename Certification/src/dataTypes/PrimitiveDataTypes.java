package dataTypes;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * En esta clase veremos los tipos de datos primitivos
		 * 
		 * */
		
		// L o F al final de un numero, especifican si este es long or float
		
		byte b = 100; // 8 bits en positivo hasta el 127 -> 1111111  el "1" 
		//restante se usa para delimitar el signo  en negativo hasta  -128   
		byte c = -128;
		
		short y =12345 ; // 16 bits -1 del sigo esto deja 2 ^15 = 32,767
		// Descomentar para ver el ejemplo
		//short z =  32768;
		
		
		boolean result = true;
		char capitalC = 'C';
		byte bi = 100;
		short s = 10000;
		int i = 100000;  // 32 bits 
		
		
		double d1 = 123.4;
		// same value as d1, but in scientific notation
		double d2 = 1.234e2;
		float f1  = 123.4f;
		
		long creditCardNumber = 1234_5678_9012_3456L;
		long socialSecurityNumber = 999_99_9999L;
		float pi =  3.14_15F;
		long hexBytes = 0xFF_EC_DE;
		
		
		int x1 = 5_2;
		//int x2 = _52;
		//int x3 = 52_;
		
		
		

	}
	
	
	//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
	
	/*Data Type	Default Value (for fields)
	byte	0
	short	0
	int	0
	long	0L
	float	0.0f
	double	0.0d
	char	'\u0000'
	String (or any object)  	null
	boolean	false
*/

}
