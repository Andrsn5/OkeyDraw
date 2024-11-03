package ru.vsu.cs;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class LeftPalmTree {

    private int x, y;


    public LeftPalmTree(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2) {
        drawTrunk(g2);
        drawLeaves(g2);
    }

    private void drawTrunk(Graphics2D g2) {
        g2.setColor(new Color(139, 69, 19));
        g2.setStroke(new BasicStroke(30));
        QuadCurve2D q1 = new QuadCurve2D.Float(x - 200, y , x - 30, y - 100, x - 10, y - 400);
        QuadCurve2D q2 = new QuadCurve2D.Float(x - 220, y , x - 60, y - 100, x - 10, y - 400);



        g2.draw(q1);
        g2.draw(q2);

    }

    private void drawLeaves(Graphics2D g2) {
        g2.setColor(new Color(34, 139, 34));
        g2.setStroke(new BasicStroke(10));//6

        for (int i = -5; i < 5; i++) {
            double angle = Math.toRadians(40 * i - 80);
            int leafLength = 100 + i * 10;
            QuadCurve2D leaf = new QuadCurve2D.Double(
                    x - 5, y - 400,
                    x + Math.cos(angle) * leafLength, y - 500 + Math.sin(angle) * leafLength,
                    x + Math.cos(angle) * (leafLength + 50), y - 390 + Math.sin(angle) * (leafLength + 50));
            g2.draw(leaf);
            QuadCurve2D leaf2 = new QuadCurve2D.Double(
                    x - 5, y - 400,
                    x + Math.cos(angle) * leafLength , y - 480 + Math.sin(angle) * leafLength,
                    x + Math.cos(angle) * (leafLength + 50), y - 390 + Math.sin(angle) * (leafLength + 50));
            g2.draw(leaf2);
        }

        for (int i = 0; i < 4; i++) {
            double angle = Math.toRadians(30 * i - 60);
            int leafLength = 60 + i * 10;
            QuadCurve2D leaf = new QuadCurve2D.Double(
                    x - 5, y - 400,
                    x + Math.cos(angle) * leafLength, y - 500 + Math.sin(angle) * leafLength,
                    x + Math.cos(angle) * (leafLength + 30), y - 390 + Math.sin(angle) * (leafLength + 30));
            g2.draw(leaf);
            QuadCurve2D leaf2 = new QuadCurve2D.Double(
                    x - 5, y - 400,
                    x + Math.cos(angle) * leafLength , y - 480 + Math.sin(angle) * leafLength,
                    x + Math.cos(angle) * (leafLength + 30), y - 390 + Math.sin(angle) * (leafLength + 30));
            g2.draw(leaf2);
        }
    }
    private void drawFullLeaves(Graphics2D g2){
        g2.setColor(new Color(34, 139, 34));
        g2.setStroke(new BasicStroke(10));//6

        for (int i = -5; i < 5; i++) {
            double angle = Math.toRadians(40 * i - 80);
            int leafLength = 100 + i * 10;
            QuadCurve2D leaf = new QuadCurve2D.Double(
                    x - 5, y - 400,
                    x + Math.cos(angle) * leafLength, y - 500 + Math.sin(angle) * leafLength,
                    x + Math.cos(angle) * (leafLength + 50), y - 390 + Math.sin(angle) * (leafLength + 50));
            g2.draw(leaf);
            g2.fill(leaf);
        }

//        for (int i = 0; i < 4; i++) {
//            double angle = Math.toRadians(30 * i - 60);
//            int leafLength = 60 + i * 10;
//            QuadCurve2D leaf = new QuadCurve2D.Double(
//                    x - 5, y - 400,
//                    x + Math.cos(angle) * leafLength, y - 500 + Math.sin(angle) * leafLength,
//                    x + Math.cos(angle) * (leafLength + 30), y - 390 + Math.sin(angle) * (leafLength + 30));
//            g2.draw(leaf);
//            g2.fill(leaf);
//        }
    }
}
