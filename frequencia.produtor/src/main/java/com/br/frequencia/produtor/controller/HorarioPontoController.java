package com.br.frequencia.produtor.controller;

import com.br.frequencia.produtor.model.HorarioPonto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/horario_ponto")
public class HorarioPontoController {

    @GetMapping
    public List<HorarioPonto> listarHorarioPonto() {
        return null;
    }

}
