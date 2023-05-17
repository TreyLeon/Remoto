package GitProject;

public class Estudiante {
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String dni;
    private String estudiosPrevios;
    private String telefono;

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEstudiosPrevios() {
        return estudiosPrevios;
    }

    public void setEstudiosPrevios(String estudiosPrevios) {
        this.estudiosPrevios = estudiosPrevios;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
