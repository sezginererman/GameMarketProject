package example3Day4;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Sezgin");
		user1.setLastName("ERERMAN");
		user1.setEmail("sezginererman@gmail.com");
		user1.setNationalyId("1234567891");
		user1.setBornYear(1996);
		
		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Engin");
		user2.setLastName("DEMÝROÐ");
		user2.setEmail("abc@gmail.com");
		user2.setNationalyId("12345678910");
		user2.setBornYear(1989);
		
		UserManager userManager = new UserManager(new NationalityIdConfirmation());
		userManager.add(user1);
		userManager.add(user2);
		
		System.out.println("*********************************************************");
		
		Game game1 = new Game();
		game1.setGameId(1);
		game1.setGameName("Valorant");
		game1.setGamePrice(50);
		
		Game game2 = new Game();
		game2.setGameId(2);
		game2.setGameName("Cyberpunk");
		game2.setGamePrice(180);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		
		System.out.println("*********************************************************");
		
		Campaign campaign1 = new Campaign();
		campaign1.setCampaignId(1);
		campaign1.setCampaignName("BlackFriday");
		campaign1.setDiscountRate(25);
		
		Campaign campaign2 = new Campaign();
		campaign2.setCampaignId(2);
		campaign2.setCampaignName("The Boss is Crayz!!!");
		campaign2.setDiscountRate(50);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		
		System.out.println("*********************************************************");
		
		SaleManager salemanager = new SaleManager(new NationalityIdConfirmation());
		salemanager.sale(user1, game1);
		salemanager.saleWithCampaign(user2, game2, campaign2);
		salemanager.sale(user2, game1);
		

	}

}
