package Code;

public class Main9 {

    public static int largest(int a , int b){
        if(a == b){
            return -1;
        }
        if(a > b){
            return a;
        }
        else{
            return b;
        }

        // return Math.max(a , b);
    }

    public static boolean lowerCaseCheck(String s){

        char c = s.trim().charAt(0);

        if(c >= 'a' && c <= 'z'){
            return true;
        }
        return false;
    }

    public static int fibonacci(int a , int b , int n){

        int ans = 0;
        for (int i = 1; i < n; i++) {
            ans = a+b;
            a = b;
            b = ans;
        }

        return ans;

    }

    public static int occurences(int num , int digit){

        int ans = 0;

        while (num > 0) {
            int lastDigit = num%10;
            num/=10;
            
            if(lastDigit == digit){
                ans++;
            }
        }

        return ans;
    }

    public static int reverse(int num){
        
        int ans = 0;
        int lastDigit = 0;

        while (num > 0) {
            lastDigit = num%10;
            ans = ans*10 + lastDigit;
            num/=10;
        }

        return ans;
    }

    public static void main(String[] args) {
        // System.out.println(largest(100 , 200));
        // System.out.println(lowerCaseCheck("aditya"));
        // System.out.println(fibonacci(0  , 1 , 7));
        // System.out.println(occurences(1385757879 , 7));
        // System.out.println(reverse(1234567));

    }
}
