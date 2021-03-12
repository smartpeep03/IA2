package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Animal {
    private String name;
    private String type;
    private String sex;
    private int number;
    private int momNum;
    private int dadNum;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    static ArrayList<Animal> dataBase = new ArrayList<Animal>();

    public Animal(String name, String type, String sex, int number, int momNum, int dadNum, int birthDay, int birthMonth, int birthYear) {
        this.name = name;
        this.type = type;
        this.sex = sex;
        this.number = number;
        this.momNum = momNum;
        this.dadNum = dadNum;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMomNum() {
        return momNum;
    }

    public void setMomNum(int momNum) {
        this.momNum = momNum;
    }

    public int getDadNum() {
        return dadNum;
    }

    public void setDadNum(int dadNum) {
        this.dadNum = dadNum;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public static void addAnimal()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Sheep or Cow? ");
        String type = input.nextLine();
        if(type.equals("Sheep"))
        {
            com.company.Sheep.addSheep();
        }
        else if(type.equals("Cow"))
        {
            com.company.Cow.addCow();
        }
    }



    public static void display()
    {
        for(int i =0; i<dataBase.size(); i++)
        {
            System.out.println(dataBase.get(i).getName());
        }
    }


}
