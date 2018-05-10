package model;

public class Service_cost
{
    private String Benefit_service;
    private String Copay;
    private String Coinsurance;
    private String PlanID;

    public Service_cost( String Benefit_service, String Copay, String Coinsurance,String PlanID)
    {
        
        this.Benefit_service = Benefit_service;
        this.Copay = Copay;
        this.Coinsurance = Coinsurance;
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

    public String getCopay()
    {
		return Copay  ;
	}

    public void setCopay(String Copay)
    {
        this.Copay = Copay;
    }

    public String getCoinsurance()
    {
        return Coinsurance;
    }

    public void setCoinsurance(String Coinsurance)
    {
        this.Coinsurance = Coinsurance;
    }
	
	public String getPlan_ID()
    {
        return PlanID;
    }

    public void  setPlan_ID(String Plan_ID)
    {
        this.PlanID = PlanID;
    }
}
