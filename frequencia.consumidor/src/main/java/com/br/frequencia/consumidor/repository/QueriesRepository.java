package com.br.frequencia.consumidor.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class QueriesRepository {

    private final JdbcTemplate jdbcTemplate;

    public QueriesRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Integer buscarIdPorNome(Long id_servidor) {
        String sql = "SELECT id_unidade FROM rh.servidor WHERE id_servidor = ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, id_servidor);
    }
}
