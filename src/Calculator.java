import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Calculator {

    //Debug Things
    String debugText;
    public static Boolean debugYesButton;
    public static Boolean debugNoButton;
    public static Boolean debugEnterButton;
    //public static

    public void calculatorFrame(){
        JFrame calcFrame = new JFrame("Car Frequency Calculator");
        calcFrame.setVisible(true);
        calcFrame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        calcFrame.setSize(475,600);
        //Frame Element Adding
        CalculatorComponent calculatorComponent = new CalculatorComponent();
        SixLineFix SixLineDisplay = new SixLineFix();
        ScreenEffects screenEffects = new ScreenEffects();
        Question question = new Question();
        Engine engine = new Engine();
        Date date=java.util.Calendar.getInstance().getTime();
        JButton yesButton = new JButton("Yes");
        JButton noButton = new JButton("No");
        JButton enterButton = new JButton("Enter");
        JTextField textInput = new JTextField();
        JLabel timeLabel = new JLabel("" + date);
        yesButton.setBounds(45,330,100,40);
        noButton.setBounds(300,330,100,40);
        enterButton.setBounds(150,330,145,40);
        textInput.setBounds(50,260,345,50);
        timeLabel.setBounds(135,50,200,20);
        calcFrame.add(yesButton);
        calcFrame.add(noButton);
        calcFrame.add(enterButton);
        calcFrame.add(timeLabel);
        calcFrame.add(textInput);
        calcFrame.add(calculatorComponent);
        calculatorComponent.repaint();
        calculatorComponent.revalidate();

        //Action Listeners
        //*
        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                engine.buttonInput(0); //Starts Calc
                calculatorComponent.repaint();
                calculatorComponent.revalidate();
                System.out.println("yesbuttonpressed");
            }
        });

        noButton.addActionListener(actionEvent -> {
            SixLineDisplay.displayer("No Button Pressed",3);
            calculatorComponent.repaint();
            calculatorComponent.revalidate();
        });
        enterButton.addActionListener(actionEvent -> {
            SixLineDisplay.displayer("No Button Pressed",4);
            //screenEffects.textSlide("Enter Button Pressed");
            calculatorComponent.repaint();
            calculatorComponent.revalidate();
        });

    }
    public void debug(){
        String debugReadout = "DummyTxtZed";
        if (debugYesButton) {debugReadout = "Yes Button Pressed";}
        debugText = debugReadout;
    }
}
