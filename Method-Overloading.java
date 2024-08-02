class myClass{
  public static void main(String args[]){
    System.out.println("In the main method");
    add(2,3);
  } 
  //same method name but different arguments 
  public static int add(int a,int b){
    return a+b;
  }

  public static int add(int a,int b,intc){
    return a+b+c;
  }
  public static double add(double a,double b){
    return a+b;
  }
    

}
