public class PatronPrototypeMain {

    public static void main(String[] args) {
        Persona persona1 = new Persona("juan", 35);
        Persona persona2 = persona1.clone();
        System.out.println(persona1.getName() + " " + persona1.getAge());
        System.out.println(persona2.getName() + " " + persona2.getAge());
    }


}
