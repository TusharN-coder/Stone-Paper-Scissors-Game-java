//STUDENT GRADE CALCULATOR

import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int Total_Marks=0;
        int Total_Subjects=5;
        double Average_Percentage;
        String Grade="";

        String []Subjects={"Maths", "Science", "English", "Hindi", "SST"};
        int []Marks=new int[5];

        for(int i=0;i<Marks.length;i++){
            System.out.println("Enter Marks for Subject: "+Subjects[i]+" (0-100)");
            Marks[i]=sc.nextInt();
            if(Marks[i]<0 || Marks[i]>100){
                System.out.println("Invalid input! Please enter marks between 0 and 100.");
                i--;
            }
        }

        System.out.printf("%-10s   %5s\n","Subjects","Marks");
        for(int i=0;i<Marks.length; i++){
            System.out.printf("%-10s   %3d\n",Subjects[i],Marks[i]);
            Total_Marks+=Marks[i];
        }

        Average_Percentage=Total_Marks/Total_Subjects;

        if(Average_Percentage>=80){
            Grade="A";
        }
        else if(Average_Percentage>=60 && Average_Percentage<80){
            Grade="B";
        }
        else if(Average_Percentage>=35 && Average_Percentage<60){
            Grade="C";
        }
        else if(Average_Percentage>=0 && Average_Percentage<35){
            Grade="D";
            System.out.println("Student Failed");
        }

        System.out.println("Total Marks Obtain: "+Total_Marks+"\nAverage Percentage: "+Average_Percentage+"%\nGrades: "+Grade);
    }
}
