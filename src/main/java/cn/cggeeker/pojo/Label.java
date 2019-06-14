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
@Table(name = "label_tb")
public class Label {

    @Id
    @KeySql(useGeneratedKeys = true)
    private int labelId;

    private String labelName;  //用驼峰式命名后，如果用通用mapper里的方法，会出问题：会直接将labelName转化成label_name,导致属性与字段无法映射
}
