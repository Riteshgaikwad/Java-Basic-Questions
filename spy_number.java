//Question:-Find the number is a spy number or not. Spy=>No. sum and product of each digit is equal .
import java.util.*;
public class spy_number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=sc.nextInt();
        int sum=0;
        int product=1;
        while (num>0) {
            int rem=num%10;
            sum+=rem;
            product*=rem;
            num/=10;
        }
        if(sum==product){
            System.out.print("The number is a SPY number");
        }else{
            System.out.print("The number is not a SPY number");
        }
    }
}
