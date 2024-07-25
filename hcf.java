//Question:-Find HCF of given two numbers.

import java.util.*;
public class hcf {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int n1=sc.nextInt();
        System.out.print("Enter Second number:");
        int n2=sc.nextInt();
        int hcf=n1<n2?n1:n2;
        for(; ;){
            if(n1%hcf==0 && n2%hcf==0){
                System.out.print("The HCF of "+n1+" and "+n2+" is : "+hcf);
                break;
            }
            hcf--;
        }
    }
    
}


//Question:- check the numbers are coprime or not 
/*
  It have same logic as above code but only one condition added if hcf ==1 {the number is coprime}else{the number is not a coprime };
 */