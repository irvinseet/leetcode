
class Main {
    public static boolean isPalindrome(int x) {
        int temp = x;
        int sum = 0;

        while (x > 0) {
            int r = x % 10; //remainder
            sum = (sum*10) + r;
            x /= 10;
        }
        return temp == sum;
    }
    public static void main(String[] args) {
        int num = 123454321;
        System.out.println(isPalindrome(num));
    }
}