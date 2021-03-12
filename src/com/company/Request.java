package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Formatter;


class Request extends JFrame implements ActionListener {


    Container contentPane = getContentPane();

    JPanel pnl = new JPanel();

    JPanel grid = new JPanel(new GridLayout(3, 3, 40, 20));

    JLabel txt = new JLabel("Add Animal");


    JButton btn1 = new JButton("Sheep");
    JButton btn2 = new JButton("Cow");


    JTextField field = new JTextField(38);


    public Request() {
        super("Swing Window");
        setSize(500, 220);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);
        txt.setFont(new Font("Arial", Font.BOLD, 24));
        pnl.add(txt);
        grid.add(btn1);
        grid.add(btn2);


        contentPane.add("North", pnl);
        contentPane.add("South", grid);

        setVisible(true);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == btn1) {
            //make reader here and read all the way through then write
            //make reader read through and add to an arraylist with loop
            try {
                File sheepF = new File("sheep.csv");
                sheepF.setReadable(true);
                sheepF.setWritable(true);
                FileWriter file = new FileWriter(sheepF, true);

                BufferedWriter buffer = new BufferedWriter(file);


                String name = JOptionPane.showInputDialog("Name:");
                buffer.write(name + ",");


                String sex = JOptionPane.showInputDialog("Sex:");
                buffer.write(sex + ",");

                String number = JOptionPane.showInputDialog("Number:");
                buffer.write(number + ",");

                String momNum = JOptionPane.showInputDialog("Mom's Number:");
                buffer.write(momNum + ",");

                String dadNum = JOptionPane.showInputDialog(("Dad's Number"));
                buffer.write(dadNum + ",");

                String birthDay = JOptionPane.showInputDialog(("Birth Day:"));
                buffer.write(birthDay + ",");

                String birthMonth = JOptionPane.showInputDialog(("Birth Month:"));
                buffer.write(birthMonth + ",");

                String birthYear = JOptionPane.showInputDialog("Birth Year:");
                buffer.write(birthYear + ",");

                //String sheared = JOptionPane.showInputDialog("Is it sheared?");
                String[] options = {"Yes", "No"};
                int isShePos = JOptionPane.showOptionDialog(null, "Is it sheared?", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                String sheared = options[isShePos];
                buffer.write(sheared + ",");


                //int numLambs = Integer.parseInt(JOptionPane.showInputDialog("Number of Lambs:"));
                String numLambs = JOptionPane.showInputDialog("Number of Lambs");
                buffer.write(numLambs + ",");

                // String isVac = JOptionPane.showInputDialog("Has it been vaccinated?");
                //  String[] options = {"Yes", "No"};
                int isVacPos = JOptionPane.showOptionDialog(null, "Is it vaccinated?", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                String isVac = options[isVacPos];
                buffer.write(isVac);

                buffer.newLine();
                buffer.close();

                //Sheep newAni = new Sheep(name, sex, number, momNum, dadNum, birthDay, birthMonth, birthYear, sheared, numLambs, isVac);
                // Formatter fmt = new Formatter();
                // System.out.println(fmt.format("%s %s %s %s %s", "Title*", "Title*", "Title*", "Title*", "Title*"));

                //field.setText(JOptionPane.showInputDialog(this, "Name: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
                //field.setText(JOptionPane.showInputDialog(this, "Breed: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
                //field.setText(JOptionPane.showInputDialog(this, "Sex: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
                //field.setText(JOptionPane.showInputDialog(this, "Number: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
                //field.setText(JOptionPane.showInputDialog(this, "Mom's Number: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
                //field.setText(JOptionPane.showInputDialog(this, "Dad's Number: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
                //field.setText(JOptionPane.showInputDialog(this, "Birth Day: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
                //field.setText(JOptionPane.showInputDialog(this, "Birth Month: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
                //field.setText(JOptionPane.showInputDialog(this, "Birth Year: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
                //field.setText(JOptionPane.showInputDialog(this, "Has it been sheared in the past year? ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
                //field.setText(JOptionPane.showInputDialog(this, "Number of Lambs: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
                //field.setText(JOptionPane.showInputDialog(this, "Has it been vaccinated? : ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
            } catch (IOException e) {
                System.out.println("A write error has occurred");
            }
        }

        if (event.getSource() == btn2) {
            //field.setText(JOptionPane.showInputDialog(this, "Name: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
            //field.setText(JOptionPane.showInputDialog(this, "Breed: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
            //field.setText(JOptionPane.showInputDialog(this, "Sex: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
            //field.setText(JOptionPane.showInputDialog(this, "Number: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
            //field.setText(JOptionPane.showInputDialog(this, "Mom's Number: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
            // field.setText(JOptionPane.showInputDialog(this, "Dad's Number: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
            // field.setText(JOptionPane.showInputDialog(this, "Birth Day: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
            // field.setText(JOptionPane.showInputDialog(this, "Birth Month: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
            //field.setText(JOptionPane.showInputDialog(this, "Birth Year: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
            //field.setText(JOptionPane.showInputDialog(this, "Mother's Genes: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
            //field.setText(JOptionPane.showInputDialog(this, "Father's Genes: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
            //field.setText(JOptionPane.showInputDialog(this, "Date of First Vaccine: ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
            //field.setText(JOptionPane.showInputDialog(this, "Has it Received Second Vaccine? ", "Input the Following Information: ", JOptionPane.PLAIN_MESSAGE));
            try {
                File cowF = new File("cow.csv");
                cowF.setReadable(true);
                cowF.setWritable(true);
                FileWriter file = new FileWriter(cowF, true);


                BufferedWriter buffer = new BufferedWriter(file);


                String name = JOptionPane.showInputDialog("Name:");
                buffer.write(name + ",");


                String sex = JOptionPane.showInputDialog("Sex:");
                buffer.write(sex + ",");

                String number = JOptionPane.showInputDialog("Number:");
                buffer.write(number + ",");

                String momNum = JOptionPane.showInputDialog("Mom's Number:");
                buffer.write(momNum + ",");

                String dadNum = JOptionPane.showInputDialog(("Dad's Number"));
                buffer.write(dadNum + ",");

                String birthDay = JOptionPane.showInputDialog(("Birth Day:"));
                buffer.write(birthDay + ",");

                String birthMonth = JOptionPane.showInputDialog(("Birth Month:"));
                buffer.write(birthMonth + ",");

                String birthYear = JOptionPane.showInputDialog("Birth Year:");
                buffer.write(birthYear + ",");

                String vacStatus = JOptionPane.showInputDialog("Date of 1st Vaccine:");
                buffer.write(vacStatus + ",");

                String[] options = {"Yes", "No"};
                int isVacPos = JOptionPane.showOptionDialog(null, "Has it gotten 2nd vaccine?", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                String isVac = options[isVacPos];
                buffer.write(isVac);

                buffer.close();


            } catch (IOException e) {
                System.out.println("A write error has occurred");
            }

        }
    }


        public static void main (String[] args)
        {
            Request gui = new Request();
        }
    }
