import javax.swing.JOptionPane;

public class ej1 {

	public static void main(String[] args) {
		// obtenemos la figura
		String figura = JOptionPane.showInputDialog("introduce la figura de la cual quiers calcular el area:");
//segun la figura obtenida llamamos el método necesario
		if (figura.equals("circulo")) {
			calculaAreaCirculo();
		} else if (figura.equals("triangulo")) {
			calculaAreaTriangulo();
		} else if (figura.equals("cuadrado")) {
			calculaAreaCuadrado();
		} else {
			System.out.println("la figura introducida no es correcta");
		}
	}

	// pide datos necesarios pra calcular el area del circulo,calcula el area e
	// imprime el resultado
	public static void calculaAreaCirculo() {
		// guardamos el radio introducido en una variable
		double radio = Double.parseDouble(JOptionPane.showInputDialog("introduce el radio:"));
		final double PI = 3.14;
		// calculamos el area
		double area = Math.pow(radio, 2) * PI;
		// mostramos el resulatado
		JOptionPane.showMessageDialog(null, "El area del circulo con el radio " + radio + " es: " + area);
	}

	// pide los datos,calcula el area del triangulo y muestra el resultado
	public static void calculaAreaTriangulo() {
		// pide datos necesario y se guardan en vvariables
		double base = Double.parseDouble(JOptionPane.showInputDialog("introduce la base del triangulo:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("introduce la altura del triangulo:"));
		// calculo area
		double area = (base * altura) / 2;
		// mostramos resultado
		JOptionPane.showMessageDialog(null, "El area del triangulo con base " + base + " y " + altura + " es: " + area);

	}

	// pide datos,calcula y muestra area cuadrado
	public static void calculaAreaCuadrado() {
		// pide datos y los guarda en una variable
		double lado = Double.parseDouble(JOptionPane.showInputDialog("introduce lado del cuadrado: "));
		// calculo
		double area = lado * lado;
		// muestra resultado
		JOptionPane.showMessageDialog(null, "El area del cuadrado con lado " + lado + " es: " + area);

	}

}
