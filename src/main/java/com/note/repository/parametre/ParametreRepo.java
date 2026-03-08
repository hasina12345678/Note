package com.note.repository.parametre;

import com.note.model.parametre.Parametre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParametreRepo extends JpaRepository<Parametre, Long> {
    
}