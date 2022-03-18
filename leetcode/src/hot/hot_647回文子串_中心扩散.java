package hot;

public class hot_647回文子串_中心扩散 {
    public static void main(String[] args) {

    }
    public int countSubstrings(String s) {
        // int result=0;
        // for(int i=0;i<s.length();i++){
        //     for(int j=i;j<s.length();j++){
        //         //String str=s.substring(i,j);
        //         int left=i;
        //         int right=j;
        //         while (left<right){
        //             if(s.charAt(left)!=s.charAt(right)){
        //                 break;
        //             }
        //             left++;
        //             right--;
        //         }
        //         if(left>=right){
        //             result++;
        //         }
        //     }
        // }
        // return result;

        int num = 0;
        int n = s.length();
        for(int i=0;i<n;i++)//遍历回文中心点
        {
            for(int j=0;j<=1;j++)//j=0,中心是一个点，j=1,中心是两个点
            {
                int l = i;
                int r = i+j;
                while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                    num++;
                }
            }
        }
        return num;
    }
}
