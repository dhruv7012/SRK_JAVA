package Assignment_4;

public class UsingArray3rd {
    public static void main(String[] args) {
        int[] arr = new int[26];

        String str = "qwertyuiopasdfghaajklzxcvbnm";
        boolean flag = true;
        str = str.toLowerCase();

        str = str.replace(" ", "");


        for (int i = 0 ; i < str.length(); i++){
            arr[str.charAt(i)-'a'] ++;
        }

        for (int i = 0 ; i < 26; i ++){

            if (arr[i] == 0){
                System.out.println("String is not pangram");
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("Word is pangram");
        }


    }
}
