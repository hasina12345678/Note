package com.note.service;

import com.note.model.Examen;
import com.note.repository.ExamenRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ExamenServ {

    @Autowired
    private ExamenRepo examenRepo;
    
}