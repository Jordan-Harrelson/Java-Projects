import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
/**
 * Class that contains the main method, the class that provides most of the inner workings of the calculator
 * The class first creates a JFrame, resizes it, and creates six LED objects
 * It then creates all the buttons necessary for the application to run, adding the necessary components to them
 * It then calls the overriden draw method from mycomponent to change the LEDs as necessary
 * 
 * The calculator has three functions, Decimal, Hexidecimal and Roman numeral
 * 
 * @author (Jordan Harrelson) 
 * @version (10/8/14)
 */
public class Calc extends Led implements ActionListener
{
    private enum Actions {
        ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, A, B, C, D, E, F, ROMD, ROMC, ROMI, ROMV, ROMX, ROML, ROMM,
        ADDITION, SUBTRACTION, DIVISION, MULTIPLICATION, CLEAR, SUBMIT, DECIMAL, HEXIDECIMAL, ROMAN
    }
    
    public LinkedList<String> numbers;
    public ListIterator<String> iter;
    public JFrame theFrame;
    public JButton buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, 
    buttonNine, buttonA, buttonB, buttonC, buttonD, buttonE, buttonF, buttonSubmit, 
    buttonClear, buttonAddition, buttonSubtraction, buttonDivision, buttonMultiplication, buttonDecimal, buttonHex, buttonRom,
    buttonI, buttonV, buttonX, buttonL, buttonRomC, buttonRomD, buttonM;
    public Led firstLed, secondLed, thirdLed, fourthLed, fifthLed, sixthLed;
    public int valueOne, valueTwo, led1, led2, led3, led4, led5, led6, values;
    public String mode, label;
    public JLabel stringLabel;
    /**
     * Constructor method for the Calc class, creates a JFrame, creates the LED's and assigns their default values
     * It then creates a label for writing out the roman numerals 
     */
    public Calc()
    {
        super();
        theFrame = new JFrame();
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        firstLed = new Led(new Bar(Color.red,20,20,10,50));
        firstLed.reset();
        secondLed = new Led(new Bar(Color.red,90,20,10,50)); 
        secondLed.reset();
        thirdLed = new Led(new Bar(Color.red, 170,20,10,50)); 
        thirdLed.reset();
        fourthLed = new Led(new Bar(Color.red, 240,20,10,50)); 
        fourthLed.reset();
        fifthLed = new Led(new Bar(Color.red, 310,20,10,50)); 
        fifthLed.reset();
        sixthLed = new Led(new Bar(Color.red, 380,20,10,50));
        sixthLed.reset();
        theFrame.pack();
        valueOne = 0;
        values = 0;
        mode = "decimal";
        numbers = new LinkedList<String>();
        label = "";
        stringLabel = new JLabel(label);
        stringLabel.setBounds(500,0,1500,150);
        stringLabel.setFont(new Font("times new roman", Font.BOLD, 60));
        theFrame.setSize(1400,1000);
    }
    
    /**
     * Main method that creates a new Calc object, adds the buttons and draws the LEDs
     */
    public static void main(String[] args){
        Calc run = new Calc();
        run.addButtons();
        run.draw();
    }
    
    /**
     * Method that creates and displays every single button used in the device
     * It first creates a new JButton, setting it's text 
     * Then it sets the dimensions and position of the button in question, adds an action listener and finally adds the button to the Frame
     * Some will be toggled between being enabled or not depending on the calculator mode
     */
    public void addButtons(){
        buttonZero = new JButton("0");
        buttonZero.setBounds(75,350,75,50);
        buttonZero.setActionCommand(Actions.ZERO.name());
        buttonZero.addActionListener(this);
        theFrame.add(buttonZero);
        
        buttonOne = new JButton("1");
        buttonOne.setBounds(0,200,75,50);
        buttonOne.setActionCommand(Actions.ONE.name());
        buttonOne.addActionListener(this);
        theFrame.add(buttonOne);
        
        buttonTwo = new JButton("2");
        buttonTwo.setBounds(75,200,75,50);
        buttonTwo.setActionCommand(Actions.TWO.name());
        buttonTwo.addActionListener(this);
        theFrame.add(buttonTwo);
        
        buttonThree = new JButton("3");
        buttonThree.setBounds(150,200,75,50);
        buttonThree.setActionCommand(Actions.THREE.name());
        buttonThree.addActionListener(this);
        theFrame.add(buttonThree);
        
        buttonFour = new JButton("4");
        buttonFour.setBounds(0,250,75,50);
        buttonFour.setActionCommand(Actions.FOUR.name());
        buttonFour.addActionListener(this);
        theFrame.add(buttonFour);
        
        buttonFive = new JButton("5");
        buttonFive.setBounds(75,250,75,50);
        buttonFive.setActionCommand(Actions.FIVE.name());
        buttonFive.addActionListener(this);
        theFrame.add(buttonFive);
        
        buttonSix = new JButton("6");
        buttonSix.setBounds(150,250,75,50);
        buttonSix.setActionCommand(Actions.SIX.name());
        buttonSix.addActionListener(this);
        theFrame.add(buttonSix);
        
        buttonSeven = new JButton("7");
        buttonSeven.setBounds(0,300,75,50);
        buttonSeven.setActionCommand(Actions.SEVEN.name());
        buttonSeven.addActionListener(this);
        theFrame.add(buttonSeven);
        
        buttonEight = new JButton("8");
        buttonEight.setBounds(75,300,75,50);
        buttonEight.setActionCommand(Actions.EIGHT.name());
        buttonEight.addActionListener(this);
        theFrame.add(buttonEight);
        
        buttonNine = new JButton("9");
        buttonNine.setBounds(150,300,75,50);
        buttonNine.setActionCommand(Actions.NINE.name());
        buttonNine.addActionListener(this);
        theFrame.add(buttonNine);
        
        buttonA = new JButton("A");
        buttonA.setBounds(300,200,75,50);
        buttonA.setActionCommand(Actions.A.name());
        buttonA.addActionListener(this);
        buttonA.setEnabled(false);
        theFrame.add(buttonA);
        
        buttonB = new JButton("B");
        buttonB.setBounds(375,200,75,50);
        buttonB.setActionCommand(Actions.B.name());
        buttonB.addActionListener(this);
        buttonB.setEnabled(false);
        theFrame.add(buttonB);
        
        buttonC = new JButton("C");
        buttonC.setBounds(300,250,75,50);
        buttonC.setActionCommand(Actions.C.name());
        buttonC.addActionListener(this);
        buttonC.setEnabled(false);
        theFrame.add(buttonC);
        
        buttonD = new JButton("D");
        buttonD.setBounds(375,250,75,50);
        buttonD.setActionCommand(Actions.D.name());
        buttonD.addActionListener(this);
        buttonD.setEnabled(false);
        theFrame.add(buttonD);
        
        buttonE = new JButton("E");
        buttonE.setBounds(300,300,75,50);
        buttonE.setActionCommand(Actions.E.name());
        buttonE.addActionListener(this);
        buttonE.setEnabled(false);
        theFrame.add(buttonE);
        
        buttonF = new JButton("F");
        buttonF.setBounds(375,300,75,50);
        buttonF.setActionCommand(Actions.F.name());
        buttonF.addActionListener(this);
        buttonF.setEnabled(false);
        theFrame.add(buttonF);
        
        buttonI = new JButton("I");
        buttonI.setBounds(500,200,75,50);
        buttonI.setActionCommand(Actions.ROMI.name());
        buttonI.addActionListener(this);
        buttonI.setEnabled(false);
        theFrame.add(buttonI);
        
        buttonV = new JButton("V");
        buttonV.setBounds(575,200,75,50);
        buttonV.setActionCommand(Actions.ROMV.name());
        buttonV.addActionListener(this);
        buttonV.setEnabled(false);
        theFrame.add(buttonV);
        
        buttonX = new JButton("X");
        buttonX.setBounds(500,250,75,50);
        buttonX.setActionCommand(Actions.ROMX.name());
        buttonX.addActionListener(this);
        buttonX.setEnabled(false);
        theFrame.add(buttonX);
        
        buttonL = new JButton("L");
        buttonL.setBounds(575,250,75,50);
        buttonL.setActionCommand(Actions.ROML.name());
        buttonL.addActionListener(this);
        buttonL.setEnabled(false);
        theFrame.add(buttonL);
        
        buttonRomC = new JButton("C");
        buttonRomC.setBounds(500,300,75,50);
        buttonRomC.setActionCommand(Actions.ROMC.name());
        buttonRomC.addActionListener(this);
        buttonRomC.setEnabled(false);
        theFrame.add(buttonRomC);
        
        buttonRomD = new JButton("D");
        buttonRomD.setBounds(575,300,75,50);
        buttonRomD.setActionCommand(Actions.ROMD.name());
        buttonRomD.addActionListener(this);
        buttonRomD.setEnabled(false);
        theFrame.add(buttonRomD);
        
        buttonM = new JButton("M");
        buttonM.setBounds(540,350,75,50);
        buttonM.setActionCommand(Actions.ROMM.name());
        buttonM.addActionListener(this);
        buttonM.setEnabled(false);
        theFrame.add(buttonM);
        
        buttonAddition = new JButton("+");
        buttonAddition.setBounds(675,200,75,100);
        buttonAddition.setActionCommand(Actions.ADDITION.name());
        buttonAddition.addActionListener(this);
        theFrame.add(buttonAddition);
        
        buttonSubtraction = new JButton("-");
        buttonSubtraction.setBounds(750,200,75,100);
        buttonSubtraction.setActionCommand(Actions.SUBTRACTION.name());
        buttonSubtraction.addActionListener(this);
        theFrame.add(buttonSubtraction);
        
        buttonDivision = new JButton("/");
        buttonDivision.setBounds(675,300,75,100);
        buttonDivision.setActionCommand(Actions.DIVISION.name());
        buttonDivision.addActionListener(this);
        theFrame.add(buttonDivision);
        
        buttonMultiplication = new JButton("*");
        buttonMultiplication.setBounds(750,300,75,100);
        buttonMultiplication.setActionCommand(Actions.MULTIPLICATION.name());
        buttonMultiplication.addActionListener(this);
        theFrame.add(buttonMultiplication);
        
        buttonSubmit = new JButton("Submit");
        buttonSubmit.setBounds(75,450,150,50);
        buttonSubmit.setActionCommand(Actions.SUBMIT.name());
        buttonSubmit.addActionListener(this);
        theFrame.add(buttonSubmit);
        
        buttonClear = new JButton("Clear");
        buttonClear.setBounds(250,450,150,50);
        buttonClear.setActionCommand(Actions.CLEAR.name());
        buttonClear.addActionListener(this);
        theFrame.add(buttonClear);
        
        buttonDecimal = new JButton("Decimal");
        buttonDecimal.setBounds(450,450,100,50);
        buttonDecimal.setActionCommand(Actions.DECIMAL.name());
        buttonDecimal.addActionListener(this);
        buttonDecimal.setEnabled(false);
        theFrame.add(buttonDecimal);
        
        buttonHex = new JButton("Hexidecimal");
        buttonHex.setBounds(570,450,120,50);
        buttonHex.setActionCommand(Actions.HEXIDECIMAL.name());
        buttonHex.addActionListener(this);
        theFrame.add(buttonHex);
        
        buttonRom = new JButton("Roman");
        buttonRom.setBounds(710,450,100,50);
        buttonRom.setActionCommand(Actions.ROMAN.name());
        buttonRom.addActionListener(this);
        theFrame.add(buttonRom);
    }
    
    /**
     * Method that takes in an listens for the Action events attached to each button
     * It then continues to take in numbers until the user hits an operator, clear or submit
     * When an operator is chosen the method looks at the current mode (decimal, hexi or roman) and performs that operation making sure to keep a running total going and displaying the results afterward
     * When Submit is finally hit, the running total is taken and redisplayed to the LEDs
     * If the mode is in Hexi or Roman, additionally operations will be performed before it is redisplayed 
     */
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand() == Actions.ZERO.name()){
            figureItOut(0);
        }
        else if(e.getActionCommand() == Actions.ONE.name()){
            figureItOut(1);
        }
        else if(e.getActionCommand() == Actions.TWO.name()){
            figureItOut(2);
        }
        else if(e.getActionCommand() == Actions.THREE.name()){
            figureItOut(3);
        }
        else if(e.getActionCommand() == Actions.FOUR.name()){
            figureItOut(4);
        }
        else if(e.getActionCommand() == Actions.FIVE.name()){
            figureItOut(5);
        }
        else if(e.getActionCommand() == Actions.SIX.name()){
            figureItOut(6);
        }
        else if(e.getActionCommand() == Actions.SEVEN.name()){
            figureItOut(7);
        }
        else if(e.getActionCommand() == Actions.EIGHT.name()){
            figureItOut(8);
        }
        else if(e.getActionCommand() == Actions.NINE.name()){
            figureItOut(9);
        }
        else if(e.getActionCommand() == Actions.A.name()){
            figureItOut(10);
        }
        else if(e.getActionCommand() == Actions.B.name()){
            figureItOut(11);
        }
        else if(e.getActionCommand() == Actions.C.name()){
            figureItOut(12);
        }
        else if(e.getActionCommand() == Actions.D.name()){
            figureItOut(13);
        }
        else if(e.getActionCommand() == Actions.E.name()){
            figureItOut(14);
        }
        else if(e.getActionCommand() == Actions.F.name()){
            figureItOut(15);
        }
        else if(e.getActionCommand() == Actions.ROMI.name()){
            if(label.length() < 15){
                label += "I";
                draw();
            }
            else{
                error();
            }
        }
        else if(e.getActionCommand() == Actions.ROMV.name()){
            if(label.length() < 15){
                label += "V";
                draw();
            }
            else{
                error();
            }
        }
        else if(e.getActionCommand() == Actions.ROMX.name()){
            if(label.length() < 15){
                label += "X";
                draw();
            }
            else{
                error();
            }
        }
        else if(e.getActionCommand() == Actions.ROML.name()){
            if(label.length() < 15){
                label += "L";
                draw();
            }
            else{
                error();
            }
        }
        else if(e.getActionCommand() == Actions.ROMC.name()){
            if(label.length() < 15){
                label += "C";
                draw();
            }
            else{
                error();
            }
        }
        else if(e.getActionCommand() == Actions.ROMD.name()){
            if(label.length() < 15){
                label += "D";
                draw();
            }
            else{
                error();
            }
        }
        else if(e.getActionCommand() == Actions.ROMM.name()){
            if(label.length() < 15){
                label += "M";
                draw();
            }
            else{
                error();
            }
        }
        
        else if(e.getActionCommand() == Actions.DECIMAL.name()){
            buttonHex.setEnabled(true);
            buttonZero.setEnabled(true);
            buttonOne.setEnabled(true);
            buttonTwo.setEnabled(true);
            buttonThree.setEnabled(true);
            buttonFour.setEnabled(true);
            buttonFive.setEnabled(true);
            buttonSix.setEnabled(true);
            buttonSeven.setEnabled(true);
            buttonEight.setEnabled(true);
            buttonNine.setEnabled(true);
            buttonA.setEnabled(false);
            buttonB.setEnabled(false);
            buttonC.setEnabled(false);
            buttonD.setEnabled(false);
            buttonE.setEnabled(false);
            buttonF.setEnabled(false);
            buttonI.setEnabled(false);
            buttonV.setEnabled(false);
            buttonX.setEnabled(false);
            buttonL.setEnabled(false);
            buttonRomC.setEnabled(false);
            buttonRomD.setEnabled(false);
            buttonM.setEnabled(false);
            buttonDecimal.setEnabled(false);
            buttonRom.setEnabled(true);
            mode = "decimal";
            clear();
        }
        
        else if(e.getActionCommand() == Actions.HEXIDECIMAL.name()){
            buttonHex.setEnabled(false);
            buttonZero.setEnabled(true);
            buttonOne.setEnabled(true);
            buttonTwo.setEnabled(true);
            buttonThree.setEnabled(true);
            buttonFour.setEnabled(true);
            buttonFive.setEnabled(true);
            buttonSix.setEnabled(true);
            buttonSeven.setEnabled(true);
            buttonEight.setEnabled(true);
            buttonNine.setEnabled(true);
            buttonI.setEnabled(false);
            buttonV.setEnabled(false);
            buttonX.setEnabled(false);
            buttonL.setEnabled(false);
            buttonRomC.setEnabled(false);
            buttonRomD.setEnabled(false);
            buttonM.setEnabled(false);
            buttonA.setEnabled(true);
            buttonB.setEnabled(true);
            buttonC.setEnabled(true);
            buttonD.setEnabled(true);
            buttonE.setEnabled(true);
            buttonF.setEnabled(true);
            buttonDecimal.setEnabled(true);
            buttonRom.setEnabled(true);
            mode = "hexidecimal";
            clear();
        }
        
        else if(e.getActionCommand() == Actions.ROMAN.name()){
            buttonZero.setEnabled(false);
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            buttonFour.setEnabled(false);
            buttonFive.setEnabled(false);
            buttonSix.setEnabled(false);
            buttonSeven.setEnabled(false);
            buttonEight.setEnabled(false);
            buttonNine.setEnabled(false);
            buttonI.setEnabled(true);
            buttonV.setEnabled(true);
            buttonX.setEnabled(true);
            buttonL.setEnabled(true);
            buttonRomC.setEnabled(true);
            buttonRomD.setEnabled(true);
            buttonM.setEnabled(true);
            buttonA.setEnabled(false);
            buttonB.setEnabled(false);
            buttonC.setEnabled(false);
            buttonD.setEnabled(false);
            buttonE.setEnabled(false);
            buttonF.setEnabled(false);
            buttonHex.setEnabled(true);
            buttonDecimal.setEnabled(true);
            buttonRom.setEnabled(false);
            mode = "roman";
            clear();
        }
        
        else if(e.getActionCommand() == Actions.ADDITION.name()){
            if(mode == "decimal"){
                valueOne = (sixthLed.getValue() + (fifthLed.getValue()*10) + (fourthLed.getValue()*100) + (thirdLed.getValue()*1000) + (secondLed.getValue()*10000) + (firstLed.getValue()*100000));
                numbers.add(Integer.toString(valueOne));
                numbers.add("addition");
                clearNoReset();
            }
            else if(mode == "roman"){
                valueOne = translateRoman(label);
                numbers.add(Integer.toString(valueOne));
                numbers.add("addition");
                clearNoReset();
            }
            else{
                valueOne = (sixthLed.getValue() + (fifthLed.getValue()*16) + (fourthLed.getValue()*(16^2)) + (thirdLed.getValue()*(16^3)) + (secondLed.getValue()*(16^4)) + (firstLed.getValue()*(16^5)));
                numbers.add(Integer.toString(valueOne));
                numbers.add("addition");
                clearNoReset();
            }
        }
        else if(e.getActionCommand() == Actions.SUBTRACTION.name()){
            if(mode == "decimal"){
                valueOne = (sixthLed.getValue() + (fifthLed.getValue()*10) + (fourthLed.getValue()*100) + (thirdLed.getValue()*1000) + (secondLed.getValue()*10000) + (firstLed.getValue()*100000));
                numbers.add(Integer.toString(valueOne));
                numbers.add("subtraction");
                clearNoReset();
            }
            else if(mode == "roman"){
                valueOne = translateRoman(label);
                numbers.add(Integer.toString(valueOne));
                numbers.add("subtraction");
                clearNoReset();
            }
            else{
                valueOne = ((sixthLed.getValue()) + (fifthLed.getValue()*16) + (fourthLed.getValue()*(16^2)) + (thirdLed.getValue()*(16^3)) + (secondLed.getValue()*(16^4)) + (firstLed.getValue()*(16^5)));
                numbers.add(Integer.toString(valueOne));
                numbers.add("subtraction");
                clearNoReset();
            }
        }
        else if(e.getActionCommand() == Actions.MULTIPLICATION.name()){
            if(mode == "decimal"){
                valueOne = (sixthLed.getValue() + (fifthLed.getValue()*10) + (fourthLed.getValue()*100) + (thirdLed.getValue()*1000) + (secondLed.getValue()*10000) + (firstLed.getValue()*100000));
                numbers.add(Integer.toString(valueOne));
                numbers.add("multiplication");
                clearNoReset();
            }
            else if(mode == "roman"){
                valueOne = translateRoman(label);
                numbers.add(Integer.toString(valueOne));
                numbers.add("multiplication");
                clearNoReset();
            }
            else{
                valueOne = ((sixthLed.getValue()) + (fifthLed.getValue()*16) + (fourthLed.getValue()*(16^2)) + (thirdLed.getValue()*(16^3)) + (secondLed.getValue()*(16^4)) + (firstLed.getValue()*(16^5)));
                numbers.add(Integer.toString(valueOne));
                numbers.add("multiplication");
                clearNoReset();
            }
        }
        else if(e.getActionCommand() == Actions.DIVISION.name()){
            if(mode == "decimal"){
                valueOne = (sixthLed.getValue() + (fifthLed.getValue()*10) + (fourthLed.getValue()*100) + (thirdLed.getValue()*1000) + (secondLed.getValue()*10000) + (firstLed.getValue()*100000));
                numbers.add(Integer.toString(valueOne));
                numbers.add("division");
                clearNoReset();
            }
            else if(mode == "roman"){
                valueOne = translateRoman(label);
                numbers.add(Integer.toString(valueOne));
                numbers.add("division");
                clearNoReset();
            }
            else{
                valueOne = ((sixthLed.getValue()) + (fifthLed.getValue()*16) + (fourthLed.getValue()*(16^2)) + (thirdLed.getValue()*(16^3)) + (secondLed.getValue()*(16^4)) + (firstLed.getValue()*(16^5)));
                numbers.add(Integer.toString(valueOne));
                numbers.add("division");
                clearNoReset();
            }
        }
        else if(e.getActionCommand() == Actions.CLEAR.name()){
            clear();
        }
        else if(e.getActionCommand() == Actions.SUBMIT.name()){
            if(numbers.size() == 0){
                error();
            }
            else{
                led1 = 0;
                led2 = 0;
                led3 = 0;
                led4 = 0;
                led5 = 0;
                led6 = 0;
                if(mode == "decimal"){
                    valueOne = (sixthLed.getValue() + (fifthLed.getValue()*10) + (fourthLed.getValue()*100) + (thirdLed.getValue()*1000) + (secondLed.getValue()*10000) + (firstLed.getValue()*100000));
                }
                else if(mode == "roman"){
                    valueOne = translateRoman(label);
                    label = "";
                }
                else{
                    valueOne = (sixthLed.getValue() + (fifthLed.getValue()*16) + (fourthLed.getValue()*(16^2)) + (thirdLed.getValue()*(16^3)) + (secondLed.getValue()*(16^4)) + (firstLed.getValue()*(16^5)));
                }
                String firstValue = numbers.get(0);
                values = Integer.parseInt(firstValue);
                numbers.add(Integer.toString(valueOne));
                iter = numbers.listIterator(0);
                String current;
                while(iter.hasNext()){
                    current = iter.next();
                    if(current.equalsIgnoreCase("addition")){
                        valueTwo = Integer.parseInt(iter.next());
                        values = values + valueTwo; 
                    }
                    else if(current.equalsIgnoreCase("subtraction")){
                        valueTwo = Integer.parseInt(iter.next());
                        values = values - valueTwo;
                    }
                    else if(current.equalsIgnoreCase("multiplication")){
                        valueTwo = Integer.parseInt(iter.next());
                        values = values * valueTwo; 
                    }
                    else if(current.equalsIgnoreCase("division")){
                        valueTwo = Integer.parseInt(iter.next());
                        values = values / valueTwo; 
                    }
                }
                if(mode == "decimal"){
                    if(values > 1000000){
                        error();
                    }
                    else if(values>=100000){
                        led1 = (values/100000);
                        values = values - (led1*100000);
                        led2 = (values/10000);
                        values = values - (led2*10000);
                        led3 = (values/1000);
                        values = values - (led3*1000);
                        led4 = (values/100);
                        values = values - (led4*100);
                        led5 = (values/10);
                        values = values - (led5*10);
                        led6 = values;
                        firstLed.setNum(led1);
                        secondLed.setNum(led2);
                        thirdLed.setNum(led3);
                        fourthLed.setNum(led4);
                        fifthLed.setNum(led5);
                        sixthLed.setNum(led6);
                        draw();
                    }
                    else if(values>=10000){
                        led2 = (values/10000);
                        values = values - (led2*10000);
                        led3 = (values/1000);
                        values = values - (led3*1000);
                        led4 = (values/100);
                        values = values - (led4*100);
                        led5 = (values/10);
                        values = values - (led5*10);
                        led6 = values;
                        firstLed.setNum(led1);
                        secondLed.setNum(led2);
                        thirdLed.setNum(led3);
                        fourthLed.setNum(led4);
                        fifthLed.setNum(led5);
                        sixthLed.setNum(led6);
                        draw();
                    }
                    else if(values>=1000){
                        led3 = (values/1000);
                        values = values - (led3*1000);
                        led4 = (values/100);
                        values = values - (led4*100);
                        led5 = (values/10);
                        values = values - (led5*10);
                        led6 = values;
                        firstLed.setNum(led1);
                        secondLed.setNum(led2);
                        thirdLed.setNum(led3);
                        fourthLed.setNum(led4);
                        fifthLed.setNum(led5);
                        sixthLed.setNum(led6);
                        draw();
                    }
                    else if(values>=100){
                        led4 = (values/100);
                        values = values - (led4*100);
                        led5 = (values/10);
                        values = values - (led5*10);
                        led6 = values;
                        firstLed.setNum(led1);
                        secondLed.setNum(led2);
                        thirdLed.setNum(led3);
                        fourthLed.setNum(led4);
                        fifthLed.setNum(led5);
                        sixthLed.setNum(led6);
                        draw();
                    }
                    else if(values>=10){
                        led5 = (values/10);
                        values = values - (led5*10);
                        led6 = values;
                        firstLed.setNum(led1);
                        secondLed.setNum(led2);
                        thirdLed.setNum(led3);
                        fourthLed.setNum(led4);
                        fifthLed.setNum(led5);
                        sixthLed.setNum(led6);
                        draw();
                    }
                    else{
                        led6 = values;
                        firstLed.setNum(led1);
                        secondLed.setNum(led2);
                        thirdLed.setNum(led3);
                        fourthLed.setNum(led4);
                        fifthLed.setNum(led5);
                        sixthLed.setNum(led6);
                        draw();
                    }
                }
                
                else if(mode == "roman"){
                    if(values > 3999){
                        error();
                        label = "";
                    }
                    while(values >= 1000){
                        label += "M";
                        values -= 1000;
                    }
                    if((values/100) == 9){
                        label += "CM";
                        values -= 900;
                    }
                    else if((values/100) == 4){
                        label += "CD";
                        values -= 400;
                    }
                    if((values/100) < 9 && (values/100) > 4){
                        label += "D";
                        values -= 500;
                        while(values>=100){
                            label += "C";
                            values -= 100;
                        }
                    }
                    else{
                        while(values>=100){
                            label += "C";
                            values -= 100;
                        }
                    }
                    if((values/10) == 9){
                        label += "XC";
                        values -= 90;
                    }
                    else if((values/10) == 4){
                        label += "XL";
                        values -= 40;
                    }
                    if((values/10) < 9 && (values/10) > 4){
                        label += "L";
                        values -= 50;
                        while(values>=10){
                            label += "X";
                            values -= 10;
                        }
                    }
                    else{
                        while(values>=10){
                            label += "X";
                            values -= 10;
                        }
                    }
                    if((values/1) == 9){
                        label += "IX";
                        values -= 9;
                    }
                    else if((values/1) == 4){
                        label += "IV";
                        values -= 4;
                    }
                    if((values/1) < 9 && (values/1) > 4){
                        label += "V";
                        values -= 5;
                        while(values>=1){
                            label += "I";
                            values -= 1;
                        }
                    }
                    else{
                        while(values>=1){
                            label += "I";
                            values -= 1;
                        }
                    }
                    draw();
                }
                
                else{
                    int count = 0;
                    int valueBreaker = values;
                    while(valueBreaker > 16){
                        valueBreaker = values/16;
                        count++;
                    }
                    if(count >= 6){
                        error();
                    }
                    else if(count == 5){
                        led1 = values%16;
                        values = values/16;
                        led2 = values%16;
                        values = values/16;
                        led3 = values%16;
                        values = values/16;
                        led4 = values%16;
                        values = values/16;
                        led5 = values%16;
                        led6 = values/16;
                        firstLed.setNum(led1);
                        secondLed.setNum(led2);
                        thirdLed.setNum(led3);
                        fourthLed.setNum(led4);
                        fifthLed.setNum(led5);
                        sixthLed.setNum(led6);
                        draw();
                    }
                    else if(count == 4){
                        led2 = values%16;
                        values = values/16;
                        led3 = values%16;
                        values = values/16;
                        led4 = values%16;
                        values = values/16;
                        led5 = values%16;
                        led6 = values/16;
                        firstLed.setNum(led1);
                        secondLed.setNum(led6);
                        thirdLed.setNum(led5);
                        fourthLed.setNum(led4);
                        fifthLed.setNum(led3);
                        sixthLed.setNum(led2);
                        draw();
                    }
                    else if(count == 3){
                        led3 = values%16;
                        values = values/16;
                        led4 = values%16;
                        values = values/16;
                        led5 = values%16;
                        led6 = values/16;
                        firstLed.setNum(led1);
                        secondLed.setNum(led2);
                        thirdLed.setNum(led6);
                        fourthLed.setNum(led5);
                        fifthLed.setNum(led4);
                        sixthLed.setNum(led3);
                        draw();
                    }
                    else if(count == 2){
                        led4 = values%16;
                        values = values/16;
                        led5 = values%16;
                        led6 = values/16;
                        firstLed.setNum(led1);
                        secondLed.setNum(led2);
                        thirdLed.setNum(led3);
                        fourthLed.setNum(led6);
                        fifthLed.setNum(led5);
                        sixthLed.setNum(led4);
                        draw();
                    }
                    else if(count == 1){
                        led5 = values%16;
                        led6 = values/16;
                        firstLed.setNum(led1);
                        secondLed.setNum(led2);
                        thirdLed.setNum(led3);
                        fourthLed.setNum(led4);
                        fifthLed.setNum(led6);
                        sixthLed.setNum(led5);
                        draw();
                    }
                    else{    
                        led6 = values;
                        firstLed.setNum(led1);
                        secondLed.setNum(led2);
                        thirdLed.setNum(led3);
                        fourthLed.setNum(led4);
                        fifthLed.setNum(led5);
                        sixthLed.setNum(led6);
                        draw();
                    }
                }
            }
        }
    }
    
    /**
     * Method that adds the JLabel for roman numerals, The LEDs to be displayed and sets the frame visibility to true
     */
    public void draw(){
        stringLabel.setText(label);
        theFrame.add(stringLabel);
        theFrame.add(new MyComponent(firstLed, secondLed, thirdLed, fourthLed, fifthLed, sixthLed));
        theFrame.setVisible(true);
    }
    
    /**
     * A method that, despite it's snarky name, looks to see which LEDs are active 
     * If all of them are active, nothing happens, otherwise it moves each digit over one
     * 
     * @param Int- the number to set the first LED to
     */
    public void figureItOut(int num){
        if(sixthLed.getActive() == false){
                sixthLed.setNum(num);
            }
            else if(fifthLed.getActive() == false){
                fifthLed.setNum(sixthLed.getValue());
                sixthLed.setNum(num);
            }
            else if(fourthLed.getActive() == false){
                fourthLed.setNum(fifthLed.getValue());
                fifthLed.setNum(sixthLed.getValue());
                sixthLed.setNum(num);
            }
            else if(thirdLed.getActive() == false){
                thirdLed.setNum(fourthLed.getValue());
                fourthLed.setNum(fifthLed.getValue());
                fifthLed.setNum(sixthLed.getValue());
                sixthLed.setNum(num);
            }
            else if(secondLed.getActive() == false){
                secondLed.setNum(thirdLed.getValue());
                thirdLed.setNum(fourthLed.getValue());
                fourthLed.setNum(fifthLed.getValue());
                fifthLed.setNum(sixthLed.getValue());
                sixthLed.setNum(num);
            }
            else if(firstLed.getActive() == false){
                firstLed.setNum(secondLed.getValue());
                secondLed.setNum(thirdLed.getValue());
                thirdLed.setNum(fourthLed.getValue());
                fourthLed.setNum(fifthLed.getValue());
                fifthLed.setNum(sixthLed.getValue());
                sixthLed.setNum(num);
            }
            else{
            }
        draw();
    }
    
    /**
     * Method that takes the String inside the JLabel, translates it to a decimal value and then feeds it back up to whichever function (addition, subtraction). 
     * 
     * @param String- The current value in Roman numerals
     * @return Int- the Decimal form of the given Roman number
     */
    public int translateRoman(String translate){
        int total = 0;
        char firstChar;
        char secondChar;
        String first = "";
        String second = "";
        for(int i = 0; i < translate.length(); i++){
            firstChar = translate.charAt(i);
            first = String.valueOf(firstChar);
            if((translate.length() - (i+1)) > 0){
                secondChar = translate.charAt(i+1);
                second = String.valueOf(secondChar);
            }   
            
            if(first.equalsIgnoreCase("C") && second.equalsIgnoreCase("M")){
                total += 900;
                i++;
            }
            else if(first.equalsIgnoreCase("C") && second.equalsIgnoreCase("D")){
                total += 400;
                i++;
            }
            else if(first.equalsIgnoreCase("X") && second.equalsIgnoreCase("C")){
                total += 90;
                i++;
            }
            else if(first.equalsIgnoreCase("X") && second.equalsIgnoreCase("L")){
                total += 40;
                i++;
            }
            else if(first.equalsIgnoreCase("I") && second.equalsIgnoreCase("X")){
                total += 9;
                i++;
            }
            else if(first.equalsIgnoreCase("I") && second.equalsIgnoreCase("V")){
                total += 4;
                i++;
            }
            else if(first.equalsIgnoreCase("M")){
                total += 1000;
            }
            else if(first.equalsIgnoreCase("D")){
                total += 500;
            }
            else if(first.equalsIgnoreCase("C")){
                total += 100;
            }
            else if(first.equalsIgnoreCase("L")){
                total += 50;
            }
            else if(first.equalsIgnoreCase("X")){
                total += 10;
            }
            else if(first.equalsIgnoreCase("V")){
                total += 5;
            }
            else if(first.equalsIgnoreCase("I")){
                total += 1;
            }
            else{
                error();
            }
        }
        return total;
    }
    
    /**
     * Method that sets the LEDs to display "ERROR"
     */
    public void error(){
        firstLed.reset();
        secondLed.letterE();
        thirdLed.letterA();
        fourthLed.letterA();
        fifthLed.zero();
        sixthLed.letterA();
        draw();
    }
    
    /**
     * method that clears all corresponding values, label and LED displays
     */
    public void clear(){
        sixthLed.reset();
        fifthLed.reset();
        fourthLed.reset();
        thirdLed.reset();
        secondLed.reset();
        firstLed.reset();
        sixthLed.setActive(false);
        fifthLed.setActive(false);
        fourthLed.setActive(false);
        thirdLed.setActive(false);
        secondLed.setActive(false);
        firstLed.setActive(false);
        sixthLed.setValue(0);
        fifthLed.setValue(0);
        fourthLed.setValue(0);
        thirdLed.setValue(0);
        secondLed.setValue(0);
        firstLed.setValue(0);
        valueOne = 0;
        values = 0;
        numbers.clear();
        valueTwo = 0;
        label = "";
        stringLabel.setText(label);
        draw();
    }
    
    /**
     * Method that clears the LED and label displays, but does not wipe the local variables containing the running total
     */
    public void clearNoReset(){
        sixthLed.reset();
        fifthLed.reset();
        fourthLed.reset();
        thirdLed.reset();
        secondLed.reset();
        firstLed.reset();
        sixthLed.setActive(false);
        fifthLed.setActive(false);
        fourthLed.setActive(false);
        thirdLed.setActive(false);
        secondLed.setActive(false);
        firstLed.setActive(false);
        sixthLed.setValue(0);
        fifthLed.setValue(0);
        fourthLed.setValue(0);
        thirdLed.setValue(0);
        secondLed.setValue(0);
        firstLed.setValue(0);
        label = "";
        stringLabel.setText(label);
        draw();
    }
}