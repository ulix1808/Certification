package staticx;

public class TestStatic {
	
	/*
	 * La palabra reservada "static" declara un metodod o variable como recursos de la clase, no pueden ser llamados por otra clase
	 * Desde la instancia de la clase orginal y no pueden acceder a los componentes no estaticos de su clase
	 * */

	//Static1 x = new Static1();
	static NoStatic1 y = new NoStatic1();
	
	private static final boolean[] switches = new boolean[5];
	
	 static{// El bloque "Static" permite inicializar una varavle static sin necesidad de declarar un metodo
	 System.out.println("Initializing...");
	for (int i=0; i<5; i++){
	 switches[i] = true;
	 }
	 }
	
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Static1.print("Puede ser llamado el metodo directamente de la clase " + Static1.val);
		CallStaticClass();
		Static1.print("Alguien en otro objeto cambio el valor de la variable estatica " + Static1.val);
	
		
		
	}
	
	
	public static void CallStaticClass() {
		
		y.changeStatic();
		
	}
	
	

}
  