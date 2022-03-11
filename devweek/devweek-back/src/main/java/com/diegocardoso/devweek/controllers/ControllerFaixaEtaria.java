package com.diegocardoso.devweek.controllers;

import com.diegocardoso.devweek.entities.FaixaEtaria;
import com.diegocardoso.devweek.entities.Response;
import com.diegocardoso.devweek.service.FaixaEtariaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import static java.time.LocalDateTime.now;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api")
public class ControllerFaixaEtaria {

    private final FaixaEtariaService faixaEtariaService;

    public ControllerFaixaEtaria(FaixaEtariaService faixaEtariaService) {
        this.faixaEtariaService = faixaEtariaService;
    }

    /*LISTAR TODOS*/
    @GetMapping("/faixas-etarias")
    public ResponseEntity<Response>  allFaixaEtaria() {

        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(Map.of("faixas etarias", faixaEtariaService.findAllFaixaEtaria()))
                        .message("faixas carregadas!!!")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()

        );
    }

    /*OBTER POR ID*/
    @GetMapping("/faixa-etaria/{id}")
    public ResponseEntity<Response> serverById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(Map.of("faixa etaria carregada", faixaEtariaService.findByIdFaixaEtaria(id)))
                        .message("faixa etaria carregada")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

    /*SALVAR */
    @PostMapping("/novo")
    public ResponseEntity<Response> saveServer(@RequestBody @Valid FaixaEtaria faixaEtaria) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(Map.of("salvando...", faixaEtariaService.save(faixaEtaria)))
                        .message("faixa etaria salvada com sucesso")
                        .status(CREATED)
                        .statusCode(CREATED.value())
                        .build()
        );
    }

    /*DELETAR*/
    @DeleteMapping("/faixa-etaria/remover/{id}")
    public ResponseEntity<Response> deleteByServer(@PathVariable("id") Long id) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(Map.of("deleted!", faixaEtariaService.delete(id)))
                        .message("faixa etaria deleteda")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }
}
