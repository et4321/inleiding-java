package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    //init

    public void init() { setBackground(Color.white); }

    //paint
    public void paint(Graphics g) {
        g.setColor(Color.black);

        g.drawRect(50, 10, 10, 200);
        g.fillRect(50, 10, 10, 200);

        g.setColor(Color.red);
        g.drawRect(60, 10, 150, 20);
        g.fillRect(60, 10, 150, 20);

        g.setColor(Color.blue);
        g.drawRect(60, 60, 150, 20);
        g.fillRect(60, 60, 150, 20);


    }

}
