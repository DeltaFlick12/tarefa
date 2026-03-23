package com.flick.tarefa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flick.tarefa.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}