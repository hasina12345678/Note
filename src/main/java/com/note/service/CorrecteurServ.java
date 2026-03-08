package com.note.service;

import com.note.model.Correcteur;
import com.note.repository.CorrecteurRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CorrecteurServ {

    @Autowired
    private CorrecteurRepo correcteurRepo;
    
}