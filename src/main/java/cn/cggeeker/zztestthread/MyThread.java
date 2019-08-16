package cn.cggeeker.zztestthread;

/**
 * @Auther:CG
 * @Date:2019/8/7/007
 * @Description:cn.cggeeker.zjavathinkingtest
 * @version:1.0
 */
public class MyThread extends Thread{

    @Override
    public void run() {
       System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t = new MyThread();
        t.setName("T-1");
        //设置守护线程setDaemon(true)（守护线程：即该线程只有当JVM结束的时候退出！）
        //守护线程必须写在start()方法之前
        t.setDaemon(true);
        t.start();  //这是启动了一个新线程，会打印线程名字 T-1
    /*    t.wait();*/
        t.run();    //没有启动新线程，还是当前线程内运行，不会打印T-1;
        if(t.isInterrupted()) {
            System.out.println("线程t收到了中断信号");
        }else{
            System.out.println("线程t没有收到了中断信号");
        }
        try {
            t.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();

        if(t.isInterrupted()) {
            System.out.println("线程t收到了中断信号");
        }else{
            System.out.println("线程t没有收到了中断信号");
        }
    }
}

