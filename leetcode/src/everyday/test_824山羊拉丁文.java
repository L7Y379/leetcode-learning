package everyday;

public class test_824山羊拉丁文 {
    public String toGoatLatin(String sentence) {
        String[] sentence_arr=sentence.split(" ");
        for(int i=0;i<sentence_arr.length;i++){
            if(sentence_arr[i].charAt(0)=='a'
                    ||sentence_arr[i].charAt(0)=='e'
                    ||sentence_arr[i].charAt(0)=='i'
                    ||sentence_arr[i].charAt(0)=='o'
                    ||sentence_arr[i].charAt(0)=='u'
                    ||sentence_arr[i].charAt(0)=='A'
                    ||sentence_arr[i].charAt(0)=='E'
                    ||sentence_arr[i].charAt(0)=='I'
                    ||sentence_arr[i].charAt(0)=='O'
                    ||sentence_arr[i].charAt(0)=='U'
            ){
                sentence_arr[i]=sentence_arr[i]+"ma";
            }else {
                sentence_arr[i]=sentence_arr[i].substring(1)+sentence_arr[i].charAt(0)+"ma";
            }
            for(int j=0;j<=i;j++){
                sentence_arr[i]+="a";
            }
        }
        for(int i=1;i<sentence_arr.length;i++){
            sentence_arr[0]=sentence_arr[0]+" "+sentence_arr[i];
        }
        return sentence_arr[0];
    }
}
