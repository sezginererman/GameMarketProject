package example3Day4;

public class SaleManager implements Entity {
	
	private Confirmation confirmation;
	
	public SaleManager(Confirmation confirmation) {
		super();
		this.confirmation = confirmation;
	}

	public void sale(User user, Game game) {
		if(confirmation.confirm(user)) {
		System.out.println(user.getFirstName() +" isimli kullanýcý, " +game.getGameName() + " isimli oyunu " + game.getGamePrice() + 
				" liraya satýn aldý. ");
		}else {
			System.out.println("Oyunu satýn almak için lütfen kimlik bilgilerinizi doðrulayýn.");
		}
	}
	
	public void saleWithCampaign(User user, Game game, Campaign campaign) {
		if(confirmation.confirm(user)){
		System.out.println(user.getFirstName() +" isimli kullanýcý, " +game.getGameName() + " isimli oyunu " + game.getGamePrice() + 
				" lira yerine " + campaign.getCampaignName() + " isimli kampanyadan faydalanarak " +  
				(game.getGamePrice() * (100 - campaign.getDiscountRate()) / 100) + " liraya satýn aldý.");
		}else {
			System.out.println("Oyunu satýn almak için lütfen kimlik bilgilerinizi doðrulayýn.");
		}
		
	}
	
	


}
