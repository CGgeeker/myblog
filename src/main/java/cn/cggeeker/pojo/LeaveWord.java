package cn.cggeeker.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * @Auther:CG
 * @Date:2019/6/20/020
 * @Description:cn.cggeeker.pojo
 * @version:1.0
 */
@Data
@Table(name = "leaveword_tb")
public class LeaveWord {

    @Id
    @KeySql(useGeneratedKeys = true)
    private int leavewordId;

    private String userName;

    private String leaveword;

    private Timestamp leavewordTime;

}
