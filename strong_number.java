//Question:- Find the input number is strong number or not.

import java.util.*;
public class strong_number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:-");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0){
            int fact=1;
            int rem=temp%10;
            for(int i=rem;i>0;i--){
                fact*=i;
            }
            sum+=fact;
            temp/=10;
        }
        if(sum==num){
            System.out.print("The number is a Strong Number ");
        }else{
            System.out.print("The number is not a Strong Number ");
        }

    }    
}
