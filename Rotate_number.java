import java.util.*;
public class Rotate_number {
    public static int count(int num){
        int count=0;
        while (num>0) {
            num/=10;
            count++;
        }
        return count;
    }
    public static int pow(int base,int raise){
        int pow=1;
        for(int i=0;i<raise;i++){
            pow*=base;
        }
        return pow;
    }
    public static int rotate(int num){
        return (num%10*pow(10,count(num)-1)+(num/=10));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        System.out.print(rotate(num));
    }
    
}
