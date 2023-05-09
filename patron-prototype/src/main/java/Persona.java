public class Persona implements Cloneable{

    private String name;
    private int age;


    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Persona() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Persona clone() {
        Persona nuevaPersona = new Persona();
        nuevaPersona.setName(this.name);
        nuevaPersona.setAge(this.age);
        return nuevaPersona;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
