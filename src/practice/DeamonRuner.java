package practice;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/3/15
 * \* Time: 16:30
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class DeamonRuner implements Runnable {
    @Override
    public void run() {
        try {
            SleepUtils.second(10);
        }finally {
            System.out.println("deam finally run");
        }
    }
}