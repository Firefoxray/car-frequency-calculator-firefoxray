import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class CalculatorComponent extends JComponent {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        Main main = new Main();
        SixLineFix screen = new SixLineFix();

        //Frame
        g2.setColor(new Color(98, 98, 93));
        g2.fillRect(25,25,400,500);
        g2.setColor(new Color(208, 219, 227));
        g2.fillRect(45,90,360,150);

        //Screen
        g2.setColor(Color.black);
        g2.drawString(screen.screen[0],55,120);
        g2.drawString(screen.screen[1],55,140);
        g2.drawString(screen.screen[2],55,160);
        g2.drawString(screen.screen[3],55,180);
        g2.drawString(screen.screen[4],55,200);
        g2.drawString(screen.screen[5],55,220);

        //InfoFrame and InfoScreen
        g2.setColor(new Color(208, 219, 227));
        g2.fillRect(120,42,215,30);
    }

}
