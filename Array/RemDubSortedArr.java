package Array;

public class RemDubSortedArr {
 
    public static int remDub(int [] nums){

        if(nums.length ==0){
            return 0;
        }
        
        int k = 1;
        for(int i  = 1 ;i<nums.length;i++){

            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++; 
            }
        }
        return k;
    }
    
    public static void main(String[] args) {
        
        int [] nums = {1, 1, 2};
        int k = remDub(nums);

        System.out.println(k);
        for(int i = 0;i<k;i++){
            System.out.println(nums[i]+" ");
        }

    }
}
