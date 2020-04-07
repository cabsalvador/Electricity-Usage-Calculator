import java.awt.event.ActionEvent;

public class SelectUserButton extends EUCButton{
	private static final String BUTTON_NAME = "Select User";
	
	public SelectUserButton(final ElectricityUsageCalculator electricityUsageCalculator) {
		super(BUTTON_NAME, electricityUsageCalculator);
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		goToSelectUserPage();
	}
}