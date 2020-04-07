import javax.swing.*;
import java.awt.event.ActionEvent;
class SaveNewUserButton extends EUCButton {
	private static final String BUTTON_NAME = "Save & Add New User";
	
	private JTextField firstNameTField;
	private JTextField lastNameTField;
	private JTextField userNameTField;
	private JTextField passwordTField;
	private JTextField verifyPasswordTField;
	
	public SaveNewUserButton(final ElectricityUsageCalculator electricityUsageCalculator, 
							final JTextField firstNameTField,
							final JTextField lastNameTField,
							final JTextField userNameTField,
							final JTextField passwordTField,
							final JTextField verifyPasswordTField){
		super(BUTTON_NAME, electricityUsageCalculator);
		this.firstNameTField = firstNameTField;
		this.lastNameTField = lastNameTField;
		this.userNameTField = userNameTField;
		this.passwordTField = passwordTField;
		this.verifyPasswordTField = verifyPasswordTField;
	}

}