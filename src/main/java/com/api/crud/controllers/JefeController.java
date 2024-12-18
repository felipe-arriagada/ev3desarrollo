package com.api.crud.controllers;


import com.api.crud.models.JefepracModel;
import com.api.crud.services.JefeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/jefe")

public class JefeController {
    @Autowired
    private JefeService jefeService;

    @GetMapping()
    public ArrayList<JefepracModel>getJefes(){
        return jefeService.getJefes();
    }
    @PostMapping
    


}
