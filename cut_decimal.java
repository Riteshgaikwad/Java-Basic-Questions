import java.util.*;
class cut_decimal{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        double num=sc.nextDouble();
        cutDecimal(num,2);
    }
    public static void cutDecimal(double num,int count){
        double x=1;
        for(int i=0;i<count;i++){
            x*=10;
        }
        int temp=(int) (num*x);
        System.out.print(temp/x);
    }
}