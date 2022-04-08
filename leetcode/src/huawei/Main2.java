package huawei;

import java.util.*;

public class Main2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int topN=sc.nextInt();
        int M=sc.nextInt();
        String[] s_biao=new String[M];
        String[] s_zheng=new String[M];
        for(int i=0;i<M;i++){
            s_biao[i]=sc.nextLine();
            s_zheng[i]=sc.nextLine();
        }
        Map<String,Integer> map_biao=new HashMap<String,Integer>();
        Map<String,Integer> map_zheng=new HashMap<String,Integer>();
        Map<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0;i<M;i++){
            String[] arr1=s_biao[i].split(" ");
            String[] arr2=s_zheng[i].split(" ");
            System.out.println(arr1);
            System.out.println(arr2);
            for(String s:arr1){
                if(!map_biao.containsKey(s)){
                    map_biao.put(s,3);
                }else {
                    map_biao.put(s,map_biao.get(s)+3);
                }
                if(!map.containsKey(s)){
                    map.put(s,3);
                }else {
                    map.put(s,map.get(s)+3);
                }
            }
            for(String s:arr2){
                if(!map_zheng.containsKey(s)){
                    map_zheng.put(s,1);
                }else {
                    map_zheng.put(s,map_zheng.get(s)+1);
                }
                if(!map.containsKey(s)){
                    map.put(s,1);
                }else {
                    map.put(s,map.get(s)+1);
                }
            }
        }


        int[] nums=new int[map.size()];
        int k=0;
        for (String key : map.keySet()) {
            nums[k]=map.get(key);
            k++;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int y=0;y<topN;y++){
            for (String key : map.keySet()) {
                if(map.get(key)==nums[nums.length-1-y]){
                    System.out.println(key);
                }


            }

        }
    }
}
