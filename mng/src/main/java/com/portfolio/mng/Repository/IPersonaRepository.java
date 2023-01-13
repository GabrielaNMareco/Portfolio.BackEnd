package com.portfolio.mng.Repository;

import com.portfolio.mng.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {

    public void deleteAllById(Long id);
    
}
