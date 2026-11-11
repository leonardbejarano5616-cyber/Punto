public final class Estudiante {
    private final String matricula;
    private final String nombre;
    private final String apellido;
    private final String correo;
    private final String telefono;
    private final String carrera;

    public Estudiante(String matricula, String nombre, String apellido, String correo,
            String telefono, String carrera) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCarrera() {
        return carrera;
    }
}
