package staticx;


import static java.lang.Math.random;

// Si usamos static en import, esto nos da acces directo  los metodos estaticos de la clase sin unsar el nombre de la misma
import static java.lang.Math.*;


public class Static1 {
	
	
	static int  val =3 ; // esta variable tiene el mismo valor para todos los objetos creados de la clase Static1
	
	public static void  print(String text) {
		
		// Ejemplo llamada a clase Math
		
		Math.max(1, 2);
		// como ya importamos la clase  con "static" ya no necesitamos llamar a la misma 
		
		System.out.println("El numero mayor de max es  : " + max(1,5));
		
		System.out.println(text);
	//	changeVal(); no se puede llamar a un metodo que no es estatico desde uno estatico	
	}
	
	public void changeVal() {
		
		val = 5;
		
	}

}
