
public class ltcode003 {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1;
        int index = 0;

        if (s.charAt(0) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(0) == '+') {
            index++;
        }

        long result = 0;
        while (index < s.length()) {
            char c = s.charAt(index);
            if (!Character.isDigit(c)) break;

            result = result * 10 + (c - '0');
            if (result * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (result * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            index++;
        }

        return (int) result * sign;
    }

    public static void main(String[] args) {
        ltcode003 solution = new ltcode003();
        System.out.println(solution.myAtoi("42")); // 42
        System.out.println(solution.myAtoi(" -042")); // -42
        System.out.println(solution.myAtoi("1337c0d3")); // 1337
        System.out.println(solution.myAtoi("0-1")); // 0
        System.out.println(solution.myAtoi("words and 987")); // 0
    }
}
