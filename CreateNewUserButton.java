import java.awt.event.ActionEvent;;

public class CreateNewUserButton extends EUCButton{
	private static final String BUTTON_NAME = "Create New User";
	
	public CreateNewUserButton(final ElectricityUsageCalculator electricityUsageCalculator){
		super(BUTTON_NAME, electricityUsageCalculator);
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		goToCreateNewUserPage();
	}
}