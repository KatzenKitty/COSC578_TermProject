package net.codejava.model;

public class Cost_sharing
{
	private String Plan_ID;
    private String CSRVariationType;
    private String Adv_payment;
    private String IssuerActuarialValue;

    public Cost_sharing(String Plan_ID, String CSRVariationType, String Adv_payment, String IssuerActuarialValue)
    {
        this.Plan_ID = Plan_ID;
        this.CSRVariationType = CSRVariationType;
        this.Adv_payment = Adv_payment;
        this.IssuerActuarialValue = IssuerActuarialValue;
		
    }

    public String getPlan_ID()
    {
        return Plan_ID;
    }

    public void  setPlan_ID(String Plan_ID)
    {
        this.Plan_ID = Plan_ID;
    }

    public String getCSRVariationType()
    {
        return CSRVariationType;
    }

    public void setCSRVariationType(String CSRVariationType)
    {
        this.CSRVariationType = CSRVariationType;
    }

    public String getAdv_payment()
    {
	return	Adv_payment;    }

    public void setAdv_payment(String Adv_payment)
    {
        this.Adv_payment = Adv_payment;
    }

    public String getIssuerActuarialValue()
    {
        return IssuerActuarialValue;
    }

    public void setIssuerActuarialValue(String IssuerActuarialValue)
    {
        this.IssuerActuarialValue = IssuerActuarialValue;
    }
	
	
}
