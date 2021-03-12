package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Animal.display;




public class Main {

    public static void main(String[] args) {


        Actions gui2 = new Actions();
        //Request gui3 = new Request();

        ArrayList<Animal> dataBase = new ArrayList<Animal>();
        System.out.println("Add Animal?");
        Scanner input = new Scanner(System.in);
        String resp = input.nextLine();

        if (resp.equals("Yes")) {
           com.company.Animal.addAnimal();


        }

       // display();

        //com.company.Cow.getCReminders();
    }
}

