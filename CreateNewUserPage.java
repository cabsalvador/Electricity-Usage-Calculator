import javax.swing.*;
import java.awt.*;


public class CreateNewUserPage extends JPanel{
//	Labels
	private static final String TITLE_LABEL = "Create New User";
	private static final String FIRST_NAME_LABEL = "First Name";
	private static final String LAST_NAME_LABEL = "Last Name";
	private static final String USERNAME_LABEL = "Username";
	private static final String PASSWORD_LABEL = "Password";
	private static final String VERIFY_PASSWORD_LABEL = "Verify Password";
	private static final int TEXT_BOX_SIZE = 20;
	private static final int PASSWORD_TEXT_BOX_SIZE = 20;
	
	private final ElectricityUsageCalculator electricityUsageCalculator;
	private final JLabel titleLabel;
	private final JLabel firstNameLabel;
	private final JLabel lastNameLabel;
	private final JLabel usernameLabel;
	private final JLabel passwordLabel;
	private final JLabel verifyPasswordLabel;
	
	private final JTextField firstNameTextBox;
	private final JTextField lastNameTextBox;
	private final JTextField usernameTextBox;
	private final JTextField passwordTextBox;
	private final JTextField verifyPasswordTextBox;
	
	private JPanel northPanel;
	private JPanel centerPanel;
	private JPanel southPanel;
	private JPanel spacePanel;

	//    Design
	private Color gainsboro = new Color (102, 175, 184);
	private Font titleFont = new Font("New Courier", Font.PLAIN, 35);
	private Font font1 = new Font("New Courier", Font.PLAIN, 15);
	
	private JButton testBut1 = new JButton("Cancel");
	private JButton testBut2 = new JButton("Create User");

	public CreateNewUserPage(final ElectricityUsageCalculator electricityUsageCalculator){
		this.electricityUsageCalculator = electricityUsageCalculator;
		setBackground(gainsboro);
		
		titleLabel = new JLabel(TITLE_LABEL, SwingConstants.CENTER);
		titleLabel.setFont(titleFont);
		firstNameLabel = new JLabel(FIRST_NAME_LABEL, SwingConstants.RIGHT);
		lastNameLabel = new JLabel(LAST_NAME_LABEL, SwingConstants.RIGHT);
		usernameLabel = new JLabel(USERNAME_LABEL, SwingConstants.RIGHT);
		passwordLabel = new JLabel(PASSWORD_LABEL, SwingConstants.RIGHT);
		verifyPasswordLabel = new JLabel(VERIFY_PASSWORD_LABEL, SwingConstants.RIGHT);
		
		firstNameTextBox = new JTextField(TEXT_BOX_SIZE);
		lastNameTextBox = new JTextField(TEXT_BOX_SIZE);
		usernameTextBox = new JTextField(TEXT_BOX_SIZE);
		passwordTextBox = new JPasswordField(TEXT_BOX_SIZE);
		verifyPasswordTextBox = new JPasswordField(TEXT_BOX_SIZE);

		
		setLayout(new GridLayout(3,1));
		this.add(titleLabel);
		setupCenter();
		setupSouth();
	}
	
	private void setupNorth(){
		northPanel = new JPanel();
		northPanel.add(titleLabel);
		this.add(northPanel);
	}
	
	private void setupCenter(){
		centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(5,2));
		centerPanel.setBackground(gainsboro);
		firstNameLabel.setFont(font1);
		lastNameLabel.setFont(font1);
		usernameLabel.setFont(font1);
		passwordLabel.setFont(font1);
		verifyPasswordLabel.setFont(font1);
		centerPanel.add(firstNameLabel);
		centerPanel.add(firstNameTextBox);
		centerPanel.add(lastNameLabel);
		centerPanel.add(lastNameTextBox);
		centerPanel.add(usernameLabel);
		centerPanel.add(usernameTextBox);
		centerPanel.add(passwordLabel);
		centerPanel.add(passwordTextBox);
		centerPanel.add(verifyPasswordLabel);
		centerPanel.add(verifyPasswordTextBox);
		this.add(centerPanel);
				
	}
	
	private void setupSouth(){
		southPanel = new JPanel();
		southPanel.setLayout(new FlowLayout());
		southPanel.setBackground(gainsboro);
		southPanel.add(new CancelButton(electricityUsageCalculator));
		southPanel.add(testBut2);
		this.add(southPanel);
	}
	
	//	Empty Panel
	private void setupSpacePanel(){
		spacePanel = new JPanel();
		spacePanel.setBackground(gainsboro);
		this.add(spacePanel);
	}
}