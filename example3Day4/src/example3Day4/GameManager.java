package example3Day4;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() +" isimli oyun sisteme eklendi");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() +" isimli oyun bilgileri güncellendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() +" isimli oyun bilgileri sistemden silindi");		
	}



}
