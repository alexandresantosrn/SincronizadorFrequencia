package com.br.frequencia.consumidor.model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

public class HorarioPonto {

    private long id_horario_ponto;
    private long id_servidor;
    private int id_unidade_registro;
    LocalDateTime entrada_informada;
    LocalDateTime saida_informada;
    LocalDateTime entrada_real;
    LocalDateTime saida_real;
    LocalTime horas_trabalhadas;
    LocalDateTime ultima_sinconizacao;

    public HorarioPonto() {
    }

    public HorarioPonto(long id_horario_ponto, long id_servidor, int id_unidade_registro, LocalDateTime entrada_informada, LocalDateTime saida_informada, LocalDateTime entrada_real, LocalDateTime saida_real, LocalTime horas_trabalhadas, LocalDateTime ultima_sinconizacao) {
        this.id_horario_ponto = id_horario_ponto;
        this.id_servidor = id_servidor;
        this.id_unidade_registro = id_unidade_registro;
        this.entrada_informada = entrada_informada;
        this.saida_informada = saida_informada;
        this.entrada_real = entrada_real;
        this.saida_real = saida_real;
        this.horas_trabalhadas = horas_trabalhadas;
        this.ultima_sinconizacao = ultima_sinconizacao;
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

    public int getId_unidade_registro() {
        return id_unidade_registro;
    }

    public void setId_unidade_registro(int id_unidade_registro) {
        this.id_unidade_registro = id_unidade_registro;
    }

    public LocalDateTime getEntrada_informada() {
        return entrada_informada;
    }

    public void setEntrada_informada(LocalDateTime entrada_informada) {
        this.entrada_informada = entrada_informada;
    }

    public LocalDateTime getSaida_informada() {
        return saida_informada;
    }

    public void setSaida_informada(LocalDateTime saida_informada) {
        this.saida_informada = saida_informada;
    }

    public LocalDateTime getEntrada_real() {
        return entrada_real;
    }

    public void setEntrada_real(LocalDateTime entrada_real) {
        this.entrada_real = entrada_real;
    }

    public LocalDateTime getSaida_real() {
        return saida_real;
    }

    public void setSaida_real(LocalDateTime saida_real) {
        this.saida_real = saida_real;
    }

    public LocalTime getHoras_trabalhadas() {
        return horas_trabalhadas;
    }

    public void setHoras_trabalhadas(LocalTime horas_trabalhadas) {
        this.horas_trabalhadas = horas_trabalhadas;
    }

    public LocalDateTime getUltima_sinconizacao() {
        return ultima_sinconizacao;
    }

    public void setUltima_sinconizacao(LocalDateTime ultima_sinconizacao) {
        this.ultima_sinconizacao = ultima_sinconizacao;
    }

    @Override
    public String toString() {
        return "HorarioPonto{" +
                "id_horario_ponto=" + id_horario_ponto +
                ", id_servidor=" + id_servidor +
                ", id_unidade_registro=" + id_unidade_registro +
                ", entrada_informada=" + entrada_informada +
                ", saida_informada=" + saida_informada +
                ", entrada_real=" + entrada_real +
                ", saida_real=" + saida_real +
                ", horas_trabalhadas=" + horas_trabalhadas +
                ", ultima_sinconizacao=" + ultima_sinconizacao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HorarioPonto that = (HorarioPonto) o;
        return id_horario_ponto == that.id_horario_ponto && id_servidor == that.id_servidor && id_unidade_registro == that.id_unidade_registro && Objects.equals(entrada_informada, that.entrada_informada) && Objects.equals(saida_informada, that.saida_informada) && Objects.equals(entrada_real, that.entrada_real) && Objects.equals(saida_real, that.saida_real) && Objects.equals(horas_trabalhadas, that.horas_trabalhadas) && Objects.equals(ultima_sinconizacao, that.ultima_sinconizacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_horario_ponto, id_servidor, id_unidade_registro, entrada_informada, saida_informada, entrada_real, saida_real, horas_trabalhadas, ultima_sinconizacao);
    }
}
