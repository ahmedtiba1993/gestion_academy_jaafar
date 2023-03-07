package com.academy.academy.controller.api;

import com.academy.academy.dto.MatiereDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface MatiereApi {

    @PostMapping(value ="/matiere/create" , consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    MatiereDto save(@RequestBody MatiereDto dto);

    @GetMapping(value = "/matiere/id/{idMatiere}")
    MatiereDto findById(@PathVariable("idMatiere") Integer id);

    @GetMapping(value = "/matiere/all")
    List<MatiereDto> findAll();

    @DeleteMapping(value = "/matiere/delete/{idMatiere}")
    void delete(@PathVariable("idMatiere") Integer id);
}
