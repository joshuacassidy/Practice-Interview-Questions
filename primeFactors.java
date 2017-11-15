import java.util.ArrayList;

/**
 * Created by Josh on 02/11/2017.
 */
public class primeFactors {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        long number = 600851475143L;
        ArrayList<Long> nums = factors(600851475143L);
        long max = 0L;
        for (long x: nums){
            max = x;
        }
        System.out.println(max);
    }


    public static boolean isPrime(long x){
        for(long i = 2L; i <x; i++){
            if(x%i == 0){
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Long> factors(long x){
        ArrayList<Long> nums = new ArrayList<>();
        for(long i =1L; i < x; i++){
            if(isPrime(i) && x%i==0){
                nums.add(i);
            }
            System.out.println(i);


        }
        return nums;
    }
}
