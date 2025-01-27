
public class ltcode007 {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                break;
            }
            digits[i] = 0;
        }

        for (int i : digits) {
            System.out.print(i + " ");
        }
    }
}
