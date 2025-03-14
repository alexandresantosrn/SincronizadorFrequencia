package com.br.frequencia.produtor.service;

import com.br.frequencia.produtor.model.HorarioPonto;
import com.br.frequencia.produtor.repository.HorarioPontoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorarioPontoService {

    private final HorarioPontoRepository horarioPontoRepository;

    private HorarioPontoService(HorarioPontoRepository horarioPontoRepository) {
        this.horarioPontoRepository = horarioPontoRepository;
    }

    public List<HorarioPonto> listarHorariosPonto() {
        return horarioPontoRepository.findAll();
    }
}
