import java.util.List;

/**
 * Model of the Water Racer Game.
 * 
 * @author Michael Womick
 * @author Tharun Kintali
 * 
 */

public class Game {
	
	List<GaugeView> _gaugeViews;
	SprayListener _listener;
	boolean _isOver;
	
	/**
	 * A Game has a list of Gauges for each player, a status, and a SprayListener.
	 * 
	 * @param gaugeViews All the GaugeViews participating in a Game instance.
	 */
	public Game(List<GaugeView> gaugeViews) {
		this._gaugeViews = gaugeViews;
		this._listener = new SprayListener(this);
		_isOver = false;
	}
	
	
	/**
	 * 
	 * @return Whether or not a player has reached 100, thus ending the Game.
	 */
	public boolean isGameOver() {
		return _isOver;
	}
	
	public List<GaugeView> getGaugeViews() {
			return _gaugeViews;
	}
	
	public SprayListener getSprayListener() {
		return _listener;
	}
	
	/**
	 * Update Game status, depending on the progress of each Gauge in the Game.
	 */
	public void update() {
		for(GaugeView g : getGaugeViews()) {
			if(g.getGauge().getValue()==100) {
				_isOver = true;
			}
		}
	}

}