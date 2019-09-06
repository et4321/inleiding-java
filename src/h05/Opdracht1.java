package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    //declaratie
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        setBackground(Color.lightGray);
        //initialisatie
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 150;
        hoogte = 60;}


        //paint

    public void paint(Graphics g) {
        //lijn
        g.drawLine(10, 50, 150, 50);
        g.drawString("Lijn", 40, 70);

        //rechthoek
        g.drawRect(10, 80, breedte, hoogte);
        g.drawString("Rechthoek", 40, 160);

        //afgeronden rechthoek
        g.drawRoundRect(10, 180,breedte,hoogte, 10, 10);
        g.drawString("Afgeronde rechthoek", 35, 260);

        //gevulden rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(180, 80, breedte, hoogte);
        g.setColor(Color.black);
        g.drawOval(180, 80, breedte,hoogte);
        g.drawString("Gevulden rechthoek met ovaal", 180, 160);

        //gevulden ovaal
        g.setColor(Color.magenta);
        g.fillOval(180, 180,breedte,hoogte );
        g.setColor(Color.black);
        g.drawString("Gevulden ovaal", 180, 260);

        //taartpunt met ovaal eromheen
        g.drawOval(350, 80,breedte,hoogte);
        g.setColor(Color.magenta);
        g.fillArc(351, 80, 150, 65, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 360, 160);

        //cirkel
        g.drawOval(400, 180, 60, 60);
        g.drawString("Cirkel", 400, 260);

    }

}
