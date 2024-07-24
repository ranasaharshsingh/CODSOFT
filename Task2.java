import java.util.Scanner;
/**
 *
 * @author HP
 */
public class StudentGradeCalculation
{
    public static void main(String args[])
    {
    int nosub,marks,totalMarks=0,percentage;
    String grade;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the total number of subjects = ");
    nosub = sc.nextInt();
    for (int i=0;i<nosub;i++)
    {
        System.out.println("Enter the marks of subject "+(i+1)+" out of 100 = "); 
        marks=sc.nextInt();
        if(marks<=100)
        {
        totalMarks+=marks;
        }
        else 
        {
            do
            {
           System.out.println("Please enter marks out of 100 !!");
           System.out.println("Enter the marks of subject "+(i+1)+" out of 100 :");
           marks=sc.nextInt();
           if(marks<=100)
               totalMarks+=marks;
            }
            while(marks>100);
        }
    }
    percentage = (totalMarks/nosub);
    switch(percentage/10)
    {
        case 10: grade="A+";break;
        case 9: grade="A";break;
        case 8: grade ="B+";break;
        case 7: grade ="B";break;
        case 6: grade ="C+";break;
        case 5: grade ="C";break;
        case 4: grade = "D";break;
        default: grade="F";
    }
    System.out.println("Result Of The Student :");
    System.out.println("Total Subject : "+nosub+"\nAverage Percentage : "+percentage+"%");
    System.out.println("Grade of the Student : "+grade);
    }
}
