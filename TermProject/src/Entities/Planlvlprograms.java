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
@Table(name = "Plan_lvl_programs", catalog = "eleo1db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Planlvlprograms.findAll", query = "SELECT p FROM Planlvlprograms p")
    , @NamedQuery(name = "Planlvlprograms.findByPlanID", query = "SELECT p FROM Planlvlprograms p WHERE p.planID = :planID")
    , @NamedQuery(name = "Planlvlprograms.findByTobaccowellness", query = "SELECT p FROM Planlvlprograms p WHERE p.tobaccowellness = :tobaccowellness")
    , @NamedQuery(name = "Planlvlprograms.findByDiseasemgmt", query = "SELECT p FROM Planlvlprograms p WHERE p.diseasemgmt = :diseasemgmt")})
public class Planlvlprograms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Plan_ID")
    private String planID;
    @Column(name = "Tobacco_wellness")
    private String tobaccowellness;
    @Column(name = "Disease_mgmt")
    private String diseasemgmt;
    @JoinColumn(name = "Plan_ID", referencedColumnName = "HIOS_Plan_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Plan plan;

    public Planlvlprograms() {
    }

    public Planlvlprograms(String planID) {
        this.planID = planID;
    }

    public String getPlanID() {
        return planID;
    }

    public void setPlanID(String planID) {
        this.planID = planID;
    }

    public String getTobaccowellness() {
        return tobaccowellness;
    }

    public void setTobaccowellness(String tobaccowellness) {
        this.tobaccowellness = tobaccowellness;
    }

    public String getDiseasemgmt() {
        return diseasemgmt;
    }

    public void setDiseasemgmt(String diseasemgmt) {
        this.diseasemgmt = diseasemgmt;
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
        if (!(object instanceof Planlvlprograms)) {
            return false;
        }
        Planlvlprograms other = (Planlvlprograms) object;
        if ((this.planID == null && other.planID != null) || (this.planID != null && !this.planID.equals(other.planID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Planlvlprograms[ planID=" + planID + " ]";
    }
    
}
