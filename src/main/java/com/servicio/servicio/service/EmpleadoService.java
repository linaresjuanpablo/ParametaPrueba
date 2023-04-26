package com.servicio.servicio.service;

import com.servicio.servicio.model.Empleado;
import com.servicio.servicio.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.*;

@Service

public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;


    public Empleado create(Empleado empleado)  {

        LocalDate fechaHoy = LocalDate.now();
        int edad = fechaHoy.getYear() - empleado.getFechaNacimiento().getYear();


        if(edad < 18){
            throw new RuntimeException("Debe ser mayor de edad");
        }

        if(empleado.getNombres()==null || empleado.getNombres().isEmpty()){
            throw new RuntimeException("Debe ingresar un nombre");
        }
        if(empleado.getApellidos()==null || empleado.getApellidos().isEmpty()){
            throw new RuntimeException("Debe ingresar un apellido");
        }
        if(empleado.getTipoDocumento()==null || empleado.getTipoDocumento().isEmpty()){
            throw new RuntimeException("Debe ingresar un tipo de documento");
        }
        if(empleado.getFechaNacimiento()==null ){
            throw new RuntimeException("Debe ingresar fecha nacimiento");
           }

        if(empleado.getFechaVinculacion()==null){
            throw new RuntimeException("Debe ingresar fecha de vinculacion");
        }
        if(empleado.getCargo()==null || empleado.getCargo().isEmpty()){
            throw new RuntimeException("Debe ingresar un cargo");
        }
        if(empleado.getSalario()==null ){
            throw new RuntimeException("Debe ingresar salario neto");
        }

        return empleadoRepository.save(empleado);
    }
}
