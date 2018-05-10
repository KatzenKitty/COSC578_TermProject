package model;

public class Plan
{
    private String HIOS_Plan_ID;
    private String Plan_URL;
    private String Plan_type;
    private String QHP_Status;
	private String Status;
	private String Plan_name;
	private String Metal_lvl;
	private String Child_only_plan_flag;
	private int Child_only_plan_ID;
	private String Service_Area;
	private float EHB_Perc_Premium;
	private int Issuer_ID;

    public Plan(String HIOS_Plan_ID, String Plan_URL, String Plan_type, String QHP_Status,String Status, String Plan_name,String Metal_lvl, String Child_only_plan_flag, int Child_only_plan_ID, String Service_Area, float EHB_Perc_Premium, int Issuer_ID)
    {
        this.HIOS_Plan_ID = HIOS_Plan_ID;
        this.Plan_URL = Plan_URL;
        this.Plan_type = Plan_type;
        this.QHP_Status = QHP_Status;
		this.Status = Status;
		this.Plan_name = Plan_name;
		this.Metal_lvl = Metal_lvl;
		this.Child_only_plan_flag = Child_only_plan_flag;
		this.Child_only_plan_ID = Child_only_plan_ID;
		this.Service_Area = Service_Area;
		this.EHB_Perc_Premium = EHB_Perc_Premium;
		this.Issuer_ID = Issuer_ID;
    }

    public String getHIOS_Plan_ID()
    {
        return HIOS_Plan_ID;
    }

    public void  setHIOS_Plan_ID(String HIOS_Plan_ID)
    {
        this.HIOS_Plan_ID = HIOS_Plan_ID;
    }

    public String getPlan_URL()
    {
        return Plan_URL;
    }

    public void setPlan_URL(String Plan_URL)
    {
        this.Plan_URL = Plan_URL;
    }

    public String getPlan_type()
    {
        return Plan_type;
    }

    public void setPlan_type(String Plan_type)
    {
        this.Plan_type = Plan_type;
    }

    public String getQHP_Status()
    {
        return QHP_Status;
    }

    public void setQHP_Status(String QHP_Status)
    {
        this.QHP_Status = QHP_Status;
    }
	
	public String getStatus()
	{
		return Status;
	}
	
	public void setStatus(String Status)
	{
		this.Status = Status;
	}
	
	public String setPlan_name()
	{
		return Plan_name;
	}
	
	public void setPlan_name(String Plan_name)
	{
		this.Plan_name = Plan_name;
	}
	
	public String getMetal_lvl()
	{
		return Metal_lvl;
	}
	
	public void setMetal_lvl(String Metal_lvl)
	{
		this.Metal_lvl = Metal_lvl;
	}
	
	public String getChild_only_plan_flag()
	{
		return Child_only_plan_flag;
	}
	
	public void setChild_only_plan_flag(String Child_only_plan_flag)
	{
		this.Child_only_plan_flag = Child_only_plan_flag;
	}
	
	public int getChild_only_plan_ID()
	{
		return Child_only_plan_ID;
	}
	
	public void setChild_only_plan_ID(int Child_only_plan_ID)
	{
		this.Child_only_plan_ID = Child_only_plan_ID;
	}
	
	public String getService_Area()
	{
		return Service_Area;
	}
	
	public void setService_Area(String Service_Area)
	{
		this.Service_Area = Service_Area;
	}
	
	public float getEHB_Perc_Premium()
	{
		return EHB_Perc_Premium;
	}
	
	public void setEHB_Perc_Premium(float EHB_Perc_Premium)
	{
		this.EHB_Perc_Premium = EHB_Perc_Premium;
	}
	
	public int getIssuer_ID()
	{
		return Issuer_ID;
	}
	
	public void setIssuer_ID(int Issuer_ID)
	{
		this.Issuer_ID = Issuer_ID;
	}
}
