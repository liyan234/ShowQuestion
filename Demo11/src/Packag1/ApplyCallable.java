package Packag1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
    }
}

class MyThread2 implements Callable {

    @Override
    public Object call() throws Exception {
        return null;
    }
}

public class ApplyCallable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 1） Thread 重写run方法
        Thread t1 = new MyThread();

        // 2) 实现Runnable接口
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        // 3) Callable 带返回值的
        // 结合 Future接口 可以获取返回值
        FutureTask task = new FutureTask(new Callable<String>() {

            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return "called";
            }
        });
        new Thread(task).start();
        // 一定要获取到任务的返回值
        // 如果任务未执行完 当前线程阻塞等待

        System.out.println(task.get());
        System.out.println("main");
    }

}
