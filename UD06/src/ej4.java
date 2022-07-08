import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un numero: ");// pedir numero
		int num = sc.nextInt();// guardar numero en variable
		sc.close();
		System.out.println("el factorial de " + num + " es: " + calculaFactorial(num));// mostramos el resultado+llamada
																						// al metodo que calcula el
																						// factorial
	}

	public static int calculaFactorial(int num) {
		int factorial = 1;
		for (int i = num; i > 0; i--) {// hacemos el calculo
			factorial = factorial * i;
		}

		return factorial;// devoolvemos el valor

	}

}
