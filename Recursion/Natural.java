package Recursion;

public class Natural {
 
    public static void main(String[] args) {
        nums(10);
    }

    public static void nums(int n ){

        if(n<=0)
          return;
        else
          nums(n-1);
          System.out.println(n);
    }
}
