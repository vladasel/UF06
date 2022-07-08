import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un nuemro");//pedimos y guardamos el numero en una variable
		int num= sc.nextInt();
		sc.close();
		System.out.println("tu numero en binario es: "+decimalAbinario(num));//llamada metodo
		

	}
	
	public static String decimalAbinario(int num) {
		String numBinario = Integer.toBinaryString(num);//pasamos un num decimal a binario
		return numBinario;
	}

}
