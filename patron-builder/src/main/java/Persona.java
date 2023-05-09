public class Persona {
    private final String nombre;
    private final int edad;

    private Persona(PersonaBuilder builder) {
        this.nombre = builder.nombre;
        this.edad = builder.edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public static class PersonaBuilder {
        private String nombre;
        private final int edad;
        private String seudonimo;

        public PersonaBuilder(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public PersonaBuilder seudonimo(String seudonimo) {
            this.seudonimo = seudonimo;
            return this;
        }

        public Persona build() {
            return new Persona(this);
        }

    }

    public static PersonaBuilder getBuilder(String nombre, int edad) {
        return new PersonaBuilder(nombre, edad);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}






