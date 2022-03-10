package com.diegocardoso.devweek.repo;

import com.diegocardoso.devweek.models.Regiao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegiaoRepo extends JpaRepository<Regiao, Long> {
}
