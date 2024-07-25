
//Question:-Find the number is noeon number or not . Neon=> no sqeare and the sum of digit of square is equal to the number.
import java.util.*;
public class Neon_number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        int square=num*num;
        int sum=0;
        while (square>0) {
            int rem=square%10;
            sum+=rem;
            square/=10;
        }
        if(num==sum){
            System.out.print("The number "+num+" is a Neon Number ");
        }else{
            System.out.print("The number "+num+" is not a Neon Number ");
        }
    }
    
}
