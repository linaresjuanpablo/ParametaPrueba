package com.servicio.servicio.repository;

import com.servicio.servicio.model.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmpleadoRepository extends CrudRepository<Empleado, String> {
}
