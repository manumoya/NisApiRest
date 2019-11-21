package nisum.service;

import nisum.dao.PersonaInfoDAO;
import nisum.model.Persona;

import java.util.List;

public class PersonaInfoService {

    public static List<Persona> findAll(){
        return PersonaInfoDAO.findAll();
    }

    public static int savePersona(Persona persona){
        return PersonaInfoDAO.save(persona);
    }

    public static Persona getPersona(Integer idPersona){
        return PersonaInfoDAO.get(idPersona);
    }

    public static Persona updatePersona(Persona persona){
        return PersonaInfoDAO.update(persona);
    }

    public static int deletePersona(Integer idPersona){
        return PersonaInfoDAO.delete(idPersona);
    }

}
