/**
 * Created by Josh on 02/11/2017.
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        int[] x = {1,2,4,4};
//        System.out.println(numbers(x,8)[0]);
//        if(numbers(x,8) != null){
//            System.out.println(numbers(x,8)[0]);
//            System.out.println(numbers(x,8)[1]);
//        } else {
            System.out.println(numbers(x,8));
//        }

    }

    public static int[] numbers(int[] x, int answer){
        int i = 0;
        int j = x.length-1;
        while(i < j){
            if(x[i]+x[j] > answer){
                j--;
            } else if(x[i]+x[j] < answer){
                i++;
            } else {
                return new int[] {x[i],x[j]};
            }
        }


        return null;
    }

    public static int[] binaryNumbers(int[] x, int answer){
//        int p,index;
//        index = 0;


        for(int i=0; i < x.length; i++){
            int p =0;
            int r = x.length-1;
            while (p < r){
                int q= (p+r)/2;
                int numberSearchingFor =  answer - x[i];
//                System.out.println(numberSearchingFor);
                if(x[q]+x[i] == answer){
                    return new int[] {x[q],x[i]};
                } else if(x[q] > numberSearchingFor){
                    r = q-1;
                } else {
                    p = q+1;
                }
            }
        }
        return null;
    }

    public static int[] bruteForceNumbers(int[] x, int answer){
        for (int i = 0; i<x.length; i++){
            for(int j =0; j < x.length; j++){
                if( x[j]+x[i] == answer){
                    return new int[] {x[i],x[j]};
                }
            }
        }

        return null;
    }

}
