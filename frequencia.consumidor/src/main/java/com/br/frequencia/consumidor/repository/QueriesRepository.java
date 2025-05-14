package com.br.frequencia.consumidor.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class QueriesRepository {

    /**
     * Atributo jdbcTemplate
     */
    private final JdbcTemplate jdbcTemplate;

    /**
     * Construtor da classe QueriesRepository
     * @param jdbcTemplate
     */
    public QueriesRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * Método para buscar o id_unidade do servidor
     * @param id_servidor
     * @return id_unidade
     */
    public Integer buscarIdPorNome(Long id_servidor) {
        String sql = "SELECT id_unidade FROM rh.servidor WHERE id_servidor = ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, id_servidor);
    }
}
