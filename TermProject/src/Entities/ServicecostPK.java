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
public class ServicecostPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Benefit_service")
    private String benefitservice;
    @Basic(optional = false)
    @Column(name = "PlanID")
    private String planID;

    public ServicecostPK() {
    }

    public ServicecostPK(String benefitservice, String planID) {
        this.benefitservice = benefitservice;
        this.planID = planID;
    }

    public String getBenefitservice() {
        return benefitservice;
    }

    public void setBenefitservice(String benefitservice) {
        this.benefitservice = benefitservice;
    }

    public String getPlanID() {
        return planID;
    }

    public void setPlanID(String planID) {
        this.planID = planID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (benefitservice != null ? benefitservice.hashCode() : 0);
        hash += (planID != null ? planID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServicecostPK)) {
            return false;
        }
        ServicecostPK other = (ServicecostPK) object;
        if ((this.benefitservice == null && other.benefitservice != null) || (this.benefitservice != null && !this.benefitservice.equals(other.benefitservice))) {
            return false;
        }
        if ((this.planID == null && other.planID != null) || (this.planID != null && !this.planID.equals(other.planID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.ServicecostPK[ benefitservice=" + benefitservice + ", planID=" + planID + " ]";
    }
    
}
