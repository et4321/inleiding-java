package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    //init

    public void init() {
        setBackground(Color.white);
    }

    //paint
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRoundRect(120, 20, 100, 250, 10, 10);
        g.fillRoundRect(120, 20, 100, 250, 10, 10);

        g.setColor(Color.green);
        g.drawOval(136, 30, 65, 65);
        g.fillOval (136, 30, 65, 65);

        g.setColor(Color.orange);
        g.drawOval(136, 110, 65, 65);
        g.fillOval (136, 110, 65, 65);

        g.setColor(Color.red);
        g.drawOval(136, 190, 65, 65);
        g.fillOval (136, 190, 65, 65);

    }
}