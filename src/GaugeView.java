import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 * View for Gauge.
 * 
 * @author Michael Womick
 * @author Tharun Kintali
 */
public class GaugeView extends JPanel {

	private static final long serialVersionUID = 1L;			// Don't worry about this. Just leave it.
	private JProgressBar _progressBar;
	private Gauge _gauge;
	
	/**
	 * GaugeView
	 * 
	 * A view for the Gauge object.
	 * 
	 * @param gauge The Gauge to generate a view for.
	 */
	public GaugeView(Gauge gauge) {
		_gauge = gauge;
		setLayout(new FlowLayout());
		_progressBar = new JProgressBar(0, 100);
		_progressBar.setValue(0);
		add(_progressBar);
	}
	
	/**
	 * Update progress bar.
	 */
	public void update() {
		_progressBar.setValue(_gauge.getValue());
		add(_progressBar);
	}

	public Gauge getGauge() {
		return _gauge;
	}

}
