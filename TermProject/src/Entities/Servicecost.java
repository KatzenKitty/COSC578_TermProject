/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nunya
 */
@Entity
@Table(name = "Service_cost", catalog = "eleo1db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servicecost.findAll", query = "SELECT s FROM Servicecost s")
    , @NamedQuery(name = "Servicecost.findByBenefitservice", query = "SELECT s FROM Servicecost s WHERE s.servicecostPK.benefitservice = :benefitservice")
    , @NamedQuery(name = "Servicecost.findByCopay", query = "SELECT s FROM Servicecost s WHERE s.copay = :copay")
    , @NamedQuery(name = "Servicecost.findByCoinsurance", query = "SELECT s FROM Servicecost s WHERE s.coinsurance = :coinsurance")
    , @NamedQuery(name = "Servicecost.findByPlanID", query = "SELECT s FROM Servicecost s WHERE s.servicecostPK.planID = :planID")})
public class Servicecost implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ServicecostPK servicecostPK;
    @Column(name = "Copay")
    private String copay;
    @Column(name = "Coinsurance")
    private String coinsurance;
    @JoinColumn(name = "PlanID", referencedColumnName = "HIOS_Plan_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Plan plan;

    public Servicecost() {
    }

    public Servicecost(ServicecostPK servicecostPK) {
        this.servicecostPK = servicecostPK;
    }

    public Servicecost(String benefitservice, String planID) {
        this.servicecostPK = new ServicecostPK(benefitservice, planID);
    }

    public ServicecostPK getServicecostPK() {
        return servicecostPK;
    }

    public void setServicecostPK(ServicecostPK servicecostPK) {
        this.servicecostPK = servicecostPK;
    }

    public String getCopay() {
        return copay;
    }

    public void setCopay(String copay) {
        this.copay = copay;
    }

    public String getCoinsurance() {
        return coinsurance;
    }

    public void setCoinsurance(String coinsurance) {
        this.coinsurance = coinsurance;
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
        hash += (servicecostPK != null ? servicecostPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicecost)) {
            return false;
        }
        Servicecost other = (Servicecost) object;
        if ((this.servicecostPK == null && other.servicecostPK != null) || (this.servicecostPK != null && !this.servicecostPK.equals(other.servicecostPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Servicecost[ servicecostPK=" + servicecostPK + " ]";
    }
    
}
