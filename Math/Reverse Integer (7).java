public class Solution {
    public int reverse(int x) {
        int y = 0;

        while (x != 0) {
            int digit = x % 10;

            if ((y > 0 && y > (Integer.MAX_VALUE - digit) / 10) || (y < 0 && y < (Integer.MIN_VALUE - digit) / 10)) {
                return 0;
            }
            
            x /= 10;
            y = y * 10 + digit;;
        }

        return y;
    }
}
