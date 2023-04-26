package com.servicio.servicio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="prueba")

public class Empleado {
    @Id
    private Integer id;
    @NotEmpty(message = "debe ingresar el nombre del empleado ")
    @Column (unique = true, name = "nombres")
    @NotBlank
    @Size(min=2, message = "debe ingresar el nombre del empleado ")
    private String nombres;
    @NotEmpty(message = "debe ingresar el apellido del empleado ")
    private String apellidos;
    private String tipoDocumento;
    private String numeroDocumento;
    @Past
    private LocalDate fechaNacimiento;
    @Past
    private Date fechaVinculacion;
    private String cargo;
    private Double salario;

    public Empleado() {
        }

    public Empleado(Integer id, String nombres, String apellidos, String tipoDocumento, String numeroDocumento,
                    LocalDate fechaNacimiento, Date fechaVinculacion, String cargo, Double salario) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaVinculacion = fechaVinculacion;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaVinculacion() {
        return fechaVinculacion;
    }

    public void setFechaVinculacion(Date fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
