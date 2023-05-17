package GitProject;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Pedir los datos del estudiante
		        System.out.println("Registro de Estudiantes");
		        System.out.println("----------------------");

		        System.out.print("Nombre: ");
		        String nombre = scanner.nextLine();

		        System.out.print("Apellidos: ");
		        String apellidos = scanner.nextLine();

		        System.out.print("Fecha de nacimiento: ");
		        String fechaNacimiento = scanner.nextLine();

		        System.out.print("DNI: ");
		        String dni = scanner.nextLine();

		        System.out.print("Estudios previos: ");
		        String estudiosPrevios = scanner.nextLine();

		        System.out.print("Teléfono: ");
		        String telefono = scanner.nextLine();
		        
		        // Imprimir los datos del estudiante
		        System.out.println("\nDatos del Estudiante");
		        System.out.println("--------------------");
		        System.out.println("Nombre: " + nombre);
		        System.out.println("Apellidos: " + apellidos);
		        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
		        System.out.println("DNI: " + dni);
		        System.out.println("Estudios previos: " + estudiosPrevios);
		        System.out.println("Teléfono: " + telefono);
	}

}
