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
public class BenefitsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Plan_ID")
    private String planID;
    @Basic(optional = false)
    @Column(name = "Bene_service")
    private String beneservice;

    public BenefitsPK() {
    }

    public BenefitsPK(String planID, String beneservice) {
        this.planID = planID;
        this.beneservice = beneservice;
    }

    public String getPlanID() {
        return planID;
    }

    public void setPlanID(String planID) {
        this.planID = planID;
    }

    public String getBeneservice() {
        return beneservice;
    }

    public void setBeneservice(String beneservice) {
        this.beneservice = beneservice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (planID != null ? planID.hashCode() : 0);
        hash += (beneservice != null ? beneservice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BenefitsPK)) {
            return false;
        }
        BenefitsPK other = (BenefitsPK) object;
        if ((this.planID == null && other.planID != null) || (this.planID != null && !this.planID.equals(other.planID))) {
            return false;
        }
        if ((this.beneservice == null && other.beneservice != null) || (this.beneservice != null && !this.beneservice.equals(other.beneservice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.BenefitsPK[ planID=" + planID + ", beneservice=" + beneservice + " ]";
    }
    
}
