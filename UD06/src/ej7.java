import java.util.Scanner;

public class ej7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("introduce la cantidad");
		double cantidad = sc.nextDouble();
		sc.nextLine();
		System.out.println("introduce la moneda: (dolar/libra/yen)");
		String moneda = sc.nextLine();
		
		sc.close();
		
		cambioDivisa(cantidad, moneda);

	}

	public static void cambioDivisa(double cantidad, String moneda) {
		switch (moneda) {
		case "dolar":
			System.out.println(cantidad + " euros son " + (cantidad * 1.28611) + " dolares");
			break;
		case "libra":
			System.out.println(cantidad + " euros son " + (cantidad * 0.86) + " libras");
			break;
		case "yen":
			System.out.println(cantidad + " euros son " + (cantidad * 129.852) + " yenes");
			break;
		default:
			System.out.println("la divisa introducida no es correcta");
			break;
		}
	}

}
