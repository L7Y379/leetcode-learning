import java.util.*;

public class log {

    public static void main(String[] args){

        //字符串转字符数组
        //char[] charArray = s.toCharArray();

        //数组排序
        //Arrays.sort(nums);

        //字符串转整形
        String digits='1'+"";
        int num = Integer.parseInt(digits);

        //字符串加整形
        char t=(char)('a'+5);

        //哈希表的定义与使用
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
        }};

        //栈的定义与使用
        Deque<Integer> stack = new LinkedList<Integer>();
        stack.push(5);
        stack.push(6);
        stack.pop();
        int prev = stack.peek();
    }
}
