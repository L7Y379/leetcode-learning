package everyday;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class test_1305两棵二叉搜索树中的所有元素 {
    public static List<Integer> list1=new ArrayList<>();
    public static List<Integer> list2=new ArrayList<>();
    public static List<Integer> result=new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        PriorityQueue<Integer> pre=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        inorder1(root1);
        inorder2(root2);
        int i=0;
        int j=0;
        while(i<list1.size()&&j<list2.size()){
            if(list1.get(i)<list2.get(j)){
                result.add(list1.get(i));
                i++;
            }else {
                result.add(list2.get(j));
                j++;
            }
        }
        while (i<list1.size()){
            result.add(list1.get(i));
            i++;
        }
        while (j<list2.size()){
            result.add(list2.get(j));
            j++;
        }
        return result;




    }
    public static void inorder1(TreeNode root){
        if(root==null){
            return;
        }
        inorder1(root.left);
        list1.add(root.val);
        inorder1(root.right);

    }
    public static void inorder2(TreeNode root){
        if(root==null){
            return;
        }
        inorder2(root.left);
        list2.add(root.val);
        inorder2(root.right);

    }
}
