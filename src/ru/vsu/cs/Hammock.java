package ru.vsu.cs;

import java.awt.*;
import java.awt.geom.QuadCurve2D;

class Hammock {
    private int x, y;
    public Hammock(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(new Color(164, 1, 1));
        g2d.setStroke(new BasicStroke(4));
        QuadCurve2D hammock = new QuadCurve2D.Double(200, 375, 400, 550, 450, 460);
        QuadCurve2D hammock2 = new QuadCurve2D.Double(300, 450, 400, 550, 500, 500);
        QuadCurve2D hammock3 = new QuadCurve2D.Double(400, 450, 480, 560, 550, 450);
        g2d.fillPolygon(new int[]{190,350,220},new int[]{375,495,370},3);


        g2d.draw(hammock2);
        g2d.draw(hammock);
        g2d.fill(hammock);
        g2d.fill(hammock2);
        g2d.draw(hammock3);
        g2d.fill(hammock3);

        g2d.setColor(new Color(31, 19, 19));
        g2d.drawLine(190,375,120,310);
        g2d.drawLine(220,370,120,310);
        g2d.drawLine(120,310,70,310);
        g2d.drawLine(550, 450,660,310);
        g2d.drawLine(660,310,701,310);

    }}


//        g2d.setColor(new Color(213, 71, 66, 231));
//        for (int i = 0 ; i<5;i++){
//            g2d.fillArc(x1+80 - 20*i, y1 +100-20*i , (x2 - x1 )/ 2 -10*i, 70-5*i, 0 - 18 *i, -200 + 20*i);
//        }
//
//        g2d.setStroke(new BasicStroke(30));
//        QuadCurve2D q1 = new QuadCurve2D.Float(x + 200, y , x + 30, y - 100, x + 10, y - 400);
//        QuadCurve2D q2 = new QuadCurve2D.Float(x + 220, y , x + 60, y - 80, x + 10, y - 400);
//
//        for(int i = 0; i<3;i++){
//            g2d.fillArc(x1+80 +35*i, y1 +100-5*i , (x2 - x1 )/ 2 -10*i, 70-10*i, -200+30*i, 200-15*i);
//        }
//    }

