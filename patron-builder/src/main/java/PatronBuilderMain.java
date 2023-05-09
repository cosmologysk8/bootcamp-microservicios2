public class PatronBuilderMain {

    public static void main(String[] args) {
        Persona persona = Persona.getBuilder("Adrian", 24).seudonimo("Adri").build();
        System.out.println(persona.toString());
    }

}
