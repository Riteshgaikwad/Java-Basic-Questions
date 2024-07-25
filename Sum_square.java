//Question:- Sum of square of individual digit 

import java.util.*;
class Sum_square{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:-");
        int num=sc.nextInt();
        int sum=0;
        while (num>0) {
            int rem=num%10;
            sum+=rem*rem;
            num/=10;
        }
        System.out.print("the sum of square of each digit is :-"+sum);

    }
}