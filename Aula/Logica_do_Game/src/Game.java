
public class Game implements Runnable {
	
	private boolean isRunning;
	private Thread thread;
	
	public static void main(String[]args) {
		Game game = new Game();
		game.start();
	}
	
	public synchronized void start(){
		isRunning = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public void update() {
	//Atualizar o jogo
		System.out.println("Update");
	}
	
	public void render() {
	//Renderizar
		System.out.println("Render");
	}

	@Override
	public void run() {
	//Looping
		while(isRunning) {
		   update();
		   render();
		   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
