import java.util.ArrayList;
import java.util.List;

public class PersonaService {

    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("juan", 23));
        personas.add(new Persona("pepe", 33));
        personas.add(new Persona("luis", 28));
        personas.add(new Persona("antonio", 13));
        personas.add(new Persona("alberto", 20));
        return personas;
    }

}
