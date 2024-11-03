package ru.vsu.cs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawPanel extends JPanel {

    private int sunCenterX = 400;
    private int sunCenterY = 300;
    private int sunRadius = 300;
    private double angle = 160;
    private Color sunColor = Color.YELLOW;
    private int count = 0;
    private Color backgroundColor = new Color(135, 206, 235);


    private Sun s;
    private  Mountains allM;
    private  Mountain TriaglesM;
    private Ocean sea;
    private RightPalmTree rightPalm;
    private LeftPalmTree leftPalm;
    private Hammock hammock;
    private Beach beach;




    public void paint(Graphics g) {
        super.paintComponent(g);
        setBackground(backgroundColor);
        Graphics2D g2d = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();
        s.setX((int) (sunCenterX + sunRadius * Math.cos(angle)));
        s.setY((int) (sunCenterY - sunRadius * Math.sin(angle)));
        s.setC(sunColor);

        allM.setH(height+10);
        allM.setW(width);
//        TriaglesM.setH(height);
//        TriaglesM.setW(width);
        sea.setH(height);
        sea.setW(width);
        beach.setH(height);
        beach.setW(width);

        s.draw(g2d);
        allM.draw(g2d);
//        TriaglesM.draw(g2d);
        sea.draw(g2d);
        beach.draw(g2d);
        leftPalm.draw(g2d);
        rightPalm.draw(g2d);
        hammock.draw(g2d);
    }



    public DrawPanel() {


        s = new Sun(5, 5, 50, 80, 11, sunColor);
//        TriaglesM = new Mountain(getHeight(),getWidth());
        allM = new Mountains(getHeight(),getWidth());
        sea = new Ocean(getHeight(),getWidth());
        beach = new Beach(getHeight(),getWidth());
        leftPalm = new LeftPalmTree(150,510);
        rightPalm = new RightPalmTree(650,590);
        hammock = new Hammock(650,700);





        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println( x + ", " + y );
                performAction();

            }
        });
    }

    private void performAction() {
        count++;
        if (count % 2 == 1) {
            Timer timer = new Timer(50, null);
            int steps = 110;
            final int[] stepCount = {0};


            timer.addActionListener(e -> {
                if (stepCount[0] < steps) {
                    angle -= Math.PI / steps;

                    float ratio = (float) stepCount[0] / steps;
                    sunColor = new Color(255, (int) (255 * (1 - ratio)), 0);
                    backgroundColor = blendColors(new Color(135, 206, 235), new Color(0, 0, 139), ratio/2);                    repaint();
                    stepCount[0]++;
                } else {
                    timer.stop();
                }
            });
            timer.start();
        } else {

            angle = 160;
            backgroundColor = new Color(135, 206, 235);
            sunColor = Color.YELLOW;
            repaint();
        }
    }
    private Color blendColors(Color color1, Color color2, float ratio) {
        int red = color1.getRed() + (int) ((color2.getRed() - color1.getRed()) * ratio);
        int green = color1.getGreen() + (int) ((color2.getGreen() - color1.getGreen()) * ratio);
        int blue = color1.getBlue() + (int) ((color2.getBlue() - color1.getBlue()) * ratio);

        return new Color(red, green, blue);
    }


    }




// drawpanel


//        s.setX((int) (sunCenterX + sunRadius * Math.cos(angle)));
//        s.setY((int) (sunCenterY + sunRadius * Math.sin(angle)));
//        allM.setH(getHeight());
//        allM.setW(getWidth());


// paint
//    setBackground(backgroundColor);
//        leftPalm.draw(g2d);
//        rightPalm.draw(g2d);
//        int sunX = (int) (sunCenterX + sunRadius * Math.cos(angle));
//        int sunY = (int) (sunCenterY + sunRadius * Math.sin(angle));
//        Sun.draw(g2d, sunX, sunY, 50, 80, 11, sunColor);Mountain.draw(g2d,getHeight(),getWidth());

//        Ocean.draw(g,getHeight(),getWidth());
//        Beach.draw(g2d,getHeight(),getWidth());

//        LeftPalmTree lefPlam = new LeftPalmTree(150,510);
//        lefPlam.draw((Graphics2D) g);
//        RightPalmTree rigPlam = new RightPalmTree(650,590);
//        rigPlam.draw((Graphics2D) g);
//        Hammock.drawHammok((Graphics2D)g);

