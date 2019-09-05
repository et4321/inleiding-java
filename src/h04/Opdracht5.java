package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    //init

    public void init() { setBackground(Color.blue);}

    //paint
    public void paint(Graphics g) {

        g.setColor(Color.yellow);
        g.drawOval(20, 20, 350, 150);
        g.fillOval(20, 20, 350, 150);

    }


}
