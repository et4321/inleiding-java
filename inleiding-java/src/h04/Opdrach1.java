package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdrach1 extends Applet {

    //init

    public void init() {setBackground(Color.white); }

    //paint
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(50, 200, 200, 50);
        g.drawLine(200, 50, 350, 200);
        g.drawLine(50, 200, 350, 200);
    }



}
