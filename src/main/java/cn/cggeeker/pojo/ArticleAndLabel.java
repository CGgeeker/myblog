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
@Table(name = "articleandlabel_tb")
public class ArticleAndLabel {
    @Id
    @KeySql(useGeneratedKeys = true)
    private int al_id;

    private String labelName;

    private int articleId;
}
