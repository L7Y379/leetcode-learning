package jianzhi;

public class jianzhi_58_1 {
    // class Solution {
//     public String reverseWords(String s) {
//         List<String> list=new ArrayList<String>();
//         int length_s=s.length();
//         // if(length_s==0){
//         //     return "";
//         // }
//         int i=0;
//         while(i<=length_s-1){
//             if(s.charAt(i)!=' '){
//                 String link="";
//                 int j=i;
//                 while(j<=length_s-1&&s.charAt(j)!=' '){
//                     link=link+s.charAt(j);
//                     j++;
//                 }
//                 list.add(link);
//                 i=j;
//             }
//             i++;
//         }
//         String result="";
//         for(int k=list.size()-1;k>=1;k--){
//             result=result+list.get(k)+' ';
//         }
//         if(list.size()==0){
//             return "";
//         }else{
//             result=result+list.get(0);
//         }

//         return result;
//     }
// }

    class Solution {
        public String reverseWords(String s) {
            String[] strs = s.trim().split(" "); // 删除首尾空格，分割字符串
            StringBuilder res = new StringBuilder();
            for(int i = strs.length - 1; i >= 0; i--) { // 倒序遍历单词列表
                if(strs[i].equals("")) continue; // 遇到空单词则跳过
                res.append(strs[i] + " "); // 将单词拼接至 StringBuilder
            }
            return res.toString().trim(); // 转化为字符串，删除尾部空格，并返回
        }
    }


}
