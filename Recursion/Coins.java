package Recursion;

public class Coins {
    
    public static int count(int [] arr, int index, int target){

        if(target == 0){
          return 1;
        }
        if(target < 0 || index == arr.length){
          return 0;
        }

        int take = count(arr, index, target-arr[index]);

        int skip = count(arr, index+1, target);

        return take+skip;
    }
    public static void main(String[] args) {
        
        int [] arr = {2, 4, 5, 6};
        int target = 18;

        int result = count(arr, 0, target);
        System.out.println("Total ways = " + result);
    }

}
