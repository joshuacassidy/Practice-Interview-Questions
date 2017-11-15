/**
 * Created by Josh on 06/11/2017.
 */
public class The10001Prime {
    public static void main(String[] args) {
        int prime_Counter = 0;
        int iterator = 0;
        int thePrime = 0;


        while (prime_Counter <= 10001){
            iterator++;
            if (isPrime(iterator)){
                thePrime = iterator;
                prime_Counter++;
            }
        }
//        104743
        System.out.println(isPrime(104743));
        System.out.println(thePrime);

    }
    public static boolean isPrime(int num){
        for (int i = 2; i < num-1; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
