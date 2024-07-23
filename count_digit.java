//Question:- Find the number of digits in the given number.

public class count_digit {
    public static void main(String args[]){
        int num=2335;
        int count=0;
        do {
            num/=10;
            count++;
        } while (num!=0);
        
        System.out.println("The number of count is :"+count);
        
    }
}
    
