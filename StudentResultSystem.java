package TASK3;

import java.util.Scanner;

public class StudentResultSystem {
     static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        while (true){
            processStudent();
            System.out.println("do you want to enter another student ?");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("no")){
                System.out.println("existing system , Thank you ! ");
                break;
            }
        }
    }
    // method to process one student
    public static void  processStudent(){
      System.out.println(" enter student name :");
      String name = sc.next();
      int marks = getValidMarks();
      double percentage = calculatePercent(marks);
      char grade = calculateGrade(percentage);
      displayResult(name ,marks , percentage , grade);

    }

    private static void displayResult(String name, int marks, double percentage, char grade) {
        System.out.println("---- Result Summary -----");
        System.out.println("Student Name : " + name);
        System.out.println("Marks        : " + marks);
        System.out.println("Percentage   : " + percentage + "%");
        System.out.println("Grade        : " + grade);
    }

    private static char calculateGrade(double percentage) {
        char grade;

        switch ((int) percentage / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        return grade;
    }

    private static double calculatePercent(int marks) {
        return marks ;
    }

    private static int getValidMarks() {
        int marks ;
        while (true){
            System.out.println("enter the marks (0 - 100)");
            marks = sc.nextInt();
            if (marks< 0 || marks> 100 ){
                System.out.println(" enter valid marks ");
                continue;
            }
            break;
        }
        return marks;
    }


}
