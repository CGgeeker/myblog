package cn.cggeeker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Auther:CG
 * @Date:2019/6/9/009
 * @Description:cn.cggeeker
 * @version:1.0
 */
@SpringBootApplication
@MapperScan("cn.cggeeker.mapper") //扫描mybatis接口并交由spring管理
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
