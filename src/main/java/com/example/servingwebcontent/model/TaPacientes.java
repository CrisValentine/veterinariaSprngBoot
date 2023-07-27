/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.servingwebcontent.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author bside.cristian
 */
@Entity
@Table(name = "TA_PACIENTES")
@NamedQueries({
    @NamedQuery(name = "TaPacientes.findAll", query = "SELECT t FROM TaPacientes t"),
    @NamedQuery(name = "TaPacientes.findByIdPaciente", query = "SELECT t FROM TaPacientes t WHERE t.idPaciente = :idPaciente"),
    @NamedQuery(name = "TaPacientes.findByNombrePaciente", query = "SELECT t FROM TaPacientes t WHERE t.nombrePaciente = :nombrePaciente"),
    @NamedQuery(name = "TaPacientes.findByFechaNacPaciente", query = "SELECT t FROM TaPacientes t WHERE t.fechaNacPaciente = :fechaNacPaciente"),
    @NamedQuery(name = "TaPacientes.findByTelefono", query = "SELECT t FROM TaPacientes t WHERE t.telefono = :telefono")})
public class TaPacientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PACIENTE")
    private Long idPaciente;
    @Basic(optional = false)
    @Column(name = "NOMBRE_PACIENTE")
    private String nombrePaciente;
    @Column(name = "FECHA_NAC_PACIENTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacPaciente;
    @Column(name = "TELEFONO")
    private Long telefono;
    @JoinColumn(name = "ID_PROPIETARIO", referencedColumnName = "ID_PROPIETARIO")
    @ManyToOne(optional = false)
    private TaPropietarios idPropietario;
    @JoinColumn(name = "ID_TIPO_PACIENTE", referencedColumnName = "ID_TIPO_PACIENTE")
    @ManyToOne(optional = false)
    private TaTipoPacientes idTipoPaciente;
   

    public TaPacientes() {
    }

    public TaPacientes(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public TaPacientes(Long idPaciente, String nombrePaciente) {
        this.idPaciente = idPaciente;
        this.nombrePaciente = nombrePaciente;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public Date getFechaNacPaciente() {
        return fechaNacPaciente;
    }

    public void setFechaNacPaciente(Date fechaNacPaciente) {
        this.fechaNacPaciente = fechaNacPaciente;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public TaPropietarios getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(TaPropietarios idPropietario) {
        this.idPropietario = idPropietario;
    }

    public TaTipoPacientes getIdTipoPaciente() {
        return idTipoPaciente;
    }

    public void setIdTipoPaciente(TaTipoPacientes idTipoPaciente) {
        this.idTipoPaciente = idTipoPaciente;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPaciente != null ? idPaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof TaPacientes)) {
            return false;
        }
        TaPacientes other = (TaPacientes) object;
        if ((this.idPaciente == null && other.idPaciente != null) || (this.idPaciente != null && !this.idPaciente.equals(other.idPaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entitiesfromdatabase.TaPacientes[ idPaciente=" + idPaciente + " ]";
    }
    
}
