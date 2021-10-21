package jianzhi;

public class jianzhi_45_1 {
    // class Solution {
//     public int countDigitOne(int n) {
//         int result = 0;
//         for(int i=1;i<=n;i++){
//             String link1=""+i;
//             char[] link2=link1.toCharArray();
//             int length_link2=link1.length();
//             for(int j=0;j<=length_link2-1;j++){
//                 if(link2[j]=='1'){
//                     result++;
//                 }
//             }
//         }
//         return result;
//     }
// }

// class Solution {
//     public int countDigitOne(int n) {
//         int result = 0;
//         for(int i=1;i<=n;i++){
//             int j=i;
//             while(j!=0){
//                 if(j%10==1){
//                     result++;
//                 }
//                 j=j/10;
//             }

//         }
//         return result;
//     }
// }

    class Solution {
        public int countDigitOne(int n) {
            int digit = 1, res = 0;
            int high = n / 10, cur = n % 10, low = 0;
            while(high != 0 || cur != 0) {
                if(cur == 0) res += high * digit;
                else if(cur == 1) res += high * digit + low + 1;
                else res += (high + 1) * digit;
                low += cur * digit;
                cur = high % 10;
                high /= 10;
                digit *= 10;
            }
            return res;
        }
    }

}
