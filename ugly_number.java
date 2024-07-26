import java.util.*;
public class ugly_number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        while (num!=1) {
            if(num%2==0){
                num/=2;
            }else if(num%3==0){
                num/=3;
            }else if(num%5==0){
                num/=5;
            }else{
                break;
            }
        }
        if(num==1){
            System.out.print("It is a Ugly Number");
        }else{
            System.out.print("It is not a ugly number");
        }
    }
}
