package model;

public class Referral_required
{
	private String Plan_ID;
    private String Specialists_req_ref;
    private String Ref_req;

    public Referral_required(String Plan_ID, String Specialists_req_ref, String Ref_req)
    {
        this.Plan_ID = Plan_ID;
        this.Specialists_req_ref = Specialists_req_ref;
        this.Ref_req = Ref_req;
        
    }

    public String getPlan_ID()
    {
        return Plan_ID;
    }

    public void  setPlan_ID(String Plan_ID)
    {
        this.Plan_ID = Plan_ID;
    }

    public String getSpecialists_req_ref()
    {
        return Specialists_req_ref;
    }

    public void setSpecialists_req_ref(String Specialists_req_ref)
    {
        this.Specialists_req_ref = Specialists_req_ref;
    }

    public String getRef_req()
    {
		return Ref_req ;   }

    public void setRef_req(String Ref_req)
    {
        this.Ref_req = Ref_req;
    }
	
}
