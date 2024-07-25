import java.util.*;
public class fibonacci {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=sc.nextInt();
        int n1=0;
        int n2=1;
        int n3;
        int count=0;
        while (count<num) {
            n3=n1+n2;
            System.out.print(n1+" ");
            n1=n2;
            n2=n3;
            count++;
        }
    }
    
}
