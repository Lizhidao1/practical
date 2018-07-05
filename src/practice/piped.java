package practice;

import javax.swing.*;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/3/15
 * \* Time: 17:19
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class piped {
    public static void main(String[] args) throws IOException {
        PipedWriter out =new PipedWriter();
        PipedReader in =new PipedReader();
        out.connect(in);
        Thread thread = new Thread(new Print(in));
        thread.start();
        int receive =0;
        try {
            while ((receive=System.in.read())!=-1){
                out.write(receive);

        }

        }finally {
            out.close();
        }
    }

    private static class Print implements Runnable {
        private PipedReader in;
        public Print(PipedReader in) {
            this.in =in;

        }

        @Override
        public void run() {
            int receive = 0;
            try {
                while ((receive=in.read())!=-1){
                    System.out.println(receive);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}