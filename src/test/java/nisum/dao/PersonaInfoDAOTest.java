package nisum.dao;

import nisum.model.Persona;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class PersonaInfoDAOTest {
    @Test
    public void findAll() {
        List<Persona> list = PersonaInfoDAO.findAll();
        assertEquals(0,list.size());

        Persona persona = new Persona(1,"manu", "moya", "rgua", 999, "red");
        PersonaInfoDAO.save(persona);

        List<Persona> list2 = PersonaInfoDAO.findAll();
        assertEquals(1,list2.size());
    }

    @Test
    public void get() {
        Persona persona = new Persona(1,"manu", "moya", "rgua", 999, "red");
        Persona persona2 = PersonaInfoDAO.get(1);

        assertEquals(persona.getName(),persona2.getName());
    }

}
