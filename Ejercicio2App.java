	/**
	 * 2 - Escribe un programa Java que realice lo siguiente: declarar una variable N de tipo int, 
	 * una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
	 * A continuación muestra por pantalla:
	 * El valor de cada variable.
	 * La suma de N + A
	 * La diferencia de A - N 
	 * El valor numérico correspondiente al carácter que contiene la variable C. 
	 * @author Jose Luis Padilla Gonzalez
	 * 07-07-2021
	 */
public class Ejercicio2App {

	public static void main(String[] args) {
		int N=7;
		double A=4.5;
		char C='a';
		double result=0;
		
		//Suma de N + A
		result=N+A;
		System.out.println(N+" + "+A+" = "+result);
		
		//RESTA DE A - N
		result=A-N;
		System.out.println(A+" - "+N+" = "+result);
		
		//VALORE CORRESPONDIENTE A C
		result=(int)C;
		System.out.println("El valor numerico de "+C+" es igual a "+result);
	}

}
