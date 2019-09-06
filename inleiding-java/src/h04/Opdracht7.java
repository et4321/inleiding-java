package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {

    //init

    public void init() {
        setBackground(Color.white);
    }

    //paint
    public void paint(Graphics g) {
        g.setColor(Color.black);

        g.drawRoundRect(60, 20, 250, 250, 20, 10);

        g.drawOval(90, 40, 80, 80);
        g.fillOval(90, 40, 80, 80);

        g.drawOval(200, 40, 80, 80);
        g.fillOval(200, 40, 80, 80);

        g.drawOval(90, 160, 80, 80);
        g.fillOval(90, 160, 80, 80);

        g.drawOval(200, 160, 80, 80);
        g.fillOval(200, 160, 80, 80);


    }
}