import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("introduce un numero entero: ");
		String numString = sc.nextLine();
		sc.close();

		int num = Integer.parseInt(numString);

		if (esEntero(num) == true && esPositivo(num) == true) {
			System.out.println("tu numero tiene " + numeroCifras(num) + " cifras");
		} else {
			System.out.println("el numero introducido no es válido");

		}
	}

//calcula numero cifras
	public static int numeroCifras(int num) {
		int cifras = (int) (Math.log10(num) + 1);
		return cifras;
	}

//verifica que es entero
	public static boolean esEntero(int num) {
		if (num == (int) num) {
			return true;
		} else {
			return false;
		}
	}

//verifica que es positivo
	public static boolean esPositivo(int num) {
		if (num < 0) {
			return false;
		} else {
			return true;
		}
	}

}
