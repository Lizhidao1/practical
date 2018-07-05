package practice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/3/29
 * \* Time: 17:10
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Forkdemo extends RecursiveTask<Integer> {
    private static final int THRESHOLD=2;
    private int start;
    private int end;
    public Forkdemo(int start, int end){
        this.start=start;
        this.end=end;
    }
    @Override
    protected Integer compute() {
        int sum=0;
        boolean cancompute= (end-start)<=THRESHOLD;
        if (cancompute){
            for (int i =start;i<=end;i++){
                sum+=i;
            }
        }else {
            int middle =(start+end)/2;
            Forkdemo left = new Forkdemo(start,middle);
            Forkdemo right = new Forkdemo(middle+1,end);
            left.fork();
            right.fork();
            int leftResult = left.join();
            int rightResult = right.join();
            sum=leftResult+rightResult;
        }
        return sum;
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool   = new ForkJoinPool();
        Forkdemo task =new Forkdemo(1,100);
        Future <Integer> result = forkJoinPool.submit(task);
        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}