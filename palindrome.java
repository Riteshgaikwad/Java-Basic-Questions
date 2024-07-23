import java.util.*;
public class palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int rev=0;
        for(int a=num;a>0;a/=10){
            int rem=a%10;
            rev=rev*10+rem;
            
        }
        if(num==rev){
            System.out.println("The number is Palingrome !");
        }else{
            System.out.println("The number is not a Palindrome !");
        }
    }
    
}
