package hot;

public class hot_338比特位计数_与运算 {
    class Solution {
        public int[] countBits(int n) {
            int[] bits = new int[n + 1];
            int highBit = 0;
            for (int i = 1; i <= n; i++) {
                if ((i & (i - 1)) == 0) {
                    highBit = i;
                }
                bits[i] = bits[i - highBit] + 1;
            }
            return bits;
        }
    }
}
