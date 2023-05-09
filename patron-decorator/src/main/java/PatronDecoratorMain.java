public class PatronDecoratorMain {

    public static void main(String[] args) {
        PersonaDecorador personaDecorador = new PersonaDecorador(new Persona("Adrian"),24);
        personaDecorador.saludar();
    }

}
