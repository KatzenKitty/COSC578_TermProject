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
@Table(name = "Exclusions", catalog = "eleo1db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Exclusions.findAll", query = "SELECT e FROM Exclusions e")
    , @NamedQuery(name = "Exclusions.findByBenefitservice", query = "SELECT e FROM Exclusions e WHERE e.exclusionsPK.benefitservice = :benefitservice")
    , @NamedQuery(name = "Exclusions.findByMOOPinexcl", query = "SELECT e FROM Exclusions e WHERE e.mOOPinexcl = :mOOPinexcl")
    , @NamedQuery(name = "Exclusions.findByMOOPoutexcl", query = "SELECT e FROM Exclusions e WHERE e.mOOPoutexcl = :mOOPoutexcl")
    , @NamedQuery(name = "Exclusions.findBySubjToDedExcl", query = "SELECT e FROM Exclusions e WHERE e.subjToDedExcl = :subjToDedExcl")
    , @NamedQuery(name = "Exclusions.findByPlanID", query = "SELECT e FROM Exclusions e WHERE e.exclusionsPK.planID = :planID")})
public class Exclusions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExclusionsPK exclusionsPK;
    @Column(name = "MOOP_in_excl")
    private String mOOPinexcl;
    @Column(name = "MOOP_out_excl")
    private String mOOPoutexcl;
    @Column(name = "subj_to_ded_excl")
    private String subjToDedExcl;
    @JoinColumn(name = "Benefit_service", referencedColumnName = "Bene_service", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Benefits benefits;
    @JoinColumn(name = "PlanID", referencedColumnName = "HIOS_Plan_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Plan plan;

    public Exclusions() {
    }

    public Exclusions(ExclusionsPK exclusionsPK) {
        this.exclusionsPK = exclusionsPK;
    }

    public Exclusions(String benefitservice, String planID) {
        this.exclusionsPK = new ExclusionsPK(benefitservice, planID);
    }

    public ExclusionsPK getExclusionsPK() {
        return exclusionsPK;
    }

    public void setExclusionsPK(ExclusionsPK exclusionsPK) {
        this.exclusionsPK = exclusionsPK;
    }

    public String getMOOPinexcl() {
        return mOOPinexcl;
    }

    public void setMOOPinexcl(String mOOPinexcl) {
        this.mOOPinexcl = mOOPinexcl;
    }

    public String getMOOPoutexcl() {
        return mOOPoutexcl;
    }

    public void setMOOPoutexcl(String mOOPoutexcl) {
        this.mOOPoutexcl = mOOPoutexcl;
    }

    public String getSubjToDedExcl() {
        return subjToDedExcl;
    }

    public void setSubjToDedExcl(String subjToDedExcl) {
        this.subjToDedExcl = subjToDedExcl;
    }

    public Benefits getBenefits() {
        return benefits;
    }

    public void setBenefits(Benefits benefits) {
        this.benefits = benefits;
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
        hash += (exclusionsPK != null ? exclusionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Exclusions)) {
            return false;
        }
        Exclusions other = (Exclusions) object;
        if ((this.exclusionsPK == null && other.exclusionsPK != null) || (this.exclusionsPK != null && !this.exclusionsPK.equals(other.exclusionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Exclusions[ exclusionsPK=" + exclusionsPK + " ]";
    }
    
}
