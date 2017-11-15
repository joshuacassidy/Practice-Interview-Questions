/**
 * Created by Josh on 02/11/2017.
 */
public class palindrome {
    public static void main(String[] args) {
        int largestInt = 0;
        for(int i = 0; i < 1000; i++){
            for (int j = 0; j < 1000; j++){
                if(isPalidrome(i*j) && largestInt < i*j){
                    largestInt = i*j;
                    System.out.println("i: " +i);
                    System.out.println("j: " +j);
                }
            }

        }
        System.out.println(largestInt);
    }

    public static boolean isPalidrome(int x){
        String temp = x + "";
        String y = "";
        for(int i = temp.length()-1; i >= 0; i--){
            y+=temp.charAt(i);
        }

        if(x == Integer.parseInt(y)){
            return true;
        }
        else {
            return false;
        }

    }

}
