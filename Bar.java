import java.awt.*;
//import javax.swing.*;
/**
 * Class that creates a bar object, to feed into a Rectangle object
 * 
 * @author (Jordan Harrelson) 
 * @version (10/06/14)
 */
public class Bar
{
   public Color barColor;                             //the color of the bar, can be red or black
   public int xCoordinate;                            //the xCoordinate of the bar on the JFrame panel
   public int yCoordinate;                            //the yCoordinate of the bar on the JFrame panel
   public int width;                                  //the width of the bar
   public int height;                                 //the height of the bar
   
   /** 
    * default constructor, serves no real purpose
    */
   public Bar(){
    }
    
   /**
    * Constructor for objects of class Bar
    * 
    * @param Color- Color variable to decide the color of the bar, black or red
    * @param int- four int paramaters for the XCoordinate position, YCoordinate position, width and height
    */
   public Bar(Color barColor, int xCoordinate, int yCoordinate, int width, int height)
   {
       setBarColor(barColor);
       setXCoordinate(xCoordinate);
       setYCoordinate(yCoordinate);
       setWidth(width);
       setHeight(height);
   }
   
   /** 
    * Setter method that sets the bar color
    * 
    * @param Color- color of the bar
    */
   public void setBarColor(Color barColor){
        this.barColor = barColor;
    }
    
   /**
    * Setter method that sets the XCoordinate
    * 
    * @param Int- the position of the XCoordinate
    */
   public void setXCoordinate(int xCoordinate){
        this.xCoordinate = xCoordinate;
    }
    
   /**
    * Setter method that sets the YCoordinate
    * 
    * @param Int- the position of the YCoordinate
    */
   public void setYCoordinate(int yCoordinate){
        this.yCoordinate = yCoordinate;
    }
    
   /**
    * Setter method that sets the Width of the bar
    * 
    * @param Int- the width of the bar
    */ 
   public void setWidth(int width){
        this.width = width;
    }
   
   /**
    * Setter method that sets the height of the bar
    * 
    * @param Int- the height of the bar
    */
   public void setHeight(int height){
        this.height = height;
    }
   
    /**
     * Getter method that returns the color of the bar
     * 
     * @return the color of the bar, red or black
     */
   public Color getBarColor(){
       return barColor;
   }
   
   /**
    * Getter method that returns the position of the XCoordinate
    * 
    * @return the position of the XCoordinate
    */
   public int getXCoordinate(){
        return xCoordinate;
    }
    
    /**
     * Getter method that returns the position of the YCoordinate
     * 
     * @return the position of the YCoordinate
     */
   public int getYCoordinate(){
        return yCoordinate;
    }
    
    /**
     * Getter method that returns the width of the bar
     * 
     * @return the width of the bar
     */
   public int getWidth(){
        return width;
    }
    
    /**
     * Getter method that returns the height of the bar
     * 
     * @return the height of the bar
     */
   public int getHeight(){
        return height;
    }
}

