/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author nunya
 */
@Entity
@Table(name = "Provider", catalog = "eleo1db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Provider.findAll", query = "SELECT p FROM Provider p")
    , @NamedQuery(name = "Provider.findByHIOSIssuerID", query = "SELECT p FROM Provider p WHERE p.hIOSIssuerID = :hIOSIssuerID")
    , @NamedQuery(name = "Provider.findByName", query = "SELECT p FROM Provider p WHERE p.name = :name")
    , @NamedQuery(name = "Provider.findByServiceArea", query = "SELECT p FROM Provider p WHERE p.serviceArea = :serviceArea")})
public class Provider implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HIOS_Issuer_ID")
    private Integer hIOSIssuerID;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "Service_Area")
    private String serviceArea;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "provider")
    private Collection<Plan> planCollection;

    public Provider() {
    }

    public Provider(Integer hIOSIssuerID) {
        this.hIOSIssuerID = hIOSIssuerID;
    }

    public Provider(Integer hIOSIssuerID, String name, String serviceArea) {
        this.hIOSIssuerID = hIOSIssuerID;
        this.name = name;
        this.serviceArea = serviceArea;
    }

    public Integer getHIOSIssuerID() {
        return hIOSIssuerID;
    }

    public void setHIOSIssuerID(Integer hIOSIssuerID) {
        this.hIOSIssuerID = hIOSIssuerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    @XmlTransient
    public Collection<Plan> getPlanCollection() {
        return planCollection;
    }

    public void setPlanCollection(Collection<Plan> planCollection) {
        this.planCollection = planCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hIOSIssuerID != null ? hIOSIssuerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Provider)) {
            return false;
        }
        Provider other = (Provider) object;
        if ((this.hIOSIssuerID == null && other.hIOSIssuerID != null) || (this.hIOSIssuerID != null && !this.hIOSIssuerID.equals(other.hIOSIssuerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Provider[ hIOSIssuerID=" + hIOSIssuerID + " ]";
    }
    
}
