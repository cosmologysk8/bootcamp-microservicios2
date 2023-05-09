public class PatronSingletonMain {

    public static void main(String[] args) {
        Persona persona = Persona.getInstancia();
        System.out.println(persona.toString());
    }

}
