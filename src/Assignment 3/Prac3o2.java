public class Prac3o2 {
    public static void main(String[] args) {
        String str = "aba";
        String temp = str;
        int n = 1000000000;
        int co = 0;

        while (str.length() < n){
            str = str + temp;
        }

        str = str.substring(0,n);

        System.out.println(str);
        System.out.println(str.length());

        System.out.println(str.contains("a"));
        System.out.println(str.indexOf('a')+1);

            while(str.contains("a")){
                str=str.substring(str.indexOf('a')+1,str.length());
//                str = str.replace('a','x');
                System.out.println(str);
                co++;
            }

        System.out.println(co);

    }
}
