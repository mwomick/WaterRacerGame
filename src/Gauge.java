/**
 * Model for Gauge which tracks a player's progress.
 * 
 * @author Michael Womick
 * @author Tharun Kintali
 *
 */
public class Gauge {
	private int _progress;
	private char _key;
	
	/**
	 * Creates a Gauge assigned to a key. This is essentially synonymous with 'player'.
	 * 
	 * @param key Keyboard key to control Gauge instance.
	 */
	public Gauge(char key) {
		_progress = 0;
		setKey(key);
		
	}
	
	/**
	 * Increase the Gauge's progress by amount.
	 * 
	 * @param amount Amount by which to increase the Gauge.
	 */
	public void increase(int amount) {
		int temp = _progress + amount;
		if(temp>100 || temp<0) {
			throw new RuntimeException("Gauge progress must be between 0 and 100 percent.");
		}
		setValue(temp);		
	}
	
	public char getKey() {
		return _key;
	}
	
	public void setKey(char key) {
		_key = key;
	}
	
	public int getValue() {
		return _progress;
	}
	
	public void setValue(int value) {
		_progress = value;
	}
}
