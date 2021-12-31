import java.util.*;

public class log {

    public static void main(String[] args){

        //字符串转字符数组
        //char[] charArray = s.toCharArray();
        //对字符串数组排序
        //Arrays.sort(charArray);

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
        //找到map哈希表中键为key的值list，否则创建一个新的list
        //List<String> list = map.getOrDefault(key, new ArrayList<String>());


        //栈的定义与使用
        Deque<Integer> stack = new LinkedList<Integer>();
        stack.push(5);
        stack.push(6);
        stack.pop();
        int prev = stack.peek();

        //字符串操作
        StringBuilder cur=new StringBuilder();
        cur.append("s");
        cur.deleteCharAt(cur.length()-1);
        cur.toString();


        //List与数组之间的转换
        List<String> list=new ArrayList<>();
        list.add("dog");
        list.add("cat");
        list.add("cow");
        String[] animals=list.toArray(new String[0]);
        List<Integer> list2=new ArrayList<>();
        list2.add(55);
        list2.add(22);
        list2.add(33);
        Integer[] animals2=list2.toArray(new Integer[0]);
    }
}
