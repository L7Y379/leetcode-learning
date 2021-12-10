package hot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hot_17 {
//    class Solution {
//        public List<String> letterCombinations(String digits) {
//            List<String> result=new ArrayList<String>();
//            if(digits.length()==0){
//                return result;
//            }
//            int length_digits=digits.length();
//            int num = Integer.parseInt(digits);
//            int[] nums=new int[length_digits];
//            for(int i=length_digits-1;i>=0;i--){
//                nums[i]=num%10;
//                num=num/10;
//            }
//            char[] c=new char[26];
//            for(int i=0;i<=25;i++){
//                //char t='a'+i;
//                c[i]=(char)('a'+i);
//            }
//            for(int j=0;j<=2;j++){
//                if(length_digits==1){
//                    String cx=c[3*(nums[0]-2)+j]+"";
//                    result.add(cx);
//                }
//                else{
//                    for(int k=0;k<=2;k++){
//                        if(length_digits==2){
//                            String cx=c[3*(nums[0]-2)+j]+""+c[3*(nums[1]-2)+k];
//                            result.add(cx);
//                        }
//                        else{
//                            for(int n=0;n<=2;n++){
//                                if(length_digits==3){
//                                    String cx=c[3*(nums[0]-2)+j]+""+c[3*(nums[1]-2)+k]+c[3*(nums[2]-2)+n];
//                                    result.add(cx);
//                                }
//                                else{
//                                    for(int m=0;m<=2;m++){
//                                        if(length_digits==4){
//                                            String cx=c[3*(nums[0]-2)+j]+""+c[3*(nums[1]-2)+k]+c[3*(nums[2]-2)+n]+c[3*(nums[3]-2)+m];
//                                            result.add(cx);
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//            return result;
//        }
//    }
    class Solution {
        public List<String> letterCombinations(String digits) {
            List<String> combinations = new ArrayList<String>();
            if (digits.length() == 0) {
                return combinations;
            }
            Map<Character, String> phoneMap = new HashMap<Character, String>() {{
                put('2', "abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "pqrs");
                put('8', "tuv");
                put('9', "wxyz");
            }};
            backtrack(combinations, phoneMap, digits, 0, new StringBuffer());
            return combinations;
        }

        public void backtrack(List<String> combinations, Map<Character, String> phoneMap, String digits, int index, StringBuffer combination) {
            if (index == digits.length()) {
                combinations.add(combination.toString());
            } else {
                char digit = digits.charAt(index);
                String letters = phoneMap.get(digit);
                int lettersCount = letters.length();
                for (int i = 0; i < lettersCount; i++) {
                    combination.append(letters.charAt(i));
                    backtrack(combinations, phoneMap, digits, index + 1, combination);
                    combination.deleteCharAt(index);
                }
            }
        }
    }
}
