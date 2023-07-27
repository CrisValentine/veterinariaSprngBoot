/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.servingwebcontent.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author bside.cristian
 */
@Entity
@Table(name = "TA_CITAS")
@NamedQueries({
    @NamedQuery(name = "TaCitas.findAll", query = "SELECT t FROM TaCitas t"),
    @NamedQuery(name = "TaCitas.findByIdCita", query = "SELECT t FROM TaCitas t WHERE t.idCita = :idCita"),
    @NamedQuery(name = "TaCitas.findByFechaCita", query = "SELECT t FROM TaCitas t WHERE t.fechaCita = :fechaCita")})
public class TaCitas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CITA")
    private Long idCita;
    @Column(name = "FECHA_CITA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCita;
    @JoinColumn(name = "ID_PACIENTE", referencedColumnName = "ID_PACIENTE")
    @ManyToOne(optional = false)
    private TaPacientes idPaciente;
    @JoinColumn(name = "ID_PROPIETARIO", referencedColumnName = "ID_PROPIETARIO")
    @ManyToOne(optional = false)
    private TaPropietarios idPropietario;
    @JoinColumns({
        @JoinColumn(name = "ID_VETERINARIO", referencedColumnName = "ID_VETERINARIO"),
        @JoinColumn(name = "TA_VETERINARIOS_CEDULA_VET", referencedColumnName = "CEDULA_VET")})
    @ManyToOne(optional = false)
    private TaVeterinarios taVeterinarios;

    public TaCitas() {
    }

    public TaCitas(Long idCita) {
        this.idCita = idCita;
    }

    public Long getIdCita() {
        return idCita;
    }

    public void setIdCita(Long idCita) {
        this.idCita = idCita;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public TaPacientes getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(TaPacientes idPaciente) {
        this.idPaciente = idPaciente;
    }

    public TaPropietarios getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(TaPropietarios idPropietario) {
        this.idPropietario = idPropietario;
    }

    public TaVeterinarios getTaVeterinarios() {
        return taVeterinarios;
    }

    public void setTaVeterinarios(TaVeterinarios taVeterinarios) {
        this.taVeterinarios = taVeterinarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCita != null ? idCita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaCitas)) {
            return false;
        }
        TaCitas other = (TaCitas) object;
        if ((this.idCita == null && other.idCita != null) || (this.idCita != null && !this.idCita.equals(other.idCita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entitiesfromdatabase.TaCitas[ idCita=" + idCita + " ]";
    }
    
}
