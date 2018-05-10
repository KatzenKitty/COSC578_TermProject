/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "Cost_sharing", catalog = "eleo1db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Costsharing.findAll", query = "SELECT c FROM Costsharing c")
    , @NamedQuery(name = "Costsharing.findByPlanID", query = "SELECT c FROM Costsharing c WHERE c.planID = :planID")
    , @NamedQuery(name = "Costsharing.findByCSRVariationType", query = "SELECT c FROM Costsharing c WHERE c.cSRVariationType = :cSRVariationType")
    , @NamedQuery(name = "Costsharing.findByAdvpayment", query = "SELECT c FROM Costsharing c WHERE c.advpayment = :advpayment")
    , @NamedQuery(name = "Costsharing.findByIssuerActuarialValue", query = "SELECT c FROM Costsharing c WHERE c.issuerActuarialValue = :issuerActuarialValue")})
public class Costsharing implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Plan_ID")
    private String planID;
    @Column(name = "CSRVariationType")
    private String cSRVariationType;
    @Column(name = "Adv_payment")
    private String advpayment;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "IssuerActuarialValue")
    private BigDecimal issuerActuarialValue;
    @JoinColumn(name = "Plan_ID", referencedColumnName = "HIOS_Plan_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Plan plan;

    public Costsharing() {
    }

    public Costsharing(String planID) {
        this.planID = planID;
    }

    public String getPlanID() {
        return planID;
    }

    public void setPlanID(String planID) {
        this.planID = planID;
    }

    public String getCSRVariationType() {
        return cSRVariationType;
    }

    public void setCSRVariationType(String cSRVariationType) {
        this.cSRVariationType = cSRVariationType;
    }

    public String getAdvpayment() {
        return advpayment;
    }

    public void setAdvpayment(String advpayment) {
        this.advpayment = advpayment;
    }

    public BigDecimal getIssuerActuarialValue() {
        return issuerActuarialValue;
    }

    public void setIssuerActuarialValue(BigDecimal issuerActuarialValue) {
        this.issuerActuarialValue = issuerActuarialValue;
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
        if (!(object instanceof Costsharing)) {
            return false;
        }
        Costsharing other = (Costsharing) object;
        if ((this.planID == null && other.planID != null) || (this.planID != null && !this.planID.equals(other.planID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Costsharing[ planID=" + planID + " ]";
    }
    
}
