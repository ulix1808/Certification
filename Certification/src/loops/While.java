package loops;

public class While {
	
	// las clases e interfaces deben comenzar con mayusculas
	// los metodos con minuscula y camel case
	// las variables deben comenza con minusculas y no deben tener un numero al inicio o _ o $ 
	// las constantes debe ser en ayusculas abajo un ejemplo
	 static final int PRUEBA = 4;
	 
	 /*
	  * Packages:

	    The prefix of a unique package name is always written in all-lowercase ASCII letters and should be one of the top-level domain names, like com, edu, gov, mil, net, org.
	    Subsequent components of the package name vary according to an organization’s own internal naming conventions.
	
		Examples:
	
		com.sun.eng
		com.apple.quicktime.v2
	
		// java.lang packet in JDK
						
					java.lang

	 */
	
	 /*
	  * Existen dos tipos de loops en Java el While es una condicion booleana y se implementa cuando no se conoce el numero de iteraciones
	  * 
	  * El for que interbamente utiliza un while es utilizado cuando se conoce el numero de iteraciones
	  * 
	  * Existe: While, Do while
	  * 
	  * Existe For & Enhanced For
	  * 
	  * 
	  * */
	 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// simple while 
		int i = 0; // variable de incremento
		while (i < 8) { // condicion boleana de paro
		System.out.println(i);
		i++; // opeardor de incremento
		}
		System.out.println("done");
	
		int x = 5 ;
		do {
			
			System.out.println("Se ejecuta por lo menos una vez aun si el valor del dato es  >=  5: " + x);
			x++;
			
			
		}while(x < 5);
		

	}

}
