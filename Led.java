import java.awt.*;
import javax.swing.*;
/**
 * Class that creates a single LED digit and contains methods to changle its value
 * 
 * @author (Jordan Harrelson) 
 * @version (10/06/14)
 */
public class Led extends Bar
{
public Bar bar1;                                                                                                                                        //first bar to construct the led digit
public Bar bar2;                                                                                                                                        //second bar to construct the led digit
public Bar bar3;                                                                                                                                        //third bar to construct the led digit
public Bar bar4;                                                                                                                                        //fourth bar to construct the led digit
public Bar bar5;                                                                                                                                        //fifth bar to construct the led digit
public Bar bar6;                                                                                                                                        //sixth bar to construct the led digit
public Bar bar7;                                                                                                                                        //seventh bar to construct the led digit
public int value;                                                                                                                                       //set the value of the led digit
public boolean active;                                                                                                                                  //boolean to determine if it's active or not

public Led(){                                                                                                                                           //default constructor
    super();                                                                                                                                            //call the default constructor for the Bar Class
}
/**
 * Constructor for objects of class Led, takes in a Bar and clones it 6 times, placing it at different points to make an 8
 * 
 * @param Bar- single bar to be used to make an LED
 */
public Led(Bar testBar)                                                                                                                                 //constructor with a bar passed in
{                                                                                                                                                       //
    super();                                                                                                                                            //call default constructor
    setActive(false);                                                                                                                                   //set active to false
    setValue(0);                                                                                                                                        //set value to 0
    this.bar1 = new Bar(testBar.getBarColor(), testBar.getXCoordinate(), testBar.getYCoordinate(), testBar.getWidth(), testBar.getHeight());            //initialize the first bar with the givin coordinates
    this.bar2 = new Bar(testBar.getBarColor(), testBar.getXCoordinate()+40, testBar.getYCoordinate(), testBar.getWidth(), testBar.getHeight());         //initialize the second with an offset
    this.bar3 = new Bar(testBar.getBarColor(), testBar.getXCoordinate(), testBar.getYCoordinate()+60, testBar.getWidth(), testBar.getHeight());         //initialize third with an offset
    this.bar4 = new Bar(testBar.getBarColor(), testBar.getXCoordinate()+40, testBar.getYCoordinate()+60, testBar.getWidth(), testBar.getHeight());      //initialize fourth with an offset
    this.bar5 = new Bar(testBar.getBarColor(), testBar.getXCoordinate()+10, testBar.getYCoordinate()-10, testBar.getWidth()+20, testBar.getHeight()-40);//initialize fifth with an offset
    this.bar6 = new Bar(testBar.getBarColor(), testBar.getXCoordinate()+10, testBar.getYCoordinate()+50, testBar.getWidth()+20, testBar.getHeight()-40);//initialize sixth with an offset
    this.bar7 = new Bar(testBar.getBarColor(), testBar.getXCoordinate()+10, testBar.getYCoordinate()+110, testBar.getWidth()+20, testBar.getHeight()-40);//initialize seventh with an offset
}                                                                                                                                                       //

/**
 * Method that sets the LED object in question to the number zero
 */
public void zero(){
    bar1.setBarColor(Color.black);
    bar2.setBarColor(Color.black);
    bar3.setBarColor(Color.black);
    bar4.setBarColor(Color.black);
    bar5.setBarColor(Color.black);
    bar6.setBarColor(Color.red);
    bar7.setBarColor(Color.black);
}

/**
 * Method that sets the LED object in question to the number one
 */
public void one(){
    bar1.setBarColor(Color.red);
    bar2.setBarColor(Color.black);
    bar3.setBarColor(Color.red);
    bar4.setBarColor(Color.black);
    bar5.setBarColor(Color.red);
    bar6.setBarColor(Color.red);
    bar7.setBarColor(Color.red);
}

/**
 * Method that sets the LED object in question to the number two
 */
public void two(){
    bar1.setBarColor(Color.red);
    bar2.setBarColor(Color.black);
    bar3.setBarColor(Color.black);
    bar4.setBarColor(Color.red);
    bar5.setBarColor(Color.black);
    bar6.setBarColor(Color.black);
    bar7.setBarColor(Color.black);
}

/**
 * Method that sets the LED object in question to the number three
 */
public void three(){
    bar1.setBarColor(Color.red);
    bar2.setBarColor(Color.black);
    bar3.setBarColor(Color.red);
    bar4.setBarColor(Color.black);
    bar5.setBarColor(Color.black);
    bar6.setBarColor(Color.black);
    bar7.setBarColor(Color.black);
}

/**
 * Method that sets the LED object in question to the number four
 */
public void four(){
    bar1.setBarColor(Color.black);
    bar2.setBarColor(Color.black);
    bar3.setBarColor(Color.red);
    bar4.setBarColor(Color.black);
    bar5.setBarColor(Color.red);
    bar6.setBarColor(Color.black);
    bar7.setBarColor(Color.red);
}

/**
 * Method that sets the LED object in question to the number five
 */
public void five(){
    bar1.setBarColor(Color.black);
    bar2.setBarColor(Color.red);
    bar3.setBarColor(Color.red);
    bar4.setBarColor(Color.black);
    bar5.setBarColor(Color.black);
    bar6.setBarColor(Color.black);
    bar7.setBarColor(Color.black);
}

/**
 * Method that sets the LED object in question to the number six
 */
public void six(){
    bar1.setBarColor(Color.black);
    bar2.setBarColor(Color.red);
    bar3.setBarColor(Color.black);
    bar4.setBarColor(Color.black);
    bar5.setBarColor(Color.black);
    bar6.setBarColor(Color.black);
    bar7.setBarColor(Color.black);
}

/**
 * Method that sets the LED object in question to the number seven
 */
public void seven(){
    bar1.setBarColor(Color.red);
    bar2.setBarColor(Color.black);
    bar3.setBarColor(Color.red);
    bar4.setBarColor(Color.black);
    bar5.setBarColor(Color.black);
    bar6.setBarColor(Color.red);
    bar7.setBarColor(Color.red);
}

/**
 * Method that sets the LED object in question to the number eight
 */
public void eight(){
    bar1.setBarColor(Color.black);
    bar2.setBarColor(Color.black);
    bar3.setBarColor(Color.black);
    bar4.setBarColor(Color.black);
    bar5.setBarColor(Color.black);
    bar6.setBarColor(Color.black);
    bar7.setBarColor(Color.black);
}

/**
 * Method that sets the LED object in question to the number nine
 */
public void nine(){
    bar1.setBarColor(Color.black);
    bar2.setBarColor(Color.black);
    bar3.setBarColor(Color.red);
    bar4.setBarColor(Color.black);
    bar5.setBarColor(Color.black);
    bar6.setBarColor(Color.black);
    bar7.setBarColor(Color.red);
}

/**
 * Method that sets the LED object in question to the letter A
 */
public void letterA(){
    bar1.setBarColor(Color.black);
    bar2.setBarColor(Color.black);
    bar3.setBarColor(Color.black);
    bar4.setBarColor(Color.black);
    bar5.setBarColor(Color.black);
    bar6.setBarColor(Color.black);
    bar7.setBarColor(Color.red);
}

/**
 * Method that sets the LED object in question to the letter B
 */
public void letterB(){
    bar1.setBarColor(Color.black);
    bar2.setBarColor(Color.red);
    bar3.setBarColor(Color.black);
    bar4.setBarColor(Color.black);
    bar5.setBarColor(Color.red);
    bar6.setBarColor(Color.black);
    bar7.setBarColor(Color.black);
}

/**
 * Method that sets the LED object in question to the letter C
 */
public void letterC(){
    bar1.setBarColor(Color.black);
    bar2.setBarColor(Color.red);
    bar3.setBarColor(Color.black);
    bar4.setBarColor(Color.red);
    bar5.setBarColor(Color.black);
    bar6.setBarColor(Color.red);
    bar7.setBarColor(Color.black);
}

/**
 * Method that sets the LED object in question to the letter D
 */
public void letterD(){
    bar1.setBarColor(Color.red);
    bar2.setBarColor(Color.black);
    bar3.setBarColor(Color.black);
    bar4.setBarColor(Color.black);
    bar5.setBarColor(Color.red);
    bar6.setBarColor(Color.black);
    bar7.setBarColor(Color.black);
}

/**
 * Method that sets the LED object in question to the letter E
 */
public void letterE(){
    bar1.setBarColor(Color.black);
    bar2.setBarColor(Color.red);
    bar3.setBarColor(Color.black);
    bar4.setBarColor(Color.red);
    bar5.setBarColor(Color.black);
    bar6.setBarColor(Color.black);
    bar7.setBarColor(Color.black);
}

/**
 * Method that sets the LED object in question to the letter F
 */
public void letterF(){
    bar1.setBarColor(Color.black);
    bar2.setBarColor(Color.red);
    bar3.setBarColor(Color.black);
    bar4.setBarColor(Color.red);
    bar5.setBarColor(Color.black);
    bar6.setBarColor(Color.black);
    bar7.setBarColor(Color.red);
}

/**
 * Method that sets resets the LED object in question, by setting all the bars to red
 */
public void reset(){
    bar1.setBarColor(Color.red);
    bar2.setBarColor(Color.red);
    bar3.setBarColor(Color.red);
    bar4.setBarColor(Color.red);
    bar5.setBarColor(Color.red);
    bar6.setBarColor(Color.red);
    bar7.setBarColor(Color.red);
}

/**
 * Method that checks the int in the paramater and based on the number proved, it calls the corresponding number method
 * Sets the value of the LED object to the provided and lists the LED as active
 * 
 * @param int- the number provided to set the LED object to, numbers can range 1 to 15
 */
public void setNum(int number){
    if(number == 0){
        zero();
        setValue(0);
        setActive(true);
    }
    else if(number == 1){
        one();
        setValue(1);
        setActive(true);
    }
    else if(number == 2){
        two();
        setValue(2);
        setActive(true);
    }
    else if(number == 3){
        three();
        setValue(3);
        setActive(true);
    }
    else if(number == 4){
        four();
        setValue(4);
        setActive(true);
    }
    else if(number == 5){
        five();
        setValue(5);
        setActive(true);
    }
    else if(number == 6){
        six();
        setValue(6);
        setActive(true);
    }
    else if(number == 7){
        seven();
        setValue(7);
        setActive(true);
    }
    else if(number == 8){
        eight();
        setValue(8);
        setActive(true);
    }
    else if(number == 9){
        nine();
        setValue(9);
        setActive(true);
    }
    else if(number == 10){
        letterA();
        setValue(10);
        setActive(true);
    }
    else if(number == 11){
        letterB();
        setValue(11);
        setActive(true);
    }
    else if(number == 12){
        letterC();
        setValue(12);
        setActive(true);
    }
    else if(number == 13){
        letterD();
        setValue(13);
        setActive(true);
    }
    else if(number == 14){
        letterE();
        setValue(14);
        setActive(true);
    }
    else if(number == 15){
        letterF();
        setValue(15);
        setActive(true);
    }
}

/**
 * Method that sets the LED as active
 * 
 * @param boolean- true or false, sets the LED accordingly
 */
public void setActive(boolean active){
    this.active = active;
}

/**
 * Method that sets the number value of the LED
 * 
 * @param int- sets the value of LED according to the number provided
 */
public void setValue(int value){
    this.value = value;
}

/**
 * Method that returns the first Bar of the LED
 * 
 * @return Bar- the first bar
 */
public Bar getBarOne(){
    return bar1;
}

/**
 * Method that returns the second Bar of the LED
 * 
 * @return Bar- the second bar
 */
public Bar getBarTwo(){
    return bar2;
}

/**
 * Method that returns the third Bar of the LED
 * 
 * @return Bar- the third bar
 */
public Bar getBarThree(){
    return bar3;
}

/**
 * Method that returns the fourth Bar of the LED
 * 
 * @return Bar- the fourth bar
 */
public Bar getBarFour(){
    return bar4;
}

/**
 * Method that returns the fifth Bar of the LED
 * 
 * @return Bar- the fifth bar
 */
public Bar getBarFive(){
    return bar5;
}

/**
 * Method that returns the sixth Bar of the LED
 * 
 * @return Bar- the sixth bar
 */
public Bar getBarSix(){
    return bar6;
}

/**
 * Method that returns the seventh Bar of the LED
 * 
 * @return Bar- the seventh bar
 */
public Bar getBarSeven(){
    return bar7;
}

/**
 * Method that returns whether the LED is active or not
 * 
 * @return boolean- true or false, is it active?
 */
public boolean getActive(){
    return active;
}

/**
 * method that returns the value displayed on the LED
 * 
 * @return int- the LED's value
 */
public int getValue(){
    return value;
}
}


