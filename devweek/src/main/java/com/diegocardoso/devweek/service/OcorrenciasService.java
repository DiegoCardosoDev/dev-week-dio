package com.diegocardoso.devweek.service;



import com.diegocardoso.devweek.models.IncidenciaExame;
import com.diegocardoso.devweek.repo.OcorrenciaRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Slf4j
@Service
public class OcorrenciasService {

    private final OcorrenciaRepo ocorrenciaRepo;

    public OcorrenciasService(OcorrenciaRepo ocorrenciaRepo) {
        this.ocorrenciaRepo = ocorrenciaRepo;
    }

    /*LISTAR TODAS*/
    public List<IncidenciaExame>  findAllOcorrencias(){
        log.info("listando todas ocorrencias...");
        return ocorrenciaRepo.findAll();
    }


    /*OBTER  OCORRENCIA POR ID*/
    public IncidenciaExame  findOcorrenciasById(Long id) {
        Optional<IncidenciaExame> ocorrenciaOptional = ocorrenciaRepo.findById(id);
        if (ocorrenciaOptional.isPresent()){
            IncidenciaExame ocorrenciaUnid = ocorrenciaOptional.get();
            log.info("faixa etaria  id: {}", id);
            return ocorrenciaRepo.getById(id);
        }
        log.info("nao encontrado!: {}", id);
        return null;

    }




}
