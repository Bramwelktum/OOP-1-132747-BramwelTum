package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double kcseGrades;
        int InterviewScore;
        int cofidenceScore;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to University Student Admisions");
        System.out.println("Please the students KCSE points: ");
        kcseGrades = input.nextDouble();

        System.out.println("Now enter the students Interview Score: ");
        InterviewScore = input.nextInt();
        System.out.println("-----------------------");

        System.out.println("Now enter the students confidence Score: ");
        cofidenceScore = input.nextInt();
        System.out.println("-----------------------");

        if (kcseGrades >= 0 && kcseGrades <= 100.0 && InterviewScore >= 0 && InterviewScore <= 10 && cofidenceScore >= 0 && cofidenceScore <= 10){
            if(kcseGrades >= 65.0 && InterviewScore >= 6 && cofidenceScore >= 5){
                System.out.println("Student is ACCEPTED to university!");
                System.out.println("Students KCSE points are " + kcseGrades + " and students Interview score is " + InterviewScore + "and students confidence score is" + cofidenceScore);
            }
            else {
                System.out.println("Student is REJECTED to the university!");
                System.out.println("Students KCSE points are " + kcseGrades + " and students Interview score is " + InterviewScore + "and students confidence score is" + cofidenceScore);
            }
        }
        else{
            System.out.println("Please Check KCSE Points, Interview score and Confidence score input!");
            System.out.println("Your inputs were:");
            System.out.println(kcseGrades + " = KCSE points should be between 0.0 and 100.0.");
            System.out.println(InterviewScore + " = Interview Score should be between 0 and 100");
            System.out.println(cofidenceScore + " = Confidence Score should be between 0 and 100");
        }
    }
}
