import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("introduce el tamaño del array: ");
		int longitud = sc.nextInt();// obtenemos longitud del array desde entrada por teclado
		int array[] = rellenaArray(longitud);// guardamos el array que nos devuelve el metodo
		imprimeArray(array);// imprimimos el array llamando el metodo
		sumaValoresArray(array);// llamada metodo para la suma de los valores del array pasado por parametro

	}

	// asigna valores random a todas las posiciones del array
	public static int[] rellenaArray(int a) {
		int array[] = new int[a];
		for (int i = 0; i < array.length; i++) {// recorremos el array
			array[i] = (int) (Math.random() * (9 - 0) + 0);
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

	// suma total valores
	public static void sumaValoresArray(int array[]) {
		int suma = 0;// inicializamos una variable que usaremos para ir acumulando/sumando los
						// valores
		for (int i = 0; i < array.length; i++) {// recorremos array
			suma = suma + array[i];// se va "actualizando" la variable sumando en cada iteración el valor de la
									// posición en la que estamos
		}
		System.out.println("la suma de todos los valores del array es: " + suma);// mostrar por pantalla
	}

}
