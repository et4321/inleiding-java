package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    //init

    public void init() { setBackground(Color.lightGray); }

    //paint
    public void paint(Graphics g) {
        g.setColor(Color.black);

        g.drawString("Gewicht in KG", 20, 20);

        //namen
        g.drawString("Valerie", 150, 250);
        g.drawString("Jeroen", 200, 250);
        g.drawString("Hans", 250, 250);

        //lijnen
        g.drawLine(150, 225, 275, 225);
        g.drawLine(150, 205, 275, 205);
        g.drawLine(150, 185, 275, 185);
        g.drawLine(150, 165, 275, 165);
        g.drawLine(150, 145, 275, 145);
        g.drawLine(150, 125, 275, 125);
        g.drawLine(150, 105, 275, 105);

        //getallen
        g.drawString("0", 135, 225);
        g.drawString("20", 130, 205);
        g.drawString("40", 130, 185);
        g.drawString("60", 130, 165);
        g.drawString("80", 130, 145);
        g.drawString("100", 125, 125);
        g.drawString("120", 125, 105);

        //staafen
        g.setColor(Color.blue);
        g.drawRect(160, 185, 10, 40);     //valerie (40kg)
        g.fillRect(160, 185, 10, 40);

        g.setColor(Color.red);
        g.drawRect(210, 125, 10, 100);     //jeroen (100kg)
        g.fillRect(210, 125, 10, 100);

        g.setColor(Color.green);
        g.drawRect(260, 145, 10, 80);    //hans (80kg)
        g.fillRect(260, 145, 10, 80);

    }
}