import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.stream.*;

/*

*This is the main Electricity Usage Calculator.

When initialized, it will create all the "pages" which are JPanel, and then add them to CardLayout.

*/
public class ElectricityUsageCalculator extends JFrame{
	
//	All the cards that will be used in the program. 
	private static String FRAME_TITLE = "Electricity Rate Calculator";
	private static String MAIN_PAGE_CARD = "MainPage";
	private static String SELECT_USER_PAGE_CARD = "Select User";
	private static String CREATE_NEW_USER_PAGE_CARD = "Create New User";
	
	private JPanel cards;
	private MainPage mainPage;
	private SelectUserPage selectUserPage;
	private CreateNewUserPage createNewUserPage;
	
	ElectricityUsageCalculator(){
		super(FRAME_TITLE);
		cards = new JPanel();
		cards.setLayout(new CardLayout());
		
		mainPage = new MainPage(this);
		cards.add(MAIN_PAGE_CARD, mainPage);
		
		selectUserPage = new SelectUserPage(this);
		cards.add(SELECT_USER_PAGE_CARD, selectUserPage);
		
		createNewUserPage = new CreateNewUserPage(this);
		cards.add(CREATE_NEW_USER_PAGE_CARD, createNewUserPage);
		
		this.setSize(new Dimension(900, 600));
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.getContentPane().add(cards);
		showMainPage();
		this.setVisible(true);
		this.setResizable(false);
	}
	
	public void showMainPage(){
		((CardLayout)cards.getLayout()).show(cards, MAIN_PAGE_CARD);
	}
	
	public void showSelectUserPage(){
		((CardLayout)cards.getLayout()).show(cards, SELECT_USER_PAGE_CARD);
	}
	
	public void showCreateNewUserPage(){
		((CardLayout)cards.getLayout()).show(cards, CREATE_NEW_USER_PAGE_CARD);
	}
	
	public void exit(){
		this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
	}
	
	public static void main(String[] args) {
		ElectricityUsageCalculator electricityUsageCalculator = new ElectricityUsageCalculator();
	}
	
}