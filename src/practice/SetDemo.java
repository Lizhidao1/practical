package practice;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/1/12
 * \* Time: 10:22
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class SetDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> minheap =new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(20,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        minheap.poll();





    }
}