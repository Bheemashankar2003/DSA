package Recursion;

public class Natural {
 
    public static void main(String[] args) {
        // nums(10);
        num(1);
    }

    // public static void nums(int n ){

    //     if(n<=0)
    //       return;
    //     else
    //       nums(n-1);
    //       System.out.println(n);
    // }

    // OR
    public static int num(int n){
        if(n>10)
          return n;
        else
          System.out.println(n);
          return num(n+1);
    }
}
