package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main5 {
    public static List<List<Integer>> dependency=new ArrayList<>();
    public static TreeSet<Integer> ans=new TreeSet<>();
    public static boolean find=false;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            List<Integer> de=new ArrayList<>();
            String inputString=sc.next();
            String[] stringArray=inputString.split(",");
            for(int k=1;k<stringArray.length;k++){
                de.add(Integer.parseInt(stringArray[k]));

            }
            dependency.add(de);
        }
        dfs(m);
        if(find){
            System.out.println(ans);
        }else {
            for(int de:ans){
                System.out.println(de+",");
            }
        }
    }
    public static void dfs(int m){
        if(dependency.get(m).size()==0){
            find=true;
            return;
        }
        for (int de:dependency.get(m)){
            if(!ans.contains(de)){
                ans.add(de);
                dfs(de);
            }
        }
    }
}
