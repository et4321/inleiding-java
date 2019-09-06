package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    //init

    public void init() { }

    //paint
    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.black);
        g.drawLine(60, 100, 150, 50);
        g.drawLine(150, 50, 250, 100);

        g.drawRect(60, 100, 190, 100);    //house
        g.drawRect(70, 150, 50, 30);      //window
        g.drawRect(150, 140, 40, 60);     //door
    }
}
