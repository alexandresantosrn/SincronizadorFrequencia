package com.br.frequencia.consumidor.helper;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class HorarioPontoHelper {

    /*
     * Método para calcular a diferença entre dois horários
     * @param horarioEntrada Horário de entrada
     * @param horarioSaida Horário de saída
     * @return A diferença entre os dois horários
     */
    public static LocalTime calculaHorasTrabalhadas(LocalDateTime horarioEntrada, LocalDateTime horarioSaida) {
        Duration duracao = Duration.between(horarioEntrada, horarioSaida);
        return LocalTime.MIDNIGHT.plus(duracao);
    }

    /**
     * Método para verificar se há diferença de dias entre dois horários
     * @param horarioEntrada Horário de entrada
     * @param horarioSaida Horário de saída
     * @return true se houver diferença de dias, false caso contrário
     */
    public static boolean hasDiferencadeDias(LocalDateTime horarioEntrada, LocalDateTime horarioSaida) {
        return horarioEntrada.toLocalDate().isBefore(horarioSaida.toLocalDate());
    }
}
