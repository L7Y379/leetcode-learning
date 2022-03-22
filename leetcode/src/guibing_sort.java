import java.util.Arrays;

public class guibing_sort {
    public static void main(String[] args) {
        int[] arr={9,12,10};
        int[] temp=new int[arr.length];
        sort(arr,temp,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int[] temp,int left,int right){
        if(left==right){
            return;
        }
        int mid=(left+right)/2;
        sort(arr,temp,left,mid);
        sort(arr,temp,mid+1,right);
        merge(arr,left,mid,right,temp);
    }
    public static void merge(int[] arr,int left,int mid,int right,int[] temp){
        int i=left;
        int j=mid+1;
        int k=left;
        while (i <= mid&&j<=right) {
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while (j<=right){
            temp[k]=arr[j];
            j++;
            k++;
        }
        while (left<=right){
            arr[left]=temp[left];
            left++;
        }

    }
}
