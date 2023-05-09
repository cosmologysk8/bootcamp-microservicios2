public class Main {

    public static void main(String[] args) {
        IPersona persona = new PersonaProxy("Juan", 25);
        PersonaProxy personaProxy = new PersonaProxy("Juan", 24);
        System.out.println(personaProxy);
    }

}
