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
		System.out.println(user.getFirstName()+ " isimli kullanýcý sisteme eklendi.");
		}else {
			System.out.println("Kimlik numaranýzý kontrol ediniz.");
		}
		
	}

	@Override
	public void update(User user) {
		if (confirmation.confirm(user)) {
			System.out.println(" Kullanýcý bilgileri güncellendi.");
			}else {
				System.out.println("Kullanýcý bilgilerini kontrol ediniz.");
			}	
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + ": isimli kullanýcýnýn bilgileri silindi.");
	}

}
