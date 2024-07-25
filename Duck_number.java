/*
 Question:-Find the number is a duck number or not .
    A Duck number is a positive integer that contains at least one zero, except for those with starting zeros.
 */
import java.util.*;
public class Duck_number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=sc.nextInt();
        while (num>0) {
            int rem=num%10;
            if(rem==0){
                System.out.print("It is Duck number");
                break;
            }
            num/=10;
        }
        if(num==0){
            System.out.print("It is not a Duck number ");
        }
    }
}
