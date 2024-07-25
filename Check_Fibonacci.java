import java.util.Scanner;

public class Check_Fibonacci {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=sc.nextInt();
        int n1=0;
        int n2=1;
        int n3;
       
        while (true) {
            n3=n1+n2;
            // System.out.print(n1+" ");
            if(n1==num){
                System.out.print("Fibonacci number");
                break;
            }else if(n1>num){
                System.out.print("not Fibonacci number");
                break;
            }
            n1=n2;
            n2=n3;
            
        }
    }
    
}
