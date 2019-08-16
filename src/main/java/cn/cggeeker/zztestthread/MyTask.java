package cn.cggeeker.zztestthread;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/8/7/007
 * @Description:cn.cggeeker.zztestthread
 * @version:1.0
 */
public class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

    }


    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Thread t1 = new Thread(myTask, "T1");
        t1.start();
        System.out.println(t1.getName());
        System.out.println(t1.getState());
        System.out.println("以下是t1.run()方法执行");
        t1.run();
        System.out.println("以下是 myTask.run()方法执行");
        myTask.run();
    }

    @Test
    public void testThread(){
        Runnable runnable = new Runnable() {
            private List<String> list = new ArrayList<>();
            @Override
            public void run() {
                for(int i = 0; i < 3; i++){
                    list.add(Thread.currentThread().getName()+i);
                }
                System.out.println(String.join(",",list));
            }
        };
        //同一个runable实例是共享的，这里共享list成员变量；
        //此时多个线程同时对共享变量进行操作是线程不安全!(也就是打印结果不会确定)
        new Thread(runnable,"A").start();
        new Thread(runnable,"B").start();
        new Thread(runnable,"C").start();
    }
}
