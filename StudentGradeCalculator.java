import java.util.Scanner;
 class gradecalculator{
    
      public void calculator(){
        Scanner sc=new Scanner(System.in);
        int total_of_marks=0;
        System.out.print("Enter the number of subject=");
        int n=sc.nextInt();
        int[] marks=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the marks of subject"+" "+(i+1)+"=");
            marks[i]=sc.nextInt();
            total_of_marks=total_of_marks+marks[i];
        }
        int Average_percentage=total_of_marks/n;
        System.out.println("Total marks obtained by user="+total_of_marks+"/"+n*100);
        System.out.println("Average percentage achieved by user="+Average_percentage+"%");
        
        if(Average_percentage>=90 && Average_percentage<=100){
                System.out.println("  Corresponding Grade is:A1");
            }
            else if(Average_percentage>=80 && Average_percentage<90){
                System.out.println("Corresponding Grade is:A2");
            }
            else if(Average_percentage>=70 && Average_percentage<80){
                System.out.println("Corresponding Grade is:B1");
            }
            else if(Average_percentage>=60 && Average_percentage<70){
                System.out.println(" Corresponding Grade is:B2");
            }
            else if(Average_percentage>=50 && Average_percentage<60){
                System.out.println("Corresponding Grade is:C1");
            }
            else if(Average_percentage>=40 && Average_percentage<50){
                System.out.println("Corresponding Grade is:C2");
            }
            else if(Average_percentage>=30 && Average_percentage<40){
                System.out.println("Corresponding Grade is:D");
            }
            else{
                System.out.println("Corresponding Grade is:E");
            }

    }
}

public class task1 {
    public static void main(String[] args) {
        gradecalculator userinformation=new gradecalculator();
        userinformation.calculator();
            
    }    
}
