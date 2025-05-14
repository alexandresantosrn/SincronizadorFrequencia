package com.br.frequencia.consumidor;

import com.br.frequencia.consumidor.dto.HorarioPontoDTO;
import com.br.frequencia.consumidor.model.HorarioPonto;
import com.br.frequencia.consumidor.service.HorarioPontoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private final HorarioPontoService horarioPontoService;

	public Application(HorarioPontoService horarioPontoService) {
		this.horarioPontoService = horarioPontoService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/horario-ponto";

		HorarioPontoDTO[] horarioPontoArray = restTemplate.getForObject(url, HorarioPontoDTO[].class);

		// Verifica se o array não é nulo antes de convertê-lo para uma lista
		List<HorarioPontoDTO> horarioPontos = null;
		if (horarioPontoArray != null) {
			horarioPontos = List.of(horarioPontoArray);
			horarioPontoService.popularFila(horarioPontos);
		}
	}
}
