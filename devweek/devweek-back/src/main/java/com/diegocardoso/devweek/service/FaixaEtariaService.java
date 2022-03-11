package com.diegocardoso.devweek.service;

import com.diegocardoso.devweek.entities.FaixaEtaria;
import com.diegocardoso.devweek.repo.FaixaEtariaRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Slf4j
@Service
public class FaixaEtariaService {

    private final FaixaEtariaRepo  faixaEtariaRepo;

    public FaixaEtariaService(FaixaEtariaRepo faixaEtariaRepo) {
        this.faixaEtariaRepo = faixaEtariaRepo;
    }

    /*LISTAR TODAS FAIXAS ETARIAS*/
    public List<FaixaEtaria>  findAllFaixaEtaria(){
        log.info("listando todas faixas etarias...");
        return faixaEtariaRepo.findAll();
    }

    /*OBTER FAIXA ETARIA POR ID*/
    public FaixaEtaria findByIdFaixaEtaria(Long id) {
        log.info("faixa etaria  id: {}", id);
        return faixaEtariaRepo.findById(id).get();
    }

    /*SALVAR FAIXA ETARIA */
    @Transactional
    public FaixaEtaria save(FaixaEtaria faixaEtaria) {
        log.info("criando nova faixa etaria: {}", faixaEtaria.getDescricao());
        return faixaEtariaRepo.save(faixaEtaria);
    }

    /*DELETAR FAIXA ETARIA*/
    @Transactional
    public Boolean delete(Long id) {
        log.info("deleting faixa etaria by id {}", id);
        faixaEtariaRepo.deleteById(id);
        return Boolean.TRUE;
    }


}
