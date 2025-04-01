package com.br.frequencia.consumidor.helper;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class HorarioPontoHelper {

    public static LocalTime calculaHorasTrabalhadas(LocalDateTime horarioEntrada, LocalDateTime horarioSaida) {
        Duration duracao = Duration.between(horarioEntrada, horarioSaida);
        return LocalTime.MIDNIGHT.plus(duracao);
    }

    public static boolean hasDiferencadeDias(LocalDateTime horarioEntrada, LocalDateTime horarioSaida) {
        return horarioEntrada.toLocalDate().isBefore(horarioSaida.toLocalDate());
    }

}
