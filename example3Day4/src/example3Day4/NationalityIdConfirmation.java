package example3Day4;

public class NationalityIdConfirmation implements Confirmation {

	@Override
	public boolean confirm(User user) {
		if(user.getNationalyId().length()==11) {
			System.out.println(user.getFirstName() + " isimli ki�inin kimlik numaras� do�ruland�.");
			return true;
		}else {
			System.out.println(user.getFirstName() + " isimli ki�inin kimlik numaras� do�rulanamad�");
			return false;
		}
		
		
	}

}
