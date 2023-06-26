import java.util.*;
public class Q2A2 {
    static int distributeCandies(int[] candyType) {

        Set<Integer> set = new HashSet<>();
        for(int i : candyType){
            set.add(i);
        }
        return Math.min(candyType.length/2, set.size());
    }

    public static void main(String[] args) {

        int [] candyType = {1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));

    }
}
