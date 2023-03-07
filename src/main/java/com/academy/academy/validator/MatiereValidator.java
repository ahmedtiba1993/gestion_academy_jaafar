package com.academy.academy.validator;

import com.academy.academy.dto.MatiereDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class MatiereValidator {

    public static List<String> validate(MatiereDto dto){

        List<String> errors = new ArrayList<String>();

        if(dto == null){

            errors.add("Veuillez renseigner le nom");
            return errors;
        }

        if(!StringUtils.hasLength(dto.getNom())) {
            errors.add("Veuillez renseigner le nom");
        }

        return errors;

    }
}
