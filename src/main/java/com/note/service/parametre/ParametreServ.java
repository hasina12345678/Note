package com.note.service.parametre;

import com.note.model.parametre.Parametre;
import com.note.repository.parametre.ParametreRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ParametreServ {

    @Autowired
    private ParametreRepo parametreRepo;
    
}