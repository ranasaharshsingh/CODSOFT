import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
public class Task1 
{
   public static void main(String args[]) throws IOException
   {
       Scanner sc = new Scanner(System.in);
       Random rd = new Random();
       System.out.println(".......Welcome To The Number Game.........");
       System.out.println("Discription of the game : A random number is randomly generated in this game and the user have to guess the generated number within the range . You will also get hint to guess the number . Take less chances to guess the number to win fast........All the best!!");
       System.out.println("Enter the number of rounds you want to play the game : ");
       int rounds = sc.nextInt();
       System.out.println("Enter the range for  generating random number\n Enter the lower limit of range : ");
       int lowlimit = sc.nextInt();
       System.out.println("Enter the upper limit of range : ");
       int upperlimit = sc.nextInt();
       for(int i=1;i<=rounds;i++)
       {
           System.out.println("....Levels..... \n 1.EASY[no restricted number of attempts to win..]\n 2.DIFFICULT[limited number of attempts to win..]\nChoose The Difficulty Level :");
           int level = sc.nextInt();
           switch(level)
           {
               case 1: {
                   System.out.println("You selected the easy level therefore there is no limit on number of chances to guess the number.");
                   int randno = lowlimit + rd.nextInt(upperlimit - lowlimit);
                   int score = 1;
                   System.out.println("Game Started ........Now guesss the number!!");
                   while(true)
                   {
                       System.out.println("Enter your guess :");
                       int guess = sc.nextInt();
                       if(guess > randno)
                       {
                           System.out.println("The guessed number is greater than the generated number.");                          
                       }
                       else if ( guess < randno)
                       {
                           System.out.println("The guessed no is smaller than generated number.");
                       }
                       else
                       {
                           System.out.println("Congratulations you have guessed the generated number....!!");
                           System.out.println("Randomly generated no : "+randno+"\nScore : "+score);
                           System.out.println("...............Level cleared...................\n");
                           break;
                       }
                       score++;
                   }
                   break;
               }
               case 2: {
                System.out.println("You choosed Difficult Level hence you have only 5 chances to guess the generated number");
                int chances=5,score=1;
                int randno=lowlimit + rd.nextInt(upperlimit - lowlimit);
                while(chances!=0)
                {
                   System.out.println("Enter your guess :");
                   int guess = sc.nextInt();    
                   if(guess > randno)
                   {
                       System.out.println("The guessed number is greater than the generated number.");                          
                   }
                   else if ( guess< randno)
                   {
                           System.out.println("The guessed no is smaller than generated number.");
                   }
                   else
                   {
                       System.out.println("Congratulations you have guessed the generated number....!!");
                       System.out.println("Randomly generated no : "+randno+"\nScore : "+score);
                       System.out.println("...............Level cleared...................\n");
                       break;
                   }
                   score++;
                   chances--;
                   if(chances==0)
                   {
                       System.out.println("..............NO Chances Left...........\n............ Level Not Clear............\n");
                   }
                }  
                break;
               }
             default:
             {
                  System.out.println("...............You have selected wrong option ...................\n .............Please Select correct LEVEL........\n");
                  rounds++;
                  break;
             }
            }
        }
    }
}
