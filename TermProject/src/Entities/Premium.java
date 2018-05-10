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
@Table(name = "Premium", catalog = "eleo1db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Premium.findAll", query = "SELECT p FROM Premium p")
    , @NamedQuery(name = "Premium.findByPlanID", query = "SELECT p FROM Premium p WHERE p.premiumPK.planID = :planID")
    , @NamedQuery(name = "Premium.findByIndivRate", query = "SELECT p FROM Premium p WHERE p.indivRate = :indivRate")
    , @NamedQuery(name = "Premium.findByAgeRange", query = "SELECT p FROM Premium p WHERE p.premiumPK.ageRange = :ageRange")})
public class Premium implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PremiumPK premiumPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Indiv_Rate")
    private BigDecimal indivRate;
    @JoinColumn(name = "Plan_ID", referencedColumnName = "HIOS_Plan_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Plan plan;

    public Premium() {
    }

    public Premium(PremiumPK premiumPK) {
        this.premiumPK = premiumPK;
    }

    public Premium(PremiumPK premiumPK, BigDecimal indivRate) {
        this.premiumPK = premiumPK;
        this.indivRate = indivRate;
    }

    public Premium(String planID, String ageRange) {
        this.premiumPK = new PremiumPK(planID, ageRange);
    }

    public PremiumPK getPremiumPK() {
        return premiumPK;
    }

    public void setPremiumPK(PremiumPK premiumPK) {
        this.premiumPK = premiumPK;
    }

    public BigDecimal getIndivRate() {
        return indivRate;
    }

    public void setIndivRate(BigDecimal indivRate) {
        this.indivRate = indivRate;
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
        hash += (premiumPK != null ? premiumPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Premium)) {
            return false;
        }
        Premium other = (Premium) object;
        if ((this.premiumPK == null && other.premiumPK != null) || (this.premiumPK != null && !this.premiumPK.equals(other.premiumPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Premium[ premiumPK=" + premiumPK + " ]";
    }
    
}
