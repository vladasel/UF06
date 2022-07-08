
import javax.swing.JOptionPane;

public class ej2 {

	public static void main(String[] args) {
		int a = pideNumero1();// pedimos los numeros
		int b = pideNumero2();
		JOptionPane.showMessageDialog(null, "El numero random es: " + generaRandom(a, b));// generamos random y lo
																							// mostramos
	}

	public static int pideNumero1() {// pide el primer numero
		JOptionPane.showMessageDialog(null, "introduce entre que numeros quieres que se genere un numero ramdom");
		int a = Integer.parseInt(JOptionPane.showInputDialog("introduce el primer numero: "));
		return a;

	}

	public static int pideNumero2() {// pide el segundo numero
		int b = Integer.parseInt(JOptionPane.showInputDialog("introduce el segundo numero: "));
		return b;

	}

	public static int generaRandom(int num1, int num2) {// genra un num random entre 2 numeros datos
		int numRandom = (int) (Math.random() * (num2 - num1) + num1);
		return numRandom;
	}

}
