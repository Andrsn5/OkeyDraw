package ru.vsu.cs;

import java.awt.*;

public class Ocean {
    private int h;
    private int w;
    public Ocean(int h , int  w) {
        this.h=h;
        this.w=w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void draw(Graphics g2d) {
        g2d.setColor(new Color(70, 130, 180));
        g2d.fillRect(0, h / 2,w, h / 3);
}}
