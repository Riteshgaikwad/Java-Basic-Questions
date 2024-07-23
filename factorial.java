//Question :- Find the factorial of given number.

import java.util.*;
public class factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int factorial=1;
        while (num>0) {
            factorial*=num;
            num--;
        }
        System.out.println("The factorial  is "+factorial);
    }
    
}
