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

        Persona persona = new Persona(0,"manu", "moya", "rgua", 999, "red");
        int id = PersonaInfoDAO.save(persona);

        List<Persona> list2 = PersonaInfoDAO.findAll();
        assertEquals(1,list2.size());
    }


   @Test
    public void update() {
        Persona persona = new Persona(1,"manolo", "moya", "rgua", 999, "red");
        PersonaInfoDAO.update(persona);
        Persona personaUpd = PersonaInfoDAO.get(1);
        assertEquals("manolo",personaUpd.getName());
    }


    @Test
    public void get() {
        Persona persona = PersonaInfoDAO.get(1);
        assertEquals("manolo", persona.getName());
    }

    @Test
    public void delete() {
        int id = PersonaInfoDAO.delete(1);
        assertEquals(1, id);
    }

}
