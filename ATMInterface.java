import java.util.Scanner;

class ATM{
    private double balance;
    public ATM(double initalbalance){
       this.balance=initalbalance;
    }
    
   public void Deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("deposit sucessfully:"+amount);
        }
        else{
            System.out.println("Invalid deposit balance");
        }
    }
    public void withdraw(double amount){
        if(amount>balance){
           System.out.println("Insufficent Balance");
        }
        else if(amount<=0){
            System.out.println(" Invalid withdraw Amount");
        }
        else{
             balance=balance-amount;
            System.out.println("withdraw Successfully:"+balance);
            
        }
    }
    public void CheckBalance()
    {
        System.out.println("Current Balance:"+balance);
    }
}
public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ATM amount=new ATM(1000);
       while(true){
        System.out.println("\nWelcome to simple ATM");
        System.out.println("1.CheckBalance");
        System.out.println("2.Deposit");
        System.out.println("3.withdraw");
        System.out.println("4.Exit");
        System.out.println("Choose an option:(1-4):");
        System.out.println("Option Number:");
        int choice=sc.nextInt();
        switch (choice) {
        case 1:
            amount.CheckBalance();
            break;
        case 2:
             System.out.println("Enter the deposit amount=");
             double deposit=sc.nextDouble();
             amount.Deposit(deposit);
             break;
        case 3:
             System.out.println("Enter the Withdraw=");
             double withdraw=sc.nextDouble();
             amount.withdraw(withdraw);   
             break; 
        case 4:
            System.out.println("THANK YOU FOR USING ATM MACHINE!"); 
            sc.close();  
            return;     
       
        default:
           System.out.println("INVALID CHOICE");
            break;
       }
       }
        
        
    }
}
