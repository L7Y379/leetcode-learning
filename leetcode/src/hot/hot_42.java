package hot;

public class hot_42 {
    public int trap(int[] height) {
         int max=0;
         for(int i=0;i<height.length;i++){
             if(height[i]>=max){
                 max=height[i];
             }
         }

         // while(height[j]==0){
         //     j++;
         // }
         // while(height[k]==0){
         //     k--;
         // }
         int result=0;
         int j=0;
         int k=height.length-1;
         for(int m=1;m<=max;m++){

             while(height[j]<m){
                 j++;
             }
             while(height[k]<m){
                 k--;
             }
             for(int i=j;i<=k;i++){
                 if(m>height[i]){
                     result++;
                 }
             }
         }
         return result;

     }
}
