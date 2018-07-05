package practice;


import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/5/3
 * \* Time: 23:05
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class pdemo {
    public static void main(String[] args) {
        int[] A ={};
        int[] B ={2,3};
        double middle = 0;
        int m = A.length;
        int n = B.length;
        if (A == null || B == null || m + n == 0) {
            System.out.println(0);
        }
        //System.out.;
        int indexa = 0;
        int indexb = 0;
        indexb = indexb++;
        System.out.println(indexb);
        while(indexa+indexb !=(m+n)/2){
            int a = (indexa==m)?Integer.MAX_VALUE :A[indexa];
            int b = (indexb==n)?Integer.MAX_VALUE :B[indexb];
            if(a<b){
                middle=a;
                indexa++;
            }else{
                middle=b;
                indexb++;
            }
        }
        if((m+n)%2==1){
            System.out.println(middle);
        }else{
            int tema = (indexa==m)?Integer.MAX_VALUE:A[indexa];
            int temb = (indexb==n)?Integer.MAX_VALUE:B[indexb];
            double middle2 = Math.min(tema,temb);
            System.out.println((middle+middle2)/2);
        }
    }

}