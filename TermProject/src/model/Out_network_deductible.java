package model;

public class Out_network_deductible
{
    private String Plan_ID;
    private float Out_ped_dent_deduct;
    private float Out_net_combined;
    private float Out_net_medical;
    private String combined_deduct_flag;
    private float Out_net_drug;
	
    public Out_network_deductible(String Plan_ID, float Out_ped_dent_deduct, float Out_net_combined, float Out_net_medical,String combined_deduct_flag, float Out_net_drug)
    {
        this.Plan_ID = Plan_ID;
        this.Out_ped_dent_deduct = Out_ped_dent_deduct;
        this.Out_net_combined = Out_net_combined;
        this.Out_net_medical = Out_net_medical;
	this.combined_deduct_flag = combined_deduct_flag;
	this.Out_net_drug = Out_net_drug;
    }

    public String getPlan_ID()
    {
        return Plan_ID;
    }

    public void  setPlan_ID(String Plan_ID)
    {
        this.Plan_ID = Plan_ID;
    }

    public float getOut_ped_dent_deduct()
    {
        return Out_ped_dent_deduct;
    }

    public void setOut_ped_dent_deduct(float Out_ped_dent_deduct)
    {
        this.Out_ped_dent_deduct = Out_ped_dent_deduct;
    }

    public float getOut_net_combined()
    {
        return Out_net_combined;
    }

    public void setOut_net_combined(float Out_net_combined)
    {
        this.Out_net_combined = Out_net_combined;
    }

    public float getOut_net_medical()
    {
        return Out_net_medical;
    }

    public void setOut_net_medical(float Out_net_medical)
    {
        this.Out_net_medical = Out_net_medical;
    }
	
	public String getcombined_deduct_flag()
	{
		return combined_deduct_flag;
	}
	
	public void setcombined_deduct_flag(String combined_deduct_flag)
	{
		this.combined_deduct_flag = combined_deduct_flag;
	}
	
	public float setOut_net_drug()
	{
		return Out_net_drug;
	}
	
	public void setOut_net_drug(float Out_net_drug)
	{
		this.Out_net_drug = Out_net_drug;
	}
	
}
