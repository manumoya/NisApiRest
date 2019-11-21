package nisum.service;

import nisum.model.Persona;
import nisum.model.Validation;

public class PersonaValidation {

    public static Validation hairColour(Persona persona){
        Validation validate = new Validation();
        if (persona.getHairColour().equals("black") ||
            persona.getHairColour().equals("red") ||
            persona.getHairColour().equals("yellow") ||
            persona.getHairColour().equals("brown") ||
            persona.getHairColour().equals("white") ){

           validate.setValidated(true);
           validate.setMessage("OK");
        }else{
            validate.setValidated(false);
            validate.setMessage("hairColour no válido - Permitidos: 'black', 'red', 'yellow', 'brown' & 'white'");
        }
        return validate;
    }

}
