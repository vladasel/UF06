import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {

		imprimeArray(rellenaArray());
	}

	public static int[] rellenaArray() {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		System.out.println("introduce numeros enteros: v");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		return array;
	}

	public static void imprimeArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("pos " + i + " -> " + array[i]);
		}
	}

}
