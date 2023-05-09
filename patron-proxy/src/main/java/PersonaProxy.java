public class PersonaProxy implements IPersona{

    private PersonaReal personaReal;

    public PersonaProxy(String nombre, int edad){
      if (edad < 18) {
          before();
      } else {
          this.personaReal = new PersonaReal(nombre, edad);
          after();
      }
    }

    public void before(){
        System.out.println("La persona no puede ser menor de edad.");
    }

    public void after(){
        System.out.println("La persona es mayor de edad.");
    }

    @Override
    public String getNombre() {
        if (personaReal == null) {
            return null;
        }
        return personaReal.getNombre();
    }

    @Override
    public int getEdad() {
        if (personaReal == null) {
            return 0;
        }
        return personaReal.getEdad();
    }

    @Override
    public String toString() {
        return "PersonaProxy{" +
                "personaReal=" + personaReal +
                '}';
    }
}
