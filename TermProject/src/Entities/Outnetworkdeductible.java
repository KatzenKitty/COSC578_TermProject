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
@Table(name = "Out_network_deductible", catalog = "eleo1db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Outnetworkdeductible.findAll", query = "SELECT o FROM Outnetworkdeductible o")
    , @NamedQuery(name = "Outnetworkdeductible.findByPlanID", query = "SELECT o FROM Outnetworkdeductible o WHERE o.planID = :planID")
    , @NamedQuery(name = "Outnetworkdeductible.findByOutpeddentdeduct", query = "SELECT o FROM Outnetworkdeductible o WHERE o.outpeddentdeduct = :outpeddentdeduct")
    , @NamedQuery(name = "Outnetworkdeductible.findByOutnetcombined", query = "SELECT o FROM Outnetworkdeductible o WHERE o.outnetcombined = :outnetcombined")
    , @NamedQuery(name = "Outnetworkdeductible.findByOutnetmedical", query = "SELECT o FROM Outnetworkdeductible o WHERE o.outnetmedical = :outnetmedical")
    , @NamedQuery(name = "Outnetworkdeductible.findByCombinedDeductFlag", query = "SELECT o FROM Outnetworkdeductible o WHERE o.combinedDeductFlag = :combinedDeductFlag")
    , @NamedQuery(name = "Outnetworkdeductible.findByOutnetdrug", query = "SELECT o FROM Outnetworkdeductible o WHERE o.outnetdrug = :outnetdrug")})
public class Outnetworkdeductible implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Plan_ID")
    private String planID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Out_ped_dent_deduct")
    private BigDecimal outpeddentdeduct;
    @Column(name = "Out_net_combined")
    private BigDecimal outnetcombined;
    @Column(name = "Out_net_medical")
    private BigDecimal outnetmedical;
    @Column(name = "combined_deduct_flag")
    private String combinedDeductFlag;
    @Column(name = "Out_net_drug")
    private BigDecimal outnetdrug;
    @JoinColumn(name = "Plan_ID", referencedColumnName = "HIOS_Plan_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Plan plan;

    public Outnetworkdeductible() {
    }

    public Outnetworkdeductible(String planID) {
        this.planID = planID;
    }

    public String getPlanID() {
        return planID;
    }

    public void setPlanID(String planID) {
        this.planID = planID;
    }

    public BigDecimal getOutpeddentdeduct() {
        return outpeddentdeduct;
    }

    public void setOutpeddentdeduct(BigDecimal outpeddentdeduct) {
        this.outpeddentdeduct = outpeddentdeduct;
    }

    public BigDecimal getOutnetcombined() {
        return outnetcombined;
    }

    public void setOutnetcombined(BigDecimal outnetcombined) {
        this.outnetcombined = outnetcombined;
    }

    public BigDecimal getOutnetmedical() {
        return outnetmedical;
    }

    public void setOutnetmedical(BigDecimal outnetmedical) {
        this.outnetmedical = outnetmedical;
    }

    public String getCombinedDeductFlag() {
        return combinedDeductFlag;
    }

    public void setCombinedDeductFlag(String combinedDeductFlag) {
        this.combinedDeductFlag = combinedDeductFlag;
    }

    public BigDecimal getOutnetdrug() {
        return outnetdrug;
    }

    public void setOutnetdrug(BigDecimal outnetdrug) {
        this.outnetdrug = outnetdrug;
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
        if (!(object instanceof Outnetworkdeductible)) {
            return false;
        }
        Outnetworkdeductible other = (Outnetworkdeductible) object;
        if ((this.planID == null && other.planID != null) || (this.planID != null && !this.planID.equals(other.planID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Outnetworkdeductible[ planID=" + planID + " ]";
    }
    
}
