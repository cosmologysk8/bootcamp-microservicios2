public class PersonaDecorador implements IPersona{

    private Persona persona;
    private int age;

    public PersonaDecorador(Persona persona, int age) {
        this.persona = persona;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, me llamo " + persona.getNombre() + " y tengo " + age + " años.");
    }
}
