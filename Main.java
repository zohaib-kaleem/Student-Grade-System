import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        int numberOfStudent;

        Scanner src = new Scanner(System.in);

        //input number of students
        System.out.print("Enter number of Student: ");
        numberOfStudent = src.nextInt();

        //input number of subjects
        System.out.print("Enter number of Subjects: ");
        int numberOfSubjects = src.nextInt();

        //make students
        Student[] student = new Student[numberOfStudent];

        for(int i=0;i<numberOfStudent;i++)
        {
            System.out.println("\n----------------------------------------\nStudent "+(i+1));
            System.out.print("Enter name of Student " + (i + 1) + ": ");
            String name = src.next();
            
            System.out.print("Enter Father name of Student " + (i + 1) + ": ");
            String fName = src.next();

            System.out.print("Enter age of Student " + (i + 1) + ": ");
            int age = src.nextInt();
            
            student[i] = new Student(name, fName, age, numberOfSubjects);
        }
        
        //input marks of subjects
        for(int i=0;i<numberOfStudent;i++)
        {
            System.out.println("\n----------------------------------------\nStudent "+(i+1));
            student[i].inputSubjectsMarks();
        }
        
        //display students info
        for(int i=0;i<numberOfStudent;i++)
        {
            System.out.println("\n----------------------------------------\nStudent "+(i+1));
            student[i].display();
            System.out.println();
        }
    }
}