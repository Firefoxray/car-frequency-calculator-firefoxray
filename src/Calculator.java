import javax.swing.*;

public class Calculator {


    public static void calculatorFrame(){
        JFrame calcFrame = new JFrame("Car Frequency Calculator");
        calcFrame.setVisible(true);
        calcFrame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        calcFrame.setSize(500,600);
        //calcFrame.setLayout(null);
        //Actions
        JTextField textInput = new JTextField();
        textInput.setBounds(50,50,50,50);
        CalculatorComponent calculatorComponent = new CalculatorComponent();
        calcFrame.add(textInput);
        calcFrame.add(calculatorComponent);

        calculatorComponent.repaint();
        calculatorComponent.revalidate();
    }
}
