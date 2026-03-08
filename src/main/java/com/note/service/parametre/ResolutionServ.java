package com.note.service.parametre;

import com.note.model.parametre.Resolution;
import com.note.repository.parametre.ResolutionRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ResolutionServ {

    @Autowired
    private ResolutionRepo resolutionRepo;
    
}