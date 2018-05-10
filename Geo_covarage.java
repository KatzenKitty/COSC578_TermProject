package model;

public class Geo_covarage
{
    private String Plan_ID;
    private String Nat_net_flag;
    private String Out_serv_area_cov;
    private String Out_country_cov;

    public Geo_covarage(String Plan_ID, String Nat_net_flag, String Out_serv_area_cov, String Out_country_cov)
    {
        this.Plan_ID = Plan_ID;
        this.Nat_net_flag = Nat_net_flag;
        this.Out_serv_area_cov = Out_serv_area_cov;
        this.Out_country_cov = Out_country_cov;
		
    }

    public String getPlan_ID()
    {
        return Plan_ID;
    }

    public void  setPlan_ID(String Plan_ID)
    {
        this.Plan_ID = Plan_ID;
    }

    public String getNat_net_flag()
    {
        return Nat_net_flag;
    }

    public void setNat_net_flag(String Nat_net_flag)
    {
        this.Nat_net_flag = Nat_net_flag;
    }

    public String getOut_serv_area_cov()
    {
	return	Out_serv_area_cov;    }

    public void setOut_serv_area_cov(String Out_serv_area_cov)
    {
        this.Out_serv_area_cov = Out_serv_area_cov;
    }

    public String getOut_country_cov()
    {
        return Out_country_cov;
    }

    public void setOut_country_cov(String Out_country_cov)
    {
        this.Out_country_cov = Out_country_cov;
    }	
}
