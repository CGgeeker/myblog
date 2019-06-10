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
@Table(name = "invitecode_tb")
public class InviteCode {

    @Id
    @KeySql(useGeneratedKeys = true)
    private int code_id;

    private String inviteCode;

    private int authorityGrade;

    private String authorityInfo;
}
