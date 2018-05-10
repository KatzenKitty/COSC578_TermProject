package model;
import java.util.Date;

public class Dates
{
    private String Plan_ID;
    private Date Expiry_date;
    private Date Start_date;
   
    public Dates(String Plan_ID, java.util.Date Expiry_date, java.util.Date Start_date)
    {
        this.Plan_ID = Plan_ID;
        this.Expiry_date = Expiry_date;
        this.Start_date = Start_date;
    }

    public String getPlan_ID()
    {
        return Plan_ID;
    }

    public void  setPlan_ID(String Plan_ID)
    {
        this.Plan_ID = Plan_ID;
    }

    public Date getExpiry_date()
    {
        return Expiry_date;
    }

    public void setExpiry_date(Date Expiry_date)
    {
        this.Expiry_date = Expiry_date;
    }

    public Date getStart_date()
    {
        return Start_date;
    }

    public void setStart_date(Date Start_date)
    {
        this.Start_date = Start_date;
    }
}
