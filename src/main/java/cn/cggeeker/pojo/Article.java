package cn.cggeeker.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * @Auther:CG
 * @Date:2019/6/10/010
 * @Description:cn.cggeeker.pojo
 * @version:1.0
 */
@Data
@Table(name = "article_tb") /*将pojo类和数据库对应的表做一个映射*/
public class Article {
    @Id //指定主键
    @KeySql(useGeneratedKeys = true)
    private int article_id;

    private String title;

    private String content;

    private String author;

    private int readingNum;

    private Timestamp publishTime;

}
