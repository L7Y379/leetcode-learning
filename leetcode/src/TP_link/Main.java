package TP_link;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.nextLine();
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String[] arrs1=s1.split(" ");
        String[] arrs2=s2.split(" ");
        int[] arrs1_int=new int[arrs1.length];
        int[] arrs2_int=new int[arrs2.length];
        for(int i=0;i<arrs1.length;i++){
            arrs1_int[i]=Integer.parseInt(arrs1[i]);

        }
        for(int i=0;i<arrs2.length;i++){
            arrs2_int[i]=Integer.parseInt(arrs2[i]);
        }
        //System.out.println(Arrays.toString(arrs1_int));
        //System.out.println(Arrays.toString(arrs2_int));
        int[] result=new int[arrs1.length+arrs2.length];
        int k1=0;
        int k2=0;
        int k3=0;
        while(k2< arrs1.length&&k3<arrs2.length){
            if(arrs1_int[k2]<arrs2_int[k3]){
                result[k1]=arrs1_int[k2];
                //System.out.println(Arrays.toString(result));
                k1++;
                k2++;
            }else {
                result[k1]=arrs2_int[k3];
                //System.out.println(Arrays.toString(result));
                k1++;
                k3++;
            }
        }

        //System.out.println(Arrays.toString(result));
        while (k2<arrs1.length){
            result[k1]=arrs1_int[k2];
            k1++;
            k2++;
        }
        while (k3<arrs2.length){
            result[k1]=arrs2_int[k3];
            k2++;
            k3++;
        }
        for(int i=0;i<result.length-1;i++){
            System.out.print(result[i]+" ");
        }
        System.out.print(result[result.length-1]);
    }
    public int kthLargest(TreeNode root, int k) {
        PriorityQueue<Integer> pri=new PriorityQueue<>();
        dfs(root,k,pri);
        return pri.poll();
    }
    public static void dfs(TreeNode root, int k,PriorityQueue<Integer> pri){
        if(root==null){
            return;
        }
        if(pri.size()<k){
            pri.add(root.val);
        }else {
            pri.add(root.val);
            pri.poll();
        }
        dfs(root.left,k,pri);
        dfs(root.right,k,pri);
    }
}
