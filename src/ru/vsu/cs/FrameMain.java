package ru.vsu.cs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class FrameMain extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JPanel paintAreaPanel;
    private DrawPanel dp;

    public FrameMain() {
        setTitle("DrawOkeyyy");
        setContentPane(contentPane);
        setSize(800,600);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        dp = new DrawPanel();
        paintAreaPanel.add(dp);
    }

    public static void main(String[] args) {
        FrameMain dialog = new FrameMain();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }


}
