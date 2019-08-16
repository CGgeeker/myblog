package cn.cggeeker.zztestthread;

/**
 * @Auther:CG
 * @Date:2019/8/10/010
 * @Description:cn.cggeeker.zztestthread
 * @version:1.0
 */
public class synchronizedtest {

 /*   public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {       //为run方法加入synchronized关键字
                for(int i=0; i<10; i++){  //保证run方法同一时刻只能被一个调用者调用
                    System.out.print(i);   //后面的调用者只能等到前面调用者调用完成后再调用
                }     //这样输出的结果不确定，因为两个线程在调用同一个run方法
            }
        };

        new Thread(runnable,"T1").start();
        new Thread(runnable,"T2").start();
    }*/

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public synchronized void run() {
                for(int i=0; i<10; i++){
                    System.out.print(i);   //加入synchronized关键字后输出确定
                                           //为：01234567890123456789
                }
            }
        };

        new Thread(runnable,"T1").start();
        new Thread(runnable,"T2").start();
    }
}
