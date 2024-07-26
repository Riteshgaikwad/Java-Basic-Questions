import java.util.*;
public class tech_number {
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
    public static boolean isTech(int num){
        int ct=count(num);
        if(ct%2==0){
            int temp=num;
            int last=num%pow(10,ct/2);
            num/=pow(10,ct/2);
            int sum=last+num;
            int sqr=sum*sum;
            if(sqr==temp){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a start number:");
        int start=sc.nextInt();
        System.out.print("Enter a end number:");
        int end=sc.nextInt();
        for(int i=start;i<end;i++){
            if(isTech(i)){
                System.out.println(i);
            }
        }
    }
}
