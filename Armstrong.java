//Question:- Find the number is Armstrong number or not.

import java.util.*;
class Armstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  a number :");
        int num=sc.nextInt();
        int temp=num;
        int count=0;
        
        while (temp!=0) {
            temp/=10;
            count++;
        }
        int sum=0;
        for(int i=num;i!=0;i/=10){
            int rem=i%10;
            int pow=1;
            for(int j=0;j<count;j++){
                pow*=rem;
            }
            sum+=pow;
        }
        if(sum==num){
            System.out.print("The number is armstrong number ");
        }else{
            System.out.print("The number is not an armstrong number ");
        }
    }
    
}
