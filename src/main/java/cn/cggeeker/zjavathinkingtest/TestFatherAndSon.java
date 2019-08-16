package cn.cggeeker.zjavathinkingtest;

/**
 * @Auther:CG
 * @Date:2019/7/16/016
 * @Description:cn.cggeeker.util
 * @version:1.0
 */
public class TestFatherAndSon {
    public static void main(String[] args) {
        Father father1 = new Son1();
        Father father2 = new Son2();
        father1.add();
        father2.add();
    }
}
