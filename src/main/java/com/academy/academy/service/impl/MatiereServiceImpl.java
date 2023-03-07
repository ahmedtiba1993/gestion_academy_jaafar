package com.academy.academy.service.impl;

import com.academy.academy.dto.MatiereDto;
import com.academy.academy.repository.MatiereRepository;
import com.academy.academy.service.MatiereService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MatiereServiceImpl implements MatiereService {

    MatiereRepository matiereRepository;
    public MatiereServiceImpl(MatiereRepository matiereRepository) {
        super();
        this.matiereRepository = matiereRepository;
    }
    @Override
    public MatiereDto save(MatiereDto dto) {
        return null;
    }

    @Override
    public MatiereDto findById(Integer id) {
        return null;
    }

    @Override
    public List<MatiereDto> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
