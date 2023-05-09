import java.util.ArrayList;
import java.util.List;

public class PersonaFacade {

    private PersonaService personaService;

    public PersonaFacade(PersonaService personaService) {
        this.personaService = personaService;
    }

    public List<Persona> getPersonasEntre20y30() {
        List<Persona> personas = personaService.listarPersonas();
        List<Persona> personasEntre20y30 = new ArrayList<>();

        for (Persona persona : personas) {
            if (persona.getEdad() >= 20 && persona.getEdad() <= 30) {
                personasEntre20y30.add(persona);
            }
        }

        return personasEntre20y30;
    }

}
