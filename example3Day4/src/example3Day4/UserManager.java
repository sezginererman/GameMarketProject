package example3Day4;

public class UserManager implements UserService {

	private Confirmation confirmation;
	
	public UserManager(Confirmation confirmation) {
		super();
		this.confirmation = confirmation;
	}

	@Override
	public void add(User user) {
		if (confirmation.confirm(user)) {
		System.out.println(user.getFirstName()+ " isimli kullan�c� sisteme eklendi.");
		}else {
			System.out.println("Kimlik numaran�z� kontrol ediniz.");
		}
		
	}

	@Override
	public void update(User user) {
		if (confirmation.confirm(user)) {
			System.out.println(" Kullan�c� bilgileri g�ncellendi.");
			}else {
				System.out.println("Kullan�c� bilgilerini kontrol ediniz.");
			}	
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + ": isimli kullan�c�n�n bilgileri silindi.");
	}

}
