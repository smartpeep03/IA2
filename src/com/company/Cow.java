package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Cow extends Animal{

    private String mGene;
    private String fGene;
    private int vacDay;
    private int vacMonth;
    private int vacYear;
    static ArrayList<Cow> dataBaseC = new ArrayList<Cow>();


    public Cow(String name, String type, String sex, int number, int momNum, int dadNum, int birthDay, int birthMonth, int birthYear, String mGene, String fGene, int vacDay, int vacMonth, int vacYear) {
        super(name, type, sex, number, momNum, dadNum, birthDay, birthMonth, birthYear);
        this.fGene = fGene;
        this.mGene = mGene;
        this.vacDay = vacDay;
        this.vacMonth = vacMonth;
        this.vacYear = vacYear;
    }

    public int getVacDay() {
        return vacDay;
    }

    public int getVacMonth() {
        return vacMonth;
    }

    public int getVacYear() {
        return vacYear;
    }

    public static void addCow(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the following information:");

        System.out.print("Name: ");
        String name = input.nextLine();

        String type = "Cow";

        System.out.print("Breed: ");
        String breed = input.nextLine();

        System.out.print("Number: ");
        int number = input.nextInt();

        System.out.print("Sex: ");
        String sex = input.nextLine();

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

        System.out.print("Mother's Genetics: ");
        String mGenes = input.nextLine();

        System.out.print("Father's Genetics: ");
        String fGenes = input.nextLine();

        System.out.print("Day of 1st Vaccine: ");
        int vacDay = input.nextInt();

        System.out.print("Month of 1st Vaccine: ");
        int vacMonth = input.nextInt();

        System.out.print("Year of 1st Vaccine: ");
        int vacYear = input.nextInt();

        Cow newAni = new Cow(name, type, sex, number, momNum, dadNum, birthDay, birthMonth, birthYear, mGenes, fGenes, vacDay, vacMonth, vacYear);
        dataBaseC.add(newAni);
    }

    public static void getCReminders()
    {
        java.time.LocalDate today = java.time.LocalDate.now();
        int curMon = today.getMonthValue();
        int curDay = today.getDayOfMonth();

        for(int i = 0; i<dataBaseC.size(); i++) {

            int monSinceVac = curMon - dataBaseC.get(i).getVacMonth();
            int daySinceVac = curDay-dataBaseC.get(i).getVacDay();
            LocalDate dateBefore = LocalDate.of(dataBaseC.get(i).getVacYear(), Month.MAY, 24);
          //  int days = ChronoUnit.DAYS.between(today, dateBefore);

        }


        }
    }

