/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author nunya
 */
@Embeddable
public class PremiumPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Plan_ID")
    private String planID;
    @Basic(optional = false)
    @Column(name = "Age_Range")
    private String ageRange;

    public PremiumPK() {
    }

    public PremiumPK(String planID, String ageRange) {
        this.planID = planID;
        this.ageRange = ageRange;
    }

    public String getPlanID() {
        return planID;
    }

    public void setPlanID(String planID) {
        this.planID = planID;
    }

    public String getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (planID != null ? planID.hashCode() : 0);
        hash += (ageRange != null ? ageRange.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PremiumPK)) {
            return false;
        }
        PremiumPK other = (PremiumPK) object;
        if ((this.planID == null && other.planID != null) || (this.planID != null && !this.planID.equals(other.planID))) {
            return false;
        }
        if ((this.ageRange == null && other.ageRange != null) || (this.ageRange != null && !this.ageRange.equals(other.ageRange))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.PremiumPK[ planID=" + planID + ", ageRange=" + ageRange + " ]";
    }
    
}
