import javax.swing.*;
import java.awt.*;
import javax.management.loading.*;


/*
This displays everything shown in the Main Page. 
The Main Page uses a GridLayout with 5 rows stacked on top of each other. 
Row 1 ->North Panel
Row 2 ->Empty Panel 
Row 3 ->Center Panel
Row 4 ->Empty Panel
Row 5 ->South Panel 

*/

public class MainPage extends JPanel {
	
//	Title info
	private static final String TITLE_LABEL = "Electric Usage Calculator!";
	private Font titleFont = new Font("New Courier", Font.PLAIN, 35);
	
	private Color gainsboro = new Color (102, 175, 184);
	
	private final ElectricityUsageCalculator electricityUsageCalculator;
	private final JLabel titleLabel;
	private JPanel northPanel;
	private JPanel spacePanel;
	private JPanel centerPanel;
	private JPanel southPanel;
	private JPanel infoPanel;
	
//	These are temporary buttons only for testing
	private JButton testBut1 = new JButton("Select User (non-functioning)");
	private JButton testBut2 = new JButton("Create New User (non-functioning");
	private JButton infoBut = new JButton("Info");
	
	public MainPage(final ElectricityUsageCalculator electricityUsageCalculator){	
		this.electricityUsageCalculator = electricityUsageCalculator;
		
		titleLabel = new JLabel(TITLE_LABEL, SwingConstants.CENTER);
		setBackground(gainsboro);
		
		
		this.setLayout(new GridLayout(7,1));
		setupSpacePanel();
		setupNorth();
		setupSpacePanel();
		setupCenter();
		setupSpacePanel();
		setupSouth();
		setupInfo();
	}
	
//	Empty Panel
	private void setupSpacePanel(){
		spacePanel = new JPanel();
		spacePanel.setBackground(gainsboro);
		this.add(spacePanel);
	}
	
//	North Panel - Contains the title for the main page. 
	private void setupNorth(){
		northPanel = new JPanel();
		northPanel.setBackground(gainsboro);
		titleLabel.setFont(titleFont);
		northPanel.add(titleLabel);
		this.add(northPanel);
		
	}
	
//	Center Panel - Contains the button for loading/creating User
	private void setupCenter(){
		centerPanel = new JPanel();
		centerPanel.setBackground(gainsboro);

		centerPanel.setLayout(new FlowLayout());
		centerPanel.add(new SelectUserButton(electricityUsageCalculator));
		centerPanel.add(new CreateNewUserButton(electricityUsageCalculator));		
		this.add(centerPanel);
		
	}
	
//	South Panel - Contains Exit Button 
	private void setupSouth(){
		southPanel = new JPanel();
		southPanel.setBackground(gainsboro);
		southPanel.add(new ExitButton(electricityUsageCalculator));
		this.add(southPanel);
	}
	
	private void setupInfo(){
		infoPanel = new JPanel(new FlowLayout());
		infoPanel.add(infoBut);
		infoPanel.setBackground(gainsboro);
		this.add(infoPanel);
		
	}
}