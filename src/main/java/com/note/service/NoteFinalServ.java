package com.note.service;

import com.note.model.NoteFinal;
import com.note.repository.NoteFinalRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class NoteFinalServ {

    @Autowired
    private NoteFinalRepo noteFinalRepo;
    
}