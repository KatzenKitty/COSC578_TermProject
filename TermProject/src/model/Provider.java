package net.codejava.model;

public class Provider
{
	private int HIOS_Issuer_ID;
    private String Name;
    private String Service_Area;

    public Provider(int HIOS_Issuer_ID, String Name, String Service_Area)
    {
        this.HIOS_Issuer_ID = HIOS_Issuer_ID;
        this.Name = Name;
        this.Service_Area = Service_Area;
        
    }

    public int getHIOS_Issuer_ID()
    {
        return HIOS_Issuer_ID;
    }

    public void setHIOS_Issuer_ID(int HIOS_Issuer_ID)
    {
        this.HIOS_Issuer_ID = HIOS_Issuer_ID;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public String getService_Area()
    {
		return Service_Area;
	}

    public void setService_Area(String Service_Area)
    {
        this.Service_Area = Service_Area;
    }
	
}
