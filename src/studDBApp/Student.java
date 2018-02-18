package studDBApp;


import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses= "";
    private int tuitionBalance = 0;
    private static int costOdCourse = 600;
    private static int id=1000;


    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Eneter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Eneter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - for Sophomore\n3 - Junior\n4 - Senior\n Enter student class level: ");
        this.gradeYear = in.nextInt();
        setStudentId();



    }


    //Generate id
    private void setStudentId(){
        id++;
        this.studentID = gradeYear + "" + id;

    }

    //Enroll in courses
    public void enroll(){
        do {
            System.out.print("Enter course to enroll( Q to quit ): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine().toUpperCase();
            if (!course.equals("Q")) {
                courses = courses + "\n  > " + course;
                tuitionBalance = tuitionBalance + costOdCourse;

            }
            else {break;}

        }while  (1 != 0);
    }
    //View balance
    public void viewBalance() {
        System.out.println("Your balance is: " + tuitionBalance + "zł");
    }
    // Pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: zł ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of " + payment + "zl");
        viewBalance();

    }
    // Show status
    public String toString(){
        return "Name: " + firstName + " " + lastName  +
                "\nGrade Level:" + gradeYear +
                "\nStudent Id: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\n______________________" +
                "\nBalance: " + tuitionBalance + " zł";


    }

}
