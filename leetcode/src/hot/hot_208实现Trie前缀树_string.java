package hot;

import java.util.ArrayList;
import java.util.List;

public class hot_208实现Trie前缀树_string {
    class Trie {
        List<String> list;
        public Trie() {
            list=new ArrayList<String>();
        }

        public void insert(String word) {
            list.add(word);
        }

        public boolean search(String word) {
            for(int i=0;i<list.size();i++){
                if(list.get(i).equals(word)){
                    return true;
                }
            }
            return false;
        }

        public boolean startsWith(String prefix) {
            for(int i=0;i<list.size();i++){
                if(list.get(i).startsWith(prefix)){
                    return true;
                }
            }
            return false;
        }
    }

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
}
