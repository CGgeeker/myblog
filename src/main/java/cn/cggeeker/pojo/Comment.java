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
@Table(name = "comment_tb")
public class Comment {

    @Id
    @KeySql(useGeneratedKeys = true)
    private int comment_id;

    private String userName;

    private String comment;

    private int articleId;

    private Timestamp commentTime;
}
