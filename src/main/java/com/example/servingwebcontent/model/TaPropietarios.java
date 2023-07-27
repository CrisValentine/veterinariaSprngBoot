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
@Table(name = "TA_PROPIETARIOS")
@NamedQueries({
    @NamedQuery(name = "TaPropietarios.findAll", query = "SELECT t FROM TaPropietarios t"),
    @NamedQuery(name = "TaPropietarios.findByIdPropietario", query = "SELECT t FROM TaPropietarios t WHERE t.idPropietario = :idPropietario"),
    @NamedQuery(name = "TaPropietarios.findByNombrePropietario", query = "SELECT t FROM TaPropietarios t WHERE t.nombrePropietario = :nombrePropietario"),
    @NamedQuery(name = "TaPropietarios.findByApellidoMaternoPropietario", query = "SELECT t FROM TaPropietarios t WHERE t.apellidoMaternoPropietario = :apellidoMaternoPropietario"),
    @NamedQuery(name = "TaPropietarios.findByApellidoPaternoPropietario", query = "SELECT t FROM TaPropietarios t WHERE t.apellidoPaternoPropietario = :apellidoPaternoPropietario")})
public class TaPropietarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PROPIETARIO")
    private Long idPropietario;
    @Basic(optional = false)
    @Column(name = "NOMBRE_PROPIETARIO")
    private String nombrePropietario;
    @Column(name = "APELLIDO_MATERNO_PROPIETARIO")
    private String apellidoMaternoPropietario;
    @Column(name = "APELLIDO_PATERNO_PROPIETARIO")
    private String apellidoPaternoPropietario;

    public TaPropietarios() {
    }

    public TaPropietarios(Long idPropietario) {
        this.idPropietario = idPropietario;
    }

    public TaPropietarios(Long idPropietario, String nombrePropietario) {
        this.idPropietario = idPropietario;
        this.nombrePropietario = nombrePropietario;
    }

    public Long getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(Long idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getApellidoMaternoPropietario() {
        return apellidoMaternoPropietario;
    }

    public void setApellidoMaternoPropietario(String apellidoMaternoPropietario) {
        this.apellidoMaternoPropietario = apellidoMaternoPropietario;
    }

    public String getApellidoPaternoPropietario() {
        return apellidoPaternoPropietario;
    }

    public void setApellidoPaternoPropietario(String apellidoPaternoPropietario) {
        this.apellidoPaternoPropietario = apellidoPaternoPropietario;
    }



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPropietario != null ? idPropietario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof TaPropietarios)) {
            return false;
        }
        TaPropietarios other = (TaPropietarios) object;
        if ((this.idPropietario == null && other.idPropietario != null) || (this.idPropietario != null && !this.idPropietario.equals(other.idPropietario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entitiesfromdatabase.TaPropietarios[ idPropietario=" + idPropietario + " ]";
    }
    
}
