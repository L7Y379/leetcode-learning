package everyday;

public class test_7整数反转 {
    public int reverse(int x) {
        long x_l=x;
        if(x_l==0){
            return 0;
        }
        long reverse_x=0;
        if(x_l>0){
            while(x_l>0){
                reverse_x=reverse_x*10+x_l%10;
                x_l/=10;
            }
        }
        if(x_l<0){
            x_l=-x_l;
            while(x_l>0){
                reverse_x=reverse_x*10+x_l%10;
                x_l/=10;
            }
            reverse_x=-reverse_x;
        }

        if(reverse_x<-Integer.MIN_VALUE||reverse_x>Integer.MAX_VALUE){
            return 0;
        }
        return (int)reverse_x;
    }
}
