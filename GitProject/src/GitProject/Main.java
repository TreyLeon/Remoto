package GitProject;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner scanner = new Scanner(System.in);
	        ArrayList <String> estudiantes = new ArrayList<>();

	        // Pedir los datos del estudiante
	        System.out.println("Registro de Estudiantes");
	        System.out.println("----------------------");

	        System.out.print("Nombre: ");
	        estudiantes.add(scanner.nextLine());

	        System.out.print("Apellidos: ");
	        estudiantes.add(scanner.nextLine());

	        System.out.print("Fecha de nacimiento: ");
	        estudiantes.add(scanner.nextLine());

	        System.out.print("DNI: ");
	        estudiantes.add(scanner.nextLine());

	        System.out.print("Estudios previos: ");
	        estudiantes.add(scanner.nextLine());

	        System.out.print("Teléfono: ");
	        estudiantes.add(scanner.nextLine());

	        // Imprimir los datos del estudiante
	        System.out.println("\nDatos del Estudiante");
	        System.out.println("--------------------");
	        System.out.println("Nombre: " + estudiantes.get(0));
	        System.out.println("Apellidos: " + estudiantes.get(1));
	        System.out.println("Fecha de nacimiento: " + estudiantes.get(2));
	        System.out.println("DNI: " + estudiantes.get(3));
	        System.out.println("Estudios previos: " + estudiantes.get(4));
	        System.out.println("Teléfono: " + estudiantes.get(5));
	}

}
