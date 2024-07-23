//Question:- Find the power of given number take base as input and raise and print the answer

import java.util.*;
public class power {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base value : ");
        int base=sc.nextInt();
        System.out.print("Enter the raise value : ");
        int raise=sc.nextInt();
        int ans=1;
        while (raise>0) { 
            ans*=base;
            raise--;
        }
        System.out.print("The answer is : "+ans);
    }
    
}
