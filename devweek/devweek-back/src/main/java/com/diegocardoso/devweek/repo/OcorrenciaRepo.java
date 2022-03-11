package com.diegocardoso.devweek.repo;

import com.diegocardoso.devweek.entities.IncidenciaExame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcorrenciaRepo extends JpaRepository<IncidenciaExame, Long> {
}
