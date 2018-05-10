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
@Table(name = "In_network_deductible", catalog = "eleo1db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Innetworkdeductible.findAll", query = "SELECT i FROM Innetworkdeductible i")
    , @NamedQuery(name = "Innetworkdeductible.findByPlanID", query = "SELECT i FROM Innetworkdeductible i WHERE i.planID = :planID")
    , @NamedQuery(name = "Innetworkdeductible.findByInnetpeddentdeduct", query = "SELECT i FROM Innetworkdeductible i WHERE i.innetpeddentdeduct = :innetpeddentdeduct")
    , @NamedQuery(name = "Innetworkdeductible.findByInnetmed", query = "SELECT i FROM Innetworkdeductible i WHERE i.innetmed = :innetmed")
    , @NamedQuery(name = "Innetworkdeductible.findByInnetworkdrug", query = "SELECT i FROM Innetworkdeductible i WHERE i.innetworkdrug = :innetworkdrug")
    , @NamedQuery(name = "Innetworkdeductible.findByCombinedDeductFlag", query = "SELECT i FROM Innetworkdeductible i WHERE i.combinedDeductFlag = :combinedDeductFlag")
    , @NamedQuery(name = "Innetworkdeductible.findByInnetcombined", query = "SELECT i FROM Innetworkdeductible i WHERE i.innetcombined = :innetcombined")})
public class Innetworkdeductible implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Plan_ID")
    private String planID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "In_net_ped_dent_deduct")
    private BigDecimal innetpeddentdeduct;
    @Column(name = "In_net_med")
    private BigDecimal innetmed;
    @Column(name = "In_network_drug")
    private BigDecimal innetworkdrug;
    @Column(name = "combined_deduct_flag")
    private String combinedDeductFlag;
    @Column(name = "In_net_combined")
    private BigDecimal innetcombined;
    @JoinColumn(name = "Plan_ID", referencedColumnName = "HIOS_Plan_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Plan plan;

    public Innetworkdeductible() {
    }

    public Innetworkdeductible(String planID) {
        this.planID = planID;
    }

    public String getPlanID() {
        return planID;
    }

    public void setPlanID(String planID) {
        this.planID = planID;
    }

    public BigDecimal getInnetpeddentdeduct() {
        return innetpeddentdeduct;
    }

    public void setInnetpeddentdeduct(BigDecimal innetpeddentdeduct) {
        this.innetpeddentdeduct = innetpeddentdeduct;
    }

    public BigDecimal getInnetmed() {
        return innetmed;
    }

    public void setInnetmed(BigDecimal innetmed) {
        this.innetmed = innetmed;
    }

    public BigDecimal getInnetworkdrug() {
        return innetworkdrug;
    }

    public void setInnetworkdrug(BigDecimal innetworkdrug) {
        this.innetworkdrug = innetworkdrug;
    }

    public String getCombinedDeductFlag() {
        return combinedDeductFlag;
    }

    public void setCombinedDeductFlag(String combinedDeductFlag) {
        this.combinedDeductFlag = combinedDeductFlag;
    }

    public BigDecimal getInnetcombined() {
        return innetcombined;
    }

    public void setInnetcombined(BigDecimal innetcombined) {
        this.innetcombined = innetcombined;
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
        if (!(object instanceof Innetworkdeductible)) {
            return false;
        }
        Innetworkdeductible other = (Innetworkdeductible) object;
        if ((this.planID == null && other.planID != null) || (this.planID != null && !this.planID.equals(other.planID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Innetworkdeductible[ planID=" + planID + " ]";
    }
    
}
