/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.ufg.restful.webservices.hello.restful.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author xtecuan
 */
public class Persona implements Serializable {

    private Long idPersona;
    private String nombres;
    private String apellidos;
    private String email;
    private String sexo;
    private Date fechaNacimiento;

    public Persona(Long idPersona, String nombres, String apellidos, String email, String sexo, Date fechaNacimiento) {
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(Long idPersona, String nombres, String apellidos) {
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Persona() {
    }
    
    

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email=" + email + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}
