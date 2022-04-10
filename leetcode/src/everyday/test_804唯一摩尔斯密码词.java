package everyday;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class test_804唯一摩尔斯密码词 {
    public static void main(String[] args) {
        String[] mosi={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] words={"gin", "zen", "gig", "msg"};
        Set<String> mosiku=new HashSet<>();
        for(String word:words){
            String s="";
            for(int i=0;i<word.length();i++){
                s+=(mosi[word.charAt(i) - 'a']);
            }
            mosiku.add(s);
        }
        Iterator<String> ite= mosiku.iterator();
        while (ite.hasNext()){
            String str=ite.next();
            System.out.println(str);

        }
        System.out.println(mosiku.size());

    }
}
