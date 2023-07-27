/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.servingwebcontent.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author bside.cristian
 */
@Embeddable
public class TaVeterinariosPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ID_VETERINARIO")
    private long idVeterinario;
    @Basic(optional = false)
    @Column(name = "CEDULA_VET")
    private long cedulaVet;

    public TaVeterinariosPK() {
    }

    public TaVeterinariosPK(long idVeterinario, long cedulaVet) {
        this.idVeterinario = idVeterinario;
        this.cedulaVet = cedulaVet;
    }

    public long getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(long idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public long getCedulaVet() {
        return cedulaVet;
    }

    public void setCedulaVet(long cedulaVet) {
        this.cedulaVet = cedulaVet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idVeterinario;
        hash += (int) cedulaVet;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaVeterinariosPK)) {
            return false;
        }
        TaVeterinariosPK other = (TaVeterinariosPK) object;
        if (this.idVeterinario != other.idVeterinario) {
            return false;
        }
        if (this.cedulaVet != other.cedulaVet) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entitiesfromdatabase.TaVeterinariosPK[ idVeterinario=" + idVeterinario + ", cedulaVet=" + cedulaVet + " ]";
    }
    
}
