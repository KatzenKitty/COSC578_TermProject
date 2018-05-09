package model;

public class MOOP
{
    private String Plan_ID;
    private float In_net_MOOP;
    private float Out_net_MOOP;
   
    public MOOP(String Plan_ID, float In_net_MOOP, float Out_net_MOOP)
    {
        this.Plan_ID = Plan_ID;
        this.In_net_MOOP = In_net_MOOP;
        this.Out_net_MOOP = Out_net_MOOP;
    }

    public String getPlan_ID()
    {
        return Plan_ID;
    }

    public void  setPlan_ID(String Plan_ID)
    {
        this.Plan_ID = Plan_ID;
    }

    public float getIn_net_MOOP()
    {
        return In_net_MOOP;
    }

    public void setIn_net_MOOP(float In_net_MOOP)
    {
        this.In_net_MOOP = In_net_MOOP;
    }

    public float getOut_net_MOOP()
    {
        return Out_net_MOOP;
    }

    public void setOut_net_MOOP(float Out_net_MOOP)
    {
        this.Out_net_MOOP = Out_net_MOOP;
    }
}
