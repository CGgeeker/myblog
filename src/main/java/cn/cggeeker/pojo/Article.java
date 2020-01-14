package cn.cggeeker.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
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
    @KeySql(useGeneratedKeys = true)  //开启mysql主键自增策略
    private int articleId;

    private String title;

    private String content;

    private String author;

    @Column(name = "readingnum")   //为了避免默认开启的驼峰命名将属性readingNum命名为成字段名为reading_num, 这里就将表字段名readingnum给上
    private int readingNum;

    private Timestamp publishTime;

    private String articleImg;

}
