package com.fatec.routememories.repository;

import com.routememories.model.Cemetery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CemeteryRepository extends JpaRepository<Cemetery, Long> {
    // Aqui você pode adicionar métodos de consulta personalizados, se necessário
}
