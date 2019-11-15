import java.util.List;
import java.util.ArrayList;

import javax.swing.JFrame;
/**
 * Main class for Water Racer Game.
 * 
 * @author Michael Womick
 * @author Tharun Kintali
 */
public class WaterRacerGame {

	public static void main(String[] args) {
		
		Gauge gauge1 = new Gauge('f');												// Create new Gauge controlled by the 'f' key
		Gauge gauge2 = new Gauge('j');												// Create new Gauge controlled by the 'j' key
		
		GaugeView view1 = new GaugeView(gauge1);									// Create GaugeViews for the Gauges
		GaugeView view2 = new GaugeView(gauge2);
	
		List<GaugeView> allViews = new ArrayList<>();								// Add GaugeViews to a list
		allViews.add(view1);
		allViews.add(view2);
		
		Game mainGame = new Game(allViews);											// Create Game with the GaugeViews
		
		GameView gameView = new GameView(mainGame);									// Create GameView for the Game
		
		JFrame main_frame = new JFrame();											// Set up window
		main_frame.setTitle("Water Racer Game");
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main_frame.setContentPane(gameView);
		main_frame.addKeyListener(gameView.getGame().getSprayListener());
		main_frame.pack();
		main_frame.setVisible(true);
	}

}