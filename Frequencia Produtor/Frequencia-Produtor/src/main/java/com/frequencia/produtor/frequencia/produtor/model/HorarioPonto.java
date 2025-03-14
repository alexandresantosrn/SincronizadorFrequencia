package com.frequencia.produtor.frequencia.produtor.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "horario_ponto")
public class HorarioPonto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_horario_ponto;
    private long id_servidor;
    private LocalDateTime horario_entrada;
    private LocalDateTime horario_saida;

    public HorarioPonto() {
    }

    public HorarioPonto(long id_horario_ponto, long id_servidor, LocalDateTime horario_entrada, LocalDateTime horario_saida) {
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

    @Override
    public String toString() {
        return "HorarioPonto [id_horario_ponto=" + id_horario_ponto + ", id_servidor=" + id_servidor + ", horario_entrada=" + horario_entrada + ", horario_saida=" + horario_saida + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HorarioPonto that = (HorarioPonto) o;
        return id_horario_ponto == that.id_horario_ponto && id_servidor == that.id_servidor && Objects.equals(horario_entrada, that.horario_entrada) && Objects.equals(horario_saida, that.horario_saida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_horario_ponto, id_servidor, horario_entrada, horario_saida);
    }
}