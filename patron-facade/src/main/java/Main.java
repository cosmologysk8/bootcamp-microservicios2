public class Main {

    public static void main(String[] args) {
        PersonaFacade personaFacade = new PersonaFacade(new PersonaService());
        System.out.println(personaFacade.getPersonasEntre20y30());
    }
}
