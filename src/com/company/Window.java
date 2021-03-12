package com.company;
import javax.swing.*;
import java.awt.*;



public class Window extends JFrame {

    public void main(String[] args) {
    }

       Container contentPane = getContentPane();

       JPanel pnl = new JPanel();

        JPanel grid = new JPanel(new GridLayout(3,3,40,20));

         JLabel txt = new JLabel("Farm Database");
         JLabel txtTwo = new JLabel(" ");

         JButton addAni = new JButton("Add Animal");
         JButton search = new JButton("Search");
         JButton remind = new JButton("Reminders");
         JButton display = new JButton("Display Data");

        public Window()
        {
            super("Swing Window");
            setSize(500, 220);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            add(pnl);
           txt.setFont(new Font("Arial", Font.BOLD, 24));
           pnl.add(txt);


            grid.add(addAni);
            grid.add(search);
            grid.add(remind);
            grid.add(display);


            contentPane.add("North", pnl);
           contentPane.add("South", grid);

            setVisible(true);
        }




}
