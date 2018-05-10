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
@Table(name = "MOOP", catalog = "eleo1db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Moop.findAll", query = "SELECT m FROM Moop m")
    , @NamedQuery(name = "Moop.findByPlanID", query = "SELECT m FROM Moop m WHERE m.planID = :planID")
    , @NamedQuery(name = "Moop.findByInnetMOOP", query = "SELECT m FROM Moop m WHERE m.innetMOOP = :innetMOOP")
    , @NamedQuery(name = "Moop.findByOutnetMOOP", query = "SELECT m FROM Moop m WHERE m.outnetMOOP = :outnetMOOP")})
public class Moop implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Plan_ID")
    private String planID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "In_net_MOOP")
    private BigDecimal innetMOOP;
    @Column(name = "Out_net_MOOP")
    private BigDecimal outnetMOOP;
    @JoinColumn(name = "Plan_ID", referencedColumnName = "HIOS_Plan_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Plan plan;

    public Moop() {
    }

    public Moop(String planID) {
        this.planID = planID;
    }

    public String getPlanID() {
        return planID;
    }

    public void setPlanID(String planID) {
        this.planID = planID;
    }

    public BigDecimal getInnetMOOP() {
        return innetMOOP;
    }

    public void setInnetMOOP(BigDecimal innetMOOP) {
        this.innetMOOP = innetMOOP;
    }

    public BigDecimal getOutnetMOOP() {
        return outnetMOOP;
    }

    public void setOutnetMOOP(BigDecimal outnetMOOP) {
        this.outnetMOOP = outnetMOOP;
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
        if (!(object instanceof Moop)) {
            return false;
        }
        Moop other = (Moop) object;
        if ((this.planID == null && other.planID != null) || (this.planID != null && !this.planID.equals(other.planID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Moop[ planID=" + planID + " ]";
    }
    
}
