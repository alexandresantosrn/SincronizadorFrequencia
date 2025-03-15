package com.br.frequencia.consumidor.dto;

import java.time.LocalDateTime;

public class HorarioPontoDTO {

    private long id_horario_ponto;
    private long id_servidor;
    private LocalDateTime horario_entrada;
    private LocalDateTime horario_saida;

    public HorarioPontoDTO() {
    }

    public HorarioPontoDTO(long id_horario_ponto, long id_servidor, LocalDateTime horario_entrada, LocalDateTime horario_saida) {
        this.id_horario_ponto = id_horario_ponto;
        this.id_servidor = id_servidor;
        this.horario_entrada = horario_entrada;
        this.horario_saida = horario_saida;
    }

    public long getId_horario_ponto() {
        return id_horario_ponto;
    }

    public void setId_horario_ponto(long id_horario_ponto) {
        this.id_horario_ponto = id_horario_ponto;
    }

    public long getId_servidor() {
        return id_servidor;
    }

    public void setId_servidor(long id_servidor) {
        this.id_servidor = id_servidor;
    }

    public LocalDateTime getHorario_entrada() {
        return horario_entrada;
    }

    public void setHorario_entrada(LocalDateTime horario_entrada) {
        this.horario_entrada = horario_entrada;
    }

    public LocalDateTime getHorario_saida() {
        return horario_saida;
    }

    public void setHorario_saida(LocalDateTime horario_saida) {
        this.horario_saida = horario_saida;
    }
}
