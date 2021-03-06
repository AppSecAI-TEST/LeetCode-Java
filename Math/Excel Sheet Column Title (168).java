public class Solution {
    public String convertToTitle(int n) {
        return n == 0 ? "" : convertToTitle(--n / 26) + (char) ('A' + (n % 26));
    }
}

public class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.insert(0, (char) ('A' + --n % 26));
            n /= 26;
        }

        return sb.toString();
    }
}
