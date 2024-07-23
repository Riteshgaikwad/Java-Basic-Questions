//Question:-Print the sum of digits in the given number 

import java.util.*;
public class SumofDigits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int sum=0;
        while (num>0) {
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        System.out.print("The sum of digitd is : "+sum);
    }
}
