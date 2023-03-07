package com.academy.academy.service;

import com.academy.academy.dto.MatiereDto;

import java.util.List;

public interface MatiereService {

    MatiereDto save(MatiereDto dto);

    MatiereDto findById(Integer id);

    List<MatiereDto> findAll();

    void delete (Integer id);

}
