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
@Table(name = "Out_of_pocket", catalog = "eleo1db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Outofpocket.findAll", query = "SELECT o FROM Outofpocket o")
    , @NamedQuery(name = "Outofpocket.findByPlanID", query = "SELECT o FROM Outofpocket o WHERE o.planID = :planID")
    , @NamedQuery(name = "Outofpocket.findByDefaultCoins", query = "SELECT o FROM Outofpocket o WHERE o.defaultCoins = :defaultCoins")
    , @NamedQuery(name = "Outofpocket.findByDefaultCopay", query = "SELECT o FROM Outofpocket o WHERE o.defaultCopay = :defaultCopay")
    , @NamedQuery(name = "Outofpocket.findByHsaHra", query = "SELECT o FROM Outofpocket o WHERE o.hsaHra = :hsaHra")})
public class Outofpocket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Plan_ID")
    private String planID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Default_Coins")
    private BigDecimal defaultCoins;
    @Basic(optional = false)
    @Column(name = "Default_Copay")
    private BigDecimal defaultCopay;
    @Basic(optional = false)
    @Column(name = "HSA_HRA")
    private String hsaHra;
    @JoinColumn(name = "Plan_ID", referencedColumnName = "HIOS_Plan_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Plan plan;

    public Outofpocket() {
    }

    public Outofpocket(String planID) {
        this.planID = planID;
    }

    public Outofpocket(String planID, BigDecimal defaultCoins, BigDecimal defaultCopay, String hsaHra) {
        this.planID = planID;
        this.defaultCoins = defaultCoins;
        this.defaultCopay = defaultCopay;
        this.hsaHra = hsaHra;
    }

    public String getPlanID() {
        return planID;
    }

    public void setPlanID(String planID) {
        this.planID = planID;
    }

    public BigDecimal getDefaultCoins() {
        return defaultCoins;
    }

    public void setDefaultCoins(BigDecimal defaultCoins) {
        this.defaultCoins = defaultCoins;
    }

    public BigDecimal getDefaultCopay() {
        return defaultCopay;
    }

    public void setDefaultCopay(BigDecimal defaultCopay) {
        this.defaultCopay = defaultCopay;
    }

    public String getHsaHra() {
        return hsaHra;
    }

    public void setHsaHra(String hsaHra) {
        this.hsaHra = hsaHra;
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
        if (!(object instanceof Outofpocket)) {
            return false;
        }
        Outofpocket other = (Outofpocket) object;
        if ((this.planID == null && other.planID != null) || (this.planID != null && !this.planID.equals(other.planID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Outofpocket[ planID=" + planID + " ]";
    }
    
}
