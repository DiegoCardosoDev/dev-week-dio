package com.diegocardoso.devweek.service;

import com.diegocardoso.devweek.models.FaixaEtaria;
import com.diegocardoso.devweek.repo.FaixaEtariaRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Slf4j
@Service
public class FaixaEtariaService {

    private final FaixaEtariaRepo  faixaEtariaRepo;

    public FaixaEtariaService(FaixaEtariaRepo faixaEtariaRepo) {
        this.faixaEtariaRepo = faixaEtariaRepo;
    }

    /*LISTAR TODOS*/
    public List<FaixaEtaria>  findAllFaixaEtaria(){
        return faixaEtariaRepo.findAll();
    }

    /*OBTER POR ID*/
    public Optional<FaixaEtaria> findByIdFaixaEtaria(Long id){
        return faixaEtariaRepo.findById(id);
    }

    /*SALVAR */
    @Transactional
    public FaixaEtaria save(FaixaEtaria faixaEtaria) {
        return faixaEtariaRepo.save(faixaEtaria);
    }

    /*DELETAR*/
    @Transactional
    public void delete(FaixaEtaria faixaEtaria) {
        faixaEtariaRepo.delete(faixaEtaria);
    }


}
