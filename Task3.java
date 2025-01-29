import java.util.Scanner;
class BankAccount
{
    private double AccBalance;
    public BankAccount(double initialamount)
    {
        AccBalance=initialamount;
    }
    public double getAccBalance()
    {
        return AccBalance;
    }
    public void diposit(double amount)
    {
        AccBalance += amount;
    }
    public boolean withdrawal(double amount)
    {
        if (amount<=AccBalance)
        {
            AccBalance -= amount;
            return true;
        }
        else{
            return false;
        }
    }
}
class ATM_Interface {
    private BankAccount account;
    public ATM_Interface(BankAccount account)
    {
        this.account=account;
    }
    public void display()
    {
        System.out.println("..........Welcome to ATM..........");
        System.out.println("\n1.Chech Account Balance\n2.Diposit\n3.Withdrawal\n4.Cancle/Exit");
    }
    public void transaction()
    {
        Scanner sc = new Scanner(System.in);
        int choice ;
        double amount;
        do
        {
            display();
            System.out.println("Enter Your Choice : ");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                {
                    System.out.println("Your bank balance : "+account.getAccBalance());
                    break;
                }
                case 2:
                {
                    while(true)
                    {
                        System.out.println("Enter the amount to be deposit : ");
                        amount = sc.nextDouble();
                    
                        if(amount>0)
                        {
                            account.diposit(amount);
                            System.out.println("Amount Diposited Successfully.\nYour Current Balance is : "+account.getAccBalance());
                            break;
                        }
                        else
                        {   
                            System.out.println("Invalid amount!!");
                            continue;
                        }
                    }
                    break;
                }
                case 3:
                {
                    while(true)
                    {
                        System.out.println("Enter the amount to withdraw :");
                        amount = sc.nextDouble();
                        if(amount > 0 && account.withdrawal(amount))
                        {
                            System.out.println("Withdrawal Successful.\nYour Current Balance is : "+account.getAccBalance());
                            break;
                    }
                        else if(amount <= 0)
                        {
                            System.out.println("Invalid amount entered .");
                            continue;
                        }
                        else
                        {
                            System.out.println("Insufficient Bank Balance .");
                            continue;
                        }
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("Thanks for visiting ATM.\nVisit Again...");
                    break;
                }
                default:
                {
                    System.out.println("Invalid Choice Selected.");
                }
            }
        }
        while(choice!=4);
    }    
}
public class Task3 {
    public static void main(String args[])
    {
        BankAccount userAccount = new BankAccount(100.0);
        ATM_Interface atm = new ATM_Interface(userAccount);
        atm.transaction();
    }
}
 
