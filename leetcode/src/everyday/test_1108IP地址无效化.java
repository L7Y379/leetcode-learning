package everyday;

import java.util.HashSet;
import java.util.Set;

public class test_1108IP地址无效化 {
    public String defangIPaddr(String address) {
        String[] arrs=address.split("\\.");
        String result=arrs[0];
        for(int i=1;i<arrs.length;i++){
            result=result+"[.]"+arrs[i];
        }
        return result;
    }

}
