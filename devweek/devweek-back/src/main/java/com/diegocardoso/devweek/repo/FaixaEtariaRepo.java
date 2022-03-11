package com.diegocardoso.devweek.repo;

import com.diegocardoso.devweek.entities.FaixaEtaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaixaEtariaRepo extends JpaRepository<FaixaEtaria, Long> {
}
