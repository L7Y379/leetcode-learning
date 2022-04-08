package huawei;

import java.util.*;

public class Main3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        sc.nextLine();

        List<List<Integer>> ls=new ArrayList<List<Integer>>();
        for(int i=0;i<N;i++){
            String[] s=sc.nextLine().split(",");
            List<Integer> l=new ArrayList<Integer>();
            int m=Integer.parseInt(s[0]);
            for(int j=0;j<m;j++){
                l.add(Integer.parseInt(s[j+1]));
            }
            ls.add(l);
        }

        List<List<Integer>> al=new ArrayList<List<Integer>>();
        boolean[] tik=new boolean[N];
        Queue<Integer> queue=new LinkedList<Integer>();
        queue.offer(M);
        tik[M]=true;
        while(!queue.isEmpty()){
            List<Integer> ite=new ArrayList<>();
            for(int i=0;i<queue.size();i++){
                int p=queue.poll();
                ite.add(p);
                for(int ll:ls.get(p)){
                    if(tik[ll]){
                        System.out.println(-1);
                        return;
                    }else {
                        tik[ll]=true;
                        queue.offer(ll);
                    }
                }
            }
            al.add(ite);
        }
        if(al.size()==0){
            System.out.println("null");
            return;
        }
        String result="";
        for(int i=al.size()-1;i>0;i--){
            List<Integer> rl=al.get(i);
            Collections.sort(rl);
            for(int k:rl){
                result+=k+",";
            }
        }
        System.out.println(result.substring(0,result.length()-1));
    }
}
