import java.util.ArrayList;

/**
 * Created by Josh on 02/11/2017.
 */
public class evenFibs {
    public static void main(String[] args) {
        int x,y,z = 0;
        ArrayList<Integer> thisOne = new ArrayList<>();
        ArrayList<Integer> last = new ArrayList<>();
        ArrayList<Integer> nums =getFibonacciNumbers(0,1,thisOne);
        for(int i: nums){
            if(i%2==0){
                last.add(i);
                System.out.println(i);
            }
        }
    }
    public static ArrayList<Integer> getFibonacciNumbers(int x, int y,ArrayList<Integer> nums){
        if(x+y <4000000){
            int z = x +y;
            nums.add(z);
            return getFibonacciNumbers(y,z,nums);
        }
        return nums;

    }
}
