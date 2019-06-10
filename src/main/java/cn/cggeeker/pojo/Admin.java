package cn.cggeeker.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Auther:CG
 * @Date:2019/6/10/010
 * @Description:cn.cggeeker.pojo
 * @version:1.0
 */
@Data
@Table(name = "admin_tb")  /*将pojo类和数据库对应的表做一个映射*/
public class Admin {
    @Id  //指定主键
    @KeySql(useGeneratedKeys = true)
    private int admin_id;

    private String adminName;

    private String passWord;

    private String email;

    private String tel;

    private String info;

    private String wechatImg;

}
