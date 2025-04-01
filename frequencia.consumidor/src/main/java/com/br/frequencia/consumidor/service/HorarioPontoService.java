package com.br.frequencia.consumidor.service;

import com.br.frequencia.consumidor.dto.HorarioPontoDTO;
import com.br.frequencia.consumidor.helper.HorarioPontoHelper;
import com.br.frequencia.consumidor.model.HorarioPonto;
import com.br.frequencia.consumidor.repository.QueriesRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class HorarioPontoService {
    private final QueriesRepository queriesRepository;

    public HorarioPontoService(QueriesRepository queriesRepository) {
        this.queriesRepository = queriesRepository;
    }

    public void popularFila(List<HorarioPontoDTO> horarioPontos) {
       for (HorarioPontoDTO horarioPontoDTO : horarioPontos) {
           extrairCampos(horarioPontoDTO);
       }
    }

    private void extrairCampos(HorarioPontoDTO horarioPontoDTO) {
        HorarioPonto horarioPonto = new HorarioPonto();
        horarioPonto.setId_horario_ponto(horarioPontoDTO.getId_horario_ponto());
        horarioPonto.setId_servidor(horarioPontoDTO.getId_servidor());
        horarioPonto.setId_unidade_registro(queriesRepository.buscarIdPorNome(horarioPontoDTO.getId_servidor()));

        if (horarioPontoDTO.getHorario_entrada() != null) {
            if(HorarioPontoHelper.hasDiferencadeDias(horarioPontoDTO.getHorario_entrada(), horarioPontoDTO.getHorario_saida())) {
               horarioPonto.setEntrada_informada(horarioPontoDTO.getHorario_entrada());
            } else {
                horarioPonto.setEntrada_informada(horarioPontoDTO.getHorario_entrada());
                horarioPonto.setSaida_informada(horarioPontoDTO.getHorario_saida());
            }
        }

        if(horarioPontoDTO.getHorario_entrada() != null) {
            horarioPonto.setEntrada_real(horarioPontoDTO.getHorario_entrada());
        }

        if(horarioPontoDTO.getHorario_saida() != null) {
            horarioPonto.setSaida_real(horarioPontoDTO.getHorario_saida());
        }

        if(horarioPontoDTO.getHorario_saida() != null) {
            horarioPonto.setHoras_trabalhadas(HorarioPontoHelper.calculaHorasTrabalhadas(horarioPontoDTO.getHorario_entrada(), horarioPontoDTO.getHorario_saida()));
        }

        horarioPonto.setUltima_sinconizacao(LocalDateTime.now());
    }
}
