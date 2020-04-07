import javax.swing.*;
import java.awt.*;
import javax.management.loading.*;

public class SelectUserPage extends JPanel{
    private static final String TITLE_LABEL = "Select User";
    
    private final ElectricityUsageCalculator electricityUsageCalculator;


    //    Design
    private Color gainsboro = new Color (102, 175, 184);
    private Font titleFont = new Font("New Courier", Font.PLAIN, 35);

    public SelectUserPage(final ElectricityUsageCalculator electricityUsageCalculator){
        this.electricityUsageCalculator = electricityUsageCalculator;
        setBackground(gainsboro);
    }
}