package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {
    
    //normal approach 
    // public static void main(String[] args) {
        
    //     int [] num1 = {23, 45, 67, 78};
    //     int [] num2 = {23, 56, 67, 56, 100, 20};

    //     HashSet<Integer> hs = new HashSet<>();

    //     for(int i = 0;i<num1.length;i++){
    //         for(int j = 0;j<num2.length;j++){
    //             if(num1[i] == num2[j]){
    //                 hs.add(num1[i]);
    //             }
    //         }
    //     }
    //     System.out.println(hs);
    // }


    //DSA Approach

    public static int[] res(int []nums1, int []nums2){

        Set<Integer> set = new HashSet<>();

        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    set.add(nums1[i]);
                }
            }
        }

        int [] result = new int[set.size()];
        int index = 0;

        for(int n : set){
            result[index++] = n;
        }

        return result;
    }

    public static void main(String[] args) {
        
        int [] nums1 = {2, 5, 7, 8};
        int [] nums2 = {3, 5, 2, 3};

        System.out.println(Arrays.toString(res(nums1, nums2)));
    }
}
