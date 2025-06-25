import java.util.Random;
import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.print("How many attempt do you want=");
        int attempt=sc.nextInt();
        Random r=new Random();
        int random_number=r.nextInt(101);
        while(i<=attempt){
        System.out.print("Enter the guess number=");
        int user_number=sc.nextInt();
        if(user_number>random_number){
            System.out.println("user number is greater than random number(TOO High)");
        }
        else if(user_number<random_number){
            System.out.println("user number is less than random_number(TOO LOW)");
        }
        else{
            System.out.println("Congrulation You Have Won in this game");
            System.out.println("Thank You For Playing  Random number game");
            break;
        }
        if(i==attempt){
            System.out.println("SORRY YOU HAVE LOST THIS GAME PLEASE PLAY AGAIN ");
            System.out.println("Random number is="+random_number);
        }
        i=i+1;
    }
}  
}
