package 网易互娱;

import java.util.Scanner;

public class Main {
    public static class Tree{
        public int value;
        public Tree(int value){
            this.value=value;
        }
        Tree left=null;
        Tree right=null;
    }
    public static int max=Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] inorder=new int[n];
        int[] postorder=new int[n];
        for(int i=0;i<n;i++){
            inorder[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            postorder[i]=sc.nextInt();
        }
        Tree root=gettree(postorder,0,n-1,inorder,0,n-1);
        getMax(root);
        System.out.println(max-1);

    }
    public static Tree gettree(int[] postorder,int leftp,int rightp,int[] inorder,int lefti,int righti){
        if(leftp>rightp){
            return null;
        }
        Tree root=new Tree(postorder[rightp]);
        int k=-1;
        for (int i=lefti;i<=righti;i++){
            if(inorder[i]== root.value){
                k=i;
                break;
            }
        }
        int l=k-lefti;
        root.left=gettree(postorder,leftp,leftp+l-1,inorder,lefti,k-1);
        root.right=gettree(postorder,leftp+l,rightp-1,inorder,k+1,righti);
        return root;
    }
    public static int getMax(Tree root){
        if(root==null){
            return 0;
        }
        int ml=Math.max(getMax(root.left),0);
        int mr=Math.max(getMax(root.right),0);
        int t=1+ml+mr;
        max=Math.max(max,t);
        return Math.max(ml,mr)+1;
    }
}
