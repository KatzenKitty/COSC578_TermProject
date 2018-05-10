package model;

public class Plan_lvl_programs
{
	private String Plan_ID;
    private String Tobacco_wellness;
    private String Disease_mgmt;

    public Plan_lvl_programs(String Plan_ID, String Tobacco_wellness, String Disease_mgmt)
    {
        this.Plan_ID = Plan_ID;
        this.Tobacco_wellness = Tobacco_wellness;
        this.Disease_mgmt = Disease_mgmt;
        
    }

    public String getPlan_ID()
    {
        return Plan_ID;
    }

    public void  setPlan_ID(String Plan_ID)
    {
        this.Plan_ID = Plan_ID;
    }

    public String getTobacco_wellness()
    {
        return Tobacco_wellness;
    }

    public void setTobacco_wellness(String Tobacco_wellness)
    {
        this.Tobacco_wellness = Tobacco_wellness;
    }

    public String getDisease_mgmt()
    {
		return Disease_mgmt ; 
	}

    public void setDisease_mgmt(String Disease_mgmt)
    {
        this.Disease_mgmt = Disease_mgmt;
    }
	
}
