
//Question:- Extract the numbers from the given input. 

import java.util.*;
class Extracting_Number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        while (num>0) {
            int rem=num%10;
            System.out.print(rem);
            num/=10;

        }
    }
}