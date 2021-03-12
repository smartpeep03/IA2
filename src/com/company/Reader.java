package com.company;
import java.io.*;

public class Reader {
    public static void main(String[] args){
        try{
            FileReader file = new FileReader("Sheep.txt");
            BufferedReader buffer = new BufferedReader(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your name: ");

            String name = reader.readLine();
            System.out.println("Your name is: " + name);
            String line = "";
            while((line = buffer.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch(IOException e)
        {
            System.out.println("A read error has occurred");
        }
    }
}
