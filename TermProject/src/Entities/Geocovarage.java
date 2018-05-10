/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nunya
 */
@Entity
@Table(name = "Geo_covarage", catalog = "eleo1db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Geocovarage.findAll", query = "SELECT g FROM Geocovarage g")
    , @NamedQuery(name = "Geocovarage.findByPlanID", query = "SELECT g FROM Geocovarage g WHERE g.planID = :planID")
    , @NamedQuery(name = "Geocovarage.findByNatnetflag", query = "SELECT g FROM Geocovarage g WHERE g.natnetflag = :natnetflag")
    , @NamedQuery(name = "Geocovarage.findByOutservareacov", query = "SELECT g FROM Geocovarage g WHERE g.outservareacov = :outservareacov")
    , @NamedQuery(name = "Geocovarage.findByOutcountrycov", query = "SELECT g FROM Geocovarage g WHERE g.outcountrycov = :outcountrycov")})
public class Geocovarage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Plan_ID")
    private String planID;
    @Column(name = "Nat_net_flag")
    private String natnetflag;
    @Column(name = "Out_serv_area_cov")
    private String outservareacov;
    @Column(name = "Out_country_cov")
    private String outcountrycov;
    @JoinColumn(name = "Plan_ID", referencedColumnName = "HIOS_Plan_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Plan plan;

    public Geocovarage() {
    }

    public Geocovarage(String planID) {
        this.planID = planID;
    }

    public String getPlanID() {
        return planID;
    }

    public void setPlanID(String planID) {
        this.planID = planID;
    }

    public String getNatnetflag() {
        return natnetflag;
    }

    public void setNatnetflag(String natnetflag) {
        this.natnetflag = natnetflag;
    }

    public String getOutservareacov() {
        return outservareacov;
    }

    public void setOutservareacov(String outservareacov) {
        this.outservareacov = outservareacov;
    }

    public String getOutcountrycov() {
        return outcountrycov;
    }

    public void setOutcountrycov(String outcountrycov) {
        this.outcountrycov = outcountrycov;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (planID != null ? planID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Geocovarage)) {
            return false;
        }
        Geocovarage other = (Geocovarage) object;
        if ((this.planID == null && other.planID != null) || (this.planID != null && !this.planID.equals(other.planID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Geocovarage[ planID=" + planID + " ]";
    }
    
}
