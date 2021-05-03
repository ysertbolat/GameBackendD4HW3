package Entities;

public class Campaign{

    public int campaingId;
    public String campaingName;
    public double campaignDiscount;


    public Campaign(int campaingId, String campaingName, double campaignDiscount) {
        this.campaingId = campaingId;
        this.campaingName = campaingName;
        this.campaignDiscount = campaignDiscount;
    }

    public int getCampaingId() {
        return campaingId;
    }

    public void setCampaingId(int campaingId) {
        this.campaingId = campaingId;
    }

    public String getCampaingName() {
        return campaingName;
    }

    public void setCampaingName(String campaingName) {
        this.campaingName = campaingName;
    }

    public int getCampaignDiscount() {
        return (int) campaignDiscount;
    }

    public void setCampaignDiscount(double campaignDiscount) {
        this.campaignDiscount = campaignDiscount;
    }

}
