package nisum.api;

import nisum.dao.PersonaInfoDAO;
import nisum.model.Validation;
import nisum.service.PersonaInfoService;
import nisum.service.PersonaValidation;
import org.springframework.web.bind.annotation.*;
import nisum.model.Persona;

import java.util.List;

@RestController
public class PersonaInfoController {

    /* BienVenido */
    @RequestMapping("/")
    public String index() {
        return "Gracias por llegar al API de Manuel Moya";
    }

    /* GET => Retorna todas las personas */
    @GetMapping("/persona")
    public List<Persona> findAll(){
        return PersonaInfoService.findAll();
    }

    /* POST => Grabar persona */
    @PostMapping("/persona")
    public Persona addUser(@RequestBody Persona persona) {

        Validation valid = PersonaValidation.hairColour(persona);

        if(!valid.isValidated()) {
            throw new RuntimeException( valid.getMessage() );
        }

        int id = PersonaInfoService.savePersona(persona);
        return persona;
    }

    /* GET => mostrar una persona buscada */
    @GetMapping("/persona/{personaId}")
    public Persona getPersona(@PathVariable int personaId){
        Persona persona = PersonaInfoService.getPersona(personaId);

        if(persona.getId() == null) {
            throw new RuntimeException("Persona ID no encontrada - " + personaId);
        }

        return persona;
    }

    /* PUT  Modificar una persona  */
    @PutMapping("/persona")
    public Persona updatePersona(@RequestBody Persona persona) {

        Persona personaFound = PersonaInfoService.getPersona(persona.getId());
        if(personaFound.getId() == null) {
            throw new RuntimeException("Persona ID no encontrada - " + persona.getId());
        }

        Persona personaUpdated = PersonaInfoService.updatePersona(persona);
        return personaUpdated;
    }

    /*DELETE => Borra una persona */
    @DeleteMapping("persona/{personaId}")
    public String deletePersona(@PathVariable int personaId) {

        Persona persona = PersonaInfoService.getPersona(personaId);
        if(persona.getId() == null) {
            throw new RuntimeException("Persona ID no encontrada - "+ personaId);
        }

        PersonaInfoService.deletePersona(personaId);

        return "Usuario ID eliminado - " + personaId;
    }

}