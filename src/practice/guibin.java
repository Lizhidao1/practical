package practice;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/7/4
 * \* Time: 21:47
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class guibin {
    public static void main(String[] args) {
        int[] arr= {4,5,1,6,2,7,3,8};
        mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergesort(int[] arr, int low, int high) {
        if(low<high){
            int mid = (low+high)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] tem = new int[high-low+1];
        int i = low;
        int j = mid+1;
        int k=0;
        while (i<=mid && j<=high){
            if(arr[i]<arr[j]){
                tem[k++]=arr[i++];

            }else {
                tem[k++]=arr[j++];
            }
        }
        while (i<=mid){
            tem[k++]=arr[i++];
        }
        while (j<=high){
            tem[k++]=arr[j++];
        }
        for (int s=0;s<tem.length;s++){
            arr[s+low]=tem[s];
        }
    }
}