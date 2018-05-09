package net.codejava.model;

public class In_network_deductible
{
    private String Plan_ID;
    private String In_net_ped_dent_deduct;
    private String In_net_med;
    private String In_network_drug;
	private String combined_deduct_flag;
	private String In_net_combined;
	private String Quant_Serv_Limit;
	

    public In_network_deductible(String Plan_ID, String In_net_ped_dent_deduct, String In_net_med, String In_network_drug,String combined_deduct_flag, String In_net_combined)
    {
        this.Plan_ID = Plan_ID;
        this.In_net_ped_dent_deduct = In_net_ped_dent_deduct;
        this.In_net_med = In_net_med;
        this.In_network_drug = In_network_drug;
		this.combined_deduct_flag = combined_deduct_flag;
		this.In_net_combined = In_net_combined;
		
    }

    public String getPlan_ID()
    {
        return Plan_ID;
    }

    public void  setPlan_ID(String Plan_ID)
    {
        this.Plan_ID = Plan_ID;
    }

    public String getIn_net_ped_dent_deduct()
    {
        return In_net_ped_dent_deduct;
    }

    public void setIn_net_ped_dent_deduct(String In_net_ped_dent_deduct)
    {
        this.In_net_ped_dent_deduct = In_net_ped_dent_deduct;
    }

    public String getIn_net_med()
    {
        return In_net_med;
    }

    public void setIn_net_med(String In_net_med)
    {
        this.In_net_med = In_net_med;
    }

    public String getIn_network_drug()
    {
        return In_network_drug;
    }

    public void setIn_network_drug(String In_network_drug)
    {
        this.In_network_drug = In_network_drug;
    }
	
	public String getcombined_deduct_flag()
	{
		return combined_deduct_flag;
	}
	
	public void setcombined_deduct_flag(String combined_deduct_flag)
	{
		this.combined_deduct_flag = combined_deduct_flag;
	}
	
	public String setIn_net_combined()
	{
		return In_net_combined;
	}
	
	public void setIn_net_combined(String In_net_combined)
	{
		this.In_net_combined = In_net_combined;
	}
}
