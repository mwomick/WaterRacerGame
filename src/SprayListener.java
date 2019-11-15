import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Controller for Water Racer Game.
 * 
 * @author Michael Womick
 * @author Tharun Kintali
 */
public class SprayListener implements KeyListener {
	
	private Game _game;
	
	/**
	 * Spray Listener
	 * 
	 * Controls the key presses for a Game.
	 * 
	 * @param game Game to which the SprayListener is to be assigned.
	 */
	public SprayListener(Game game) {
		_game = game;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// Do nothing.
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(!_game.isGameOver()) {										// If the game is not over, increase the Gauge progress if the Gauge's key is pressed.
			for(GaugeView g : _game.getGaugeViews()) {
				if(e.getKeyChar() == g.getGauge().getKey()) {
					g.getGauge().increase(1);
					g.update();
				}
			}
			
			_game.update();													// Update the Game status.
		}
		else {															// Otherwise, signify "game over" and exit.
			System.out.print("Game over.");
			System.exit(0);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// Do nothing.
	}

}
