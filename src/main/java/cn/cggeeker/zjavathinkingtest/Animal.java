package cn.cggeeker.zjavathinkingtest;

import org.junit.Test;

/**
 * @Auther:CG
 * @Date:2019/7/9/009
 * @Description:cn.cggeeker.util
 * @version:1.0
 */

public class Animal {
    public void eat(){
        System.out.println("I'm animal eat()");
    };
    public void live() {
        System.out.println("I'm animal live()");
    }
@Test
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Animal ac = Cat.class.newInstance();
        ac.eat();
        ac.live();
        ((Cat) ac).run();

        System.out.println("-----------------------------验证1--------------------------------");
        Cat ac1 = Cat.class.newInstance();
        Animal animal = Animal.class.newInstance();
        if(ac1 instanceof Animal){
            System.out.println("ac1是Animal类型");
        }
        if(animal instanceof Cat){
            System.out.println("animal是Cat类型");
        }

        System.out.println("-----------------------------验证2--------------------------------");
        Cat ac2 = (Cat) Animal.class.newInstance();
        ac2.live();
        ac2.run();
        ac2.eat();

    }
}
