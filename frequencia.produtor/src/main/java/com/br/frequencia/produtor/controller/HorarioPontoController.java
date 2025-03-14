package com.br.frequencia.produtor.controller;

import com.br.frequencia.produtor.model.HorarioPonto;
import com.br.frequencia.produtor.service.HorarioPontoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/horario-ponto")
public class HorarioPontoController {

    private final HorarioPontoService horarioPontoService;

    public HorarioPontoController(HorarioPontoService horarioPontoService) {
        this.horarioPontoService = horarioPontoService;
    }

    @GetMapping
    public List<HorarioPonto> listarHorariosPonto() {
        return horarioPontoService.listarHorariosPonto();
    }
}
