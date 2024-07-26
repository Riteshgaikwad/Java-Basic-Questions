import java.util.*;
public class sum_digitOddEven {
    public static void odd_even(int num){
        int sum=0;
        while (num>0) {
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        if(sum%2==0){
            System.out.print("The sum of digit is Even");
        }else{
            System.out.print("The sum of digit is Odd");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=sc.nextInt();
        odd_even(num);
    }
    
}
