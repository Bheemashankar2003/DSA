package Recursion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionIntersection {
    
    public static void main(String[] args) {
        
        List<Integer> l1 = Arrays.asList(1,2,3,4);
        List<Integer> l2 = Arrays.asList(3,4,5,6);

        Set<Integer> union = new HashSet<>(l1);
        union.addAll(l2);

        Set<Integer> intersect = new HashSet<>(l1);
        intersect.retainAll(l2);

        System.out.println("union "+union);
        System.out.println("intersect "+intersect);
    }
}
