package everyday;

import java.util.*;

public class test_719找出第K小的数对距离 {
    public static int smallestDistancePair(int[] nums, int k) {
        System.out.println(nums.length);
        PriorityQueue<Integer> pri=new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        int t=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(t<k){
                    pri.offer(Math.abs(nums[j]-nums[i]));
                    t++;
                }else {
                    pri.offer(Math.abs(nums[j]-nums[i]));
                    pri.poll();
                }
            }
        }
        return pri.poll();
    }
    public int[][] findContinuousSequence(int target) {
        List<int[]> list=new ArrayList<int[]>();
        for(int i=2;i<target/2;i++){
            int k1=target/i;
            int k2=target%i;
            if(i%2!=0){
                if(k2==0){
                    int[] link=new int[i];
                    for(int j=0;j<i;j++){
                        link[j]=k1-i/2+j;
                    }
                    list.add(link);
                }
            }else{
                if(k2==i-1){
                    int[] link=new int[i];
                    for(int j=0;j<i;j++){
                        link[j]=k1+j;
                    }
                    list.add(link);
                }
            }
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                return o1[0]-o2[0];
            }
        });
        int[][] result=new int[list.size()][];
        for(int i=0;i<result.length;i++){
            result[i]=list.get(i);
        }
        return result;

    }
    public int translateNum(int num) {
        String snum=Integer.toString(num);
        if(snum.length()==1){
            return 1;
        }
        int[] dp=new int[snum.length()];
        dp[0]=1;
        if(snum.charAt(0)=='1'||snum.charAt(0)=='2'&&snum.charAt(1)<='5'){
            dp[1]=2;
        }else {
            dp[1]=1;
        }
        for(int i=2;i<snum.length();i++){
            if(snum.charAt(i-1)=='1'||snum.charAt(i-1)=='2'&&snum.charAt(i)<='5'){
                dp[i]=dp[i-1]+dp[i-2];
            }else {
                dp[i]=dp[i-1]+1;
            }
        }
        return dp[dp.length-1];

    }
    public static void main(String[] args) {
        int[] nums={1,2,5,8,6,4,34};
        int k=5;
        System.out.println(smallestDistancePair(nums,k));
    }
}
