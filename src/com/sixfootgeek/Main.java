package com.sixfootgeek;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by andy on 2/5/2015.
 */
public class Main {

    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public static void main(String[] args) {
        PrintWriter totes = null;
        String[] students = {"Andy", "Niall", "Ben", "Jamex", "Gerry", "Phil", "Terry", "John", "Dumbledore", "Harry", "Hermione", "Ron", "Voldermort", "Tom", "Fred", "Freddy", "Mikey", "Peter", "Dwayne", "Jesus", "God"};
        String[] grades = {"A", "B", "C", "D", "E", "F"};
        String[] subject = {"hacking", "linux", "hacking", "java", "python", "C++", "Data"};

        try {
            totes = new PrintWriter("gradesAndName.txt");

//all of the things

            for (int i = 0; i < students.length; i++) { //print out all students

                for (int t = 0; t < randInt(0, 7); t++) { //for each student print out some subjects and a grade for each subkect
                    totes.printf(students[i] + "\t" + subject[randInt(0, grades.length - 1)] + " " + grades[randInt(0, grades.length - 1)] + "\n");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            totes.close();
        }
    }

}