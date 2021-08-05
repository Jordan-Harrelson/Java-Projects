import java.awt.*;
import javax.swing.*;
/**
 * This class extends JComponent, takes in 6 LED objects and then draws them to the JFrame
 * 
 * @author (Jordan Harrelson) 
 * @version (2/12/2015)
 */
class MyComponent extends JComponent {
    public Bar barOne;
    public Bar barTwo; 
    public Bar barThree;
    public Bar barFour; 
    public Bar barFive;
    public Bar barSix;
    public Bar barSeven;
    
    public Bar bar8;
    public Bar bar9; 
    public Bar bar10;
    public Bar bar11; 
    public Bar bar12;
    public Bar bar13;
    public Bar bar14;
    
    public Bar bar15;
    public Bar bar16; 
    public Bar bar17;
    public Bar bar18; 
    public Bar bar19;
    public Bar bar20;
    public Bar bar21;
    
    public Bar bar22;
    public Bar bar23; 
    public Bar bar24;
    public Bar bar25; 
    public Bar bar26;
    public Bar bar27;
    public Bar bar28;
    
    public Bar bar29;
    public Bar bar30; 
    public Bar bar31;
    public Bar bar32; 
    public Bar bar33;
    public Bar bar34;
    public Bar bar35;
    
    public Bar bar36;
    public Bar bar37; 
    public Bar bar38;
    public Bar bar39; 
    public Bar bar40;
    public Bar bar41;
    public Bar bar42;
    
    /**
     * Constructor that takes in 7 LED objects and assigns each bar in the paramater LED's to local Bar variables
     * 
     * @param LED- one of the six LEDs needed to draw on the JFrame
     */
    public MyComponent(Led led1, Led led2, Led led3, Led led4, Led led5, Led led6){
        barOne = led1.getBarOne();
        barTwo = led1.getBarTwo();
        barThree = led1.getBarThree();
        barFour = led1.getBarFour();
        barFive = led1.getBarFive();
        barSix = led1.getBarSix();
        barSeven = led1.getBarSeven();
        
        bar8 = led2.getBarOne();
        bar9 = led2.getBarTwo();
        bar10 = led2.getBarThree();
        bar11 = led2.getBarFour();
        bar12 = led2.getBarFive();
        bar13 = led2.getBarSix();
        bar14 = led2.getBarSeven();
        
        bar15 = led3.getBarOne();
        bar16 = led3.getBarTwo();
        bar17 = led3.getBarThree();
        bar18 = led3.getBarFour();
        bar19 = led3.getBarFive();
        bar20 = led3.getBarSix();
        bar21 = led3.getBarSeven();
        
        bar22 = led4.getBarOne();
        bar23 = led4.getBarTwo();
        bar24 = led4.getBarThree();
        bar25 = led4.getBarFour();
        bar26 = led4.getBarFive();
        bar27 = led4.getBarSix();
        bar28 = led4.getBarSeven();
        
        bar29 = led5.getBarOne();
        bar30 = led5.getBarTwo();
        bar31 = led5.getBarThree();
        bar32 = led5.getBarFour();
        bar33 = led5.getBarFive();
        bar34 = led5.getBarSix();
        bar35 = led5.getBarSeven();
        
        bar36 = led6.getBarOne();
        bar37 = led6.getBarTwo();
        bar38 = led6.getBarThree();
        bar39 = led6.getBarFour();
        bar40 = led6.getBarFive();
        bar41 = led6.getBarSix();
        bar42 = led6.getBarSeven();
    }
    
    /**
     * Method that creates a 2D graphics variable 
     * accesses and sets the color of each bar
     * then positions each bar by accessing their variables and putting them in Rectangle objects
     * 
     * @param Graphics- the graphics variable that is converted into a 2Dgraphics variable
     */
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(barOne.getBarColor());
        g2d.fill(new Rectangle(barOne.getXCoordinate(), barOne.getYCoordinate(), barOne.getWidth(), barOne.getHeight()));
        g2d.setColor(barTwo.getBarColor());
        g2d.fill(new Rectangle(barTwo.getXCoordinate(), barTwo.getYCoordinate(), barTwo.getWidth(), barTwo.getHeight()));
        g2d.setColor(barThree.getBarColor());
        g2d.fill(new Rectangle(barThree.getXCoordinate(), barThree.getYCoordinate(), barThree.getWidth(), barThree.getHeight()));
        g2d.setColor(barFour.getBarColor());
        g2d.fill(new Rectangle(barFour.getXCoordinate(), barFour.getYCoordinate(), barFour.getWidth(), barFour.getHeight()));
        g2d.setColor(barFive.getBarColor());
        g2d.fill(new Rectangle(barFive.getXCoordinate(), barFive.getYCoordinate(), barFive.getWidth(), barFive.getHeight()));
        g2d.setColor(barSix.getBarColor());
        g2d.fill(new Rectangle(barSix.getXCoordinate(), barSix.getYCoordinate(), barSix.getWidth(), barSix.getHeight()));
        g2d.setColor(barSeven.getBarColor());
        g2d.fill(new Rectangle(barSeven.getXCoordinate(), barSeven.getYCoordinate(), barSeven.getWidth(), barSeven.getHeight()));
        
        g2d.setColor(bar8.getBarColor());
        g2d.fill(new Rectangle(bar8.getXCoordinate(), bar8.getYCoordinate(), bar8.getWidth(), bar8.getHeight()));
        g2d.setColor(bar9.getBarColor());
        g2d.fill(new Rectangle(bar9.getXCoordinate(), bar9.getYCoordinate(), bar9.getWidth(), bar9.getHeight()));
        g2d.setColor(bar10.getBarColor());
        g2d.fill(new Rectangle(bar10.getXCoordinate(), bar10.getYCoordinate(), bar10.getWidth(), bar10.getHeight()));
        g2d.setColor(bar11.getBarColor());
        g2d.fill(new Rectangle(bar11.getXCoordinate(), bar11.getYCoordinate(), bar11.getWidth(), bar11.getHeight()));
        g2d.setColor(bar12.getBarColor());
        g2d.fill(new Rectangle(bar12.getXCoordinate(), bar12.getYCoordinate(), bar12.getWidth(), bar12.getHeight()));
        g2d.setColor(bar13.getBarColor());
        g2d.fill(new Rectangle(bar13.getXCoordinate(), bar13.getYCoordinate(), bar13.getWidth(), bar13.getHeight()));
        g2d.setColor(bar14.getBarColor());
        g2d.fill(new Rectangle(bar14.getXCoordinate(), bar14.getYCoordinate(), bar14.getWidth(), bar14.getHeight()));
        
        g2d.setColor(bar15.getBarColor());
        g2d.fill(new Rectangle(bar15.getXCoordinate(), bar15.getYCoordinate(), bar15.getWidth(), bar15.getHeight()));
        g2d.setColor(bar16.getBarColor());
        g2d.fill(new Rectangle(bar16.getXCoordinate(), bar16.getYCoordinate(), bar16.getWidth(), bar16.getHeight()));
        g2d.setColor(bar17.getBarColor());
        g2d.fill(new Rectangle(bar17.getXCoordinate(), bar17.getYCoordinate(), bar17.getWidth(), bar17.getHeight()));
        g2d.setColor(bar18.getBarColor());
        g2d.fill(new Rectangle(bar18.getXCoordinate(), bar18.getYCoordinate(), bar18.getWidth(), bar18.getHeight()));
        g2d.setColor(bar19.getBarColor());
        g2d.fill(new Rectangle(bar19.getXCoordinate(), bar19.getYCoordinate(), bar19.getWidth(), bar19.getHeight()));
        g2d.setColor(bar20.getBarColor());
        g2d.fill(new Rectangle(bar20.getXCoordinate(), bar20.getYCoordinate(), bar20.getWidth(), bar20.getHeight()));
        g2d.setColor(bar21.getBarColor());
        g2d.fill(new Rectangle(bar21.getXCoordinate(), bar21.getYCoordinate(), bar21.getWidth(), bar21.getHeight()));
        
        g2d.setColor(bar22.getBarColor());
        g2d.fill(new Rectangle(bar22.getXCoordinate(), bar22.getYCoordinate(), bar22.getWidth(), bar22.getHeight()));
        g2d.setColor(bar23.getBarColor());
        g2d.fill(new Rectangle(bar23.getXCoordinate(), bar23.getYCoordinate(), bar23.getWidth(), bar23.getHeight()));
        g2d.setColor(bar24.getBarColor());
        g2d.fill(new Rectangle(bar24.getXCoordinate(), bar24.getYCoordinate(), bar24.getWidth(), bar24.getHeight()));
        g2d.setColor(bar25.getBarColor());
        g2d.fill(new Rectangle(bar25.getXCoordinate(), bar25.getYCoordinate(), bar25.getWidth(), bar25.getHeight()));
        g2d.setColor(bar26.getBarColor());
        g2d.fill(new Rectangle(bar26.getXCoordinate(), bar26.getYCoordinate(), bar26.getWidth(), bar26.getHeight()));
        g2d.setColor(bar27.getBarColor());
        g2d.fill(new Rectangle(bar27.getXCoordinate(), bar27.getYCoordinate(), bar27.getWidth(), bar27.getHeight()));
        g2d.setColor(bar28.getBarColor());
        g2d.fill(new Rectangle(bar28.getXCoordinate(), bar28.getYCoordinate(), bar28.getWidth(), bar28.getHeight()));
        
        g2d.setColor(bar29.getBarColor());
        g2d.fill(new Rectangle(bar29.getXCoordinate(), bar29.getYCoordinate(), bar29.getWidth(), bar29.getHeight()));
        g2d.setColor(bar30.getBarColor());
        g2d.fill(new Rectangle(bar30.getXCoordinate(), bar30.getYCoordinate(), bar30.getWidth(), bar30.getHeight()));
        g2d.setColor(bar31.getBarColor());
        g2d.fill(new Rectangle(bar31.getXCoordinate(), bar31.getYCoordinate(), bar31.getWidth(), bar31.getHeight()));
        g2d.setColor(bar32.getBarColor());
        g2d.fill(new Rectangle(bar32.getXCoordinate(), bar32.getYCoordinate(), bar32.getWidth(), bar32.getHeight()));
        g2d.setColor(bar33.getBarColor());
        g2d.fill(new Rectangle(bar33.getXCoordinate(), bar33.getYCoordinate(), bar33.getWidth(), bar33.getHeight()));
        g2d.setColor(bar34.getBarColor());
        g2d.fill(new Rectangle(bar34.getXCoordinate(), bar34.getYCoordinate(), bar34.getWidth(), bar34.getHeight()));
        g2d.setColor(bar35.getBarColor());
        g2d.fill(new Rectangle(bar35.getXCoordinate(), bar35.getYCoordinate(), bar35.getWidth(), bar35.getHeight()));
        
        g2d.setColor(bar36.getBarColor());
        g2d.fill(new Rectangle(bar36.getXCoordinate(), bar36.getYCoordinate(), bar36.getWidth(), bar36.getHeight()));
        g2d.setColor(bar37.getBarColor());
        g2d.fill(new Rectangle(bar37.getXCoordinate(), bar37.getYCoordinate(), bar37.getWidth(), bar37.getHeight()));
        g2d.setColor(bar38.getBarColor());
        g2d.fill(new Rectangle(bar38.getXCoordinate(), bar38.getYCoordinate(), bar38.getWidth(), bar38.getHeight()));
        g2d.setColor(bar39.getBarColor());
        g2d.fill(new Rectangle(bar39.getXCoordinate(), bar39.getYCoordinate(), bar39.getWidth(), bar39.getHeight()));
        g2d.setColor(bar40.getBarColor());
        g2d.fill(new Rectangle(bar40.getXCoordinate(), bar40.getYCoordinate(), bar40.getWidth(), bar40.getHeight()));
        g2d.setColor(bar41.getBarColor());
        g2d.fill(new Rectangle(bar41.getXCoordinate(), bar41.getYCoordinate(), bar41.getWidth(), bar41.getHeight()));
        g2d.setColor(bar42.getBarColor());
        g2d.fill(new Rectangle(bar42.getXCoordinate(), bar42.getYCoordinate(), bar42.getWidth(), bar42.getHeight()));
    }
}
