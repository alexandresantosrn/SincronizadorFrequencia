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

    /**
     * Repositório para consultas ao banco de dados.
     */
    private final QueriesRepository queriesRepository;

    /**
     * Lista de objetos HorarioPonto a serem processados.
     */
    private final List<HorarioPonto> filaHorarioPonto;

    /**
     * Construtor da classe HorarioPontoService.
     * @param queriesRepository Repositório para consultas ao banco de dados.
     * @param filaHorarioPonto Lista de objetos HorarioPonto a serem processados.
     */
    public HorarioPontoService(QueriesRepository queriesRepository, List<HorarioPonto> filaHorarioPonto) {
        this.queriesRepository = queriesRepository;
        this.filaHorarioPonto = filaHorarioPonto;
    }

    /**
     * Método para popular a fila de horários com os dados recebidos.
     * @param horarioPontos Lista de objetos DTO com os dados a serem extraídos.
     */
    public void popularFila(List<HorarioPontoDTO> horarioPontos) {
        for (HorarioPontoDTO horarioPontoDTO : horarioPontos) {
           extrairCampos(horarioPontoDTO);
        }

        salvarHorarios(horarioPontos);
    }

    /**
     * Método para extrair os campos do DTO e criar um objeto HorarioPonto.
     * @param horarioPontoDTO Objeto DTO com os dados a serem extraídos.
     */
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

        filaHorarioPonto.add(horarioPonto);
    }

    private void salvarHorarios(List<HorarioPontoDTO> horarioPontos) {
    }
}
