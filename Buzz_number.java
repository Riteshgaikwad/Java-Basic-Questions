//Question:- find the input number is a buzz number or not (buzz number )=no. which is divisible by 7 or last digit is 7
import java.util.*;
public class Buzz_number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        int rem=num%10;
        if(num%7==0 || rem==7){
            System.out.print("The  number "+num+" is a Buzz number ");
        }else{
            System.out.print("The  number "+num+" is not a Buzz number ");
        }
    }
    
}
