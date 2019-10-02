import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    public static void calculatorFrame(){
        JFrame calcFrame = new JFrame("Car Frequency Calculator");
        calcFrame.setVisible(true);
        calcFrame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        calcFrame.setSize(475,600);
        //Frame Element Adding
        CalculatorComponent calculatorComponent = new CalculatorComponent();
        SixLineFix SixLineDisplay = new SixLineFix();
        ScreenEffects screenEffects = new ScreenEffects();
        JButton yesButton = new JButton("Yes");
        JButton noButton = new JButton("No");
        JButton enterButton = new JButton("Enter");
        JTextField textInput = new JTextField();
        yesButton.setBounds(45,330,100,40);
        noButton.setBounds(300,330,100,40);
        enterButton.setBounds(150,330,145,40);
        textInput.setBounds(50,260,345,50);
        calcFrame.add(yesButton);
        calcFrame.add(noButton);
        calcFrame.add(enterButton);
        calcFrame.add(textInput);
        calcFrame.add(calculatorComponent);
        calculatorComponent.repaint();
        calculatorComponent.revalidate();

        //Action Listeners
        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                SixLineDisplay.displayer("Yes Button Pressed",2);
                calculatorComponent.repaint();
                calculatorComponent.revalidate();
            }
        });
        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                SixLineDisplay.displayer("No Button Pressed",3);
                calculatorComponent.repaint();
                calculatorComponent.revalidate();
            }
        });
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                SixLineDisplay.displayer("No Button Pressed",4);
                //screenEffects.textSlide("Enter Button Pressed");
                calculatorComponent.repaint();
                calculatorComponent.revalidate();
            }
        });

    }
}
