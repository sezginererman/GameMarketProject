package example3Day4;

public class SaleManager implements Entity {
	
	private Confirmation confirmation;
	
	public SaleManager(Confirmation confirmation) {
		super();
		this.confirmation = confirmation;
	}

	public void sale(User user, Game game) {
		if(confirmation.confirm(user)) {
		System.out.println(user.getFirstName() +" isimli kullan�c�, " +game.getGameName() + " isimli oyunu " + game.getGamePrice() + 
				" liraya sat�n ald�. ");
		}else {
			System.out.println("Oyunu sat�n almak i�in l�tfen kimlik bilgilerinizi do�rulay�n.");
		}
	}
	
	public void saleWithCampaign(User user, Game game, Campaign campaign) {
		if(confirmation.confirm(user)){
		System.out.println(user.getFirstName() +" isimli kullan�c�, " +game.getGameName() + " isimli oyunu " + game.getGamePrice() + 
				" lira yerine " + campaign.getCampaignName() + " isimli kampanyadan faydalanarak " +  
				(game.getGamePrice() * (100 - campaign.getDiscountRate()) / 100) + " liraya sat�n ald�.");
		}else {
			System.out.println("Oyunu sat�n almak i�in l�tfen kimlik bilgilerinizi do�rulay�n.");
		}
		
	}
	
	


}
