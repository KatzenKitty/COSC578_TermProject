package model;

public class Premium
{
	private String Plan_ID;
    private float Indiv_Rate;
    private String Age_Range;

    public Premium(String Plan_ID, float Indiv_Rate, String Age_Range)
    {
        this.Plan_ID = Plan_ID;
        this.Indiv_Rate = Indiv_Rate;
        this.Age_Range = Age_Range;
        
    }

    public String getPlan_ID()
    {
        return Plan_ID;
    }

    public void  setPlan_ID(String Plan_ID)
    {
        this.Plan_ID = Plan_ID;
    }

    public float getIndiv_Rate()
    {
        return Indiv_Rate;
    }

    public void setIndiv_Rate(float Indiv_Rate)
    {
        this.Indiv_Rate = Indiv_Rate;
    }

    public String getAge_Range()
    {
		return Age_Range   ;
    }

    public void setAge_Range(String Age_Range)
    {
        this.Age_Range = Age_Range;
    }
	
}
