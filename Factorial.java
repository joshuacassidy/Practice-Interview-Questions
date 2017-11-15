import java.math.BigInteger;

/**
 * Created by Josh on 06/11/2017.
 */
public class Factorial {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.ONE;
        for (int i=1; i <= 10; i++ ){
            sum=sum.multiply(BigInteger.valueOf(i));
        }
        System.out.println(sum);
    }
}
