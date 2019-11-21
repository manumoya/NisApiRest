package nisum.dao;

import nisum.model.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaInfoDAO {

    static List<Persona> personas = new ArrayList();

    /* muestra todas las personas */
    public static List<Persona> findAll(){
        return personas;
    }

    /* graba una persona */
    public static int save (Persona persona){
        Integer id = findAll().size()+1;
        persona.setId(id);
        personas.add(persona);
        return id;
    }

    public static Persona get(Integer idPersona){
        Persona personFound = new Persona();
        for (Persona persona : personas) {
            if (idPersona == persona.getId()) {
                personFound = persona;
            }
        }
        return personFound;
    }

    public static Persona update(Persona personaNew){
        Persona personUpdated = new Persona();
        int contId =0;
        for (Persona persona : personas) {
            if ( personaNew.getId() == persona.getId() ) {
                personas.get(contId).setName( personaNew.getName() );
                personas.get(contId).setLastName( personaNew.getLastName() );
                personas.get(contId).setAddress( personaNew.getLastName() );
                personas.get(contId).setPhoneNumber( personaNew.getPhoneNumber() );
                personas.get(contId).setHairColour( personaNew.getHairColour() );
                personUpdated = personas.get(contId);
                contId= personas.size()+1;
            }
            contId++;
        }
        return personUpdated;
    }

    public static int delete(int idDel){
        int contId =0;
        for (Persona persona : personas) {
            if (idDel == persona.getId()) {
                personas.remove(contId);
                contId= personas.size()+1;
            }
            contId++;
        }
        return idDel;
    }
}
