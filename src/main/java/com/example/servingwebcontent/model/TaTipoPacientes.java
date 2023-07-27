/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.servingwebcontent.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author bside.cristian
 */
@Entity
@Table(name = "TA_TIPO_PACIENTES")
@NamedQueries({
    @NamedQuery(name = "TaTipoPacientes.findAll", query = "SELECT t FROM TaTipoPacientes t"),
    @NamedQuery(name = "TaTipoPacientes.findByIdTipoPaciente", query = "SELECT t FROM TaTipoPacientes t WHERE t.idTipoPaciente = :idTipoPaciente"),
    @NamedQuery(name = "TaTipoPacientes.findByDescripcion", query = "SELECT t FROM TaTipoPacientes t WHERE t.descripcion = :descripcion")})
public class TaTipoPacientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TIPO_PACIENTE")
    private Short idTipoPaciente;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public TaTipoPacientes() {
    }

    public TaTipoPacientes(Short idTipoPaciente) {
        this.idTipoPaciente = idTipoPaciente;
    }

    public TaTipoPacientes(Short idTipoPaciente, String descripcion) {
        this.idTipoPaciente = idTipoPaciente;
        this.descripcion = descripcion;
    }

    public Short getIdTipoPaciente() {
        return idTipoPaciente;
    }

    public void setIdTipoPaciente(Short idTipoPaciente) {
        this.idTipoPaciente = idTipoPaciente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoPaciente != null ? idTipoPaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaTipoPacientes)) {
            return false;
        }
        TaTipoPacientes other = (TaTipoPacientes) object;
        if ((this.idTipoPaciente == null && other.idTipoPaciente != null) || (this.idTipoPaciente != null && !this.idTipoPaciente.equals(other.idTipoPaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entitiesfromdatabase.TaTipoPacientes[ idTipoPaciente=" + idTipoPaciente + " ]";
    }
    
}
