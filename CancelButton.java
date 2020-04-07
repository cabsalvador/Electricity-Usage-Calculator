import javax.swing.*;
import java.awt.event.ActionEvent;

public class CancelButton extends EUCButton {
	private static final String BUTTON_NAME = "Cancel";

	public CancelButton(final ElectricityUsageCalculator electricityUsageCalculator) {
		super(BUTTON_NAME, electricityUsageCalculator);
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		goToMainPage();
	}
}