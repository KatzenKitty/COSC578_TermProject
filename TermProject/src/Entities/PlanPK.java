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
public class PlanPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "HIOS_Plan_ID")
    private String hIOSPlanID;
    @Basic(optional = false)
    @Column(name = "Issuer_ID")
    private int issuerID;

    public PlanPK() {
    }

    public PlanPK(String hIOSPlanID, int issuerID) {
        this.hIOSPlanID = hIOSPlanID;
        this.issuerID = issuerID;
    }

    public String getHIOSPlanID() {
        return hIOSPlanID;
    }

    public void setHIOSPlanID(String hIOSPlanID) {
        this.hIOSPlanID = hIOSPlanID;
    }

    public int getIssuerID() {
        return issuerID;
    }

    public void setIssuerID(int issuerID) {
        this.issuerID = issuerID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hIOSPlanID != null ? hIOSPlanID.hashCode() : 0);
        hash += (int) issuerID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanPK)) {
            return false;
        }
        PlanPK other = (PlanPK) object;
        if ((this.hIOSPlanID == null && other.hIOSPlanID != null) || (this.hIOSPlanID != null && !this.hIOSPlanID.equals(other.hIOSPlanID))) {
            return false;
        }
        if (this.issuerID != other.issuerID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.PlanPK[ hIOSPlanID=" + hIOSPlanID + ", issuerID=" + issuerID + " ]";
    }
    
}
