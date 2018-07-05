package practice;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/3/19
 * \* Time: 15:10
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class joinDemo {
    public static void main(String[] args) {
        Thread per = Thread.currentThread();

        for (int i=0;i<10;i++){
            Thread thread =new Thread(new Daomia(per),String.valueOf(i));
            thread.start();
            per = thread;
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" over");

    }

    private static class Daomia implements Runnable {
        private Thread thread;



        public Daomia(Thread thread) {
            super();
            this.thread=thread;
        }

        @Override
        public void run() {
            //thread.join();
            System.out.println(Thread.currentThread().getName()+"oover");

        }
    }
}