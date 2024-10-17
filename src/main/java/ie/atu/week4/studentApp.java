/*
Enzo Gaddi
7/10/24
Java application called "StudentApp" to manage student applications
 */

package ie.atu.week4;
import java.util.Scanner;

public class studentApp {
    public static void main(String[] args) {
        Scanner studentInfo = new Scanner(System.in);

        System.out.println("Enter student 1 name: ");
        String name1 = studentInfo.nextLine();
        System.out.println("Enter student 1 email: ");
        String email1 = studentInfo.nextLine();
        System.out.println("Enter student 1 course: ");
        String course1 = studentInfo.nextLine();

        System.out.println("\nEnter student 2 name: ");
        String name2 = studentInfo.nextLine();
        System.out.println("Enter student 2 email: ");
        String email2 = studentInfo.nextLine();
        System.out.println("Enter student 2 course: ");
        String course2 = studentInfo.nextLine();

        System.out.println("\nEnter student 3 name: ");
        String name3 = studentInfo.nextLine();
        System.out.println("Enter student 3 email: ");
        String email3 = studentInfo.nextLine();
        System.out.println("Enter student 3 course: ");
        String course3 = studentInfo.nextLine();

        Student student1 = new Student();
        student1.setName(name1);
        student1.setEmail(email1);
        student1.setCourse(course1);

        Student student2 = new Student();
        student2.setName(name2);
        student2.setEmail(email2);
        student2.setCourse(course2);

        Student student3 = new Student();
        student3.setName(name3);
        student3.setEmail(email3);
        student3.setCourse(course3);


        System.out.println("Student 1: Name: " + student1.getName() + ", Email: " + student1.getEmail() + ", Course: " + student1.getCourse());
        System.out.println("Student 2: Name: " + student2.getName() + ", Email: " + student2.getEmail() + ", Course: " + student2.getCourse());
        System.out.println("Student 3: Name: " + student3.getName() + ", Email: " + student3.getEmail() + ", Course: " + student3.getCourse());
    }
}
