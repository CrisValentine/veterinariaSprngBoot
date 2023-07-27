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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author bside.cristian
 */
@Entity
@Table(name = "TA_VETERINARIOS")
@NamedQueries({
    @NamedQuery(name = "TaVeterinarios.findAll", query = "SELECT t FROM TaVeterinarios t"),
    @NamedQuery(name = "TaVeterinarios.findByIdVeterinario", query = "SELECT t FROM TaVeterinarios t WHERE t.taVeterinariosPK.idVeterinario = :idVeterinario"),
    @NamedQuery(name = "TaVeterinarios.findByCedulaVet", query = "SELECT t FROM TaVeterinarios t WHERE t.taVeterinariosPK.cedulaVet = :cedulaVet"),
    @NamedQuery(name = "TaVeterinarios.findByNombreVet", query = "SELECT t FROM TaVeterinarios t WHERE t.nombreVet = :nombreVet"),
    @NamedQuery(name = "TaVeterinarios.findByApellidoPaternoVet", query = "SELECT t FROM TaVeterinarios t WHERE t.apellidoPaternoVet = :apellidoPaternoVet"),
    @NamedQuery(name = "TaVeterinarios.findByApellidoMaternoVet", query = "SELECT t FROM TaVeterinarios t WHERE t.apellidoMaternoVet = :apellidoMaternoVet")})
public class TaVeterinarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TaVeterinariosPK taVeterinariosPK;
    @Basic(optional = false)
    @Column(name = "NOMBRE_VET")
    private String nombreVet;
    @Basic(optional = false)
    @Column(name = "APELLIDO_PATERNO_VET")
    private String apellidoPaternoVet;
    @Basic(optional = false)
    @Column(name = "APELLIDO_MATERNO_VET")
    private String apellidoMaternoVet;

    public TaVeterinarios() {
    }

    public TaVeterinarios(TaVeterinariosPK taVeterinariosPK) {
        this.taVeterinariosPK = taVeterinariosPK;
    }

    public TaVeterinarios(TaVeterinariosPK taVeterinariosPK, String nombreVet, String apellidoPaternoVet, String apellidoMaternoVet) {
        this.taVeterinariosPK = taVeterinariosPK;
        this.nombreVet = nombreVet;
        this.apellidoPaternoVet = apellidoPaternoVet;
        this.apellidoMaternoVet = apellidoMaternoVet;
    }

    public TaVeterinarios(long idVeterinario, long cedulaVet) {
        this.taVeterinariosPK = new TaVeterinariosPK(idVeterinario, cedulaVet);
    }

    public TaVeterinariosPK getTaVeterinariosPK() {
        return taVeterinariosPK;
    }

    public void setTaVeterinariosPK(TaVeterinariosPK taVeterinariosPK) {
        this.taVeterinariosPK = taVeterinariosPK;
    }

    public String getNombreVet() {
        return nombreVet;
    }

    public void setNombreVet(String nombreVet) {
        this.nombreVet = nombreVet;
    }

    public String getApellidoPaternoVet() {
        return apellidoPaternoVet;
    }

    public void setApellidoPaternoVet(String apellidoPaternoVet) {
        this.apellidoPaternoVet = apellidoPaternoVet;
    }

    public String getApellidoMaternoVet() {
        return apellidoMaternoVet;
    }

    public void setApellidoMaternoVet(String apellidoMaternoVet) {
        this.apellidoMaternoVet = apellidoMaternoVet;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taVeterinariosPK != null ? taVeterinariosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof TaVeterinarios)) {
            return false;
        }
        TaVeterinarios other = (TaVeterinarios) object;
        if ((this.taVeterinariosPK == null && other.taVeterinariosPK != null) || (this.taVeterinariosPK != null && !this.taVeterinariosPK.equals(other.taVeterinariosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entitiesfromdatabase.TaVeterinarios[ taVeterinariosPK=" + taVeterinariosPK + " ]";
    }
    
}
