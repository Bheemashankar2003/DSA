package OOPS;

import java.util.Arrays;

abstract class Abc {
    public static void main(String[] args) {
        
        int [] arr = {60, 10, 80, 40, 20, 30, 90, 70};
        quick(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] quick(int[] arr, int start, int end){

        if(start>=end)
         return arr;
        
        else{

            int i = start;
            int j = end;
            int pivot = arr[start];
            //or
            // int pivot = arr[(start+end)/2];

            while(i<=j){
                while(arr[i] < pivot)
                  i++;
                while(arr[j] > pivot)
                  j--;

                if( i<=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }

            quick(arr, start, j);
            quick(arr, i, end);
        }

        return arr;
    }
}
