public class Main{
    public static void main(String[] args){
        int number = 15;
        String finalNum,converted = "";

        while(number > 0){
            int temp = 0;
            temp = number %2;
            converted +=temp;
            number = number /2;
        }
        finalNum ="";
        for(int i = converted.length()-1; i >= 0; i--){
            finalNum += converted.charAt(i);
        }
        System.out.println(finalNum);

    }
}