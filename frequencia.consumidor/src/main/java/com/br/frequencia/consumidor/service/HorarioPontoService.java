package com.br.frequencia.consumidor.service;

import com.br.frequencia.consumidor.dto.HorarioPontoDTO;
import com.br.frequencia.consumidor.model.HorarioPonto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class HorarioPontoService {
    //private final HorarioPontoRepository horarioPontoRepository;

//    private HorarioPontoService(HorarioPontoRepository horarioPontoRepository) {
//        this.horarioPontoRepository = horarioPontoRepository;
//    }

    public void popularFila(List<HorarioPontoDTO> horarioPontos) {
       for (HorarioPontoDTO horarioPontoDTO : horarioPontos) {
           extrairCampos(horarioPontoDTO);
       }
    }

    private void extrairCampos(HorarioPontoDTO horarioPontoDTO) {
        HorarioPonto horarioPonto = new HorarioPonto();
        horarioPonto.setId_horario_ponto(horarioPontoDTO.getId_horario_ponto());
        horarioPonto.setId_servidor(horarioPontoDTO.getId_servidor());
        horarioPonto.setUltima_sinconizacao(LocalDateTime.now());
    }
}
