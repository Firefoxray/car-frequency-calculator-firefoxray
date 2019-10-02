import javax.swing.*;
import java.awt.*;

public class CalculatorComponent extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        Main main = new Main();
        SixLineFix screen = new SixLineFix();
        //Interlude

        //g2.fillOval(200,100,300,300);
        //Frame
        g2.setColor(new Color(98, 98, 93));
        g2.fillRect(25,25,400,500);
        g2.setColor(new Color(208, 219, 227));
        g2.fillRect(45,45,360,150);
        String welcome = main.welcome;
        //Screen
        g2.setColor(Color.black);
        g2.drawString(screen.one,55,75);
        g2.drawString(screen.two,55,95);
        g2.drawString(screen.three,55,115);
        g2.drawString(screen.four,55,135);
        g2.drawString(screen.five,55,155);
        g2.drawString(screen.six,55,175);
    }
}
