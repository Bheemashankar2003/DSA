package Array;

public class Summer {

    public static int summer(int [] arr){

        int evenShift = 0;
        int evenIndex = 0;
        int oddShift =0;
        int oddIndex = 0;

        //left shift
        for(int i = 0 ;i <arr.length;i++){
            if(arr[i]%2 == 0){
                evenShift += Math.abs(i - evenIndex);
                evenIndex++;
            }
        }

        for(int j = 0 ;j<arr.length;j++){
            if(arr[j]%2 !=0){
                oddShift+=Math.abs(j - oddIndex);
                oddIndex++;
            }
        }

        return Math.min(evenShift, oddShift);
    }
    
    public static void main(String[] args) {
        
        int [] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;

        System.out.println(summer(arr));
    }
}
