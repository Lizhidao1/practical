package practice;


import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/3/30
 * \* Time: 21:04
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class ceshidemo {
    public static void main(String[] args) {
        ListNode l1 =new ListNode(1);
        ListNode l2 =new ListNode(2);
        ArrayList l =new ArrayList();

        int[]  a ={1,2,3,4};
        int[] b = {5,6,7,8};
        System.out.println((double)1);
        
        for (int i=3;i<=11;i+=2){

            l1.next=new ListNode(i);
        }
        for (int i=2;i<=10;i+=2){
            l2.next=new ListNode(i);

        }
        while (l1.next!=null){

            System.out.println(l1.val);
            l1=l1.next;
        }

    }
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}