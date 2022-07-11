import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("introduce el tamaño del array: ");
		int longitud = sc.nextInt();
		sc.nextLine();
		System.out.println("introduce el numero minimo del random: ");
		int min = sc.nextInt();
		System.out.println("introduce el numero máximo del random: ");
		int max = sc.nextInt();
		sc.close();
		int array[] = generarArrayNumAleatorios(longitud, min, max);
		imprimeArray(array);
		System.out.println("el valor mas alto del array es: " + numMax(array));

	}

	// comproba que un numero sea o no numero primo
	public static boolean esPrimo(int num) {
		// para saber si un numero es primo lo dividimos por todos los numeros
		// inferiores a el(el mismo incluido)

		int contador = 0;
		for (int i = 1; i <= num; i++) {
			if ((num % i) == 0) {
				contador++;// contamos cuantas veces se realiza una división exacta
			}
		}
		if (contador <= 2) {// si solo se pude dividir por el mismo y uno es primo
			return true;
		} else {// si se divime por mas numero no es primo
			return false;
		}
	}

	// genera un numero primo aleatorio entre dos numeros dados
	public static int generaNumeroPrimoAleatorio(int num1, int num2) {
		int numRandom;

		do {
			numRandom = (int) (Math.random() * (num2 - num1) + num1);
		} while (esPrimo(numRandom) == false);

		return numRandom;

	}

	// genera un array de numeros primos con una longitud data, entre unos valores
	// determinados
	public static int[] generarArrayNumAleatorios(int num, int min, int max) {
		int array[] = new int[num];
		for (int i = 0; i < array.length; i++) {
			array[i] = generaNumeroPrimoAleatorio(min, max);
		}
		return array;
	}

	// imprimir los valores del array
	public static void imprimeArray(int array[]) {
		for (int i = 0; i < array.length; i++) {// se recorre el array
			System.out.println("pos " + i + " -> " + array[i]);// al pasar por la posición la imprimimos, tambien el
																// valor que tiene
		}
	}

	public static int numMax(int array[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

}
