package com.api.crud.services;

import com.api.crud.models.ProfeModel;
import com.api.crud.repositories.IProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProfessorService {
    @Autowired
    IProfessorRepository professorRepository;

    public ArrayList<ProfeModel>getProfessorUsers(){
        return (ArrayList<ProfeModel>) professorRepository.findAll();
    }
}
