import java.util.ArrayList;

public class SumOfDivisorsOf3And5 {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        for(int i = 0; i < 1000; i++){
            if(i%3 == 0 || i%5==0){
                x.add(i);
            }
        }
        int sum = 0;
        for(int i: x){
            sum+=i;
        }
        System.out.println(sum);

    }

}
