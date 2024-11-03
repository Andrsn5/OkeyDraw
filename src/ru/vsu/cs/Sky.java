package ru.vsu.cs;

import java.awt.*;

class Sky {
    public static void draw(Graphics g2d,int h, int w) {
        g2d.setColor(new Color(135, 206, 235));
        g2d.fillRect(0, 0, w,h / 2);
    }
}
