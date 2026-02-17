package Daily;

public class Robber {
    
    public static void main(String[] args) {

        int [] arr = {1, 2, 3};
        int n = arr.length;
        
        if(n == 1){
            System.out.println(arr[0]);
            return;
        }

        int case1 = rob(arr, 0, n-2);

        int case2 = rob(arr, 1, n-1);

        System.out.println(Math.max(case1, case2));

    }
    
    public static int rob(int [] arr, int start, int end){
        
        int p1 = 0;
        int p2 = 0;

        for(int i = start;i<=end;i++){

            int pick = arr[i]+p2;
            int skip = p1;

            int rob = Math.max(pick, skip);

            p2 = p1;
            p1 = rob;
        }

        return p1;
        
    }
}
