public class ltcode001 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        long reversed = 0, original = x;
        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        ltcode001 ltCode001 = new ltcode001();
        System.out.println(ltCode001.isPalindrome(121));  // true
        System.out.println(ltCode001.isPalindrome(-121)); // false
        System.out.println(ltCode001.isPalindrome(10));   // false
    }
}
