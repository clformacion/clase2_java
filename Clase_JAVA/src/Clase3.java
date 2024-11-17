
/*
 * REALIZAR LA CARGA DEL LADO DE UN CUADRADO, MOSTRANDO POR PANTALLA EL PERIMETRO DEL MISMO
 * 
 * 
 * 
 * */

import java.util.Scanner;

public class Clase3 {

	public static void main(String[] args) {
	 Scanner teclado=new Scanner(System.in);
	 int lado, perimetro;
	 System.out.print("ingrese el lado del cuadrado");
	 lado=teclado.nextInt();
	 perimetro=lado*4;
	 System.out.print("el perimetro del cuadrado es: " + perimetro);
		
		

	}

}
