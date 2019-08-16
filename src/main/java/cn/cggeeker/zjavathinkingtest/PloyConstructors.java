package cn.cggeeker.zjavathinkingtest;

import org.junit.Test;

/**
 * @Auther:CG
 * @Date:2019/7/11/011
 * @Description:cn.cggeeker.util
 * @version:1.0
 */
class Glyph{
    void draw(){
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph,radius = " + radius);
    }

    void draw(){
        System.out.println("RoundGlyph.draw(),radius = " + radius);

    }
}


public class PloyConstructors {
    @Test
    public static void main(String[] args) {
        new RoundGlyph(5);
        new Glyph();
    }
}
