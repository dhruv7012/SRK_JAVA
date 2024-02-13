public class Main {

   public static String str1 = "11110";
   public static String str2 = "0110";

   public static String sum = "";
   public static String carryReturn;

    public static void main(String[] args) {

        if(str1.length() < str2.length()){
            for(int i = 0 ; i< str2.length() - str1.length(); i ++){
                str1 = '0' + str1;
            }
        }else if (str1.length() > str2.length()){
            for(int i = 0 ; i< str1.length() - str2.length(); i ++){
                str2 = '0' + str2;
            }
        }

        char carry = '0';

        for(int i = str1.length()-1; i >=0;i--){
           carry = getSum(i,carry);
           carryReturn = carryReturn + carry;
        }

        System.out.println(carry + sum);

    }

    public static char getSum(int index, char carry){

        if(str1.charAt(index) == '1' && str2.charAt(index)== '1'){
            if (carry == '0'){
                sum =  "0" + sum ;
                return '1';
            }
            else{
                sum = "1" +  sum;
                return '1';
            }
        }
        else if ((str1.charAt(index) == '1' && str2.charAt(index)== '0')
                || (str1.charAt(index) == '0' && str2.charAt(index)== '1')) {
            if (carry == '0') {
                sum =  "1" + sum ;
                return '0';
            }
            else{
                sum = "0" + sum ;
                return '1';
            }
        }
        else {
            if (carry == '0') {
                sum = "0" + sum ;
                return '0';
            }
            else{
                sum = "1" + sum;
                return '0';
            }
        }
    }

}