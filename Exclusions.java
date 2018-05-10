package net.codejava.model;

public class Exclusions
{
    private String Benefit_service;
    private String MOOP_in_excl;
    private String MOOP_out_excl;
    private String subj_to_ded_excl;
	private String PlanID;
	

    public Exclusions(String Benefit_service, String MOOP_in_excl, String MOOP_out_excl, String subj_to_ded_excl,String PlanID)
    {
        this.Benefit_service = Benefit_service;
        this.MOOP_in_excl = MOOP_in_excl;
        this.MOOP_out_excl = MOOP_out_excl;
        this.subj_to_ded_excl = subj_to_ded_excl;
		this.PlanID = PlanID;
		
    }

    public String getBenefit_service()
    {
        return Benefit_service;
    }

    public void setBenefit_service(String Benefit_service)
    {
        this.Benefit_service = Benefit_service;
    }

    public String getMOOP_in_excl()
    {
        return MOOP_in_excl;
    }

    public void setMOOP_in_excl(String MOOP_in_excl)
    {
        this.MOOP_in_excl = MOOP_in_excl;
    }

    public String getMOOP_out_excl()
    {
        return MOOP_out_excl;
    }

    public void setMOOP_out_excl(String MOOP_out_excl)
    {
        this.MOOP_out_excl = MOOP_out_excl;
    }

    public String getsubj_to_ded_excl()
    {
        return subj_to_ded_excl;
    }

    public void setsubj_to_ded_excl(String subj_to_ded_excl)
    {
        this.subj_to_ded_excl = subj_to_ded_excl;
    }
	
	public String getPlanID()
	{
		return PlanID;
	}
	
	public void setPlanID(String PlanID)
	{
		this.PlanID = PlanID;
	}
	
}
