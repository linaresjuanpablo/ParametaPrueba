package com.servicio.servicio.controller;

import com.servicio.servicio.model.Empleado;
import com.servicio.servicio.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value="api/empleado")

public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping(value="/prueba")
    public ResponseEntity<String> prueba(){

        return ResponseEntity.status(HttpStatus.OK).body("bien inicial");
    }

    @PostMapping
    public ResponseEntity<Empleado>createEmpleado(@Valid @RequestBody Empleado empleado, BindingResult
            resultadoValidacion) {
        if (resultadoValidacion.hasErrors()){
            System.out.println("ingresar bien los datos");
        }
            Empleado crearEmpleado = empleadoService.create(empleado);
            return ResponseEntity.status(HttpStatus.OK).body(crearEmpleado);


    }
}
