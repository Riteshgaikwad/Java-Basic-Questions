public class Method_flow {

    public static int add(int a,int b){
        System.out.println("Method start ");
        int ans= a+b;
        System.out.println("Method ends");
        return ans;
    }
    public static void main(String args[]){
        System.out.println("Main  start");
        int ans=add(10,20);
        System.out.println(ans);
        System.out.println("Main ends");
    }
    
}
