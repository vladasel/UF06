import java.util.ArrayList;
import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("introduce longitud array");
		int longitud = sc.nextInt();
		int array[] = new int[longitud];
		llenaArray(array);

		System.out.println("introduce el digito final: ");
		int digFinal = sc.nextInt();
		sc.close();
		System.out.println("array original:");
		imprimirArray(array);
		System.out.println("array filtrado:");
		listaSeleccionada(digFinal, array);

	}

	// da valores a las posiciones de un array
	public static void llenaArray(int array[]) {

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (300 - 1) + 1);
		}
	}

	// verficar que haya algun numero acabado con el digito deseado dentro de un
	// array
	public static void listaSeleccionada(int num, int array[]) {
		ArrayList<Integer> lista = new ArrayList<>();

		String numDado = String.valueOf(num);// pasamos a string el num dado

		for (int i = 0; i < array.length; i++) {// recorremos el array
			String numDeArray = String.valueOf(array[i]);// pasamos a string el valor de cada posición del array

			if (numDeArray.endsWith(numDado)) {// condición:si el valor encontrado en la posición en la que estamos
												// acaba con el"numero" dado
				lista.add(array[i]);// añadimos a la lista el valor que acabe con el digito dato
			}

		}

		System.out.println(lista.toString());
	}

	// mostrar los valores del array
	public static void imprimirArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
