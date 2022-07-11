import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("introduce el tamaño de los arrays: ");
		int longitud = sc.nextInt();
		sc.close();
		int array1[] = new int[longitud];
		int array2[] = new int[longitud];

		llenarArray(array1);
		array2 = array1;

		System.out.println("array 1");
		imprimirArray(array1);
		System.out.println("array 2");
		imprimirArray(array2);
		System.out.println("******************************");

		array2 = llenarArray(array2);
		System.out.println("array 1");
		imprimirArray(array1);
		System.out.println("array 2");
		imprimirArray(array2);

		int array3[] = multiplicaArrays(array1, array2);
		System.out.println("array 3");
		imprimirArray(array3);
	}

	// llena array conn numeros aleatorios
	public static void llenarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 21);
		}
	}

	// imprime las posiciónes y los valores de un array
	public static void imprimirArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static int[] multiplicaArrays(int array1[], int array2[]) {
		int array3[] = new int[array1.length];
		for (int i = 0; i < array3.length; i++) {
			array3[i] = array1[i] * array2[i];
		}
		return array3;
	}

}
