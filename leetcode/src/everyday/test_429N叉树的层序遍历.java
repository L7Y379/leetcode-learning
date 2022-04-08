package everyday;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
public class test_429N叉树的层序遍历 {




    class Solution {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        public List<List<Integer>> levelOrder(Node root) {
            if(root==null){
                return result;
            }
            Queue<Node> q=new LinkedList<Node>();
            q.offer(root);
            while(!q.isEmpty()){
                int size=q.size();
                List<Integer> list=new ArrayList<Integer>();
                for(int i=0;i<size;i++){
                    Node n=q.poll();
                    list.add(n.val);
                    for(int j=0;j<n.children.size();j++){
                        q.offer(n.children.get(j));
                    }
                }
                result.add(list);

            }
            return result;
        }

    }
}
