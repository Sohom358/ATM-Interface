import java.util.*;
class Bank_Account
{
    int bal;
    Bank_Account()
    {
        bal=5000;  //We are assuming the default account balance
    }
}
class ATM_Interface
{
    static Scanner sc=new Scanner(System.in);
    static Bank_Account obj=new Bank_Account();
    public static void withdraw(int amount)
    {
        if(obj.bal<amount)
        {
            System.out.println("Insufficient balance");
            return;
        }
        obj.bal-=amount;
        System.out.println("Amount withdrawn...");
        System.out.println("Do you want check the balance?(Y/N)");
        char k=sc.next().charAt(0);
        if(k=='Y')
        {
            checkBalance();
        }
        else
            System.out.println("Thank you");
    }
    public static void deposit(int amount)
    {
        obj.bal+=amount;
        System.out.println("Amount deposited...");
        System.out.println("Do you want check the balance?(Y/N)");
        char k=sc.next().charAt(0);
        if(k=='Y')
        {
            checkBalance();
        }
        else
            System.out.println("Thank you");
    }
    public static void checkBalance()
    {
        System.out.println("Current Balance..."+obj.bal);
    }
    
    public static void main(String args[]){
        System.out.println("Press 1 to withdraw");
        System.out.println("Press 2 to deposit");
        System.out.println("Press 3 to check balance");

        
        int ch=sc.nextInt();
        switch (ch) {
            case 1:System.out.println("Enter the amount");
                    int amount1=sc.nextInt();
                    withdraw(amount1);
                    break;

            case 2:System.out.println("Enter the amount");
                    int amount2=sc.nextInt();
                    deposit(amount2);
                    break;

            case 3:checkBalance();
                    break;

        
            default:System.out.println("Invalid input...");
                break;
        }
    }
}