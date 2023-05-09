public class PersonaReal implements IPersona{

    private String nombre;
    private int edad;

    public PersonaReal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public PersonaReal() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "PersonaReal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

}
