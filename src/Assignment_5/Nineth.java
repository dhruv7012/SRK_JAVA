package Assignment_5;

public class Nineth {
    public static void main(String[] args) {
        String str = "DhruvParekhOP";

        getSubstring(str,2,10);
    }

    public static void getSubstring(String str,int s, int e){

        for (int i = s ; i <= e ; i ++){
            System.out.print(str.charAt(i));
        }
        System.out.println("\n"+  str);
    }

}
