import java.util.Scanner;
public class Student{
    private String name;
    private String fName;
    private int age;
    private int numberOfSubjects;
    private int[] subjectMarks;

    public Student(String name, String fName, int age, int numberOfSubjects)
    {
        this.name=name;
        this.fName=fName;
        this.age=age;
        this.numberOfSubjects= numberOfSubjects;
        this.subjectMarks = new int[numberOfSubjects];
    }

    public void inputSubjectsMarks()
    {
        Scanner src = new Scanner(System.in);

        for(int i=0;i<this.numberOfSubjects;i++)
        {
            while(true){
            System.out.print("Enter marks of Subject "+(i+1)+": ");
            subjectMarks[i] = src.nextInt();

            if(subjectMarks[i] <=100 && subjectMarks[i] >= 0)
                break;
            System.out.println("Invalid Input.\nEnter a number between 0 and 100.");
            }
        }
    }

    public void display()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Father Name: "+this.fName);
        System.out.println("Age: "+this.age);
        System.out.print("Marks: ");

        int totalMarks = 0;
        int highestMarks = -1;
        int lowestMarks = 101;
        float average = 0;
        for(int i:subjectMarks)
        {
            System.out.print(i+" ");
            totalMarks+=i;
            highestMarks = (highestMarks > i)?highestMarks:i;
            lowestMarks = (lowestMarks < i)?lowestMarks:i;
        }

        average = totalMarks/numberOfSubjects;

        System.out.println("\nObtained Marks: "+totalMarks);
        System.out.println("Average: "+average);
        System.out.println("Highest Marks: "+highestMarks);
        System.out.println("Lowest Marks: "+lowestMarks);
    }

    public static void main(String[] args)
    {
        Student ali = new Student("Ali","Ahmad",12,3);
        ali.inputSubjectsMarks();
        ali.display();
    }
}

