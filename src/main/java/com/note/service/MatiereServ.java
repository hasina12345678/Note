package com.note.service;

import com.note.model.Matiere;
import com.note.repository.MatiereRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class MatiereServ {

    @Autowired
    private MatiereRepo matiereRepo;
    
}