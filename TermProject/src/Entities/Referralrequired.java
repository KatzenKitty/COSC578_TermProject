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
@Table(name = "Referral_required", catalog = "eleo1db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Referralrequired.findAll", query = "SELECT r FROM Referralrequired r")
    , @NamedQuery(name = "Referralrequired.findByPlanID", query = "SELECT r FROM Referralrequired r WHERE r.planID = :planID")
    , @NamedQuery(name = "Referralrequired.findBySpecialistsreqref", query = "SELECT r FROM Referralrequired r WHERE r.specialistsreqref = :specialistsreqref")
    , @NamedQuery(name = "Referralrequired.findByRefreq", query = "SELECT r FROM Referralrequired r WHERE r.refreq = :refreq")})
public class Referralrequired implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Plan_ID")
    private String planID;
    @Column(name = "Specialists_req_ref")
    private String specialistsreqref;
    @Column(name = "Ref_req")
    private String refreq;
    @JoinColumn(name = "Plan_ID", referencedColumnName = "HIOS_Plan_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Plan plan;

    public Referralrequired() {
    }

    public Referralrequired(String planID) {
        this.planID = planID;
    }

    public String getPlanID() {
        return planID;
    }

    public void setPlanID(String planID) {
        this.planID = planID;
    }

    public String getSpecialistsreqref() {
        return specialistsreqref;
    }

    public void setSpecialistsreqref(String specialistsreqref) {
        this.specialistsreqref = specialistsreqref;
    }

    public String getRefreq() {
        return refreq;
    }

    public void setRefreq(String refreq) {
        this.refreq = refreq;
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
        if (!(object instanceof Referralrequired)) {
            return false;
        }
        Referralrequired other = (Referralrequired) object;
        if ((this.planID == null && other.planID != null) || (this.planID != null && !this.planID.equals(other.planID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Referralrequired[ planID=" + planID + " ]";
    }
    
}
