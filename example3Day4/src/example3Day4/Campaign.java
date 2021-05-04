package example3Day4;

public class Campaign implements Entity{
	
	private int campaignId;
	private String campaignName;
	private int discountRate;

	public Campaign() {
		
	}
	
	public Campaign(String campaignName, int discountRate, int campaignId) {
		super();
		this.campaignName = campaignName;
		this.discountRate = discountRate;
		this.campaignId= campaignId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	

}
