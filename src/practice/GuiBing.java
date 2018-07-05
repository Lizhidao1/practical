package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/3/27
 * \* Time: 9:45
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class GuiBing {
    public static void main(String[] args) {
        int[] arr = {12,4,5,12,47,865,23,8,96,544,74,96,4,982,8,2,6};
        mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        String s = "sdad";
        PriorityQueue q = new PriorityQueue();

        //PriorityQueue qp =new PriorityQueue(Comparator.reverseOrder());
    }

    private static void mergesort(int[] arr, int low, int high) {
        if (low<high){
            int mid =(low+high)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while (i<=mid&&j<=high){
            if (arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else {
                temp[k++]=arr[j++];
            }



        }
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=high){
            temp[k++]=arr[j++];
        }
        for (int k2 =0;k2<temp.length;k2++){
            arr[low+k2]=temp[k2];
        }
    }
}