package cn.cggeeker.zjavathinkingtest;

/**
 * @Auther:CG
 * @Date:2019/7/16/016
 * @Description:cn.cggeeker.util
 * @version:1.0
 */
public class Son1 implements Father {
    @Override
    public void add() {
        System.out.println("I'm Son1 add()+");
    }

    @Override
    public void plus() {
        System.out.println("I'm Son1 plus()+");
    }
}
