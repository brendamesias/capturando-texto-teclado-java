import java.util.Scanner;

public class holaMundo {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		String nombre;
		System.out.print("por favor digite su nombre: ");
		nombre = teclado.nextLine();
		System.out.println("hola " + nombre);
	}
}
 