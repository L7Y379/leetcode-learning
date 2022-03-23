package hot;

public class hot_461汉明距离_位运算 {
    class Solution {
        public int hammingDistance(int x, int y) {
            int result=0;
            int res=x^y;
            while(res!=0){
                if((res&1)==1){
                    result++;
                }
                res=res>>1;
            }
            return result;
        }
    }

// class Solution {
//     public int hammingDistance(int x, int y) {
//         int s = x ^ y, ret = 0;
//         while (s != 0) {
//             ret += s & 1;
//             s >>= 1;
//         }
//         return ret;
//     }
// }
}
