package GitProject;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

        // Pedir los datos del estudiante
        System.out.println("Registro de Estudiantes");
        System.out.println("----------------------");

        Estudiante estudiante = new Estudiante();

        System.out.print("Nombre: ");
        estudiante.setNombre(scanner.nextLine());

        System.out.print("Apellidos: ");
        estudiante.setApellidos(scanner.nextLine());

        System.out.print("Fecha de nacimiento: ");
        estudiante.setFechaNacimiento(scanner.nextLine());

        System.out.print("DNI: ");
        estudiante.setDni(scanner.nextLine());

        System.out.print("Estudios previos: ");
        estudiante.setEstudiosPrevios(scanner.nextLine());

        System.out.print("Teléfono: ");
        estudiante.setTelefono(scanner.nextLine());

        estudiantes.add(estudiante);

        // Imprimir los datos del estudiante
        System.out.println("\nDatos del Estudiante");
        System.out.println("--------------------");
        Estudiante estudianteRegistrado = estudiantes.get(0);
        System.out.println("Nombre: " + estudianteRegistrado.getNombre());
        System.out.println("Apellidos: " + estudianteRegistrado.getApellidos());
        System.out.println("Fecha de nacimiento: " + estudianteRegistrado.getFechaNacimiento());
        System.out.println("DNI: " + estudianteRegistrado.getDni());
        System.out.println("Estudios previos: " + estudianteRegistrado.getEstudiosPrevios());
        System.out.println("Teléfono: " + estudianteRegistrado.getTelefono());
    }
}
