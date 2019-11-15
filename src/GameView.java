import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JPanel;
/**
 * View for Water Racer Game.
 * 
 * @author Michael Womick
 * @author Tharun Kintali
 */
public class GameView extends JPanel {

	private static final long serialVersionUID = 1L;				// Don't worry about this. Just leave it.
	Game game;
	
	/**
	 * GameView
	 * 
	 * A JPanel containing all the GaugeViews for all the Gauges in a particular Game.
	 * 
	 * @param game
	 */
	public GameView(Game game) {
		this.game = game;
		
		setLayout(new FlowLayout());
	
		List<GaugeView> gaugeViews = game.getGaugeViews();
		
		for (GaugeView view : gaugeViews) {							// Add all the GaugeViews to the GameView
			add(view);
		}
		
		addKeyListener(game.getSprayListener());					// Add the SprayListener to the GameView
		
	}
	
	public Game getGame() {
		return game;
	}

}