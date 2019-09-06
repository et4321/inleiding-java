package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    //declaratie

    int valkarie;
    int jeroen;
    int hans;


    public void init() {
        setBackground(Color.lightGray);

        //initialisatie

        valkarie = 120;   //Per 1 is het 0.5 kg
        jeroen = 10;
        hans = 10;
    }


    //paint
    public void paint(Graphics g) {
        g.setColor(Color.black);

        g.drawString("Gewicht in KG", 20, 20);

        //lijnen
        g.drawLine(70, 215, 70, 80);
        g.drawLine(70, 120, 310, 120);
        g.drawLine(70, 180, 310, 180);
        g.drawLine(110, 80,110,215);//
        g.drawLine(150, 80,150,215);
        g.drawLine(190, 80,190,215);
        g.drawLine(230, 80,230,215);
        g.drawLine(270, 80,270,215);
        g.drawLine(310, 80,310,215);

        //staafen
        g.setColor(Color.blue);
        g.fillRect(70, 200, hans, 10);

        g.setColor(Color.red);
        g.fillRect(70, 150,jeroen, 10);

        g.setColor(Color.green);
        g.fillRect(70, 100,valkarie, 10);

        //getalen
        g.setColor(Color.black);
        g.drawString("0", 70, 230);
        g.drawString("20", 110, 230);
        g.drawString("40", 150, 230);
        g.drawString("60", 190, 230);
        g.drawString("80", 230, 230);
        g.drawString("100", 270, 230);
        g.drawString("120", 310, 230);

        //naamen
        g.setColor(Color.black);
        g.drawString("Valarie", 20, 100);
        g.drawString("Jeroen", 20, 150);
        g.drawString("Hans", 20, 200);
     }

}
