package practice;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/4/11
 * \* Time: 15:36
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class xunhuan {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        revers(0,arr.length-3-1,arr);
        revers(arr.length-3,arr.length-1,arr);
        revers(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void revers(int low,int high,int[] arr){
        while (low<high){
            int tem = arr[low];
            arr[low] =arr[high];
            arr[high]=tem;
            low++;
            high--;
        }
    }
}