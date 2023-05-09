public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private double altura;

    // No iniciamos la instancia para que podamos crear la instancia con los valores que queramos
    private static Persona instancia = null;

    private Persona(String nombre, int edad, double altura, String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.apellido = apellido;
    }

    public static Persona getInstancia() {
        if (instancia == null) {
            instancia = new Persona("Adrian", 24, 1.75, "Gomez");
        }
        return instancia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                '}';
    }
}
