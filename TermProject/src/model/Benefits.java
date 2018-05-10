package model;

public class Benefits {

    private String Plan_ID;
    private String Bene_service;
    private String Covered_flag;
    private String EHB_Flag;
    private String EHB_Variance_Reason;
    private String Quant_Serv_Limit;
    private String Bene_descrip;

    public Benefits(String Plan_ID, String Bene_service, String Covered_flag, String EHB_Flag, String EHB_Variance_Reason, String Quant_Serv_Limit, String Bene_descrip) {
        this.Plan_ID = Plan_ID;
        this.Bene_service = Bene_service;
        this.Covered_flag = Covered_flag;
        this.EHB_Flag = EHB_Flag;
        this.EHB_Variance_Reason = EHB_Variance_Reason;
        this.Quant_Serv_Limit = Quant_Serv_Limit;
        this.Bene_descrip = Bene_descrip;
    }

    public String getPlan_ID() {
        return Plan_ID;
    }

    public void setPlan_ID(String Plan_ID) {
        this.Plan_ID = Plan_ID;
    }

    public String getBene_service() {
        return Bene_service;
    }

    public void setBene_service(String Bene_service) {
        this.Bene_service = Bene_service;
    }

    public String getCovered_flag() {
        return Covered_flag;
    }

    public void setCovered_flag(String Covered_flag) {
        this.Covered_flag = Covered_flag;
    }

    public String getEHB_Flag() {
        return EHB_Flag;
    }

    public void setEHB_Flag(String EHB_Flag) {
        this.EHB_Flag = EHB_Flag;
    }

    public String getEHB_Variance_Reason() {
        return EHB_Variance_Reason;
    }

    public void setEHB_Variance_Reason(String EHB_Variance_Reason) {
        this.EHB_Variance_Reason = EHB_Variance_Reason;
    }

    public String setQuant_Serv_Limit() {
        return Quant_Serv_Limit;
    }

    public void setQuant_Serv_Limit(String Quant_Serv_Limit) {
        this.Quant_Serv_Limit = Quant_Serv_Limit;
    }

    public String getBene_descrip() {
        return Bene_descrip;
    }

    public void setBene_descrip(String Bene_descrip) {
        this.Bene_descrip = Bene_descrip;
    }
}
