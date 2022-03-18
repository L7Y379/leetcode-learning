import java.util.Arrays;

public class quicksort {
    public static void main(String[] args){
        int[] arr=new int[20];
        for(int i=19;i>=0;i--){
            arr[i]=20-i;
        }
        sort(arr,0,19);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int[] arr,int left,int right){
        int temp=arr[left];
        int i=left;
        int j=right;
        while(i<j){
            while(i<j&&arr[i]<temp){
                i++;
            }
            while(i<j&&arr[j]>temp){
                j--;
            }
            if(i<j){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
//        arr[left]=arr[i];
//        arr[i]=temp;
        if(left<i-1){
            sort(arr,left,i-1);
        }
        if(right>i+1){
            sort(arr,i+1,right);
        }
    }

    public static void sort2(int arr[],int start,int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i<j) {
            while ((i<j)&&(arr[j]>pivot)) {
                j--;
            }
            while ((i<j)&&(arr[i]<pivot)) {
                i++;
            }
            if ((arr[i]==arr[j])&&(i<j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i-1>start) {
            sort2(arr,start,i-1);
        }
        if (j+1<end) {
            sort2(arr,j+1,end);
        }
    }
}
