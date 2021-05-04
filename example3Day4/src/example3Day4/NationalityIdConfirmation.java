package example3Day4;

public class NationalityIdConfirmation implements Confirmation {

	@Override
	public boolean confirm(User user) {
		if(user.getNationalyId().length()==11) {
			System.out.println(user.getFirstName() + " isimli kiþinin kimlik numarasý doðrulandý.");
			return true;
		}else {
			System.out.println(user.getFirstName() + " isimli kiþinin kimlik numarasý doðrulanamadý");
			return false;
		}
		
		
	}

}
