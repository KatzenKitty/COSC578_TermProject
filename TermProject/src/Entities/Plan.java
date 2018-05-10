/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author nunya
 */
@Entity
@Table(name = "Plan", catalog = "eleo1db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Plan.findAll", query = "SELECT p FROM Plan p")
    , @NamedQuery(name = "Plan.findByHIOSPlanID", query = "SELECT p FROM Plan p WHERE p.planPK.hIOSPlanID = :hIOSPlanID")
    , @NamedQuery(name = "Plan.findByPlanURL", query = "SELECT p FROM Plan p WHERE p.planURL = :planURL")
    , @NamedQuery(name = "Plan.findByPlantype", query = "SELECT p FROM Plan p WHERE p.plantype = :plantype")
    , @NamedQuery(name = "Plan.findByQHPStatus", query = "SELECT p FROM Plan p WHERE p.qHPStatus = :qHPStatus")
    , @NamedQuery(name = "Plan.findByStatus", query = "SELECT p FROM Plan p WHERE p.status = :status")
    , @NamedQuery(name = "Plan.findByPlanname", query = "SELECT p FROM Plan p WHERE p.planname = :planname")
    , @NamedQuery(name = "Plan.findByMetallvl", query = "SELECT p FROM Plan p WHERE p.metallvl = :metallvl")
    , @NamedQuery(name = "Plan.findByChildonlyplanflag", query = "SELECT p FROM Plan p WHERE p.childonlyplanflag = :childonlyplanflag")
    , @NamedQuery(name = "Plan.findByChildonlyplanID", query = "SELECT p FROM Plan p WHERE p.childonlyplanID = :childonlyplanID")
    , @NamedQuery(name = "Plan.findByServiceArea", query = "SELECT p FROM Plan p WHERE p.serviceArea = :serviceArea")
    , @NamedQuery(name = "Plan.findByEHBPercPremium", query = "SELECT p FROM Plan p WHERE p.eHBPercPremium = :eHBPercPremium")
    , @NamedQuery(name = "Plan.findByIssuerID", query = "SELECT p FROM Plan p WHERE p.planPK.issuerID = :issuerID")})
public class Plan implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PlanPK planPK;
    @Basic(optional = false)
    @Column(name = "Plan_URL")
    private String planURL;
    @Basic(optional = false)
    @Column(name = "Plan_type")
    private String plantype;
    @Basic(optional = false)
    @Column(name = "QHP_Status")
    private String qHPStatus;
    @Basic(optional = false)
    @Column(name = "Status")
    private String status;
    @Column(name = "Plan_name")
    private String planname;
    @Basic(optional = false)
    @Column(name = "Metal_lvl")
    private String metallvl;
    @Basic(optional = false)
    @Column(name = "Child_only_plan_flag")
    private String childonlyplanflag;
    @Column(name = "Child_only_plan_ID")
    private Integer childonlyplanID;
    @Basic(optional = false)
    @Column(name = "Service_Area")
    private String serviceArea;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "EHB_Perc_Premium")
    private BigDecimal eHBPercPremium;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "plan")
    private Costsharing costsharing;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "plan")
    private Planlvlprograms planlvlprograms;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plan")
    private Collection<Exclusions> exclusionsCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "plan")
    private Moop moop;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "plan")
    private Dates dates;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plan")
    private Collection<Premium> premiumCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plan")
    private Collection<Benefits> benefitsCollection;
    @JoinColumn(name = "Issuer_ID", referencedColumnName = "HIOS_Issuer_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Provider provider;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plan")
    private Collection<Servicecost> servicecostCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "plan")
    private Innetworkdeductible innetworkdeductible;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "plan")
    private Referralrequired referralrequired;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "plan")
    private Outofpocket outofpocket;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "plan")
    private Outnetworkdeductible outnetworkdeductible;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "plan")
    private Geocovarage geocovarage;

    public Plan() {
    }

    public Plan(PlanPK planPK) {
        this.planPK = planPK;
    }

    public Plan(PlanPK planPK, String planURL, String plantype, String qHPStatus, String status, String metallvl, String childonlyplanflag, String serviceArea, BigDecimal eHBPercPremium) {
        this.planPK = planPK;
        this.planURL = planURL;
        this.plantype = plantype;
        this.qHPStatus = qHPStatus;
        this.status = status;
        this.metallvl = metallvl;
        this.childonlyplanflag = childonlyplanflag;
        this.serviceArea = serviceArea;
        this.eHBPercPremium = eHBPercPremium;
    }

    public Plan(String hIOSPlanID, int issuerID) {
        this.planPK = new PlanPK(hIOSPlanID, issuerID);
    }

    public PlanPK getPlanPK() {
        return planPK;
    }

    public void setPlanPK(PlanPK planPK) {
        this.planPK = planPK;
    }

    public String getPlanURL() {
        return planURL;
    }

    public void setPlanURL(String planURL) {
        this.planURL = planURL;
    }

    public String getPlantype() {
        return plantype;
    }

    public void setPlantype(String plantype) {
        this.plantype = plantype;
    }

    public String getQHPStatus() {
        return qHPStatus;
    }

    public void setQHPStatus(String qHPStatus) {
        this.qHPStatus = qHPStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPlanname() {
        return planname;
    }

    public void setPlanname(String planname) {
        this.planname = planname;
    }

    public String getMetallvl() {
        return metallvl;
    }

    public void setMetallvl(String metallvl) {
        this.metallvl = metallvl;
    }

    public String getChildonlyplanflag() {
        return childonlyplanflag;
    }

    public void setChildonlyplanflag(String childonlyplanflag) {
        this.childonlyplanflag = childonlyplanflag;
    }

    public Integer getChildonlyplanID() {
        return childonlyplanID;
    }

    public void setChildonlyplanID(Integer childonlyplanID) {
        this.childonlyplanID = childonlyplanID;
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public BigDecimal getEHBPercPremium() {
        return eHBPercPremium;
    }

    public void setEHBPercPremium(BigDecimal eHBPercPremium) {
        this.eHBPercPremium = eHBPercPremium;
    }

    public Costsharing getCostsharing() {
        return costsharing;
    }

    public void setCostsharing(Costsharing costsharing) {
        this.costsharing = costsharing;
    }

    public Planlvlprograms getPlanlvlprograms() {
        return planlvlprograms;
    }

    public void setPlanlvlprograms(Planlvlprograms planlvlprograms) {
        this.planlvlprograms = planlvlprograms;
    }

    @XmlTransient
    public Collection<Exclusions> getExclusionsCollection() {
        return exclusionsCollection;
    }

    public void setExclusionsCollection(Collection<Exclusions> exclusionsCollection) {
        this.exclusionsCollection = exclusionsCollection;
    }

    public Moop getMoop() {
        return moop;
    }

    public void setMoop(Moop moop) {
        this.moop = moop;
    }

    public Dates getDates() {
        return dates;
    }

    public void setDates(Dates dates) {
        this.dates = dates;
    }

    @XmlTransient
    public Collection<Premium> getPremiumCollection() {
        return premiumCollection;
    }

    public void setPremiumCollection(Collection<Premium> premiumCollection) {
        this.premiumCollection = premiumCollection;
    }

    @XmlTransient
    public Collection<Benefits> getBenefitsCollection() {
        return benefitsCollection;
    }

    public void setBenefitsCollection(Collection<Benefits> benefitsCollection) {
        this.benefitsCollection = benefitsCollection;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    @XmlTransient
    public Collection<Servicecost> getServicecostCollection() {
        return servicecostCollection;
    }

    public void setServicecostCollection(Collection<Servicecost> servicecostCollection) {
        this.servicecostCollection = servicecostCollection;
    }

    public Innetworkdeductible getInnetworkdeductible() {
        return innetworkdeductible;
    }

    public void setInnetworkdeductible(Innetworkdeductible innetworkdeductible) {
        this.innetworkdeductible = innetworkdeductible;
    }

    public Referralrequired getReferralrequired() {
        return referralrequired;
    }

    public void setReferralrequired(Referralrequired referralrequired) {
        this.referralrequired = referralrequired;
    }

    public Outofpocket getOutofpocket() {
        return outofpocket;
    }

    public void setOutofpocket(Outofpocket outofpocket) {
        this.outofpocket = outofpocket;
    }

    public Outnetworkdeductible getOutnetworkdeductible() {
        return outnetworkdeductible;
    }

    public void setOutnetworkdeductible(Outnetworkdeductible outnetworkdeductible) {
        this.outnetworkdeductible = outnetworkdeductible;
    }

    public Geocovarage getGeocovarage() {
        return geocovarage;
    }

    public void setGeocovarage(Geocovarage geocovarage) {
        this.geocovarage = geocovarage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (planPK != null ? planPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plan)) {
            return false;
        }
        Plan other = (Plan) object;
        if ((this.planPK == null && other.planPK != null) || (this.planPK != null && !this.planPK.equals(other.planPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Plan[ planPK=" + planPK + " ]";
    }
    
}
