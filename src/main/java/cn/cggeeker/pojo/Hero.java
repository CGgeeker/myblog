package cn.cggeeker.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * @Auther:CG
 * @Date:2019/6/9/009
 * @Description:cn.cggeeker
 * @version:1.0
 */
@Data
@Table(name = "tb_hero") /*将pojo类和数据库对应的表做一个映射*/
public class Hero {

    @Id  //指定主键
    @KeySql(useGeneratedKeys = true) //useGeneratedKeys设置为 true 时，表示如果插入的表id以自增列为主键，则允许 JDBC 支持自动生成主键，并可将自动生成的主键id返回
    private Integer id;

    private String username;

    private String profession;

    @Transient  //意思是：告诉通用mapper这个字段在查询时我不想要(该注解只对通用mapper有效)
    private String phone;

    private String email;

    private Date onlinetime;


}
