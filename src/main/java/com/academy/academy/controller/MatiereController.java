package com.academy.academy.controller;

import com.academy.academy.controller.api.MatiereApi;
import com.academy.academy.dto.MatiereDto;
import com.academy.academy.service.MatiereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MatiereController implements MatiereApi {

    private MatiereService matiereService;

    @Autowired
    public MatiereController(MatiereService matiereService) {
        super();
        this.matiereService = matiereService;
    }

    @Override
    public MatiereDto save(MatiereDto dto) {
        // TODO Auto-generated method stub
        return matiereService.save(dto);
    }

    @Override
    public MatiereDto findById(Integer id) {
        // TODO Auto-generated method stub
        return matiereService.findById(id);
    }

    @Override
    public List<MatiereDto> findAll() {
        // TODO Auto-generated method stub
        return matiereService.findAll();
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        matiereService.delete(id);
    }
}
