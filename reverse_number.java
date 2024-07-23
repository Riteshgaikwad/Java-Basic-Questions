//Question:- Reverse a given number and store it in a nuw variable 

import java.util.*;
public class reverse_number {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int reverse=0;
        while (num>0) {
            int rem=num%10;
            reverse=reverse*10+rem;
            num/=10;
        }
        System.out.println(reverse);
    }
    
}
