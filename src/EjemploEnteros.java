
public class EjemploEnteros {
	public static void main(String[] args) {
		// edad = 28 no compila porque falta definir el valor de la variable
		
		int edad;		// Declaracion de la variable
		edad = 30;		// Iniciacializacion de la variable
		
		// System.out.println("edad"); No compila porque el parametro no es la variable es un String
		System.out.println(edad);	//variable como parametro
		
		edad = 31; //Sbobreescribir el valor de la variable
		System.out.println(edad);
		
		edad = 35+99; //Se asigna el valor de suma parea realizar una operacion aritmetica
		System.out.println(edad);
		
		System.out.println("Mi edad es " + edad); // Concatenacion de un String con una variable int
		
	}
}
