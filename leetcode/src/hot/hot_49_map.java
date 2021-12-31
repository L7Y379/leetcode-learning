package hot;

import java.util.*;

public class hot_49_map {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("dog");
        list.add("cat");
        list.add("cow");
        String[] animals=list.toArray(new String[0]);
        for(String animal:animals){
            System.out.println(animal);
        }

        List<Integer> list2=new ArrayList<>();
        list2.add(55);
        list2.add(22);
        list2.add(33);
        Integer[] animals2=list2.toArray(new Integer[0]);
        for(Integer animal:animals2){
            System.out.println(animal.intValue());
        }

    }
}
