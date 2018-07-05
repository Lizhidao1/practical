package practice;

import java.util.ArrayList;
import java.util.Collections;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/3/6
 * \* Time: 10:48
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class ThreadTest {
    private static volatile boolean ready=false;
    private static volatile int numbre=0;
    private static class ReaderThread extends Thread{
        @Override
        public void run() {
            while(!ready){
                Thread.yield();
                System.out.println(numbre);
                ArrayList l =new ArrayList();
                Collections.sort(l);

            }

        }
    }

    public static void main(String[] args) {
        new ReaderThread().start();
        numbre=21;
        ready=true;
    }
}