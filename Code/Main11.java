package Code;

public class Main11 {

    public static boolean isArmstring(int num){

        int ans = 0;
        int lastDigit = 0;
        int temp = num;

        while (num > 0) {
            lastDigit = num%10;
            ans += lastDigit*lastDigit*lastDigit;
            num/=10;
        }
        if(temp == ans){
            return true;
        }
        else{
            return false;
        }
    }

    public static void threeDigitArmstrong(){

        for (int i = 100; i < 1000; i++) {
            if (isArmstring(i)) {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String[] args) {
        threeDigitArmstrong();
    }
}
