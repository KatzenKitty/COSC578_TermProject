/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author nunya
 */
@Entity
@Table(name = "Benefits", catalog = "eleo1db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Benefits.findAll", query = "SELECT b FROM Benefits b")
    , @NamedQuery(name = "Benefits.findByPlanID", query = "SELECT b FROM Benefits b WHERE b.benefitsPK.planID = :planID")
    , @NamedQuery(name = "Benefits.findByBeneservice", query = "SELECT b FROM Benefits b WHERE b.benefitsPK.beneservice = :beneservice")
    , @NamedQuery(name = "Benefits.findByCoveredflag", query = "SELECT b FROM Benefits b WHERE b.coveredflag = :coveredflag")
    , @NamedQuery(name = "Benefits.findByEHBFlag", query = "SELECT b FROM Benefits b WHERE b.eHBFlag = :eHBFlag")
    , @NamedQuery(name = "Benefits.findByEHBVarianceReason", query = "SELECT b FROM Benefits b WHERE b.eHBVarianceReason = :eHBVarianceReason")
    , @NamedQuery(name = "Benefits.findByQuantServLimit", query = "SELECT b FROM Benefits b WHERE b.quantServLimit = :quantServLimit")
    , @NamedQuery(name = "Benefits.findByBenedescrip", query = "SELECT b FROM Benefits b WHERE b.benedescrip = :benedescrip")})
public class Benefits implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BenefitsPK benefitsPK;
    @Basic(optional = false)
    @Column(name = "Covered_flag")
    private String coveredflag;
    @Basic(optional = false)
    @Column(name = "EHB_Flag")
    private String eHBFlag;
    @Column(name = "EHB_Variance_Reason")
    private String eHBVarianceReason;
    @Column(name = "Quant_Serv_Limit")
    private String quantServLimit;
    @Column(name = "Bene_descrip")
    private String benedescrip;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "benefits")
    private Collection<Exclusions> exclusionsCollection;
    @JoinColumn(name = "Plan_ID", referencedColumnName = "HIOS_Plan_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Plan plan;

    public Benefits() {
    }

    public Benefits(BenefitsPK benefitsPK) {
        this.benefitsPK = benefitsPK;
    }

    public Benefits(BenefitsPK benefitsPK, String coveredflag, String eHBFlag) {
        this.benefitsPK = benefitsPK;
        this.coveredflag = coveredflag;
        this.eHBFlag = eHBFlag;
    }

    public Benefits(String planID, String beneservice) {
        this.benefitsPK = new BenefitsPK(planID, beneservice);
    }

    public BenefitsPK getBenefitsPK() {
        return benefitsPK;
    }

    public void setBenefitsPK(BenefitsPK benefitsPK) {
        this.benefitsPK = benefitsPK;
    }

    public String getCoveredflag() {
        return coveredflag;
    }

    public void setCoveredflag(String coveredflag) {
        this.coveredflag = coveredflag;
    }

    public String getEHBFlag() {
        return eHBFlag;
    }

    public void setEHBFlag(String eHBFlag) {
        this.eHBFlag = eHBFlag;
    }

    public String getEHBVarianceReason() {
        return eHBVarianceReason;
    }

    public void setEHBVarianceReason(String eHBVarianceReason) {
        this.eHBVarianceReason = eHBVarianceReason;
    }

    public String getQuantServLimit() {
        return quantServLimit;
    }

    public void setQuantServLimit(String quantServLimit) {
        this.quantServLimit = quantServLimit;
    }

    public String getBenedescrip() {
        return benedescrip;
    }

    public void setBenedescrip(String benedescrip) {
        this.benedescrip = benedescrip;
    }

    @XmlTransient
    public Collection<Exclusions> getExclusionsCollection() {
        return exclusionsCollection;
    }

    public void setExclusionsCollection(Collection<Exclusions> exclusionsCollection) {
        this.exclusionsCollection = exclusionsCollection;
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
        hash += (benefitsPK != null ? benefitsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Benefits)) {
            return false;
        }
        Benefits other = (Benefits) object;
        if ((this.benefitsPK == null && other.benefitsPK != null) || (this.benefitsPK != null && !this.benefitsPK.equals(other.benefitsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Benefits[ benefitsPK=" + benefitsPK + " ]";
    }
    
}
