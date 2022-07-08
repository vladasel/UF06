
import javax.swing.JOptionPane;

public class ej2 {

	public static void main(String[] args) {
		int numeros = Integer.parseInt(JOptionPane.showInputDialog("introduce cuantos numeros random quieres:"));
		int a = Integer.parseInt(JOptionPane.showInputDialog("introduce el primer numero: "));// pedimos los numeros
		int b = Integer.parseInt(JOptionPane.showInputDialog("introduce el segundo numero: "));
		generaVariosRandom(numeros,a,b);//mostramos los nuemros random generados, llamando al metodo
																							
	}

	

	public static void generaVariosRandom(int num,int a, int b) {
		int arrayRandoms[]= new int[num];//definos array, en este caso tendrá la 
		//ngitud que el usuario introduzca, segun cuantos numeros random quiere
		
		for (int i=0;i<num;i++) {//recorremos el array para ir definiendo el valor de las posiciones
			arrayRandoms[i]=(int) (Math.random() * (b - a) + a);
		}
		
		JOptionPane.showMessageDialog(null, "Tus numeros random se mostrarán por consula ;)");
		for(int i=0;i<arrayRandoms.length;i++) {
			System.out.println(arrayRandoms[i]);
		}
	}

}
