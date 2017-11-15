/**
 * Created by Josh on 02/11/2017.
 */
public class smallestMutliple {
    public static void main(String[] args) {
        int x = 1;
        boolean isDivisible = false;
        while (true){
            for(int i = 1; i < 21; i++){
                if(x%i == 0){
                    isDivisible = true;
                } else {
                    isDivisible = false;
                    break;
                }
            }
            if(isDivisible){
                break;
            } else {
                x++;
            }
        }
        System.out.println(x);
    }
}
