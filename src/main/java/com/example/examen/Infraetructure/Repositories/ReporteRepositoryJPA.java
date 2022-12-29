package com.example.examen.Infraetructure.Repositories;

import com.example.examen.Domain.Entities.Reportes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReporteRepositoryJPA extends JpaRepository<Reportes, Integer> {
}
