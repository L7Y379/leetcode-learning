package jianzhi;

public class jianzhi_67_str_int {
    // class Solution {
//     public int strToInt(String str) {
//         int i=0;
//         while(str.charAt(i)==' '){
//             i++;
//             if(i==str.length()){
//                 break;
//             }
//         }
//         if(i==str.length()){
//             return 0;
//         }
//         if((str.charAt(i)<'0'||str.charAt(i)>'9')&&str.charAt(i)!='-'){
//             return 0;
//         }
//         int j=i;
//         if(str.charAt(j)=='-'){
//             j++;
//         }
//         while(str.charAt(j)>='0'&&str.charAt(j)<='9'){
//             j++;
//             if(j==str.length()){
//                 break;
//             }
//         }
//         str=str.substring(i,j);
//         //System.out.println(i);
//         Integer res=new Integer(str);
//         int result=res.intValue();
//         return result;
//     }
// }

    class Solution {
        public int strToInt(String str) {
            char[] c = str.trim().toCharArray();
            if(c.length == 0) return 0;
            int res = 0, bndry = Integer.MAX_VALUE / 10;
            int i = 1, sign = 1;
            if(c[0] == '-') sign = -1;
            else if(c[0] != '+') i = 0;
            for(int j = i; j < c.length; j++) {
                if(c[j] < '0' || c[j] > '9') break;
                if(res > bndry || res == bndry && c[j] > '7') return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                res = res * 10 + (c[j] - '0');
            }
            return sign * res;
        }
    }

}
