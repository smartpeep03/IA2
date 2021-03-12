package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


 class Actions extends JFrame implements ActionListener{



        Container contentPane = getContentPane();
        JPanel pnl = new JPanel();

        JPanel grid = new JPanel(new GridLayout(3,3,40,20));

        JLabel txt = new JLabel("Farm Database");
        JLabel txtTwo = new JLabel(" ");
        JButton addAni = new JButton("Add Animal");
        JButton search = new JButton("Search");
        JButton remind = new JButton("Reminders");
        JButton display = new JButton("Display Data");




        public Actions()
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

            addAni.addActionListener(this);


            contentPane.add("North", pnl);
            contentPane.add("South", grid);

            setVisible(true);

        }

    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == addAni)
        {
            Request gui3 = new Request();
            //Reader;
        }



    }


     public static void main( String[] args )
     {
         Actions gui = new Actions();
     }
 }