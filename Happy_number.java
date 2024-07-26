import java.util.*;
public class Happy_number {
    public static int sum_digit(int num){
        int sum=0;
        while (num>0) {
            int rem=num%10;
            sum+=rem*rem;
            num/=10;
        }

        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=sc.nextInt();
        while (true) {
            num=sum_digit(num);
            if(num==1 || num==4){
                break;
            }
        }
        if(num==1){
            System.out.print("Is is a Happy Number");
        }else{
            System.out.print("It is Unhappy number");
        }
    }    
}
