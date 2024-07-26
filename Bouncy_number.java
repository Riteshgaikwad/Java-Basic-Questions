import java.util.*;
public class Bouncy_number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a starting  number:");
        int start=sc.nextInt();
        System.out.print("Enter a ending  number:");
        int end=sc.nextInt();
        for(int i=start;i<end;i++){
            if(isBouncy(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isBouncy(int num){
        boolean inc=false,dec=false;
        while (num!=0) {
            int n1=num%10;
            num/=10;
            int n2=num%10;
            if(num==0){
                break;
            }
            if(n1>n2){
                dec=true;
            }else if(n1<n2){
                inc=true;
            }
            if(dec==true && inc==true){
                return true;
            }
        }
        return false;
    }
}
