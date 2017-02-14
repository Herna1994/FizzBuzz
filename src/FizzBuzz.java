import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {		
            Scanner leer = new Scanner(System.in);
            System.out.println("Introduce un numero entre el 1 y el 100: ");
	    int numero = leer.nextInt();
	    int decenas = calcularDecenas(numero);
	    int unidades = calcularUnidades(numero, decenas);
	    
	    if (numero < 0 || numero > 100) {
	    	System.out.println("Número inválido, ¡que pase un buen día!");
	    	System.exit(0);
	    }
	    
	    if (numero % 3 == 0 && numero % 5 == 0) {
	      System.out.println("FizzBuzz");
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

	  public static void makeFizzBuzz(int numero, int decenas, int unidades){
	    String u[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	    String e[]={"Ten","Eleven","Twelve","Thirteen","Fourteen","Fiveteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	    String d[] = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	    
	    if (numero > 10 && numero <20) {
	    	System.out.println(numero + " se escribe " + e[unidades]);
	    } else {
	    System.out.println(numero + " se escribe " + d[decenas] + "" + u[unidades]);
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
