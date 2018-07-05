package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/4/8
 * \* Time: 17:18
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class prac {
    public static void main(String[] args) {
        //int[] a = {12,245,82,2,35,612,4,894,324,5674,8564,2,132,456};
        //charu(a);
        String a = "2147483648";
        System.out.println(Integer.parseInt(a));
    }
    public static void charu(int[] a){
        int num = 0;
        int j;
        for (int i =1;i<a.length;i++){
            j=i;
            num=a[i];
            for (;j>0&&a[j-1]>num;j--){
                a[j]=a[j-1];
            }
            a[j]=num;
        }
    }

    private static void mergesort(int[] a, int low, int high) {
        if (low<high){
        int mid =(low+high)/2;
        mergesort(a,low,mid);
        mergesort(a,mid+1,high);
        merge(a,low,mid,high);
     }
    }

    private static void merge(int[] a, int start, int mid, int end) {
        int[] tem = new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while (i<=mid&&j<=end){
            if (a[i]<a[j]){
                tem[k++]=a[i++];
            }else {
                tem[k++]=a[j++];
            }
        }
        while (i<=mid){
            tem[k++]=a[i++];
        }
        while (j<=end){
            tem[k++]=a[j++];
        }
        for (int s=0;s<tem.length;s++){
            a[start+s]=tem[s];
        }
    }
}