
public class Main {
	private Player player;
	private Inimigo inimigo;
	private Inimigo inimigo2;
	
	public Main() {
		inimigo = new Inimigo();
		inimigo2 = new Inimigo();
		if(player == null) {
			System.out.println("Player nao foi inicializado");
			player = new Player();
		}
		if (player instanceof Player) {
			System.out.println("Player foi inicializado");
		}
	}

	
	public Player getPlayer() {
		return player;
	}
	
	public Inimigo getInimigo() {
		return inimigo;
	}
	public Inimigo getInimigo2() {
		return inimigo2;
	}
	
	
	
	public static void main(String[]args) {
		Main m = new Main();
		Player player = m.getPlayer();;
		Inimigo inimigo = m.getInimigo();
		player.atacarInimigo(inimigo);
		player.atacarInimigo(m.getInimigo2());
		player.atacarInimigo(m.getInimigo2());
		System.out.println(inimigo.life);
		System.out.println(m.getInimigo2().life);
		
	}
}
