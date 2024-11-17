
//realizar un programa que cargue dos numeros enteros por teclados e imprimir su suma y multiplicacion

import java.util.Scanner;

public class Clase2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int num1,num2,suma,producto;
		System.out.println("ingrese su primer valor");
		num1=teclado.nextInt();
		System.out.println("Ingrese el segundo valor");
		num2=teclado.nextInt();
		suma=num1+num2;
		producto=num1*num2;
		System.out.println("la suma de los dos valores es " + suma);
		System.out.print("la multiplicacion de los dos valores es " + producto);
		
		

		
		

	}

}
