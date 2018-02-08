/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author alois
 */
public class ColorDisplay extends JPanel {

    ArrayList<Integer> myList = new ArrayList<Integer>();
    private final Color[] color = {Color.RED, Color.BLUE, Color.MAGENTA, Color.YELLOW, Color.GREEN, Color.ORANGE};

    public ColorDisplay() {
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(this);
        setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 34, Short.MAX_VALUE)
        );
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs); //To change body of generated methods, choose Tools | Templates.

        Graphics2D g2d = (Graphics2D) grphcs;

        //Background
        g2d.setColor(Color.GRAY);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        //Display
        for (int i = 0; i < myList.size(); i++) {
            g2d.setColor(color[myList.get(i)]);
            g2d.fillOval(i * getWidth() / myList.size(), getHeight() / 2, 5, 5);
        }
    }

    public void addColor(int c) {
        myList.add(c);
        repaint();
    }

    public void removeColor() {
        myList.clear();
        repaint();
    }

}
