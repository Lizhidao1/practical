package practice;


import java.util.Collections;
import java.util.PriorityQueue;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/3/15
 * \* Time: 16:29
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class deamo {
    static Object lock = new Object();
    static boolean flag = true;
    public static void main(String[] args) {
//        Thread thread =new Thread(new DeamonRuner(),"DeamonRuner");
//        thread.setDaemon(true);
//        thread.start();
        PriorityQueue pq =new PriorityQueue(15,Collections.reverseOrder());

        Thread thread1 =new Thread(new wait());
        Thread thread2 =new Thread(new notify());
        thread1.start();
        thread2.start();
    }

    private static class wait implements Runnable {
        @Override
        public void run() {
            synchronized (lock){
                while (flag){

                    try {
                        System.out.println("111");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("222");

            }


        }
    }

    private static class notify implements Runnable {
        @Override
        public void run() {
            synchronized (lock){
                System.out.println("333");
                lock.notify();
                flag =false;
                SleepUtils.second(1);
            }
            synchronized (lock){
                System.out.println("4444");
                SleepUtils.second(1);
            }
        }
    }
}