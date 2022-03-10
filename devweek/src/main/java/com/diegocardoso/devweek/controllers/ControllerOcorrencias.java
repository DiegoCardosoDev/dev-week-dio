package com.diegocardoso.devweek.controllers;


import com.diegocardoso.devweek.models.Response;
import com.diegocardoso.devweek.service.OcorrenciasService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static java.time.LocalDateTime.now;
import static org.springframework.http.HttpStatus.OK;

@Slf4j
@RestController
@RequestMapping("/api")
public class ControllerOcorrencias {

    private final OcorrenciasService ocorrenciasService;

    public ControllerOcorrencias(OcorrenciasService ocorrenciasService) {
        this.ocorrenciasService = ocorrenciasService;
    }


    /*LISTAR TODOS*/
    @GetMapping("/ocorencias")
    public ResponseEntity<Response> allOcorrencias() {

        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(Map.of("faixas etarias", ocorrenciasService.findAllOcorrencias()))
                        .message("ocorrencias carregadas!!!")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()

        );
    }

    /*OBTER OCORRENCIAS POR ID*/
    @GetMapping("/ocorrencia/{id}")
    public ResponseEntity<Response> serverById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(Map.of("servers", ocorrenciasService.findOcorrenciasById(id)))
                        .message("Server retrieved")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }
}
