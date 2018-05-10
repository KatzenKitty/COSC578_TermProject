package model;

public class Out_of_pocket
{
	private String Plan_ID;
    private float Default_Coins;
    private float Default_Copay;
    private String HSA_HRA;

    public Out_of_pocket(String Plan_ID, float Default_Coins, float Default_Copay, String HSA_HRA)
    {
        this.Plan_ID = Plan_ID;
        this.Default_Coins = Default_Coins;
        this.Default_Copay = Default_Copay;
        this.HSA_HRA = HSA_HRA;
		
    }

    public String getPlan_ID()
    {
        return Plan_ID;
    }

    public void  setPlan_ID(String Plan_ID)
    {
        this.Plan_ID = Plan_ID;
    }

    public float getDefault_Coins()
    {
        return Default_Coins;
    }

    public void setDefault_Coins(float Default_Coins)
    {
        this.Default_Coins = Default_Coins;
    }

    public float getDefault_Copay()
    {
	return	Default_Copay ;  }

    public void setDefault_Copay(float Default_Copay)
    {
        this.Default_Copay = Default_Copay;
    }

    public String getHSA_HRA()
    {
        return HSA_HRA;
    }

    public void setHSA_HRA(String HSA_HRA)
    {
        this.HSA_HRA = HSA_HRA;
    }
	
	
}
