package com.note.service.parametre;

import com.note.model.parametre.Operateur;
import com.note.repository.parametre.OperateurRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class OperateurServ {

    @Autowired
    private OperateurRepo operateurRepo;
    
}