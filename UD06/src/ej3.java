import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		System.out.println("introduce un numero: ");
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		sc.close();
		if (esPrimo(a) == true) {
			System.out.println("es numero primo");
		} else {
			System.out.println("NO es numero primo");
		}
	}

	public static boolean esPrimo(int num) {
//para saber si un numero es primo lo dividimos por todos los numeros inferiores a el(el mismo incluido)
		
		int contador = 0;
		for (int i = 1; i <= num; i++) {
			if ((num % i) == 0) {
				contador++;//contamos cuantas veces se realiza una división exacta
			}
		}
		if (contador <= 2) {//si solo se pude dividir por el mismo y uno es primo
			return true;
		} else {//si se divime por mas numero no es primo
			return false;
		}
	}

}
