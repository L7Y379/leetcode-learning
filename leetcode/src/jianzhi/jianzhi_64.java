package jianzhi;

public class jianzhi_64 {
    // class Solution {
//     public int sumNums(int n) {
//         int result = 0;
//         result=(1+n)*n/2;
//         return result;
//     }
// }

    class Solution {
        public int sumNums(int n) {
            boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
            return n;
        }
    }


}
