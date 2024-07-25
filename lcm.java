//Question:- Find the LCM of given two numbers.

import java.util.*;
public class lcm {
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int n1=sc.nextInt();
        System.out.print("Enter the second number:");
        int n2=sc.nextInt();
        int lcm=n1>n2?n1:n2;
        while (true) {
            if(lcm%n1==0 && lcm%n2==0){
                System.out.print("LCM of "+n1+" and "+n2+" is : "+lcm);
                break;
            }
            lcm++;
        }
   } 
}
