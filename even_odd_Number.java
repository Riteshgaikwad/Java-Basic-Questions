//Question:- Find the number of even and odd numbers between 10 to 20 .

public class even_odd_Number {
    public static void main(String args[]){
        int even_count=0;
        int odd_count=0;
        for(int i=10;i<=20;i++){
            if(i%2==0){
                even_count++;
            }else{
                odd_count++;
            }
        }
        System.out.println("The Number of even numbers are :"+even_count);
        System.out.println("the Number of odd numers are : "+odd_count);
    }
}
