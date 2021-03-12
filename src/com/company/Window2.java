package com.company;
import javax.swing.*;
import java.awt.*;


public class Window2 extends JFrame {

    public void main(String[] args) {
    }

       Container contentPane = getContentPane();

       JPanel pnl = new JPanel();

        JPanel grid = new JPanel(new GridLayout(3,3,40,20));

         JLabel txt = new JLabel("Add Animal");


         JButton sheep = new JButton("Sheep");
         JButton cow = new JButton("Cow");


        public Window2()
        {
            super("Swing Window");
            setSize(500, 220);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            add(pnl);
            txt.setFont(new Font("Arial", Font.BOLD, 24));
            pnl.add(txt);
            grid.add(sheep);
            grid.add(cow);

           contentPane.add("North", pnl);
           contentPane.add("South", grid);

            setVisible(true);
        }




}
