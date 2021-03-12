package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Sheep extends Animal
{

    public static boolean sheared;
    public int numLambs;
    public int vacDay;
    public int vacMonth;
    public int vacYear;
    static ArrayList<Sheep> dataBaseS = new ArrayList<Sheep>();

    public Sheep(String name, String type, String sex, int number, int momNum, int dadNum, int birthDay, int birthMonth, int birthYear, boolean sheared, int numLambs, int vacDay, int vacMonth, int vacYear)
    {
        super(name, type, sex, number, momNum, dadNum, birthDay, birthMonth, birthYear);
        this.sheared = sheared;
        this.numLambs = numLambs;
        this.vacDay = vacDay;
        this.vacMonth = vacMonth;
        this.vacYear = vacYear;
    }



    public boolean getSheared()
    {
        return sheared;
    }


    public static void addSheep()
    {
        System.out.println("Enter the following information:");
        System.out.print("Name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        String type = "Sheep";

        System.out.print("Breed: ");
        String breed = input.nextLine();

        System.out.print("Sex: ");
        String sex = input.nextLine();

        System.out.print("Number: ");
        int number = input.nextInt();

        System.out.print("Mom's Number: ");
        int momNum = input.nextInt();

        System.out.print("Dad's Number: ");
        int dadNum = input.nextInt();

        System.out.print("Birth Day: ");
        int birthDay = input.nextInt();

        System.out.print("Birth Month: ");
        int birthMonth = input.nextInt();

        System.out.print("Birth Year: ");
        int birthYear = input.nextInt();

        System.out.print("Has it been sheared in the last year? ");

       String temp = input.nextLine();

           if(temp.equals("Yes"))
                 {
                    boolean sheared = true;
                 }
           else if(temp.equals("No"))
                {
                   boolean sheared = false;
                }



        System.out.print("How many lambs has it had? ");
        int numLambs = input.nextInt();

        System.out.print("Day of 1st Vaccine: ");
        int vacDay = input.nextInt();

        System.out.print("Month of 1st Vaccine: ");
        int vacMonth = input.nextInt();

        System.out.print("Year of 1st Vaccine: ");
        int vacYear = input.nextInt();


        Sheep newAni = new Sheep(name, type, sex, number, momNum, dadNum, birthDay, birthMonth, birthYear, sheared, numLambs, vacDay, vacMonth, vacYear);
        dataBaseS.add(newAni);
    }


    public static void getSReminders() {

     ArrayList<Integer> nums = new ArrayList<>();
     int k = 0;

     for(int i = 0; i<dataBaseS.size(); i++)
     {

        if(!dataBaseS.get(i).getSheared()) {
            k++;
            nums.add(dataBaseS.get(i).getNumber());
        }
     }
    System.out.println(k + " Sheep need to be sheared.");
     System.out.println("Their numbers are: ");

     for(int j = 0; j<nums.size(); j++)
     {
         System.out.println(nums.get(j));
     }

    }



}
