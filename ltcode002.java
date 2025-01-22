public class ltcode002 {
    public int reverse(int x) {
        int sign = x < 0 ? -1 : 1;
        x *= sign;

        int reversed = 0;
        while (x > 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }

            reversed = reversed * 10 + digit;
        }

        return sign * reversed;
    }

    public static void main(String[] args) {
        ltcode002 solution = new ltcode002();
        System.out.println(solution.reverse(123));   // 321
        System.out.println(solution.reverse(-123));  // -321
        System.out.println(solution.reverse(120));   // 21
    }
}


