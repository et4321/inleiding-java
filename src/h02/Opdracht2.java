package h02;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    //init
    public void init() {
        setBackground(Color.white);
    }

    //paint
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Joshua", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Barselaar", 50, 70 );}

}
