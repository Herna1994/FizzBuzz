package FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int numero;
		System.out.println("Introduce el numero: ");
		numero = leer.nextInt();
		int decenas = calcularDecenas(numero);
		int unidades = calcularUnidades(numero, decenas);

	        if (numero < 0 || numero > 100) {
	    	      System.out.println("Número inválido, ¡que pase un buen día!");
	    	      System.exit(0);
	        }

		if (numero % 3 == 0 && numero % 5 == 0) {
			System.out.println("Fizzbuzz");
		} else {
			if (numero % 3 == 0) {
				System.out.println("Fizz");
			} else if (numero % 5 == 0) {
				System.out.println("Buzz");
			} else {
				makeFizzBuzz(numero, decenas, unidades);
			}
		}
	}

	public static void makeFizzBuzz(int numero, int decenas, int unidades) {
		String u[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String e[] = { "", "eleven", "twelve", "thirteen", "fourteen", "fiveteen", "sixteen", "seventeen", "eighteen",
				"nineteen" };
		String d[] = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		if (numero > 10 && numero < 20) {
			System.out.println(numero + " escribe " + e[unidades]);
		} else {
			System.out.println(numero + " escribe " + d[decenas] + " " + u[unidades]);
		}
	}

	public static int calcularDecenas(int numero) {
		int decenas = 0;
		decenas = numero / 10;
		return decenas;
	}

	public static int calcularUnidades(int numero, int decenas) {
		int unidades = 0;
		unidades = numero - (decenas * 10);
		return unidades;
	}
}
