import java.util.*;

public class log {

    public static void main(String[] args){

        //字符串转字符数组
        //char[] charArray = s.toCharArray();
        //对字符串数组排序
        //Arrays.sort(charArray);
        //对二维数组排序，升序
        //Arrays.sort(intervals, new Comparator<int[]>() {
        //                public int compare(int[] interval1, int[] interval2) {
        //                    return interval1[0] - interval2[0];
        //                }
        //            });

        //数组排序
        //Arrays.sort(nums);
        //获取数组intersection的从0到index的元素构建新的数组
        //int result=Arrays.copyOfRange(intersection, 0, index);
        //字符串取字串
        //s.substring(i,j)
        //字符串转整形
        String digits='1'+"";
        int num = Integer.parseInt(digits);
        int i = (new Integer(10)).intValue();   // intValue()拆箱
        Integer integer = Integer.valueOf(i);   // valueOf()装箱
        //字符串加整形
        char t=(char)('a'+5);

        //哈希表的定义与使用
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
        }};
        phoneMap.remove('2');
        if(phoneMap.isEmpty()){

        }
        //遍历
        for(Map.Entry<Character, String> entry : phoneMap.entrySet()){
            if(entry.getValue()=="sss"){
                char result=entry.getKey();
            }
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
        Iterator<Character> ite=phoneMap.keySet().iterator();
        while (ite.hasNext()){
            char a= ite.next();
            System.out.println(phoneMap.get(a));
        }
        Iterator<Map.Entry<Character,String>> ite2=phoneMap.entrySet().iterator();
        while (ite2.hasNext()){
            Map.Entry<Character,String> entry=ite2.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }

        //containsKey
        //containsValue(Object value)
        //找到map哈希表中键为key的值list，否则创建一个新的list
        //List<String> list = map.getOrDefault(key, new ArrayList<String>());

        //哈希集合
        Set<Integer> set =new HashSet();
        set.add(22);
        if(set.contains(33)){};
        Iterator<Integer> ite3= set.iterator();
        while(ite3.hasNext()){
            int number=ite3.next();
            System.out.println(number);
        }

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
        //数组转为list
        Integer[] arr2 = {1, 2, 3};
        List<Integer> lists2 = Arrays.asList(arr2);
        //将二维数组list转换为数组
        List<int[]> merged = new ArrayList<int[]>();
        int[][] hhh=merged.toArray(new int[merged.size()][]);
        //LIST排序
        Collections.sort(list);
        //list最小值
        Collections.min(list);


        //列表操作
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(5);
        Integer a =q.poll();
    }
}
